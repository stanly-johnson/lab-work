import java.sql.*;
import java.util.Properties;
import java.io.*;

public class con
{
  
  private static final String dbClassName = "com.mysql.jdbc.Driver";
   private static final String CONNECTION = "jdbc:mysql://localhost/sjcet";

  public static void main(String[] args) throws ClassNotFoundException,SQLException
  {

    Class.forName(dbClassName);
    Properties p = new Properties();
    p.put("user","");
    p.put("password","");


	InputStreamReader r=new InputStreamReader(System.in);  
	BufferedReader br=new BufferedReader(r);  


    // Now try to connect
    Connection c = DriverManager.getConnection(CONNECTION,p);
	Statement s = c.createStatement();
	try
	{
	int n;
	 do{
    System.out.println("1.Insert details\t2.Display all\t 3.Display with rollno\t4.Delete data\t5.Update table\t6.exit");
	n=Integer.parseInt(br.readLine()); 
	switch(n)
	{
	case 1: System.out.println("Enter your name");  
		String name=br.readLine(); 
		System.out.println("Enter your roll");  
		int roll=Integer.parseInt(br.readLine());  
		s.execute("insert into cseb values ('"+roll+"','"+name+"')");
		break;
	case 2: s.execute("select roll,name from cseb");
		ResultSet rs = s.getResultSet(); 
		if (rs != null) 
		while ( rs.next() ) 
		{
		System.out.println("Name :" + rs.getString(2) +"\t"+ "Rollno : "+ rs.getString(1) );
		}
		break;
	case 3:System.out.println("Enter your rollno");  
		int sr=Integer.parseInt(br.readLine());
		s.execute("select roll,name from cseb where roll='"+sr+"'");
		rs = s.getResultSet(); 
		if (rs != null) 
		while ( rs.next() ) 
		{
		System.out.println("Name :" + rs.getString(2) +"\t"+ "Rollno : "+ rs.getString(1) );
		}
		break;
	case 4:System.out.println("Enter your rollno");  
		int dr=Integer.parseInt(br.readLine());
		s.execute(" DELETE FROM cseb WHERE roll='"+dr+"'");
		break;
	case 5: System.out.println("Enter your name");  
		String uname=br.readLine(); 
		System.out.println("Enter your roll");  
		int uroll=Integer.parseInt(br.readLine()); 
		s.execute("update cseb set name='"+uname+"' where roll='"+uroll+"'"); 
		break;
	default:System.out.println("Invalid menu entry");  
		}
	}while(n!=6);
s.close(); 


 }
 catch(IOException ex){
        System.out.println (ex.toString());
}
c.close();
}
}
