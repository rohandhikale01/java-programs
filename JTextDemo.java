import java.awt.*;

import javax.swing.*;

public class JTextDemo {
    public static void main(String[] args) {
        
        JFrame myframe=new JFrame();
        myframe.setVisible(10>5);

        myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       // myframe.setSize(800,500);

        //myframe.setLocation(400,200);

        myframe.setBounds(200,200,500,300);

        myframe.setTitle("Welcome");

        Container c=myframe.getContentPane();

        c.setLayout(null);

        JLabel uname=new JLabel("User Name:");

        uname.setBounds(50,50,100,50);
        c.add(uname);
        JTextField t1=new JTextField();

        t1.setBounds(150,70,120,20);
        c.add(t1);
        t1.setForeground(Color.RED);
        t1.setBackground(Color.YELLOW);

        if(true)
        {
            JLabel unameValid=new JLabel("Enter the valid name");
            unameValid.setBounds(150, 85, 120, 30);
            c.add(unameValid);
        }
    }
    
}
