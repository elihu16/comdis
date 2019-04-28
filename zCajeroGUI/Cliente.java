import java.rmi.Naming;
import java.util.Scanner;

public class Cliente
{
    public static void main(String []args)
    {
        try
        {
            System.setProperty("java.security.policy", "rmi.policy");
            System.setSecurityManager(new SecurityManager());
            IObjetoRemoto objrem = (IObjetoRemoto) Naming.lookup("rmi://"+args[0]+":2320/SistemasDistribuidos");
            
            // Invocación a los métodos remotos
            Scanner lectura = new Scanner(System.in);

            int cliente, opc;
            double saldo,saldodis;

            System.out.println("Cajero Automatico Elihu\n");
            System.out.print("Dame el numero de cliente");
            cliente = lectura.nextInt();
            
            if ((cliente == 1) || (cliente == 2))
            {
                do {
                    // statements
                    System.out.println("OPCIONES\n");
                    System.out.println("1-Consultar");
                    System.out.println("2-Retirar");
                    System.out.println("3-Depositar");
                    System.out.println("5-SALIR");
                    System.out.print("ingresa tu opcion");
                    opc = lectura.nextInt();

                    switch(opc){
                        case 1:
                            saldo = objrem.DevolverSaldo(cliente);
                            System.out.println("Saldo disponible: "+ saldo);
                            break;
                        case 2:
                            System.out.print("Dame la cantidad a retirar: ");
                            saldo = leer.nextDouble();
                            saldodis = objrem.DevolverSaldo(cliente);
                            if(saldo > saldodis){
                                System.out.println("Saldo insuficiente");
                            }
                            else{
                                objrem.CambiarSaldo(cliente, saldo*(-1));
                                System.out.print("Tu saldo actual es: " + objrem.DevolverSaldo(cliente));
                            
                            }
                            break;
                        case 3:
                            System.out.print("Dame la cantidad a depositar: ");
                            saldo = leer.nextDouble();
                            objrem.CambiarSaldo(cliente, saldo);
                            System.out.print("Tu saldo actual es: " + objrem.DevolverSaldo(cliente));
                            break;
                        default:
                            System.out.println("opcion incorrecta");
                    }
                    
                } while (opc != 5);//findooooooooooooooooooooooooooooooooooooooooooooooooo
            }
            else
                System.out.println("Cliente inexistente");
                
        }
        catch (Exception e){e.printStackTrace();}
    } // Fin main
}  // Fin Clase Cliente
