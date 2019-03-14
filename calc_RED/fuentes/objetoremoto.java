import java.rmi.*;
import java.rmi.server.*;

public class objetoremoto extends UnicastRemoteObject implements iobjetoremoto{
    public objetoremoto() throws RemoteException{
        super();
    }
    public float suma(float a, float b) throws RemoteException{
        return a+b;
    }
    public float resta(float a, float b) throws RemoteException{
        return a-b;
    }
    public float mult(float a, float b) throws RemoteException{
        return a*b;
    }
    public float div(float a, float b) throws RemoteException{
        if(b != 0){
            return a+b;
        }
        else{
            return -Float.MAX_VALUE;
        }
    }
}//fin de la clase objetoremoto