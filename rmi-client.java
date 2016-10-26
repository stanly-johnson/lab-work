import java.rmi.*;
import java.io.*;
import java.net.*;
public class rmifactc
{
	public static void main(String args[])
	{
		try
		{
			String url = "rmi://"+args[0]+"/Server";
			add1 obj = (add1)Naming.lookup(url);
			int a = Integer.parseInt(args[1]);
			System.out.println("Sum of two numbers= "+obj.add(a));
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
