import java.rmi.RemoteException;
import java.rmi.Remote;

public interface iobjetoremoto extends Remote{
    //prototipos de los metodos a utilizar remotamente
    public void Saludo(String mensaje) throws RemoteException;

}//fin de la interfaz iobjetoremoto