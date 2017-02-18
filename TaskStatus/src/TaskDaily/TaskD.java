package TaskDaily;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.LinearGradientPaint;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
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
		setLayout(new GridLayout(5, 1, 5, 5));
		controlPanel = new JPanel();
		controlPanel.setLayout(new GridLayout(7, 1));
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
//	public static void main(String args[]){
//		TaskD obj = new TaskD();
//		obj.mainflow();
//		
//	}
	
	public void mainflow(){
		
		final JCheckBox ent = new JCheckBox("Ennterprise project");
		final JCheckBox con = new JCheckBox("Consumer project");
		ent.setMnemonic(KeyEvent.VK_E);
		con.setMnemonic(KeyEvent.VK_C);
		
		JLabel nExe = new JLabel("Number of Execution:", JLabel.CENTER);
		JLabel nExeplan = new JLabel("Execution plan link:", JLabel.CENTER);
		
		JLabel nBug = new JLabel("Number of bugs filed:", JLabel.CENTER);
		JLabel nBugId = new JLabel("Bug Id:", JLabel.CENTER);
		JLabel nBugproj = new JLabel("Select Project for which bug field:", JLabel.CENTER);
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
        
        ent.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {         
               statusLabel.setText("Apple Checkbox: " 
                  + (e.getStateChange()==1?"checked":"unchecked"));
            }           
         });
		
        controlPanel.setSize(800,400);
        controlPanel.add(ent);
        controlPanel.add(con);
        controlPanel.add(nExe);
        controlPanel.add(nExeplan);
//        controlPanel.add(nBug);
//        controlPanel.add(nBugproj);
//        controlPanel.add(nBugId);
        controlPanel.add(save);
        controlPanel.add(saveSend);
        controlPanel.add(clear);
        setVisible(true);
		
	}
	
}
