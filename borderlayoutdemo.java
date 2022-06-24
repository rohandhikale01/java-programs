import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.Border;

public class borderlayoutdemo {
    JFrame frm=new JFrame("Border Layout");
    Container c=frm.getContentPane();
    JButton b1=new JButton("Top");
    JButton b2=new JButton("Bottom");
    JButton b3=new JButton("Center");
    JButton b4=new JButton("left");
    JButton b5=new JButton("right");


    //to create object of border layout
    BorderLayout bl=new BorderLayout();


    borderlayoutdemo()
    {
        frm.setBounds(100,100,500,500);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //c.setLayout(JFrame.B);

    
       c.add(b1,BorderLayout.PAGE_START);
        c.add(b2,BorderLayout.PAGE_END);
        c.add(b3,BorderLayout.CENTER);
        c.add(b4,BorderLayout.LINE_START);
        c.add(b5,BorderLayout.LINE_END);
        frm.setVisible(true);


    }
    public static void main(String[] args) {
        new borderlayoutdemo();
    }
}
