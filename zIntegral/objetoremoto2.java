import java.rmi.*;
import java.rmi.server.*;

public class objetoremoto2 extends UnicastRemoteObject implements iobjetoremoto2{
	private double X0, X1, H;
	public objetoremoto2() throws RemoteException{
		super();
	}
	private double funcion(double x){
		//funcion a integrar
		return x*x;
	}
	public double h(double x0,double x2, double n) throws RemoteException{
		H = (x2 - x0)/n;
		X0 = x0;
		X1 = x0 + H;
		return H;
	}
	public double x1() throws RemoteException{
		return X1;
	}
	public double fx1() throws RemoteException{
		return funcion(X1);
	}
	public double fxi_n2(double x0, double h, double n) throws RemoteException{
	        double fxi = 0;
	        double xi = 0;
	        for(int i = 2; i<=n-2; i++){
	        	xi = x0 + (i * h);
	        	fxi+= funcion(xi);
			i++;
	        }
	        return fxi;
	}


}//Fin del objetoRemoto
