import java.rmi.*;
import java.rmi.server.*;
import java.io.*;
import java.lang.Double;


public class ObjetoRemoto extends UnicastRemoteObject implements IObjetoRemoto
{
    private double saldo1, saldo2;
    
    public ObjetoRemoto() throws RemoteException
    {
         super();
         GenerarSaldo();
    } // ObjetoRemoto
    
    private void GenerarSaldo()
    {
    	String s1, s2;
    	try
    	{
    	    FileReader fr = new FileReader("datos.txt");
    	    BufferedReader br = new BufferedReader(fr);
    	    
    	    s1 = br.readLine();
    	    s2 = br.readLine();
    	    saldo1 = Double.parseDouble(s1);
    	    saldo2 = Double.parseDouble(s2);
    	    br.close();
    	}
    	catch(Exception e)
	{
    	    System.out.println("Error");
    	}
    } // Fin GenerarSaldo
    
    private void ModificarSaldo()
    {    	
    	try
	{
    	     FileWriter fw = new FileWriter("datos.txt");
    	     BufferedWriter bw = new BufferedWriter(fw);
    	
    	     bw.write(String.valueOf(saldo1));
    	     bw.newLine();
    	     bw.write(String.valueOf(saldo2));
    	     bw.newLine();		
    	     bw.close();
    	     System.out.println("Datos actualizados");
    	 }
    	 catch(IOException e)
	 {
    	     System.out.println("Error");
    	 }
    } // Fin ModificarSaldo

    
    public double DevolverSaldo(int ncliente) throws RemoteException
    {
        double saldo = -1;
        
        if (ncliente == 1)
           saldo = saldo1;
        if (ncliente == 2)
           saldo = saldo2;
        return saldo; 
    }  // Fin DevolverSaldo
    
    public void CambiarSaldo(int ncliente, double saldo) throws RemoteException
    {
        if (ncliente == 1)
        {
           saldo1+=saldo;
           ModificarSaldo();
        }
        if (ncliente == 2)
        {
           saldo2+=saldo;
           ModificarSaldo();
        }   
    }  // Fin CambiarSaldo

}  // Fin clase ObjetoRemoto
