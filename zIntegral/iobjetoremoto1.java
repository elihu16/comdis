import java.rmi.RemoteException;
import java.rmi.Remote;

public interface iobjetoremoto1 extends Remote{

	public double fx0(double x0) throws RemoteException;
	public double fx2(double x2) throws RemoteException;
	public double fxi_n1(double x0, double h, double n) throws RemoteException;

}
