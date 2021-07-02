package JavaEventClasses;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class OP extends WindowAdapter{

            JFrame f;
            OP()
            {
                f=new JFrame();
                //to show dialog box
                //{
               //     JOptionPane.showMessageDialog(f,"Option Pane");
               // }
                
                //to take input
                f.addWindowListener(this);
                f.setSize(300,300);
        		f.setVisible(true);
        		f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                String str =JOptionPane.showInputDialog(f,"Enter Name"); 
            }
            
            public void windowClosing(WindowEvent e) {
            	int a=JOptionPane.showConfirmDialog(f, "Are you sure");
            	if(a==JOptionPane.YES_OPTION) {
            		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            	}
            }
                
                public static void main(String[]args)
                {
                    new OP();
                }

				
     }


