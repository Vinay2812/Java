import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Calculator implements ActionListener
{
    JLabel l1,l2,l3,l4;
    JTextField t1,t2,t3;
    JButton b1,b2,b3,b4;
    Calculator()
    {
        
         l1=new JLabel("Operand 1");
         l2=new JLabel("Operand 2");
         l3=new JLabel("Result");
         l4=new JLabel("Status");
         t1=new JTextField();
         t2=new JTextField();
         t3=new JTextField();
         b1=new JButton("Add");
         b2=new JButton("Sub");
         b3=new JButton("Mul");
         b4=new JButton("Div");
	JPanel p=new JPanel();
	p.add(b1);
	p.add(b2);
	p.add(b3);
	p.add(b4);

        l1.setBounds(50,50,100,50);
        t1.setBounds(200,50,150,100);
        l2.setBounds(50,100,100,50);
        t2.setBounds(200,100,150,100);
        l3.setBounds(50,150,100,50);
        t3.setBounds(200,150,150,100);
       // b1.setBounds(60,200,100,80);
       // b2.setBounds(90,200,100,80); 
       // b3.setBounds(130,200,100,80);
        //b4.setBounds(170,200,100,80);
        
        
        
        JFrame jf=new JFrame();
        jf.setLayout(new GridLayout(4,2));

        jf.add(l1);
        jf.add(t1);
        jf.add(l2);
        jf.add(t2);
        jf.add(l3);
        jf.add(t3);
        jf.add(p);
        
        jf.add(l4);

	b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
	jf.pack();
                
 
        jf.setSize(500,500);
        jf.setVisible(true);
	jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args)
    {
        new Calculator();
        
    }
    public void actionPerformed(ActionEvent e)
    {
       double a=0;
       double b=0;

       try
       {
          a=Double.parseDouble(t1.getText());
          b=Double.parseDouble(t2.getText());
       }catch(Exception e1){
       l4.setText("Invalid Number");
       }
       
       double res=0;
       if(e.getSource()==b1)
       {
          res=a+b;
          t3.setText(Double.toString(res));
       }
       else if(e.getSource()==b2)
       {
          res=a-b;
          t3.setText(Double.toString(res));
       }
       else if(e.getSource()==b3)
       {
          res=a*b;
          t3.setText(Double.toString(res));
       }
       else if(e.getSource()==b4)
       {
          res=a/b;
          t3.setText(Double.toString(res));
       }
       }
}