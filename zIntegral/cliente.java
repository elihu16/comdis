import java.rmi.Naming;
import java.util.Scanner;

public class cliente{
	public static void main(String []args){
        	double x0,x2,h,fx0,fx1,fx2,integral,n,Efxi_n1,Efxi_n2;
		try{
			System.setProperty("java.security.policy", "rmi.policy");
			System.setSecurityManager(new SecurityManager());
			iobjetoremoto1 objrem1 = (iobjetoremoto1) Naming.lookup("rmi://"+args[0]+":2320/SistemasDistribuidos_01");
			iobjetoremoto2 objrem2 = (iobjetoremoto2) Naming.lookup("rmi://"+args[1]+":2321/SistemasDistribuidos_02");

			Scanner lectura = new Scanner(System.in);

			System.out.print("Calcular la integral\n");
			System.out.print("Limite inferior: ");
			x0 = lectura.nextDouble();
			System.out.print("Limite superior: ");
			x2 = lectura.nextDouble();
			System.out.print("Valor de n:");
			n = lectura.nextDouble();

			fx0 = objrem1.fx0(x0);
			fx2 = objrem1.fx2(x2);
			h = objrem2.h(x0, x2, n);
			fx1 = objrem2.fx1();
			Efxi_n1 = objrem1.fxi_n1(x0, h, n);
			Efxi_n2 = objrem2.fxi_n2(x0, h, n);
			integral = (h/3)*(fx0 + fx2 + (4*Efxi_n1) + (2*Efxi_n2));
			System.out.print("la integral es: " + integral);
		}
		catch (Exception e){e.printStackTrace();}
	}// Fin main
}// Fin Clase cliente
