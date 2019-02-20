import java.rmi.RemoteException
import java.rm1.RemoteException

public interface iobjetoremoto extends Remote{
    //prototipos de los metodos a utilizar remotamente
    public void Saludo(String mensaje) throws RemoteExceprion;
    
}//fin de la interfaz iobjetoremoto