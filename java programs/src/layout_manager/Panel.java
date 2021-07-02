package layout_manager;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Panel {
	
	JTextField t1;
	Panel()
	{
		JFrame f=new JFrame("Panel Example");
		JPanel p=new JPanel();
		JPanel p1=new JPanel();
		f.setLayout(new GridLayout(2,1));
		f.add(p1);
		p.setLayout(new GridLayout(3,3,5,5));
		
		p.setBounds(40, 80, 200, 200);
		p.setBackground(Color.gray);
		
		JButton b1=new JButton("1");
		b1.setBounds(50,100,80,40);
		b1.setBackground(Color.yellow);
		JButton b2=new JButton("2");
		b2.setBounds(100,100,80,40);
		b2.setBackground(Color.orange);
		JButton b3=new JButton("3");
		JButton b4=new JButton("4");
		JButton b5=new JButton("5");
		JButton b6=new JButton("6");
		JButton b7=new JButton("7");
		JButton b8=new JButton("8");
		JButton b9=new JButton("9");
		
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		p.add(b5);
		p.add(b6);
		p.add(b7);
		p.add(b8);
		p.add(b9);
		
		
		f.add(p);
		
		f.setSize(300,300);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

	public static void main(String[] args) {
		
			new Panel();
	}

}
