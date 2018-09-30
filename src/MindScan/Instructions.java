package MindScan;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import MindScan.Game;

public class Instructions extends JFrame implements ActionListener
{
	JPanel panel=new JPanel();
	JLabel l1,l2;
	JButton btn;

	public Instructions()
	{
	super("Instructions");
	panel.setLayout(null);

	l1=new JLabel();
	l1.setText("Follows these instructions that are given below:-");
	l1.setFont(new Font("Dialog",Font.BOLD|Font.ITALIC,25));
	l1.setForeground(Color.RED);
	l1.setBounds(10,100,600,40);
	panel.add(l1);

	l2=new JLabel();
	l2.setText("<html>1.Select or Choose any two digit number from 10 to 99 in a given table.<br><br>2.Add both digit of number that you are selected. <br><br>3.Substract the result of 2 rule from the number that you are selected.<br><br>4.Choose or select the character or symbol of specified result after substraction.<br><br>5. After, click on 'Scan your mind' button. You getting the character or symbol that you are selected.<br><br>For example:-  I selected an two digit number from 10 to 99 i.e 87.<br> I also add both these digits i.e 8+7=15.<br> After I substract 15 from 87 i.e 87-15=72.<br> After I select the character of 72th position i.e '&'.<br> And I the click on 'Scan your mind' button then they will provide the character that I was selected in the result i.e 'You selected &' </html>");
	l2.setFont(new Font("Dialog",Font.BOLD|Font.ITALIC,20));
	l2.setBounds(10,150,1400,450);
	panel.add(l2);

	btn=new JButton("Start");
	btn.setFont(new Font("Dialog",Font.BOLD|Font.ITALIC,25));
	btn.setForeground(Color.orange);
	btn.setBounds(430,620,200,70);
	btn.addActionListener(this);
	panel.add(btn);



	getContentPane().add(panel);
	
	}
public void actionPerformed(ActionEvent e)
	{
	if(e.getSource()==btn)
	{
	Game gm=new Game();
	gm.setSize(1500,900);
	gm.setVisible(true);
	//gm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	}


public static void main(String args[])
{
Instructions ins=new Instructions();
ins.setSize(600,900);
ins.setVisible(true);
ins.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}