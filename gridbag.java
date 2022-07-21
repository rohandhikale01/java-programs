
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.GridBagConstraints.*;
import java.awt.GridBagLayout.*;





public class gridbag {
    JFrame frm=new JFrame("Border Layout");
    Container c=frm.getContentPane();
    JButton b1=new JButton("Top");
    JButton b2=new JButton("Bottom");
    JButton b3=new JButton("Center");
    JButton b4=new JButton("left");
    JButton b5=new JButton("right");

   

    gridbag()
    {
        frm.setBounds(100,100,500,500);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            GridBagLayout g=new GridBagLayout();
            c.setLayout(g);
        GridBagConstraints gbc=new GridBagConstraints();
        gbc.fill=GridBagConstraints.HORIZONTAL;
        //gbc.fill=GridBagConstraints.VERTICAL;

        gbc.weightx=0.5;
      //  gbc.weighty=0.5;
        gbc.gridx=0;
        gbc.gridy=0;

        c.add(b1,gbc);

        gbc.gridx=1;
        gbc.gridy=0;

        c.add(b2,gbc); 
        gbc.gridx=2;
        gbc.gridy=0;

        c.add(b3,gbc);
        
        gbc.gridx=0;
        gbc.gridy=1;

        gbc.gridwidth=3;
        gbc.ipady=30;
        c.add(b4,gbc);
        frm.pack();

        gbc.gridwidth=2;
        gbc.gridx=1;
        gbc.gridy=2;
        gbc.ipady=0;
        gbc.anchor=GridBagConstraints.PAGE_END;
        gbc.weighty=0.5;
        gbc.ipady=20; 
        c.add(b5,gbc);
    
        frm.setVisible(true);

    }
   
    public static void main(String[] args) {
        new gridbag();
    }
}
