import java.rmi.Naming;

public class cliente{
    public static void main(String []args){
        try{
            System.setProperty("java.security.policy","rmi.policy");
            System.setSecurityManager(new SecurityManager());
            iobjetoremoto objrem = (iobjetoremoto) Naming.lookup("rmi://localhost:2320/SistemasDistribuidos");
            
            //invocacion a los metodos remotos
            double a = 5;
            double b = 0;
            System.out.println("Suma:"+ objrem.Suma(a, b));
            System.out.println("Resta: "+ objrem.Resta(a, b));
            System.out.println("Multiplicacion: "+ objrem.Multiplicacion(a, b));
            System.out.println("Division: "+ objrem.Division(a, b));
        }
        catch(Exception e){e.printStackTrace();}
    }//fin del main
}//fin de la clase cliente