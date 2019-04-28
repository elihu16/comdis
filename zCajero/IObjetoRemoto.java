import java.rmi.RemoteException;
import java.rmi.Remote;

public interface IObjetoRemoto extends Remote
{
    // Prototipos de los métodos a utilizar remotamente
    public double DevolverSaldo(int ncliente) throws RemoteException;
    public void CambiarSaldo(int ncliente, double saldo) throws RemoteException; 

}  // Fin interfaz IObjetoRemoto
