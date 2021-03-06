package feemanagement;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class FeeManagement extends WindowAdapter implements ActionListener
{
    JLabel l1,l3,l4,l5;
    JLabel t1,t3,t4,t5,amountLabel;
    JTextField amount;
    JButton b;
    JFrame f;
    String prn ,name, paid, unpaid;
    FeeManagement(String prn,String name ,String paid,String unpaid)
    {
    	this.name=name;
    	this.prn=prn;
    	this.paid=paid;
    	this.unpaid=unpaid;
    	
        f=new JFrame("PAY FEE");
        f.setLayout(null);
        l1=new JLabel("PRN :");
        l1.setFont(new Font("Arial",Font.BOLD,18));
        l3=new JLabel("Name :");
        l3.setFont(new Font("Arial",Font.BOLD,18));
        l4=new JLabel("Paid fee :");
        l4.setFont(new Font("Arial",Font.BOLD,18));
        l5=new JLabel("Remaining fee :");
        l5.setFont(new Font("Arial",Font.BOLD,18));
        amountLabel=new JLabel("Enter amount to pay : ");
        amountLabel.setFont(new Font("Arial",Font.BOLD,16));
        

        t1 = new JLabel(prn);
        t1.setFont(new Font("Arial",Font.PLAIN,18));
        //t2 = new JTextField(10);
        t3 = new JLabel(name);
        t3.setFont(new Font("Arial",Font.PLAIN,18));
        t4 = new JLabel(paid);
        t4.setFont(new Font("Arial",Font.PLAIN,18));
        t5 = new JLabel(unpaid);
        t5.setFont(new Font("Arial",Font.PLAIN,18));
        
        amount=new JTextField();
        amount.setFont(new Font("Arial",Font.PLAIN,16));
        

        b= new JButton("Go To Pay");
        b.addActionListener(this);

        l1.setBounds(90,80,80,30);
        t1.setBounds(148,80,150,30);
        l3.setBounds(280,80,100,30);
        t3.setBounds(350,80,100,30);
        l4.setBounds(90,150,100,30);
        t4.setBounds(175,150,100,30);
        l5.setBounds(280,150,150,30);
        t5.setBounds(420,150,100,30);
        
        amountLabel.setBounds(90,230,200,30);
        amount.setBounds(260,230,200,30);
        
        
        b.setBounds(230,300,100,30);


        f.add(l1);
        f.add(t1);
        f.add(l3);
        f.add(t3);
        f.add(l4);
        f.add(t4);
        f.add(l5);
        f.add(t5);
        f.add(amountLabel);
        f.add(amount);
        
        f.add(b);


        f.setSize(600, 500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.setLocationRelativeTo(null);

    }
    public void actionPerformed (ActionEvent e){
        if (e.getSource() == b) {
        	try
        	{
           //new FeePayment();
        	JOptionPane.showInputDialog(f,"Enter Credit/Debit card number : ");
        	JOptionPane.showInputDialog(f,"Enter CVV : ");
        	JOptionPane.showInputDialog(f,"Enter OTP : ");
        	JOptionPane.showMessageDialog(f,"Transaction Successful");
        	
        	int a=Integer.parseInt(amount.getText());
        	int p =Integer.parseInt(paid)+a;
        	int up=Integer.parseInt(unpaid)- a;
        	paid=""+p;
        	unpaid=""+up;
        	
        	Class.forName("oracle.jdbc.driver.OracleDriver");
    		
    		Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","brockvs28");
    		
    		PreparedStatement ps1=con.prepareStatement("update Fee_Management set paid_fees=? ,unpaid_fees=? where prn=?");
    		ps1.setString(1,paid);
    		ps1.setString(2,unpaid);
    		ps1.setString(3, prn);
			ResultSet rs1=ps1.executeQuery();
			rs1.next();
			
			con.close();
			t4.setText(""+p);
			t5.setText(""+up);
			
			amount.setText("");
        	}
        	catch(Exception e1) {System.out.println(e1);}
        }
        
       
    }
    

}
