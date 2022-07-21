import java.awt.*;
import javax.swing.*;

public class JButtonDemo{
    public static void main(String[] args) {
        
        JFrame frm=new JFrame();
        frm.setVisible(true);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setSize(500,500);
        frm.setLocation(400,100);
        Container c=frm.getContentPane();

        c.setLayout(null);

        JButton b=new JButton("Click");
        b.setBounds(100,100,120,30);
        c.add(b);

        Font f=new Font("Arial",Font.BOLD,15);
        b.setFont(f);
        b.setText("mybet");

        b.setForeground(Color.WHITE);
        b.setBackground(Color.GRAY);

        Cursor cr=new Cursor(Cursor.HAND_CURSOR);
        b.setCursor(cr);

      //  b.setEnabled(false);
       // b.setVisible(false);

       ImageIcon icon=new ImageIcon("i.png");
       JButton bt=new JButton(icon);

       bt.setSize(icon.getIconWidth(),icon.getIconHeight());
       bt.setLocation(200,200);
       c.add(bt);

    }
}

// import java.awt.*;
// import javax.swing.*;
// public class JButtonDemo extends JFrame{

//     JButtonDemo()
//     {
//         JButton b=new JButton();
//         b.setBounds(100, 50, 120, 30);
//         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         this.setLayout(null);
//         this.setSize(500,500);
//         this.setVisible(true);
//         this.add(b);
//     }

//     public static void main(String[] args) {
        
//         JButtonDemo my=new JButtonDemo();
//     }
    
// }
