import java.awt.Container;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JTextArea;
import java.awt.event.*;

public class Jchbxmenuitem implements ItemListener{

JFrame frm=new JFrame(" J Check Box Menu Item");
Container c=frm.getContentPane();
 JMenuBar br=new JMenuBar();
 JMenu menu=new JMenu("Save Changes");
 JCheckBoxMenuItem bx=new JCheckBoxMenuItem("Saved & continue");

 JTextArea ta=new JTextArea();
 Jchbxmenuitem()
 {
     frm.setBounds(100,100,300,200);
     frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     c.setLayout(null);

     bx.addItemListener(this);
     menu.add(bx);
     br.add(menu);
frm.setJMenuBar(br);

ta.setBounds(50,50,100,100);
c.add(ta);
     frm.setVisible(true);
 }
public static void main(String[] args) {
        
    new Jchbxmenuitem();
    }
@Override
public void itemStateChanged(ItemEvent e) {
    
    if(bx.isSelected())
    ta.setText("Saved ");
    else
    ta.setText("Not saved");
    
}
    
}
