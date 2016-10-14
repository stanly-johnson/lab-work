//Jva program for simple inter applet communication
import java.awt.*;
import java.io.*;
import java.applet.*;
import javax.swing.*;
import java.awt.event.*;


public class applettwo extends JApplet implements ActionListener
{
	JTextField txt2;
	JButton bt;
	JTextArea ta2;
	public void init()
	{	
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		txt2= new JTextField(10);
		c.add(txt2);
		bt=new JButton(Send);
		c.add(bt);
		bt.addActionListener(this);
		ta1=new JTextArea(20,10);
		c.add(ta2);
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		
	 	JApplet first1=(JApplet).getAppletContext().getApplet("first");
		((appletone)first1).ta1.append("second>"+txt2.getText()+"\n");
		txt1.append("second>"+txt2.getText()+"\n");
		txt1.setText("");
	
	}
}	
