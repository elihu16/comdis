import java.rmi.*;
import java.rmi.server.*;

public class objetoremoto extends UnicastRemoteObject implements iobjetoremoto{
    public objetoremoto() throws RemoteException{
        super();
    }
    public double Suma(double a, double b) throws RemoteException{
        return a+b;
    }
    public double Resta(double a, double b)throws RemoteException{
        return a-b;      
    }
    public double Multiplicacion(double a, double b)throws RemoteException{
        return a*b;
    }
    public double Division(double a, double b)throws RemoteException{
        if (b != 0){
            return a/b;
        }
        else
            return -Double.MAX_VALUE;
    }
}//fin de la clase objetoremoto