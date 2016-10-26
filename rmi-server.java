import java.rmi.*;
import java.rmi.server.*;
import java.io.*;
import java.net.*;
public class rmifacts extends UnicastRemoteObject implements add1
{
	public rmifacts()throws RemoteException
	{
	}
	public static void main(String args[])
	{
		try
		{
			System.out.println("Server starts...");
			rmifacts S = new rmifacts();
			Naming.rebind("Server",S);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public int add(int a)
	{
		int f;
		f=1;		
		for(int i=1;i<=a;i++)
			f*=i;		
		return(f);
	}
}
