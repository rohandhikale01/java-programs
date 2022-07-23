import java.awt.Container;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class JRadioDemo {
    JFrame frm=new JFrame("Radio Button");
    Container c=frm.getContentPane();
    JRadioButton r=new JRadioButton("Male");
    JRadioButton r1=new JRadioButton("Female");
    ButtonGroup grp=new ButtonGroup();
  
    JRadioButton c1=new JRadioButton("OPEN");
    JRadioButton c2=new JRadioButton("OBC");
    JRadioButton c3=new JRadioButton("SC");
    JRadioButton c4=new JRadioButton("OTHER");
    ButtonGroup cast=new ButtonGroup();

    

    JRadioDemo()
    {
        
        frm.setBounds(200, 100, 500, 500);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c.setLayout(null);
        

        r.setBounds(20, 40, 100, 30);
        c.add(r);

        
        r1.setBounds(20, 70, 100, 30);
        c.add(r1);
        grp.add(r);
        grp.add(r1);

        c1.setBounds(1, 100, 90, 25);
        c.add(c1);
        cast.add(c1);

        c2.setBounds(100, 100, 70, 25);
        c.add(c2);
        cast.add(c2);

        c3.setBounds(170, 100, 60, 25);
        c.add(c3);
        cast.add(c3);

        c4.setBounds(250, 100, 90, 25);
        c.add(c4);
        cast.add(c4);

        c4.setSelected(true);
        c4.setEnabled(false);
        frm.setVisible(true);
                                  }
    public static void main(String[] args) {
        
        new JRadioDemo();
    }
}
