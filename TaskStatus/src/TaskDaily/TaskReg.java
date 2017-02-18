package TaskDaily;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class TaskReg {
	JFrame mainFrame;
	JLabel sysTitle, empId, empName, empPass, logo;
	JPanel cpannel;
	JTextField empIDF, empNameF, empPassF;
	JButton home,submit;
	ImageIcon icon;
	
	public TaskReg(){
		mainFrame = new JFrame();
		mainFrame.setSize(700,500);
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
		submit = new JButton("submit");
		cpannel = new JPanel();
		cpannel.setLayout(new GridLayout(5, 2));
		
		ImageIcon img = new ImageIcon("C:\\Users\\SAM\\git\\masterj\\TaskStatus\\image\\VijMani.png");
		logo = new JLabel("",img,JLabel.CENTER);
		home = new JButton("Home");
		mainFrame.add(sysTitle);
		mainFrame.add(logo);
		mainFrame.add(cpannel);
		mainFrame.add(submit);
		mainFrame.add(home);
		
			home.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				mainFrame.setVisible(false);
				TaskHome home = new TaskHome();
				home.homeUI();
				
			}
		});
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


}
