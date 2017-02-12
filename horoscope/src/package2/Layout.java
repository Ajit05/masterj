package package2;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Panel;

import javax.swing.JButton;
import javax.swing.JFrame;
public class Layout extends JFrame{
	public Layout(){
		setSize(300,300);
		setTitle("Details Application");
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		Panel vp = new Panel();
		Panel p = new Panel();
		JButton button = new JButton("Enter Your Details");
		p.setEnabled(false);
		p.add(button);
		p.setBackground(Color.blue);
		vp.setLayout(new GridLayout(2,1));
		vp.add(p);
		add(vp,BorderLayout.NORTH);
	}
	public static void main(String[] args){
		Layout obj = new Layout();
	}

}
