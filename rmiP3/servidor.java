import java.rmi.registry.*;

public class servidor{
    public static void main (String []args){
        try{
            Registry registro = LocateRegistry.createRegistry(2320);
            registro.rebind("SistemasDistribuidos", new objetoremoto());
        }
        catch(Exception e){e.printStackTrace();}
    }//fin main
}//fin clase servidor