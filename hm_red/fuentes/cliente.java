import java.rmi.Naming;

public class cliente{
    public static void main(String []args){
        try{
            System.setProperty("java.security.policy","rmi.policy");
            System.setSecurityManager(new SecurityManager());
            iobjetoremoto objrem = (iobjetoremoto) Naming.lookup("rmi://172.31.9.221:2320/SistemasDistribuidos");
            //invocacion a los metodos remotos
            objrem.Saludo("hola mundo desde la FCC");
        }
        catch(Exception e){e.printStackTrace();}
    }//fin del main
}//fin de la clase cliente