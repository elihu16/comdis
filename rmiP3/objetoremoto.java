import java.rmi.*;
import java.rmi.server.*;

public class objetoremoto extends UnicastRemoteObject implements iobjetoremoto{
   
    private double saldo1, saldo2;

    public objetoremoto() throws RemoteException{
        super();
        saldo1=20000;
        saldo2=250;
    }
    /*public int DevolverNoCliente() throws RemoteException{

    }*/

    public double DevolverSaldo(int ncliente) throws RemoteException{
        double saldo = -1;
        if(ncliente == 1){
            saldo = saldo1;
        }
        if(ncliente == 2){
            saldo = saldo2;
        }
        return saldo;
    }

    public void CambiarSaldo(int ncliente, double saldo) throws RemoteException{
        if(ncliente == 1){
            saldo1 += saldo;
        }
        if(ncliente == 2){
            saldo2 +=saldo;
        }
    }
}//fin de la clase objetoremoto