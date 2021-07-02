import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class StudentProtocol  extends WindowAdapter implements ActionListener{

    JTextArea ta;
    JFrame f;
    JLabel l1,l2,l3,sl1,sl2,sl3,l4,l5,l6,l7;
    JTextField t1,t2,t3,t4,t5,t6;
    JMenuItem i1,i2,i3,i4,i5,i6;
    JButton b1;
    JScrollPane area;

    
    void reset()
    {
        l1.setVisible(false);
        l2.setVisible(false);
        //l3.setVisible(false);
        l4.setVisible(false);
        l5.setVisible(false);
        l6.setVisible(false);
        l7.setVisible(false);
        area.setVisible(false);
        sl1.setVisible(false);
        sl2.setVisible(false);
        sl3.setVisible(false);
        t1.setVisible(false);
        t2.setVisible(false);
        t3.setVisible(false);
        t4.setVisible(false);
        t5.setVisible(false);
        t6.setVisible(false);
        b1.setVisible(false);


    }

    void welcome()
    {
        l1.setVisible(true);
        l2.setVisible(true);
        //l3.setVisible(true);
    }



    void view() throws Exception
    {
        area.setVisible(true);
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","2410");
        Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery("select * from student order by roll_no");
        String str="";


        while(rs.next())
        {
            str+="PRN no: "+rs.getString(1)+"\t\tName: "+rs.getString(2)+"\t\tPhone No: "+rs.getString(3)+"\t\tAddress: "+rs.getString(4)+"\t\tMail: "+rs.getString(5)+"\n";
        }
        ta.setText(str);
        con.close();
    }

    void search()
    {
        l4.setVisible(true);
        l5.setVisible(true);
        l6.setVisible(true);
        l7.setVisible(true);
        sl1.setVisible(true);
        sl2.setVisible(true);
        sl3.setVisible(true);
        t1.setVisible(true);
        t2.setVisible(true);
        t3.setVisible(true);
        t4.setVisible(true);
        t5.setVisible(true);
        t6.setVisible(true);
        b1.setVisible(true);


    }

    StudentProtocol()
    {
        f=new JFrame("Student Protocol");
        f.setLayout(null);
        f.addWindowListener(this);

        JMenu menu=new JMenu("Menu");
        JMenuBar bar=new JMenuBar();
        i1=new JMenuItem("Welcome");
        i2=new JMenuItem("Add Student");
        i3=new JMenuItem("Remove Student");
        i4=new JMenuItem("View All");
        i5=new JMenuItem("Search");
        i6=new JMenuItem("Exit");
        menu.add(i1);
        menu.add(i2);
        menu.add(i3);
        menu.add(i4);
        menu.add(i5);
        menu.add(i6);
        bar.add(menu);
        i1.addActionListener(this);
        i2.addActionListener(this);
        i3.addActionListener(this);
        i4.addActionListener(this);
        i5.addActionListener(this);
        i6.addActionListener(this);

        l1=new JLabel("Welcome To SGU");
        l2=new JLabel("Student Portal");
        l3=new JLabel("");
        l1.setForeground(Color.blue);
        l2.setForeground(Color.red);
        //l3.setForeground(Color.blue);
        l1.setFont(new Font("Arial",Font.BOLD,24));
        l2.setFont(new Font("Arial",Font.BOLD,24));
        l3.setFont(new Font("Arial",Font.BOLD,24));
        l1.setBounds(130,120,300,70);
        l2.setBounds(150,150,200,70);
        //l3.setBounds(130,230,200,70);
        f.add(l1);
        f.add(l2);
        //f.add(l3);


        ta=new JTextArea(1000,1000);
        area=new JScrollPane(ta);
        ta.setEditable(false);
        area.setBounds(30,30,440,350);
        f.add(area);

        sl1=new JLabel("Enter Name");
        sl1.setBounds(100,30,80,30);
        f.add(sl1);

        t1=new JTextField();
        t1.setBounds(250,30,150,30);
        f.add(t1);

        b1=new JButton("Search");
        b1.setBounds(170,70,150,30);
        f.add(b1);
        b1.addActionListener(this);

        sl2=new JLabel("Data of the Student");
        sl2.setBounds(170,110,150,40);
        sl2.setBackground(Color.cyan);
        sl2.setForeground(Color.blue);
        f.add(sl2);

        sl3=new JLabel("PRN No.");
        sl3.setBounds(100,170,80,30);
        f.add(sl3);

        t2=new JTextField();
        t2.setBounds(250,170,200,30);
        t2.setEditable(false);
        f.add(t2);

        l4=new JLabel("Name");
        l4.setBounds(100,210,80,30);
        f.add(l4);

        t3=new JTextField();
        t3.setBounds(250,210,200,30);
        t3.setEditable(false);
        f.add(t3);

        l5=new JLabel("Phone No.");
        l5.setBounds(100,250,100,30);
        f.add(l5);

        t4=new JTextField();
        t4.setBounds(250,250,200,30);
        t4.setEditable(false);
        f.add(t4);

        l6=new JLabel("Address");
        l6.setBounds(100,290,80,30);
        f.add(l6);

        t5=new JTextField();
        t5.setBounds(250,290,200,30);
        t5.setEditable(false);
        f.add(t5);

        l7=new JLabel("Mail");
        l7.setBounds(100,330,80,30);
        f.add(l7);

        t6=new JTextField();
        t6.setBounds(250,330,200,30);
        t6.setEditable(false);
        f.add(t6);

        f.setJMenuBar(bar);
        f.setVisible(true);
        f.setSize(500,450);
        f.setLocationRelativeTo(null);
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        reset();
        welcome();
    }

    public static void main(String[] args) throws Exception
    {
        new StudentProtocol();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==i1)
        {
            reset();
            welcome();
        }

        if(e.getSource()==i2)
        {
            reset();
            new StudentLayout();
            welcome();

        }

        if(e.getSource()==i3)
        {
            reset();
            new RemoveStudent();
            welcome();

        }

        if(e.getSource()==i4)
        {
            try {
                reset();
                view();
            }catch(Exception e1){
                System.out.println(e1);
            }
        }

        if(e.getSource()==i5)
        {
                reset();
                search();
        }

        if(e.getSource()==i6)
        {
            System.exit(0);
        }

        if(e.getSource()==b1)
        {
            try {
                String n = t1.getText();
                Class.forName("oracle.jdbc.driver.OracleDriver");
                Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "2410");

                Statement stmt = con.createStatement();

                ResultSet rs = stmt.executeQuery("select * from student where name='" + n + "'");
                rs.next();
                t2.setText(rs.getString(1));
                t3.setText(rs.getString(2));
                t4.setText(rs.getString(3));
                t5.setText(rs.getString(4));
                t6.setText(rs.getString(5));

                con.close();
            }catch(Exception e1){
                System.out.println(e1);
            }
        }

    }

    public void windowClosing(WindowEvent e)
    {
        int a=JOptionPane.showConfirmDialog(f,"Are you sure");
        if(a==JOptionPane.YES_OPTION)
        {
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }
}



