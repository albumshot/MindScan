package MindScan;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.color.*;
import java.util.*;

public class Game extends JFrame implements ActionListener
{
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
	String s1,s2,s3,s4,s5,s6,s7,s8,s9,s10;
	JLabel c1,c2,c3,c4,c5,c6,c7,c8,c9,c10;
	JButton btn,btn2,btn3;
	JPanel panel=new JPanel();
	JLabel lbl;
	public Game()
	{
	super("Mind Game");
	panel.setLayout(null);

	lbl=new JLabel("<html><u>Mind Scan</u></html>");
	lbl.setFont(new Font("Dialog",Font.ITALIC|Font.BOLD,20));
	lbl.setForeground(Color.RED);
	lbl.setBounds(500,10,200,20);
	panel.add(lbl);

	l1=new JLabel();
	l1.setText("<html>"+"1"+"<br><br>"+"2"+"<br><br>"+"3"+"<br><br>"+"4"+"<br><br>"+"5"+"<br><br>"+"6"+"<br><br>"+"7"+"<br><br>"+"8"+"<br><br>"+"9"+"<br><br>"+"10"+"<html>");
	l1.setBounds(100,50,70,500);
	l1.setFont(new Font("Dialog",Font.ITALIC|Font.BOLD,20));
	panel.add(l1);	

	l2=new JLabel();
	l2.setText("<html>"+"11"+"<br><br>"+"12"+"<br><br>"+"13"+"<br><br>"+"14"+"<br><br>"+"15"+"<br><br>"+"16"+"<br><br>"+"17"+"<br><br>"+"18"+"<br><br>"+"19"+"<br><br>"+"20"+"<html>");
	l2.setBounds(200,50,70,500);
	l2.setFont(new Font("Dialog",Font.ITALIC|Font.BOLD,20));
	panel.add(l2);

	l3=new JLabel();
	l3.setText("<html>"+"21"+"<br><br>"+"22"+"<br><br>"+"23"+"<br><br>"+"24"+"<br><br>"+"25"+"<br><br>"+"26"+"<br><br>"+"27"+"<br><br>"+"28"+"<br><br>"+"29"+"<br><br>"+"30"+"<html>");
	l3.setBounds(300,50,70,500);
	l3.setFont(new Font("Dialog",Font.ITALIC|Font.BOLD,20));
	panel.add(l3);	

	l4=new JLabel();
	l4.setText("<html>"+"31"+"<br><br>"+"32"+"<br><br>"+"33"+"<br><br>"+"34"+"<br><br>"+"35"+"<br><br>"+"36"+"<br><br>"+"37"+"<br><br>"+"38"+"<br><br>"+"39"+"<br><br>"+"40"+"<html>");
	l4.setBounds(400,50,70,500);
	l4.setFont(new Font("Dialog",Font.ITALIC|Font.BOLD,20));
	panel.add(l4);

	l5=new JLabel();
	l5.setText("<html>"+"41"+"<br><br>"+"42"+"<br><br>"+"43"+"<br><br>"+"44"+"<br><br>"+"45"+"<br><br>"+"46"+"<br><br>"+"47"+"<br><br>"+"48"+"<br><br>"+"49"+"<br><br>"+"50"+"<html>");
	l5.setBounds(500,50,70,500);
	l5.setFont(new Font("Dialog",Font.ITALIC|Font.BOLD,20));
	panel.add(l5);	
	
	l6=new JLabel();
	l6.setBounds(600,50,70,500);
	l6.setText("<html>"+"51"+"<br><br>"+"52"+"<br><br>"+"53"+"<br><br>"+"54"+"<br><br>"+"55"+"<br><br>"+"56"+"<br><br>"+"57"+"<br><br>"+"58"+"<br><br>"+"59"+"<br><br>"+"60"+"<html>");
	l6.setFont(new Font("Dialog",Font.ITALIC|Font.BOLD,20));
	panel.add(l6);	

	l7=new JLabel();
	l7.setText("<html>"+"61"+"<br><br>"+"62"+"<br><br>"+"63"+"<br><br>"+"64"+"<br><br>"+"65"+"<br><br>"+"66"+"<br><br>"+"67"+"<br><br>"+"68"+"<br><br>"+"69"+"<br><br>"+"70"+"<html>");
	l7.setBounds(700,50,70,500);
	l7.setFont(new Font("Dialog",Font.ITALIC|Font.BOLD,20));
	panel.add(l7);

	l8=new JLabel();
	l8.setBounds(800,50,70,500);
	l8.setText("<html>"+"71"+"<br><br>"+"72"+"<br><br>"+"73"+"<br><br>"+"74"+"<br><br>"+"75"+"<br><br>"+"76"+"<br><br>"+"77"+"<br><br>"+"78"+"<br><br>"+"79"+"<br><br>"+"80"+"<html>");
	l8.setFont(new Font("Dialog",Font.ITALIC|Font.BOLD,20));
	panel.add(l8);	

	l9=new JLabel();
	l9.setText("<html>"+"81"+"<br><br>"+"82"+"<br><br>"+"83"+"<br><br>"+"84"+"<br><br>"+"85"+"<br><br>"+"86"+"<br><br>"+"87"+"<br><br>"+"88"+"<br><br>"+"89"+"<br><br>"+"90"+"<html>");
	l9.setBounds(900,50,70,500);
	l9.setFont(new Font("Dialog",Font.ITALIC|Font.BOLD,20));
	panel.add(l9);

	l10=new JLabel();
	l10.setText("<html>"+"91"+"<br><br>"+"92"+"<br><br>"+"93"+"<br><br>"+"94"+"<br><br>"+"95"+"<br><br>"+"96"+"<br><br>"+"97"+"<br><br>"+"98"+"<br><br>"+"99"+"<br><br>"+"100"+"<html>");
	l10.setBounds(1000,50,70,500);
	l10.setFont(new Font("Dialog",Font.ITALIC|Font.BOLD,20));
	panel.add(l10);

	c1=new JLabel();
	s1="<html>"+"!"+"<br><br>"+"@"+"<br><br>"+"$"+"<br><br>"+"%"+"<br><br>"+"^"+"<br><br>"+"&"+"<br><br>"+"*"+"<br><br>"+"?"+"<br><br>"+"#"+"<br><br>"+"+"+"</html>";
	c1.setText(s1);
	c1.setBounds(120,50,70,500);
	c1.setFont(new Font("Dialog",Font.ITALIC|Font.BOLD,20));
	c1.setForeground(Color.red);
	panel.add(c1);

	c2=new JLabel();
	s2="<html>"+"@"+"<br><br>"+"$"+"<br><br>"+"%"+"<br><br>"+"^"+"<br><br>"+"&"+"<br><br>"+"*"+"<br><br>"+"?"+"<br><br>"+"#"+"<br><br>"+"+"+"<br><br>"+"!"+"</html>";
	c2.setText(s2);
	c2.setBounds(230,50,70,500);
	c2.setFont(new Font("Dialog",Font.ITALIC|Font.BOLD,20));
	c2.setForeground(Color.red);
	panel.add(c2);

	c3=new JLabel();
	s3="<html>"+"$"+"<br><br>"+"%"+"<br><br>"+"^"+"<br><br>"+"&"+"<br><br>"+"*"+"<br><br>"+"?"+"<br><br>"+"#"+"<br><br>"+"+"+"<br><br>"+"!"+"<br><br>"+"@"+"</html>";
	c3.setText(s3);
	c3.setBounds(330,50,70,500);
	c3.setFont(new Font("Dialog",Font.ITALIC|Font.BOLD,20));
	c3.setForeground(Color.red);
	panel.add(c3);

	c4=new JLabel();
	s4="<html>"+"%"+"<br><br>"+"^"+"<br><br>"+"&"+"<br><br>"+"*"+"<br><br>"+"?"+"<br><br>"+"#"+"<br><br>"+"+"+"<br><br>"+"!"+"<br><br>"+"@"+"<br><br>"+"$"+"</html>";
	c4.setText(s4);
	c4.setBounds(430,50,70,500);
	c4.setFont(new Font("Dialog",Font.ITALIC|Font.BOLD,20));
	c4.setForeground(Color.red);
	panel.add(c4);

	c5=new JLabel();
	s5="<html>"+"^"+"<br><br>"+"&"+"<br><br>"+"*"+"<br><br>"+"?"+"<br><br>"+"#"+"<br><br>"+"+"+"<br><br>"+"!"+"<br><br>"+"@"+"<br><br>"+"$"+"<br><br>"+"%"+"</html>";
	c5.setText(s5);
	c5.setBounds(530,50,70,500);
	c5.setFont(new Font("Dialog",Font.ITALIC|Font.BOLD,20));
	c5.setForeground(Color.red);
	panel.add(c5);

	c6=new JLabel();
	s6="<html>"+"&"+"<br><br>"+"*"+"<br><br>"+"?"+"<br><br>"+"#"+"<br><br>"+"+"+"<br><br>"+"!"+"<br><br>"+"@"+"<br><br>"+"$"+"<br><br>"+"%"+"<br><br>"+"^"+"</html>";
	c6.setText(s6);
	c6.setBounds(630,50,70,500);
	c6.setFont(new Font("Dialog",Font.ITALIC|Font.BOLD,20));
	c6.setForeground(Color.red);
	panel.add(c6);

	c7=new JLabel();
	s7="<html>"+"*"+"<br><br>"+"?"+"<br><br>"+"#"+"<br><br>"+"+"+"<br><br>"+"!"+"<br><br>"+"@"+"<br><br>"+"$"+"<br><br>"+"%"+"<br><br>"+"^"+"<br><br>"+"&"+"</html>";
	c7.setText(s7);
	c7.setBounds(730,50,70,500);
	c7.setFont(new Font("Dialog",Font.ITALIC|Font.BOLD,20));
	c7.setForeground(Color.red);
	panel.add(c7);

	c8=new JLabel();
	s8="<html>"+"?"+"<br><br>"+"#"+"<br><br>"+"+"+"<br><br>"+"!"+"<br><br>"+"@"+"<br><br>"+"$"+"<br><br>"+"%"+"<br><br>"+"^"+"<br><br>"+"&"+"<br><br>"+"*"+"</html>";
	c8.setText(s8);
	c8.setBounds(830,50,70,500);
	c8.setFont(new Font("Dialog",Font.ITALIC|Font.BOLD,20));
	c8.setForeground(Color.red);
	panel.add(c8);

	c9=new JLabel();
	s9="<html>"+"#"+"<br><br>"+"+"+"<br><br>"+"!"+"<br><br>"+"@"+"<br><br>"+"$"+"<br><br>"+"%"+"<br><br>"+"^"+"<br><br>"+"&"+"<br><br>"+"*"+"<br><br>"+"?"+"</html>";
	c9.setText(s9);
	c9.setBounds(930,50,70,500);
	c9.setFont(new Font("Dialog",Font.ITALIC|Font.BOLD,20));
	c9.setForeground(Color.red);
	panel.add(c9);

	c10=new JLabel();
	s10="<html>"+"+"+"<br><br>"+"!"+"<br><br>"+"@"+"<br><br>"+"$"+"<br><br>"+"%"+"<br><br>"+"^"+"<br><br>"+"&"+"<br><br>"+"*"+"<br><br>"+"?"+"<br><br>"+"#"+"</html>";
	c10.setText(s10);
	c10.setBounds(1030,50,70,500);
	c10.setFont(new Font("Dialog",Font.ITALIC|Font.BOLD,20));
	c10.setForeground(Color.red);
	panel.add(c10);


	btn=new JButton("Refresh");
	btn.setBounds(600,600,150,50);
	panel.add(btn);
	btn.addActionListener(this);

	btn2=new JButton("Scan your mind");
	btn2.setBounds(400,600,150,50);
	panel.add(btn2);
	btn2.addActionListener(this);

	btn3=new JButton("Exit");
	btn3.setBounds(800,600,150,50);
	panel.add(btn3);
	btn3.addActionListener(this);	
	
	getContentPane().add(panel);
	}
public void actionPerformed(ActionEvent e)
	{

	if(e.getSource()==btn)
	{
	char ch[]=new char[10];

	
	ch[0]=s1.charAt(6);
	ch[1]=s1.charAt(15);
	ch[2]=s1.charAt(24);
	ch[3]=s1.charAt(33);
	ch[4]=s1.charAt(42);
	ch[5]=s1.charAt(51);
	ch[6]=s1.charAt(60);
	ch[7]=s1.charAt(69);
	ch[8]=s1.charAt(78);
	ch[9]=s1.charAt(87);
	
	s1="<html>"+ch[9]+"<br><br>"+ch[0]+"<br><br>"+ch[1]+"<br><br>"+ch[2]+"<br><br>"+ch[3]+"<br><br>"+ch[4]+"<br><br>"+ch[5]+"<br><br>"+ch[6]+"<br><br>"+ch[7]+"<br><br>"+ch[8]+"</html>";
	c1.setText(s1);
	
	ch[0]=s2.charAt(6);
	ch[1]=s2.charAt(15);
	ch[2]=s2.charAt(24);
	ch[3]=s2.charAt(33);
	ch[4]=s2.charAt(42);
	ch[5]=s2.charAt(51);
	ch[6]=s2.charAt(60);
	ch[7]=s2.charAt(69);
	ch[8]=s2.charAt(78);
	ch[9]=s2.charAt(87);
	
	s2="<html>"+ch[9]+"<br><br>"+ch[0]+"<br><br>"+ch[1]+"<br><br>"+ch[2]+"<br><br>"+ch[3]+"<br><br>"+ch[4]+"<br><br>"+ch[5]+"<br><br>"+ch[6]+"<br><br>"+ch[7]+"<br><br>"+ch[8]+"</html>";
	c2.setText(s2);

	ch[0]=s3.charAt(6);
	ch[1]=s3.charAt(15);
	ch[2]=s3.charAt(24);
	ch[3]=s3.charAt(33);
	ch[4]=s3.charAt(42);
	ch[5]=s3.charAt(51);
	ch[6]=s3.charAt(60);
	ch[7]=s3.charAt(69);
	ch[8]=s3.charAt(78);
	ch[9]=s3.charAt(87);
	
	s3="<html>"+ch[9]+"<br><br>"+ch[0]+"<br><br>"+ch[1]+"<br><br>"+ch[2]+"<br><br>"+ch[3]+"<br><br>"+ch[4]+"<br><br>"+ch[5]+"<br><br>"+ch[6]+"<br><br>"+ch[7]+"<br><br>"+ch[8]+"</html>";
	c3.setText(s3);

	ch[0]=s4.charAt(6);
	ch[1]=s4.charAt(15);
	ch[2]=s4.charAt(24);
	ch[3]=s4.charAt(33);
	ch[4]=s4.charAt(42);
	ch[5]=s4.charAt(51);
	ch[6]=s4.charAt(60);
	ch[7]=s4.charAt(69);
	ch[8]=s4.charAt(78);
	ch[9]=s4.charAt(87);
	
	s4="<html>"+ch[9]+"<br><br>"+ch[0]+"<br><br>"+ch[1]+"<br><br>"+ch[2]+"<br><br>"+ch[3]+"<br><br>"+ch[4]+"<br><br>"+ch[5]+"<br><br>"+ch[6]+"<br><br>"+ch[7]+"<br><br>"+ch[8]+"</html>";
	c4.setText(s4);

	ch[0]=s5.charAt(6);
	ch[1]=s5.charAt(15);
	ch[2]=s5.charAt(24);
	ch[3]=s5.charAt(33);
	ch[4]=s5.charAt(42);
	ch[5]=s5.charAt(51);
	ch[6]=s5.charAt(60);
	ch[7]=s5.charAt(69);
	ch[8]=s5.charAt(78);
	ch[9]=s5.charAt(87);
	
	s5="<html>"+ch[9]+"<br><br>"+ch[0]+"<br><br>"+ch[1]+"<br><br>"+ch[2]+"<br><br>"+ch[3]+"<br><br>"+ch[4]+"<br><br>"+ch[5]+"<br><br>"+ch[6]+"<br><br>"+ch[7]+"<br><br>"+ch[8]+"</html>";
	c5.setText(s5);

	ch[0]=s6.charAt(6);
	ch[1]=s6.charAt(15);
	ch[2]=s6.charAt(24);
	ch[3]=s6.charAt(33);
	ch[4]=s6.charAt(42);
	ch[5]=s6.charAt(51);
	ch[6]=s6.charAt(60);
	ch[7]=s6.charAt(69);
	ch[8]=s6.charAt(78);
	ch[9]=s6.charAt(87);
	
	s6="<html>"+ch[9]+"<br><br>"+ch[0]+"<br><br>"+ch[1]+"<br><br>"+ch[2]+"<br><br>"+ch[3]+"<br><br>"+ch[4]+"<br><br>"+ch[5]+"<br><br>"+ch[6]+"<br><br>"+ch[7]+"<br><br>"+ch[8]+"</html>";
	c6.setText(s6);

	ch[0]=s7.charAt(6);
	ch[1]=s7.charAt(15);
	ch[2]=s7.charAt(24);
	ch[3]=s7.charAt(33);
	ch[4]=s7.charAt(42);
	ch[5]=s7.charAt(51);
	ch[6]=s7.charAt(60);
	ch[7]=s7.charAt(69);
	ch[8]=s7.charAt(78);
	ch[9]=s7.charAt(87);
	
	s7="<html>"+ch[9]+"<br><br>"+ch[0]+"<br><br>"+ch[1]+"<br><br>"+ch[2]+"<br><br>"+ch[3]+"<br><br>"+ch[4]+"<br><br>"+ch[5]+"<br><br>"+ch[6]+"<br><br>"+ch[7]+"<br><br>"+ch[8]+"</html>";
	c7.setText(s7);

	ch[0]=s8.charAt(6);
	ch[1]=s8.charAt(15);
	ch[2]=s8.charAt(24);
	ch[3]=s8.charAt(33);
	ch[4]=s8.charAt(42);
	ch[5]=s8.charAt(51);
	ch[6]=s8.charAt(60);
	ch[7]=s8.charAt(69);
	ch[8]=s8.charAt(78);
	ch[9]=s8.charAt(87);
	
	s8="<html>"+ch[9]+"<br><br>"+ch[0]+"<br><br>"+ch[1]+"<br><br>"+ch[2]+"<br><br>"+ch[3]+"<br><br>"+ch[4]+"<br><br>"+ch[5]+"<br><br>"+ch[6]+"<br><br>"+ch[7]+"<br><br>"+ch[8]+"</html>";
	c8.setText(s8);
	
	ch[0]=s9.charAt(6);
	ch[1]=s9.charAt(15);
	ch[2]=s9.charAt(24);
	ch[3]=s9.charAt(33);
	ch[4]=s9.charAt(42);
	ch[5]=s9.charAt(51);
	ch[6]=s9.charAt(60);
	ch[7]=s9.charAt(69);
	ch[8]=s9.charAt(78);
	ch[9]=s9.charAt(87);
	
	s9="<html>"+ch[9]+"<br><br>"+ch[0]+"<br><br>"+ch[1]+"<br><br>"+ch[2]+"<br><br>"+ch[3]+"<br><br>"+ch[4]+"<br><br>"+ch[5]+"<br><br>"+ch[6]+"<br><br>"+ch[7]+"<br><br>"+ch[8]+"</html>";
	c9.setText(s9);

	ch[0]=s10.charAt(6);
	ch[1]=s10.charAt(15);
	ch[2]=s10.charAt(24);
	ch[3]=s10.charAt(33);
	ch[4]=s10.charAt(42);
	ch[5]=s10.charAt(51);
	ch[6]=s10.charAt(60);
	ch[7]=s10.charAt(69);
	ch[8]=s10.charAt(78);
	ch[9]=s10.charAt(87);
	
	s10="<html>"+ch[9]+"<br><br>"+ch[0]+"<br><br>"+ch[1]+"<br><br>"+ch[2]+"<br><br>"+ch[3]+"<br><br>"+ch[4]+"<br><br>"+ch[5]+"<br><br>"+ch[6]+"<br><br>"+ch[7]+"<br><br>"+ch[8]+"</html>";
	c10.setText(s10);

	//c2.setText(s1);
	 
	}
	
	if(e.getSource()==btn2)
	{
	
	char ch2=s1.charAt(78);
	String din=Character.toString(ch2);
	din="You selected"+" "+din;
	JOptionPane.showMessageDialog(this,din);
	}
	
	
	if(e.getSource()==btn3)
	{
		int n=JOptionPane.showConfirmDialog(this,"Are you sure want to exit...");
		if(n==0)
		System.exit(0);	
	}
	}


public static void main(String args[])
{
Game gm=new Game();
gm.setSize(900,600);
gm.setVisible(true);
gm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}