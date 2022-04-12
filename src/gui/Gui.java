package gui;

import javax.swing.*;
import java.awt.event.ActionListener;

public class Gui {
    static JFrame f;
    static JTextField t;
    static JButton b;
    static JLabel l;

    Gui()
    {
    }

    public static void main (String[] args)
    {
        JLabel inst = new JLabel("Enter a temperature to be converted");
        // frame to store the text field and button
        f = new JFrame("textfield");
        // create label to display text
        l = new JLabel("nothing entered");
        // create new button
        b = new JButton("Convert");
        // creates an object of the Gui class
        Gui g = new Gui();
        // addActionListener to button
//        b.addActionListener((ActionListener) g);
        // create a text field with 6 columns
        t = new JTextField("Enter the temperature", 6);
        // create a panel to add buttons and textfield
        JPanel p = new JPanel();

        // add buttons and textfield to panel
        p.add(inst);
        p.add(t);
        p.add(b);
        p.add(l);

        // add panel to frame
        f.add(p);

        // set the size of the frame
        f.setSize(300, 300);
        f.setVisible(true);
    }
/*
    public static JFrame createGui()
    {
        // create frame
        JFrame frame = new JFrame("Temperature Converter");
        // set default close operation button
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // set frame size
        frame.setSize(300, 300);

        // create a Text field
        JTextField t = new JTextField(6);
        frame.add(t);
        frame.setVisible(true);

        return frame;
    }
 */
}

