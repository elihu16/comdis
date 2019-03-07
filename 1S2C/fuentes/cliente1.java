import java.rmi.Naming;
import java.util.Scanner;
public class cliente1{
    public static void main(String []args){
        try{
            System.setProperty("java.security.policy","rmi.policy");
            System.setSecurityManager(new SecurityManager());
            /*iobjetoremoto objrem = (iobjetoremoto) Naming.lookup("rmi://"+args[0]+":2320/SistemasDistribuidos");*/
            
            iobjetoremoto objrem = (iobjetoremoto) Naming.lookup("rmi://localhost:2320/SistemasDistribuidos");
            
            
            //invocacion a los metodos remotos
            java.util.Scanner lectura = new Scanner(System.in);
            String cadena;

            System.out.print("Escribe el mensaje C1: ");
            cadena = lectura.nextLine();
            objrem.Saludo(cadena);
        }
        catch(Exception e){e.printStackTrace();}
    }//fin del main
}//fin de la clase cliente