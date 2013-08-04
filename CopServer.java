
import java.rmi.*;
import java.net.*;

public class CopServer
{
	public static void main( String args[] )
	{
		try
		{
			CopImpl cim = new CopImpl();
			Naming.rebind("RatServer",cim);
			System.out.println("Server ready...");
		}
		catch( Exception e )
		{
			System.out.println("Server Exception : "+e);
		}

	}
}