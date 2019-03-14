import java.rmi.Naming;
import java.util.Scanner;
public class cliente2{
    public static void main(String []args){
        try{
            System.setProperty("java.security.policy","rmi.policy");
            System.setSecurityManager(new SecurityManager());
            iobjetoremoto objrem = (iobjetoremoto) Naming.lookup("rmi://"+args[0]+":2320/SistemasDistribuidos");
            
            Scanner numero = new Scanner(System.in);
            float a;
            float b;
            int opc;

            do {
                System.out.println("Calculadora Cliente 2");
                System.out.println("ingrese el primer numero: ");
                a = numero.nextInt();
                b = numero.nextInt();

                System.out.println("OPERACIONES\n");
                System.out.println("1-RESTA");
                System.out.println("2-MULTIPLICACION");
                System.out.println("5-SALIR");
                System.out.print("ingresa tu opcion");
                opc = numero.nextInt();
                switch(opc){
                    case 1:
                        System.out.print("La Resta: "+ objrem.resta(a, b));
                    case 2:
                        System.out.print("La Multiplicacion: "+ objrem.mult(a, b));
                }
            }while (opc != 5);//FIN DOO
        }//try
        catch(Exception e){e.printStackTrace();}
    }//fin del main
}//fin de la clase cliente