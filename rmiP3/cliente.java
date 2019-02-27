import java.rmi.Naming;
import java.util.Scanner;
public class cliente{
    public static void main(String []args){
        try{
            System.setProperty("java.security.policy","rmi.policy");
            System.setSecurityManager(new SecurityManager());
            iobjetoremoto objrem = (iobjetoremoto) Naming.lookup("rmi://localhost:2320/SistemasDistribuidos");
            //invocacion a los metodos remotos
            Scanner lectura = new Scanner(System.in);
            int cliente;
            double saldo;
            System.out.println("Cajero Automatico Elihu\n");
            System.out.print("Dame el numero de cliente");
            cliente = lectura.nextInt();
            if(cliente == 1 || cliente == 2){
                System.out.println("OPCIONES\n");
                System.out.println("1-Consultar");
                System.out.println("2-Retirar");
                System.out.println("3-Depositar");
                System.out.print("ingresa tu opcion");
                opc = lectura.nextInt();
                
            }
            else{
                System.out.println("cliente inexistente");
            }

        }
        catch(Exception e){e.printStackTrace();}
    }//fin del main
}//fin de la clase cliente