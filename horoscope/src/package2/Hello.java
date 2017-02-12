package package2;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;

public class Hello extends JFrame {

	Container container;
	JTabbedPane tpane;
	JPanel red = new JPanel();
	JPanel blue = new JPanel();
	JPanel green = new JPanel();
	public Hello(){
		super("Hello");
		container = getContentPane();
		JPanel jpanel = new JPanel(new  GridLayout(1,1));
		try{
		tpane.addTab("RED",red);
		tpane.addTab("BLUE", blue);
		tpane.addTab("GREEN",green);
		}
		catch(Exception e){
			
		}
		jpanel.add(tpane);
		container.add(jpanel);
		setSize(350,400);
		setVisible(true);
	}
	
	JPanel mypanel = new JPanel();
	public static void main(String[] ajit){
		try{
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}catch(Exception e){
			
		}
		Hello tapanel = new Hello();
	}
}
