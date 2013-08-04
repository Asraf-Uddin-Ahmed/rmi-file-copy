
import java.util.*;
import java.io.*;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CopImpl extends UnicastRemoteObject implements CopIntf
{
	public CopImpl() throws RemoteException
	{}

	public void copy(String src, String dest) throws RemoteException,IOException
	{
		FileReader fr = new FileReader(src);
		Scanner fin = new Scanner(fr);
		PrintWriter pw = new PrintWriter(dest);

		while( fin.hasNext() )
			pw.println(fin.next());

		pw.close();
		fr.close();
	}
}