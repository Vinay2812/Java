import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
public class calculator implements ActionListener{
	
	JTextField t1,t2,t3;
	JLabel firstNum,secondNum,resultOfNum;
	JButton addButton,subButton,multiButton,divButton;
	JFrame jf;
	static double a=0,b=0,result=0;
	
	calculator()
	{
		jf = new JFrame("Calculator");
		jf.setSize(400,500);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setFocusable(true);
		
		jf.setLayout(new GridLayout(4,2));
		
		
		
		firstNum=new JLabel("First Number : ");
		t1=new JTextField();
		
		firstNum.setBounds(20, 72, 100, 30);
		
		t1.setBounds(250, 72, 100,30);
		
		secondNum=new JLabel("Second Number : ");
		t2=new JTextField();
		secondNum.setBounds(20, 197, 100, 30);
		t2.setBounds(250, 197, 100,30);
		
		
		resultOfNum = new JLabel("Result is : ");
		t3=new JTextField();
		resultOfNum.setBounds(20, 322, 100, 30);
		t3.setBounds(250, 197, 100,30);
		

		addButton=new JButton("+");
		subButton=new JButton("-");
		multiButton=new JButton("*");
		divButton=new JButton("/");
		JPanel p= new JPanel();
		p.add(addButton);
		p.add(subButton);
		p.add(multiButton);
		p.add(divButton);
//		addButton.setBounds(30, 447, 40, 40);
//		addButton.setBounds(80, 447, 40, 40);
//		addButton.setBounds(130, 447, 40, 40);
//		addButton.setBounds(180, 447, 40, 40);
		
		jf.add(firstNum);
		jf.add(t1);
		jf.add(secondNum);
		jf.add(t2);
		jf.add(resultOfNum);
		jf.add(t3);
		jf.add(p);
//		jf.add(addButton);
//		jf.add(subButton);
//		jf.add(multiButton);
//		jf.add(divButton);
		
		addButton.addActionListener(this);
		subButton.addActionListener(this);
		multiButton.addActionListener(this);
		divButton.addActionListener(this);
		
		jf.pack();
		jf.setLocationRelativeTo(null);
		

	}

	public static void main(String[] args) {
		new calculator();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		try {
			a=Double.parseDouble(t1.getText());
			b=Double.parseDouble(t2.getText());
		if(e.getSource()==addButton)
		{
			result=a+b;
			t3.setText(""+result);
		}
		else if(e.getSource()==subButton)
		{
			result=a-b;
			t3.setText(""+result);
		}
		else if(e.getSource()==multiButton)
		{
			result=a*b;
			t3.setText(""+result);
		}
		else if(e.getSource()==divButton)
		{
			try {
			result=a/b;
                        t3.setText(""+result);
			}
			catch (Exception e2) {
			  t3.setText("Invalid Trying to divide by zero");
			}
			
		}
			}
		catch(Exception e1){
		t3.setText("Invalid");
	    }
		
		
	}
	
	

}
