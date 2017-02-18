package TaskDaily;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TaskHome{
	
	private JButton login, reg;
	private JLabel logo;
	private JPanel cpanel;
	private JFrame mainFrame;
	public void homeUI(){
		JFrame mainFrame = new JFrame();
		mainFrame.setSize(700,500);
		mainFrame.setTitle("DAILY TASK REPORTING SYSTEM");
		mainFrame.setResizable(true);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ImageIcon img = new ImageIcon("C:\\Users\\SAM\\git\\masterj\\TaskStatus\\image\\VijMani.png");
		mainFrame.setLayout(new GridLayout(2,1));
		logo = new JLabel("",img,JLabel.CENTER);
		mainFrame.add(logo);
		cpanel = new JPanel(new FlowLayout());
		login = new JButton("New user");
		reg = new JButton("Existing user");
		cpanel.add(login);
		cpanel.add(reg);
		mainFrame.add(cpanel);
		mainFrame.setVisible(true);
		
		reg.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				mainFrame.setVisible(false);
				TaskReg regObj = new TaskReg();
				
				
			}
		});
		
		login.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				mainFrame.setVisible(false);
				TSLogin regObj = new TSLogin();
				
				
			}
		});
		
	}
	public static void main(String args[]){
		TaskHome objHome = new TaskHome();
		objHome.homeUI();
		
	}

}
