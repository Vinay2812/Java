import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

//set classpath=C:\oraclexe\app\oracle\product\10.2.0\server\jdbc\lib\ojdbc14.jar;.;

public class Exp12 implements ActionListener{
	
	JFrame f;
	JLabel l1,l2,l3,l4,l5,l6;
	JTextField t1,t2,t3,t4,t5;
	JButton b;
	
	Exp12()
	{
		f=new JFrame("Student Database");
		f.setLayout(null);
		
		l1=new JLabel("Enter name : ");
		l1.setBounds(30,30,200,30);
		t1=new JTextField();
		t1.setBounds(140,30,250,30);
		f.add(l1);
		f.add(t1);
		
		b=new JButton("Enter");
		b.setBounds(150,70,100,40);
		b.addActionListener(this);
		f.add(b);
		
		l2=new JLabel("Student Details");
		l2.setBounds(130,120,200,30);
		l2.setForeground(Color.RED);
		l2.setFont(new Font("Arial",Font.BOLD,16));
		f.add(l2);
		
		l3=new JLabel("Roll number: ");
		l3.setBounds(30,160,200,30);
		t2=new JTextField();
		t2.setBounds(140,160,250,30);
		t2.setEditable(false);
		f.add(l3);
		f.add(t2);
		
		l4=new JLabel("Name : ");
		l4.setBounds(30,200,200,30);
		t3=new JTextField();
		t3.setBounds(140,200,250,30);
		t3.setEditable(false);
		f.add(l4);
		f.add(t3);
		
		l5=new JLabel("CGPA : ");
		l5.setBounds(30,240,200,30);
		t4=new JTextField();
		t4.setBounds(140,240,250,30);
		t4.setEditable(false);
		f.add(l5);
		f.add(t4);
		
		l6=new JLabel("College : ");
		l6.setBounds(30,280,200,30);
		t5=new JTextField();
		t5.setBounds(140,280,250,30);
		t5.setEditable(false);
		f.add(l6);
		f.add(t5);
		
		
		f.setSize(500,400);
		f.setVisible(true);
		
		f.setResizable(false);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLocationRelativeTo(null);
		
		
		
	}
	
	public void connectDatabase() throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection connect=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","brockvs28");
		
		Statement st=connect.createStatement();
		
		String s=t1.getText();
		
		ResultSet rs=st.executeQuery("select * from Student_Details where name='"+s+"'");
		
		
		if(rs.next())
		{
			t2.setText(""+rs.getInt(1));
			t3.setText(rs.getString(2));
			t4.setText(""+rs.getDouble(3));
			t5.setText(rs.getString(4));
		}
		else
		{
			t2.setText("Data Not Available");
			t3.setText("Data Not Available");
			t4.setText("Data Not Available");
			t5.setText("Data Not Available");
		}
		connect.close();
	}

	public static void main(String[] args) {
		new Exp12();

	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b) {
			try {
			connectDatabase();
			}catch(Exception e1) {System.out.println(e1);}
		}
	}

}
