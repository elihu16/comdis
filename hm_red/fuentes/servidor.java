import java.rmi.registry.*;

public class servidor{
    public static void main (String []args){
        try{
            System.setProperty("java.rmi.server.hostname","172.31.9.221");
            Registry registro = LocateRegistry.createRegistry(2320);
            registro.rebind("SistemasDistribuidos", new objetoremoto());
        }
        catch(Exception e){e.printStackTrace();}
    }//fin main
}//fin clase servidor