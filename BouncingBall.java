import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BouncingBall extends JFrame{

    BouncingBall()
    {
        setSize(800,600);
        setTitle("Bouncing Ball");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        MyAnimation p=new MyAnimation(780,560);
        p.setBackground(Color.black);
        add(p);
    }
    public static void main(String a[])
    {
        new BouncingBall().setVisible(true);
    }
}

class MyAnimation extends JPanel implements MouseListener
{

    int x=0;
    int y=0;
    int ballWidth=50;
    int ballHeight=50;
    int max_x,max_y;
    int speedX=10;
    int speedY=10;

    MyAnimation(int w,int h)
    {
       this.max_x=w-ballWidth;
       this.max_y=h-ballHeight;

       addMouseListener(this);
    }

    public void paint(Graphics g)
    {
        super.paint(g);
        g.setColor(Color.red);
        g.fillOval(x,y,ballWidth,ballHeight);


        if(x>max_x||x<0)
        {
            speedX=-speedX;
        }
        if(y>max_y||y<0)
        {
            speedY=-speedY;
        }
        x=x+speedX;
        y=y+speedY;

        try {
            Thread.sleep(40);
        } catch (InterruptedException e) {
            
            e.printStackTrace();
        }
        repaint();

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
        speedX=-speedX;
        speedY=-speedY;
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }


}