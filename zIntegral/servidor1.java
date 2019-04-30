import java.rmi.registry.*;

public class servidor1{
	public static void main(String []args){
		try{
			System.setProperty("java.rml.server.hostname",args[0]);
			Registry registro = LocateRegistry.createRegistry(2320);
			registro.rebind("SistemasDistribuidos_01", new objetoremoto1());
		}
		catch(Exception e){e.printStackTrace();}
	}
}
