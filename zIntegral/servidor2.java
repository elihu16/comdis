import java.rmi.registry.*;

public class servidor2{
	public static void main(String []args){
		try{
			System.setProperty("java.rml.server.hostname",args[0]);
			Registry registro = LocateRegistry.createRegistry(2321);
			registro.rebind("SistemasDistribuidos_02", new objetoremoto2());
		}
		catch(Exception e){e.printStackTrace();}
	}
}