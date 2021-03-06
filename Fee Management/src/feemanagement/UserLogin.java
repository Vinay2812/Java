package feemanagement;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

//set classpath=C:\oraclexe\app\oracle\product\10.2.0\server\jdbc\lib\ojdbc14.jar;.;

public class UserLogin implements ActionListener{
	JFrame f;
	JLabel title,userName,userPassword;
	JTextField name;
	JPasswordField password;
	JButton login,signup;
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	
	UserLogin()
	{
		f=new JFrame("User Login");
		f.setLayout(null);
		
		title=new JLabel("WELCOME TO SGU STUDENT PORTAL");
		title.setFont(new Font("Arial",Font.BOLD,25));
		title.setForeground(Color.RED);
		title .setBounds(57,40,500,40);
		f.add(title);
		
		userName =new JLabel("User Name : ");
		userName.setBounds(90,130,120,40);
		userName.setFont(new Font("Arial",Font.BOLD,18));
		f.add(userName);
		
		name =new JTextField();
		name.setBounds(220,130,250,40);
		name.setFont(new Font("Arial",Font.PLAIN,17));
		f.add(name);
		
		userPassword =new JLabel("Password : ");
		userPassword.setBounds(90,210,120,40);
		userPassword.setFont(new Font("Arial",Font.BOLD,18));
		f.add(userPassword);
		
		password =new JPasswordField();
		password.setBounds(220,210,250,40);
		f.add(password);
		
		login=new JButton("Login");
		login.setBounds(165,280,100,50);
		login.setFont(new Font("Arial",Font.BOLD,17));
		login.addActionListener(this);
		f.add(login);
		
		signup=new JButton("Sign Up");
		signup.setBounds(310,280,100,50);
		signup.setFont(new Font("Arial",Font.BOLD,17));
		signup.addActionListener(this);
		f.add(signup);
		
		f.setSize(600,500);
		f.setResizable(false);
		f.setLocationRelativeTo(null);
		f.setVisible(true);
		f.setFocusable(true);
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

	public static void main(String[] args) {
		
			new UserLogin();

	}
	
	public void connectDatabase() throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","brockvs28");

	}

	@SuppressWarnings("deprecation")
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==login)
		{
			try
			{
				connectDatabase();

				ps=con.prepareStatement("select * from Fee_Management where prn=? and password=?");
				ps.setString(1, name.getText());
				ps.setString(2, password.getText());
				
				rs=ps.executeQuery();
			
			if(rs.next())
			{
				JOptionPane.showMessageDialog(f, "Login Successful");
				new FeeManagement(rs.getString(1),rs.getString(3),rs.getString(4),rs.getString(5));
				
			}
			else
			{
				JOptionPane.showMessageDialog(f, "Invalid user name or password");
			}
				
			name.setText("");
			password.setText("");
			con.close();
			}catch(Exception e1) {System.out.println(e1);}
		}
		else if(e.getSource()==signup)
		{
			
			try
			{
				connectDatabase();
				name.setText("");
				password.setText("");
				
				String n=JOptionPane.showInputDialog(f,"Enter Name : ");
				String p=JOptionPane.showInputDialog(f,"Create password : ");
				
				PreparedStatement ps1=con.prepareStatement("select max(prn) from Fee_Management");
				ResultSet rs1=ps1.executeQuery();
				rs1.next();
				String prn=rs1.getString(1);
				
				//19st114281102
				
				int count=Integer.parseInt(prn.substring(4,13));
				count++;
				
				//count =114281103
				
				String help="19st"+count;
				
				ps=con.prepareStatement("insert into  Fee_Management"+" values(?,?,?,?,?)");
				
				ps.setString(1,help);
				ps.setString(2, p);
				ps.setString(3,n);
				ps.setInt(4, 0);
				ps.setLong(5,137000);
				
				rs=ps.executeQuery();
				rs.next();
				con.close();
				
				name.setText(help);
				
			}
			catch(Exception e1) {System.out.println(e1);}
		}
	}

}
