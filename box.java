import java.awt.*;
import javax.swing.*;
import javax.swing.JFrame;
public class box {
    
    
    JFrame frm=new JFrame("Card Layout");
    Container c=frm.getContentPane();

    JButton b1=new JButton("BUtton1");
    JButton b2=new JButton("Button2");
    JButton b3=new JButton("Button3");
    JButton b4=new JButton("Button3");

    box()
    {
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setBounds(100,100,500,500);
     BoxLayout bx=new BoxLayout(c, BoxLayout.Y_AXIS);
     c.setLayout(bx);

     b1.setAlignmentX(Component.CENTER_ALIGNMENT);
     b2.setAlignmentX(Component.CENTER_ALIGNMENT);
     b3.setAlignmentX(Component.CENTER_ALIGNMENT);
     b4.setAlignmentX(Component.CENTER_ALIGNMENT);

        c.add(b1,Box.createRigidArea(new Dimension(20,80)));
        c.add(b2);
        c.add(b3);
        c.add(b4);

        frm.setVisible(true);
    }
    public static void main(String[] args) {
        
        new box();
    }
}
