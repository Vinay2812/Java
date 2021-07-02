package JavaEventClasses;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Program_1 implements ActionListener{

	JTextField t1;
	JButton b1;
	JFrame f;
	Program_1()
	{
		f=new JFrame("Panel Example");
		JPanel p=new JPanel();
		JPanel p1=new JPanel();
		f.setLayout(new GridLayout(2,1));
		p1.setBounds(30,100,100,30);
		
		b1=new JButton("Click me");
		t1=new JTextField();
		t1.setBounds(50,70,100,30);
		p1.setLayout(new BorderLayout());
		p1.add(t1);
		
		p.add(b1);	
		b1.addActionListener(this);
		f.add(p1);
		f.add(p);
		f.setSize(300,300);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	public static void main(String[] args) {
		
			new Program_1();
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
				t1.setText("Welcome");
	}

}
