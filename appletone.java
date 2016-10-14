//Program for simple inter applet communication
import java.awt.*;
import java.io.*;
import java.applet.*;
import java.awt.event.*;
import javax.swing.*;
//<applet code="appletone.java" width=900 height=900 name="first"> 
//</applet>
//<applet code="applettwo.java" width=900 height=900 name="second"> 
//</applet>
public class appletone extends JApplet implements ActionListener
{
	JTextField txt1;
	JButton bt;
	JTextArea ta1;
	public void init()
	{	
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		txt1= new JTextField(10);
		c.add(txt1);
		bt=new JButton("Send");
		c.add(bt);
		bt.addActionListener(this);
		ta1=new JTextArea(20,10);
		c.add(ta1);
		
	}
	public void actionPerformed(ActionEvent ae)
	{
	 	JApplet second1=(JApplet)getAppletContext().getApplet("second");
		((applettwo)second1).ta2.append("first>"+txt1.getText()+"\n");
		ta1.append("first>"+txt1.getText()+"\n");
		ta1.setText("");
	}
}
