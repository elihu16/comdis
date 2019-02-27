import java.rmi.RemoteException;
import java.rmi.Remote;

public interface iobjetoremoto extends Remote{
    //prototipos de los metodos a utilizar remotamente

    public double Suma(double a, double b ) throws RemoteException;
    public double Resta(double a, double b) throws RemoteException;
    public double Multiplicacion(double a, double b)throws RemoteException;
    public double Division(double a, double b)throws RemoteException;

}//fin de la interfaz iobjetoremoto