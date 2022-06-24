import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

// To HAndle event using Anonymous class lec-9
class AnonymousEventHandling extends JFrame 
{
    JFrame frm=new JFrame("Action Listener With Anonymous Event Handling");
    Container c=frm.getContentPane();
    JButton b=new JButton("Click To Submit");
    JLabel l=new JLabel("Button Clicked");
    AnonymousEventHandling()
    {
        c.setLayout(null);
        frm.setVisible(true);
        frm.setBounds(100,100,500,500);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        b.setBounds(100,100,150,30);
        c.add(b);

        l.setBounds(150,150, 150, 30);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                c.add(l);
            }
        });
    }

  
    
}

// To handle multiple Events on different Buttons
class Button extends JFrame implements ActionListener
{ 
     JFrame frm=new JFrame("Action Listener");
    JButton b1=new JButton("click 1");
    JButton b2=new JButton("click 2");
     JButton b3=new JButton("click 3");
     JLabel l=new JLabel("Button Not Click");
        
    Container c=frm.getContentPane();
    Button()
    {
        c.setLayout(null);
        frm.setVisible(true);
        frm.setBounds(100,100,500,500);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      

        b1.setBounds(25,25, 100, 30);
        c.add(b1);
        b1.addActionListener(this);

        b2.setBounds(25,75, 100, 30);
        c.add(b2);
        b2.addActionListener(this);
        b3.setBounds(25,125, 100, 30);
        c.add(b3);
        b3.addActionListener(this);

        l.setBounds(150, 25, 150, 20);
        c.add(l);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==b1)
        l.setText("Button 1 is Click");
        else if(e.getSource()==b2)
        l.setText("Button 2 is Click");
        else if(e.getSource()==b3)
        l.setText("Button 3 is click");

        
    }
}
public class ActionListenerDemo {

    public static void main(String[] args) {
      
      //  new MyFrame();

      //  new Button();

    new AnonymousEventHandling();
        
        
    }
    
}

//to handle an event on button
class MyFrame extends JFrame implements ActionListener
{
    JFrame frm=new JFrame("Action Listener");
   JButton b=new JButton("click");
   JLabel l=new JLabel("is");
   Container c=frm.getContentPane();
   
    MyFrame()
    {
        c.setLayout(null);
        frm.setVisible(true);
        frm.setBounds(100,100,300,200);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      

         b.setBounds(25,25, 150, 30);
        c.add(b);
        b.addActionListener(this);

        l.setBounds(40, 60, 100, 30);
        c.add(l);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        b.setBackground(Color.BLACK);
        b.setForeground(Color.GRAY);
        frm.setBackground(Color.GRAY);
        l.setText("Done");
        frm.setBounds(100, 200, 500,500);
        
    }

 
}


