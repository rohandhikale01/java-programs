import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class firtSwing {

    public static void main(String[] args) {
        
        JFrame myframe=new JFrame();
        myframe.setVisible(true); //to make the jframe visible

        myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //to close running of program 

       // myframe.setSize(500,250); //to set size of your frame 

       // myframe.setLocation(100,50); //to set position on screen  using pixel

       //combination of above two methods

       myframe.setBounds(500,300,500,250); //first location(x,y)  size width & height

       //to set title

       myframe.setTitle("My first Frame");

       //to chang icon which is left to the title  & that img should be inside the current working dir

       ImageIcon icon=new ImageIcon("img.jpeg");
       myframe.setIconImage(icon.getImage());

       //to change background
       java.awt.Container c=myframe.getContentPane();
       c.setBackground(Color.CYAN);

       //to stop being resize 
       myframe.setResizable(false);



    }
    
}
