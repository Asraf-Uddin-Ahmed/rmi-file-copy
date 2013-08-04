
import java.io.*;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CopIntf extends Remote
{
	void copy(String src, String dest) throws RemoteException,IOException;
}