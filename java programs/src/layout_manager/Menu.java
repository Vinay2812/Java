package layout_manager;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Menu extends WindowAdapter implements ActionListener{
	
	JFrame f;
	JMenuBar mb;
	JMenu m1,m2;
	JMenuItem mi1,mi2;
	JTextArea ta;
	JButton send,reset;
	JTextField t1;
	
	Menu()
	{
		f=new JFrame("Java Frame");
		{
			JOptionPane.showMessageDialog(f,"Welcome");
		}
		
		mb=new JMenuBar();
		m1=new JMenu("File");
		m2=new JMenu("Help");
		mb.add(m1);
		mb.add(m2);
		
		mi1=new JMenuItem("Open");
		mi2=new JMenuItem("Save as");
		m1.add(mi1);
		m1.add(mi2);
		
		JPanel p=new JPanel();
		JLabel l1=new JLabel("Enter Text");
		t1=new JTextField(20);
		send =new JButton("Send");
		reset=new JButton("Reset");
		
		send.addActionListener(this);
		reset.addActionListener(this);

		p.add(l1);
		p.add(t1);
		p.add(Box.createHorizontalStrut(60));
		p.add(send);
		p.add(reset);
		ta=new JTextArea();
		ta.setEditable(false);
		
		f.getContentPane().add(BorderLayout.NORTH,mb);
		f.getContentPane().add(BorderLayout.CENTER,ta);
		f.getContentPane().add(BorderLayout.SOUTH,p);
		
		f.addWindowListener(this);
		f.setVisible(true);
		f.setSize(500,300);
		
		f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		f.setLocationRelativeTo(null);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Menu();

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
		
		if(e.getSource()==reset) {
			ta.setText("");
		}
		if(e.getSource()==send) {
			String s=ta.getText() + "\n" +t1.getText();
			ta.setText(s);
			t1.setText("");
			
		}
		
	}


}
