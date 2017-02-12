import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.LayoutManager;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class main extends JFrame implements ActionListener {
	JButton b1;
	JComboBox box=new JComboBox();
	JTextField t1=new JTextField();
	JButton icon=new JButton();
	
	JTextArea datal =new JTextArea(5,60);
	public main() {
		// TODO Auto-generated constructor stub
		setSize(200,200);
		setTitle("HOROSCOPE");
		setResizable(true);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new BorderLayout());
		Panel headp=new Panel();
		Panel p0=new Panel();
		Panel p1=new Panel();
		Panel p3=new Panel();
		Panel p4=new Panel();
		
JButton headb=new JButton(("HOROSCOPE APPLICATION"));
      headb.setEnabled(false);
		p0.add(headb);
		p0.setBackground(Color.green);
		
		p1.add(new Label("ENTER THE SIGN"));
		
		box.addItem("torous");
		box.addItem("scorpio");
		box.addItem("leo");
		box.addItem("libra");
		box.addItem("aries");
		box.addItem("gemini");
		box.addItem("cancer");
		box.addItem("virgo");
		box.addItem("sagittarius");
		box.addItem("capricorn");
		box.addItem("aquarius");
		box.addItem("pisces");
		
		headp.setLayout(new GridLayout(2,1));
		p1.add(box);
		p1.setBackground(Color.yellow);
		headp.add(p0);
		headp.add(p1);
		add(headp,BorderLayout.NORTH);
		
		
		b1=new JButton("check");
		p3.add(b1);
		p3.setBackground(Color.yellow);
		add(p3,BorderLayout.CENTER);
		p4.setBackground(Color.CYAN);
		p4.setLayout(new GridLayout(2,1));
		JPanel iconp=new JPanel();
		JPanel datap=new JPanel();
		
		icon.setEnabled(false);
		iconp.add(icon);
		iconp.setBackground(Color.cyan);
		p4.add(iconp);
		datap.setBackground(Color.cyan);
	    
	    
	        datal.setLineWrap(true);
	        datal.setWrapStyleWord(true);
	        datal.setOpaque(false);
	       datal.setEditable(false);

		datap.add(datal);
		
		p4.add(datap);
		
		add(p4,BorderLayout.SOUTH);
		pack();
		b1.addActionListener(this);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  main obj=new main();
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		
		 String s=ae.getActionCommand();
		 if(s.equals("check"))
		 {
		
			 ImageIcon img;
			 Object item=box.getSelectedItem();
			 
			 String it=""+item;
		switch (it) {
		case "torous":
			 img =new ImageIcon("C:\\Users\\Meera\\workspace\\horoscope\\horoscope\\1.jpg");
		       icon.setIcon(img);
		       datal.setText("Today is the day of getting success in education. Those in service will do their work with full confidence. Your health will be good. You will feel joy and enthusiasm. You might attend a social gathering or family function. Businessman shall go on long journey to expand their business. Players will achieve some honor or medal in their game.");


			
			break;

	case "scorpio":
		 img =new ImageIcon("C:\\Users\\Meera\\workspace\\horoscope\\horoscope\\scorpioicon.jpg");
	        icon.setIcon(img);
	        datal.setText("Today is the day of getting success in education. Those in service will do their work with full confidence. Your health will be good. You will feel joy and enthusiasm. You might attend a social gathering or family function. Businessman shall go on long journey to expand their business. Players will achieve some honor or medal in their game.");
	        
			break;
			
	case "leo":
		img =new ImageIcon("C:\\Users\\Meera\\workspace\\horoscope\\horoscope\\leoicon.jpg");
        icon.setIcon(img);
		datal.setText("Today is the day to get rid off from all your tensions and problems. You will enjoy the day with your family and friends. You may participate in a social gathering or any family function. You might purchase a new vehicle or might get some money from parents. Your relation with mother will be good. This is the time to increase your savings.");
		
		break;
			
case "libra":
	img =new ImageIcon("C:\\Users\\Meera\\workspace\\horoscope\\horoscope\\libraicon.jpg");
    icon.setIcon(img);
    datal.setText("You will feel restless and lazy. Your confidence shall increase. A bold decision taken by you will make you work harder. Money will come with your hard work only. Relation with spouse will be normal. Children will do better and they can get the desired result. Students can achieve their goals easily");
    
		break;
		
case "aries":
	img =new ImageIcon("C:\\Users\\Meera\\workspace\\horoscope\\horoscope\\ariesicon.jpg");
    icon.setIcon(img);
    datal.setText("Today you will feel courageous and might try some extra ordinary tasks. You might go on short journeys. Financial position will be average. Be cautious about health. If you are planning to buy a vehicle then you should postpone it. Your relation with your spouse shall be full of tension due to hot argument with him/her.");
    
	break;

case "gemini":
	img =new ImageIcon("C:\\Users\\Meera\\workspace\\horoscope\\horoscope\\geminiicon.jpg");
    icon.setIcon(img);
    datal.setText("Your expenditure will be more than your income. Control unnecessary expenditures otherwise you may be in financial crisis. Your younger brother/sister might try to harm you. Your relation with spouse may be bitter. So control yourself and avoid argument with spouse otherwise your domestic environment shall get affected. This is not a good day for investment and health.");
	break;
	

case "cancer":
	img =new ImageIcon("C:\\Users\\Meera\\workspace\\horoscope\\horoscope\\cancericon.jpg");
    icon.setIcon(img);
    datal.setText("Today is the best day of the week. Definitely you shall get honour and respect in society. Businesspersons will get more order very easily from different resources. This is the time to invest in speculation. You will not rely upon your self. The day shall be average with some happiness and some confusion. So take all important decisions wisely and after thinking over that.");
	break;
	
case "virgo":
	img =new ImageIcon("C:\\Users\\Meera\\workspace\\horoscope\\horoscope\\virgoicon.jpg");
    icon.setIcon(img);
    datal.setText("Income will balance your expenditures. This shall be average day for income and business. Your love life is likely to improve. Long journey shall get cancelled. If you are a student then any classmate will help you in studies. If you are planning to get or buy a house then you should postpone it.");
	break;
	
case "sagittarius":
	img =new ImageIcon("C:\\Users\\Meera\\workspace\\horoscope\\horoscope\\sagittariusicon.jpg");
    icon.setIcon(img);
    datal.setText("Your working condition will improve. Your anxiety shall get removed. Your father’s health shall improve. You will be in touch with important people who will help you to make your career or working condition. Be cautious about the health of mother. Students can concentrate in their studies. You can get the property on the name of spouse. You will be busy in your work. Your mood will be romantic. You will enjoy the company of your spouse.");
	break;
	
case "capricorn":
	img =new ImageIcon("C:\\Users\\Meera\\workspace\\horoscope\\horoscope\\capricornicon.jpg");
    icon.setIcon(img);
    datal.setText("This day will be good for you. You will earn more than your expectations. Your destiny will be with you. Your relationship with your spouse may deteriorate, so be cautious otherwise it may become bitter in future as well. You may get good news from your children or they may get an award or honor in society and also your name shall rise in society as well. Your health will be normal and your mind will be restless.");
	break;
	
case "aquarius":
	img =new ImageIcon("C:\\Users\\Meera\\workspace\\horoscope\\horoscope\\aquariusicon.jpg");
    icon.setIcon(img);
    datal.setText("Be cautious when you are driving or moving on the road as well as at the time of working. This is the not good day for investment. Try to maintain harmony with spouse. There shall be some unnecessary tension. Avoid unnecessary debate. Some bad news might disappoint you. It shall be average day for love related matters.");
	break;
	
case "pisces":
	img =new ImageIcon("C:\\Users\\Meera\\workspace\\horoscope\\horoscope\\piscesicon.jpg");
    icon.setIcon(img);
    
    datal.setText("This is the good time for getting help from spouse. Definitely he/she will support you. Your mood will be romantic. This is good time for studies. Business man can grow with new partner. They can get new offers. This is good time for savings but not good to invest in speculation. Your health will not be average, be cautious regarding your food. Do exercise on regular basis. Don't hurt any female rather be good to females.");
    break;
	
		}
			 
	
		
			//ImageIcon img =new ImageIcon("C:\\Users\\Meera\\workspace\\horoscope\\horoscope\\aquariusicon.jpg");
		      //  icon.setIcon(img);
			
		 }
	}

}
