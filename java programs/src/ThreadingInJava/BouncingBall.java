package ThreadingInJava;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BouncingBall {

	public static void main(String[] args) {
		new GameFrame();

	}

}

class GameFrame{
	GameFrame()
	{
		
	}
}

class GamePanel extends JPanel implements Runnable{
	
	Ball b;
	GamePanel()
	{
		
	}
	
	public void run()
	{
		
	}
	
	public void move()
	{
		
	}
	public void checkCollision()
	{
		
	}
	
	public void draw(Graphics g)
	{
		
	}
	
	public void paint(Graphics g)
	{
		
	}
}

class Ball extends Rectangle{
	
	int xVelocity;
	int yVelocity;
	int speed=2;
	
	Ball(int x,int y,int diameter)
	{
		super(x,y,diameter,diameter);
	}
	
	public void setDirection(int x,int y)
	{
		xVelocity=x;
		yVelocity=y;
	}
	
	public void move()
	{
		x += xVelocity;
		y += yVelocity;
	}
	
	public void draw(Graphics g)
	{
		g.setColor(Color.BLUE);
		g.fillOval(x, y, height, width);
	}
	
	
}

