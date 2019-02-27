import java.rmi.RemoteException;
import java.rmi.Remote;

public interface iobjetoremoto extends Remote{
    //prototipos de los metodos a utilizar remotamente
    /*public int DevolverNoCliente() throws RemoteException;*/

    public double DevolverSaldo(int ncliente) throws RemoteException;

    public void CambiarSaldo(int ncliente, double saldo) throws RemoteException;

}//fin de la interfaz iobjetoremoto