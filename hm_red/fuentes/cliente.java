import java.rmi.Naming;
import java.util.Scanner;
public class cliente{
    public static void main(String []args){
        try{
            System.setProperty("java.security.policy","rmi.policy");
            System.setSecurityManager(new SecurityManager());
            /*iobjetoremoto objrem = (iobjetoremoto) Naming.lookup("rmi://172.31.9.221:2320/SistemasDistribuidos");
            */
            iobjetoremoto objrem = (iobjetoremoto) Naming.lookup("rmi://localhost:2320/SistemasDistribuidos");
            
            
            //invocacion a los metodos remotos
            java.util.Scanner lectura = new Scanner(System.in);
            String cadena;

            System.out.print("Escribe un saludo");
            cadena = lectura.nextLine();
            objrem.Saludo(cadena);
        }
        catch(Exception e){e.printStackTrace();}
    }//fin del main
}//fin de la clase cliente