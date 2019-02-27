import java.rmi.*;
import java.rmi.server.*;

public class objetoremoto extends UnicastRemoteObject implements iobjetoremoto{
    public objetoremoto() throws RemoteException{
        super();
    }
    public void Saludo(String mensaje) throws RemoteException{
        System.out.println(mensaje);
    }
}//fin de la clase objetoremoto