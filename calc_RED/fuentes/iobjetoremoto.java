import java.rmi.RemoteException;
import java.rmi.Remote;

public interface iobjetoremoto extends Remote{
    //prototipos de los metodos a utilizar remotamente
   public float suma(float a, float b) throws RemoteException;
   public float resta(float a, float b) throws RemoteException;
   public float mult(float a, float b) throws RemoteException;
   public float div(float a, float b) throws RemoteException;

}//fin de la interfaz iobjetoremoto