class RemoveStudent implements ActionListener
{
    JFrame f1;
    JLabel l1;
    JTextField t1;
    JButton b;

    void update() throws Exception
    {
        String n=t1.getText();
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","2410");

        Statement stmt=con.createStatement();

        ResultSet rs=stmt.executeQuery("delete from student where Roll_no='"+n+"'");
        rs.next();

        con.close();
    }
    RemoveStudent()
    {
        f1=new JFrame("Remove Student Details");
        f1.setLayout(null);
        l1=new JLabel("Enter PRN No. ");
        l1.setBounds(120,120,150,40);
        l1.setForeground(Color.black);
        l1.setFont(new Font("Arial",Font.BOLD,18));

        t1=new JTextField();
        t1.setBounds(270,120,170,40);
        t1.setFont(new Font("Arial",Font.PLAIN,18));
        b=new JButton("Remove");
        b.setBounds(210,170,120,40);
        b.setForeground(Color.black);
        b.addActionListener(this);



        f1.add(l1);
        f1.add(t1);
        f1.add(b);
        f1.setSize(500,450);
        f1.setVisible(true);
        f1.setLocationRelativeTo(null);
        f1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //f.setFocusable(true);
        //f.pack();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b)
        {
            try
            {
                update();
                t1.setText("");
            }catch(Exception e1){
                System.out.println(e1);
            }
        }
    }
}

class StudentLayout implements ActionListener{
    JFrame f;
    JTextField t1, t2, t3, t4, t5;
    JLabel a, l1, l2, l3, l4, l5;
    JButton b;

    void add() throws Exception
    {
        /*String[] n=new String[5];
        n[0]=t1.getText();
        n[1]=t2.getText();
        n[2]=t3.getText();
        n[3]=t4.getText();
        n[4]=t5.getText();*/
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","2410");

        Statement stmt=con.createStatement();

        //ResultSet rs=stmt.executeQuery("insert into student values('"+n[0]+"','"+n[1]+"','"+n[2]+"','"+n[3]+"','"+n[4]+"')");
        ResultSet rs=stmt.executeQuery("insert into student values('"+t1.getText()+"','"+t2.getText()+"','"+t3.getText()+"','"+t4.getText()+"','"+t5.getText()+"')");
        rs.next();

        con.close();
    }

    StudentLayout() {
        f = new JFrame();
        f.setLayout(null);

        a = new JLabel("Enter Student Details");
        a.setBounds(100, 50, 200, 30);
        a.setFont(new Font("Arial",Font.PLAIN,20));
        a.setForeground(Color.red);
        f.add(a);

        l1 = new JLabel("PRN No");
        l1.setBounds(85, 100, 80, 30);
        f.add(l1);

        t1 = new JTextField();
        t1.setBounds(165, 100, 200, 30);
        f.add(t1);

        l2 = new JLabel("Name");
        l2.setBounds(85, 140, 80, 30);
        f.add(l2);

        t2 = new JTextField();
        t2.setBounds(165, 140, 200, 30);
        f.add(t2);

        l3 = new JLabel("Phone no");
        l3.setBounds(85, 180, 80, 30);
        f.add(l3);


        t3 = new JTextField();
        t3.setBounds(165, 180, 200, 30);
        f.add(t3);

        l4 = new JLabel("Address");
        l4.setBounds(85, 220, 80, 30);
        f.add(l4);


        t4 = new JTextField();
        t4.setBounds(165, 220, 200, 30);
        f.add(t4);

        l5 = new JLabel("Email-Id");
        l5.setBounds(85, 260, 80, 30);
        f.add(l5);


        t5 = new JTextField();
        t5.setBounds(165, 260, 200, 30);
        f.add(t5);

        b=new JButton("Add");
        b.setBounds(200,300,100,30);
        f.add(b);
        b.addActionListener(this);

        f.setSize(500, 450);
        f.setLocationRelativeTo(null);

        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b)
        {
            try
            {
                add();
                t1.setText("");
                t2.setText("");
                t3.setText("");
                t4.setText("");
                t5.setText("");
            }catch(Exception e1){
                System.out.println(e1);
            }
        }
    }
}
