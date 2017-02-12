package package2;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JTextField;
public class Button  extends JApplet{
	public void init(){
		Container cont= getContentPane();
		JButton jbut;
		JTextField jf;
		cont.setLayout(new BorderLayout());
		jf= new JTextField("write something",7);
		cont.add(jf);
		
		jbut= new JButton("submit");
		jbut.setSize(2,1);
		cont.add(jbut);
	
		

}
	}
