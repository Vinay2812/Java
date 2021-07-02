package layout_manager;
import java.io.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class VCard extends WindowAdapter implements ActionListener {
	JFrame f;
	JLabel l1,l2;
	JTextField t1,t2;
	JTextArea ta;
	JButton addContact;
	JMenuBar mb;
	JMenu file,exit,menu;
	JMenuItem m1,m2,m4,item1,item2,item3;
	String path;
	File fi;
	JFileChooser j;
	JScrollPane s;
	
	VCard()
	{
		f=new JFrame("VCard");
		l1=new JLabel("Enter Name : ");
		t1=new JTextField();
		l1.setBounds(30,40,100,30);
		t1.setBounds(140,40,300,30);
		f.add(l1);
		f.add(t1);
		
		l2=new JLabel("Mobile Number : ");
		t2=new JTextField();
		l2.setBounds(30,80,100,30);
		t2.setBounds(140,80,300,30);
		f.add(l2);
		f.add(t2);
		
		addContact=new JButton("Add Contact");
		addContact.setBounds(165,120,150,40);
		f.add(addContact);
		addContact.addActionListener(this);
		
		ta=new JTextArea(1000,1000);
		//ta.setBounds(30,170,420,200);
		s=new JScrollPane(ta);
		s.setBounds(30,170,420,200);
		ta.setEditable(false); 
		f.add(s);
		
		mb = new JMenuBar();
		menu =new JMenu("Menu");
		file =new JMenu("File");
		exit=new JMenu("Exit");
		
		item1=new JMenuItem("Item 1");
		item2=new JMenuItem("Item 2");
		item3=new JMenuItem("Item 3");
		
		m1=new JMenuItem("Add Contact");
		m2=new JMenuItem("Read Contact");
		m4=new JMenuItem("exit");
		
		m1.addActionListener(this);
		m2.addActionListener(this);
		m4.addActionListener(this);
		item1.addActionListener(this);
		item2.addActionListener(this);
		item3.addActionListener(this);
		
		menu.add(item1);
		menu.add(item2);
		menu.add(item3);
		
		file.add(m1);
		file.add(m2);
		
		exit.add(m4);
		
		mb.add(menu);
		mb.add(file);
		mb.add(exit);
		f.getContentPane().add(BorderLayout.NORTH,mb);
		
		
		f.addWindowListener(this);
		f.setJMenuBar(mb);
		f.setLayout(null);
		f.setSize(500,450);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		f.setResizable(false);
		f.setLocationRelativeTo(null);
	}
	
	public void getPath() {
		j=new JFileChooser("D:\\");
		j.setSelectedFile(new File("VCard.txt"));
		j.showOpenDialog(null);
		fi=j.getSelectedFile();
		path=fi.getAbsolutePath();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new VCard();

	}
	
	public void updateFile() throws IOException{
		getPath();
		FileWriter fw=new FileWriter(path,true);
		String s=t1.getText()+" :\t"+t2.getText()+"\n";
		fw.write(s);
		fw.close();
		t1.setText("");
		t2.setText("");
		ta.setText("Added Succesfully");
	}
	
	public void readFile() throws IOException{
		getPath();
		FileReader fr=new FileReader(path);
		String s="";
		int c;
		while((c=fr.read())!=-1)
		{
			s+=(char)c;
		}
		s+="\n\nRead Succesfully";
		ta.setText(s);

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==item1) {
			JOptionPane.showMessageDialog(f,"Welcome");
			ta.setText("");
		}
		else if(e.getSource()==item2) {
			JOptionPane.showMessageDialog(f,"Welcome Again");
			ta.setText("");
		}
		else if(e.getSource()==item3) {
			JOptionPane.showMessageDialog(f,"Success");
			ta.setText("");
			JFileChooser jf=new JFileChooser("C:\\Users\\HP\\OneDrive\\Desktop\\java\\java programs");
			jf.showOpenDialog(null);
			File F=jf.getSelectedFile();
	        	
		}
		try {
			long a=Long.parseLong(t2.getText());
			int count=0;
			while(a!=0) {
				a=a/10;
				count++;
			}
			
			if(count!=10)throw new Exception("");
		if(e.getSource()==addContact) {
			ta.setText("");
			try {
			updateFile();
			}catch (Exception e1) {}
		
		}
		else if(e.getSource()==m1) {
			ta.setText("");
			try {
			updateFile();
			}catch (Exception e1) {}
		}
		}catch(Exception e2)
		{
			ta.setText("");
			ta.setText("Invalid");
		}
		
		
		if(e.getSource()==m2) {
			ta.setText("");
			try {
			readFile();
			}catch (Exception e1) {}
		}
		else if(e.getSource()==m4) {
			System.exit(0);
		}
		
	}
	
	@Override
	public void windowClosing(WindowEvent e) {
		int a=JOptionPane.showConfirmDialog(f,"Are you sure");
		if(a==JOptionPane.YES_OPTION) {
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	}

}
