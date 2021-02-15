import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class GUI extends JPanel 
{
    private JButton jcomp1;
    private JButton jcomp2;
    private JLabel jcomp3;

    public GUI() {
        //construct components
        jcomp1 = new JButton ("Construct Inverted Indices");
        jcomp2 = new JButton ("Choose Files");
        jcomp3 = new JLabel ("Load My Engine");

        //adjust size and set layout
        setPreferredSize (new Dimension (944, 574));
        setLayout (null);

        //add components
        add (jcomp1);
        add (jcomp2);
        add (jcomp3);

        //set component bounds
        jcomp1.setBounds (345, 345, 230, 60);
        jcomp2.setBounds (400, 240, 115, 30);
        jcomp3.setBounds (410, 130, 95, 30);
    }


    public static void main (String[] args) {
        JFrame frame = new JFrame ("Mo's Search Engine");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new GUI());
        frame.pack();
        frame.setVisible (true);
    }
}
