package TaskDaily;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TaskD extends JFrame{
	JLabel statusLabel;
	JPanel controlPanel;
	
	public TaskD(){
		// TODO Auto-generated method stub
		//System.out.println("Program by - Aji Vijayee Yadav");
		
		setSize(1000,500);
		setTitle("Daily Task System - DTS");
		setResizable(true);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(5,1));
		controlPanel = new JPanel();
		controlPanel.setLayout(new FlowLayout());
		JLabel Heading = new JLabel("DTS", JLabel.CENTER);
		JLabel subHeading = new JLabel("", JLabel.CENTER);
		JLabel Footer = new JLabel("AVY Inc 2017", JLabel.CENTER);
		subHeading.setText("DTS system make task reporting easy");
		statusLabel = new JLabel("", JLabel.CENTER);
		add(Heading);
		add(subHeading);
		add(controlPanel);
		add(statusLabel);
		add(Footer);
		
		
	}
	public static void main(String args[]){
		TaskD obj = new TaskD();
		obj.mainflow();
		
	}
	
	public void mainflow(){
		JButton save = new JButton("Save");
		JButton saveSend = new JButton("Save & Send");
		JButton clear = new JButton("Clear");
		save.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				statusLabel.setText("Save Button clicked.");
			}
		});
        saveSend.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				statusLabel.setText("Save & Send Button clicked.");
			}
		});
        clear.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				statusLabel.setText("clear Button clicked.");
			}
		});
		
        controlPanel.add(save);
        controlPanel.add(saveSend);
        controlPanel.add(clear);
        setVisible(true);
		
	}
	
}
