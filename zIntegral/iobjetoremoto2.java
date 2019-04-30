import java.rmi.RemoteException;
import java.rmi.Remote;

public interface iobjetoremoto2 extends Remote{

	public double h(double x1,double x2, double n) throws RemoteException;
	public double x1() throws RemoteException;
	public double fx1() throws RemoteException;
	public double fxi_n2(double x0, double h, double n) throws RemoteException;

}