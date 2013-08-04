
import java.rmi.*;

public class CopClient
{
	public static void main( String args[] )	//args[0]=IP address, args[1]=source address of file(with name & extention), args[2]=destination address of file(with name & extention)
	{
		try
		{
			String host = "rmi://"+args[0]+"/RatServer";
			CopIntf cin = (CopIntf)Naming.lookup(host);
			System.out.println("Response : copied");
			cin.copy(args[1],args[2]);
		}
		catch( Exception e )
		{
			System.out.println("Client Exception:"+e);
		}
	}
}