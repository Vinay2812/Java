package ThreadingInJava;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Exp_BouncingBall extends JPanel implements Runnable
{
	JFrame f;
	int x=0,y=0;
	int angleX=1,angleY=1;
	int speed=2;
	public void run()
	{
		while(true)
		{
			move();
			repaint();
			try
			{
				Thread.sleep(10);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			
		}

	}
	public void move()
	{
		if(x+angleX<0)
		angleX=+speed;
		else if(x+angleX+25>getWidth())
		angleX=-10;

		if(y+angleY<0)
		angleY=+speed;
		else if(y+angleY+25>getHeight())
		angleY=-10;

		x=x+angleX;
		y=y+angleY;


	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.setColor(Color.yellow);
		g.fillOval(x,y,25,25);
		
		
	}
	public static void main(String[] args) throws InterruptedException
	{
		JFrame f=new JFrame("Moving Ball");
		
		Exp_BouncingBall e=new Exp_BouncingBall();
		final Thread t1=new Thread(e);
		f.add(e);
		f.setSize(400,400);
		
		f.setVisible(true);
		f.setLayout(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		e.addMouseListener(new MouseAdapter()
		{
			public void mousePressed(MouseEvent e)
			{
				t1.start();

			}
		});

	}

}