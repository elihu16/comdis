import java.rmi.*;
import java.rmi.server.*;

public class objetoremoto1 extends UnicastRemoteObject implements iobjetoremoto1{
	public objetoremoto1() throws RemoteException{
		super();
	}
	private double funcion(double x){
		return x*x;
	}
	public double fx0(double x0) throws RemoteException{
		return funcion(x0);
	}
	public double fx2(double x2) throws RemoteException{
		return funcion(x2);	
	}
	public double fxi_n1(double x0, double h, double n) throws RemoteException{
	        double fxi = 0;
	        double xi = 0;
	        for(int i = 1; i<=n-1; i++){
	        	xi = x0 + (i * h);
	        	fxi+= funcion(xi);
	        	i++;
	        }
	        return fxi;
	}

}//Fin del objetoRemoto
