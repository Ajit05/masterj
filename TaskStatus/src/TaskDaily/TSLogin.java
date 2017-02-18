package TaskDaily;

import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class TSLogin {
	JFrame mainFrame;
	JLabel sysTitle, empId, empName, empPass;
	JPanel cpannel;
	JTextField empIDF, empNameF, empPassF;
	JButton login;
	ImageIcon icon;
	
	
//	public static void main(String args[]){
//		TSLogin obj = new TSLogin();
//		obj.ui();
//		
//	}

	public TSLogin(){
		mainFrame = new JFrame();
		mainFrame.setSize(500,450);
		mainFrame.setTitle("DAILY TASK REPORTING SYSTEM");
		mainFrame.setResizable(true);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setLayout(new GridLayout(3,1));
		sysTitle = new JLabel("DAILY TASK REPORTING SYSTEM LOGIN",JLabel.CENTER);
		empId = new JLabel("Emplyee ID:", JLabel.CENTER);
		empName = new JLabel("Employee Name:", JLabel.CENTER);
		empPass = new JLabel("Employee Password:", JLabel.CENTER);
		empIDF = new JTextField(20);
		empNameF = new JTextField(20);
		empPassF = new JPasswordField(20);
		login = new JButton("Login");
		
		
		
		cpannel = new JPanel();
		cpannel.setLayout(new GridLayout(4, 2));
		mainFrame.add(sysTitle);
		mainFrame.add(cpannel);
		mainFrame.add(login);
		ui();
		
		mainFrame.setVisible(true);
		
		}
	
	private void ui(){
		
		cpannel.add(empId);
		cpannel.add(empIDF);
		cpannel.add(empName);
		cpannel.add(empNameF);
		cpannel.add(empPass);
		cpannel.add(empPassF);
		cpannel.setVisible(true);
		
		
		
		
	}
	
//	private ImageIcon imageurlstatus(String path, String des){
//		java.net.URL url = TSLogin.class.getResource(path);
//		if(url != null){
//		return new ImageIcon(url,"");
//		}
//		else{
//			System.err.println("Could not find the image url" + path);
//			return null;
//		}
//	}
	

}
