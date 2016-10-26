import java.io.*;
import java.rmi.*;
public interface add1 extends Remote
{
	int add(int a)throws RemoteException;
}
