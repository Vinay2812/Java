package layout_manager;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class UsernameAndPassword extends WindowAdapter implements ActionListener{
	
	JFrame f;
	JTextArea ta;
	JButton enter;
	JTextField t1;
	JPasswordField pass;
	JLabel l1,l2;
	JScrollPane sb;
	
	UsernameAndPassword()
	{
		f=new JFrame("User Login");
		
		l1=new JLabel("User Name");
		t1=new JTextField();
		l1.setBounds(30,30,100,20);
		t1.setBounds(160,30,150,20);
		f.add(l1);
		f.add(t1);
		
		l2=new JLabel("Password");
		pass=new JPasswordField();
		l2.setBounds(30,60,100,20);
		pass.setBounds(160,60,150,20);
		f.add(l2);
		f.add(pass);
		
		enter=new JButton("Login");
		enter.setBounds(190,90,100,30);
		enter.addActionListener(this);
		f.add(enter);
		
		ta=new JTextArea(500,500);
//		ta.setBounds(30,130,420,40);
		ta.setEditable(false);
		sb = new JScrollPane(ta);
		sb.setBounds(30,130,420,100);
		f.add(sb);
		//ta.setBackground(new Color(0,0,0));
//		JPanel p2=new JPanel();
//		p2.add(ta);
//		f.add(ta);
		
		
		
		
		
		f.setLayout(null);
		f.addWindowListener(this);
		f.setResizable(false);
		f.setVisible(true);
		f.setSize(500,300);
		
		f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		f.setLocationRelativeTo(null);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new UsernameAndPassword();

	}
	
	public void windowClosing(WindowEvent e)
	{
		int a=JOptionPane.showConfirmDialog(f,"Are you sure");
		if(a==JOptionPane.YES_OPTION) {
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
		if(e.getSource()==enter) {
			
			@SuppressWarnings("deprecation")
			String s= "User name :" + t1.getText()+"\nPassword :"+pass.getText();
			ta.setText(s);
			
		}
		
	}


}
