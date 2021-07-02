package ThreadingInJava;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BouncedBall extends JPanel implements Runnable {
    
    int x=0,y=0;
    int anglex=1,angley=1;
    int speed=2;
    public void run()
    {
        while(true)
        {
            move();
            repaint();     //paint the ball
            try
            {
                Thread.sleep(10);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }

    public void move()
    {
        if(x+anglex<0)
            anglex=+speed;
        else if(x+anglex>getWidth()-50)
            anglex=-10;

        if(y+angley<0)
            angley=+speed;
        else if(y+angley>getHeight()-50)
            angley=-10;

        x=x+anglex;
        y=y+angley;
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.setColor(Color.blue);
        g.fillOval(x,y,50,50);
    }

    public static void main(String[] args) throws Exception {
        JFrame f=new JFrame("Moving Ball");
        BouncedBall e= new BouncedBall();
        
        final Thread t1=new Thread(e);
        
        f.add(e);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
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
