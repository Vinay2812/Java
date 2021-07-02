package layout_manager;

import java.io.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class GUI extends WindowAdapter implements ActionListener,ItemListener{
	JFrame f;
	JTextArea ta;
	JMenuBar mb;
	JMenu exit,menu;
	JMenuItem m4,item1,item2,item3;
	File fi;
	JFileChooser j;
	JScrollPane s;
	Checkbox c1,c2,c3;
	JButton order;
	int bill;
	int co1,co2,co3;
	
	GUI(){
		f=new JFrame("GUI");
		
		ta=new JTextArea(1000,1000);
		//ta.setBounds(30,170,420,200);
		s=new JScrollPane(ta);
		s.setBounds(30,30,430,340);
		ta.setEditable(false);
		s.setVisible(false);
		f.add(s);
		
		c1=new Checkbox("Pizza@100");
		c2=new Checkbox("Cold Coffee@60");
		c3=new Checkbox("Fries@50");
        order=new JButton("Order");
        
        c1.setBounds(165,50 ,100,50);
		c2.setBounds(165,100 ,100,50);
		c3.setBounds(165,150 ,100,50);
		order.setBounds(165,200,100,40);
		
		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);
		order.addActionListener(this);
		
        c1.setVisible(false);
		c2.setVisible(false);
		c3.setVisible(false);
		order.setVisible(false);
        
	
		f.add(order);
		f.add(c1);
		f.add(c2);
		f.add(c3);
		
		mb = new JMenuBar();
		menu =new JMenu("Menu");
		exit=new JMenu("Exit");
		
		item1=new JMenuItem("Item 1");
		item2=new JMenuItem("Item 2");
		item3=new JMenuItem("Item 3");
		
		item1.addActionListener(this);
		item2.addActionListener(this);
		item3.addActionListener(this);

		m4=new JMenuItem("exit");
		m4.addActionListener(this);
		
		
		menu.add(item1);
		menu.add(item2);
		menu.add(item3);

		exit.add(m4);
		
		mb.add(menu);
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

	public static void main(String[] args) {
	
			new GUI();
	}

	
	public void getFilePath() {
		JOptionPane.showMessageDialog(f,"Success");
		ta.setText("");
		j=new JFileChooser("C:\\Users\\HP\\OneDrive\\Desktop\\java\\java programs");
		//j.setSelectedFile(new File("VCard.txt"));
		j.showOpenDialog(null);
		fi=j.getSelectedFile();
		try {
		readFile();
		}catch(Exception e) {}
	}
	
	public void readFile() throws IOException{

		FileReader fr=new FileReader(fi);
		String s="";
		int c;
		while((c=fr.read())!=-1)
		{
			s+=(char)c;
		}
		s+="\n\nRead Succesfully";
		ta.setText(s);
		fr.close();

	}
	
	void getBill()
	{
		String s;
		s="";
		
		if(co1==0) {
			s+="Pizza = 100\n";
		}
		if(co2==0) {
			s+="Cold Coffee = 60\n";
		}
		if(co3==0) {
			s+="Fries = 50\n";
		}
		
		s+="\nYour Bill is RS "+bill;
		JOptionPane.showMessageDialog(f, s);
		c1.setState(false);
		c2.setState(false);
		c3.setState(false);
		co1=1;
		co2=1;
		co3=1;
		bill=0;
	}
	
	@Override
    public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==item1) {
			
			s.setVisible(false);
			c1.setVisible(false);
			c2.setVisible(false);
			c3.setVisible(false);
			order.setVisible(false);
			
			ta.setText("Welcome");
			s.setVisible(true);
			
		}
		
		if(e.getSource()==item2) {

			s.setVisible(false);			
			bill=0;
			co1=1;
			co2=1;
			co3=1;
			c1.setVisible(true);
			c2.setVisible(true);
			c3.setVisible(true);
			order.setVisible(true);
			
		}
		if(e.getSource()==item3) {
			
			s.setVisible(false);
			c1.setVisible(false);
			c2.setVisible(false);
			c3.setVisible(false);
			order.setVisible(false);
			
            getFilePath();
            s.setVisible(true);
            
		}
		if(e.getSource()==m4) {
			System.exit(0);
		}
		if(e.getSource()==order) {
			getBill();
			
		}
		
	}
	
	@Override
	public void windowClosing(WindowEvent e) {
		int a=JOptionPane.showConfirmDialog(f,"Are you sure");
		if(a==JOptionPane.YES_OPTION) {
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		
		if(e.getSource()==c1 ) {
			if(c1.getState()==true && co1==1) {
			bill+=100;
			co1--;
			}else {
				if(co1==0) {
				bill-=100;
				co1++;
				}
			}
		}
		if(e.getSource()==c2 ) {
			if(c2.getState()==true && co2==1) {
			bill+=60;
			co2--;
			}
			else {
				if(co2==0) {
				bill-=60;
				co2++;
				}
			}
		}
		if(e.getSource()==c3 ){
			if(c3.getState()==true&& co3==1 ) {
			bill+=50;
			co3--;
			}else {
				if(co3==0) {
				bill-=50;
				co3++;
				}
			}
		}
		
		
	}

}
