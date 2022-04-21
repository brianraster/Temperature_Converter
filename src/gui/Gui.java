package gui;

import javax.swing.*;
import java.awt.*;

public class Gui {
    static JFrame window;
    static JLabel tempText;
    static JTextField tempInput;
    static JButton b;
    static JRadioButton rb1;
    static JRadioButton rb2;
    static JLabel l;

    Gui()
    {
    }

    public static void main (String[] args)
    {
        // frame to store the text field and button
        window = new JFrame("Temperature Converter");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tempText = new JLabel("Temperature to be Converted:");
        tempText.setSize(50, 50);
        rb1 = new JRadioButton("Celeus to Farenhype");
        rb2 = new JRadioButton();

        // create label to display text
//        l = new JLabel("nothing entered");
        // create new button
        b = new JButton("Convert");
        // creates an object of the Gui class
        Gui g = new Gui();
        // addActionListener to button
//        b.addActionListener((ActionListener) g);
        // create a text field with 6 columns
        tempInput = new JTextField("Enter the temperature", 6);
        tempInput.setSize(50,10);

        // create a panel to add buttons and textfield
        JPanel mainPanel = new JPanel();
//        mainPanel.setLayout(new GridLayout(3,2, 10, 10));
        mainPanel.setLayout(new FlowLayout());

        // add buttons and textfield to panel
        mainPanel.add(tempText);
        mainPanel.add(tempInput);
        mainPanel.add(b);
        mainPanel.add(rb1);
        mainPanel.add(rb2);
//        mainPanel.add(l);

        // add panel to frame
        window.add(mainPanel);

        // set the size of the frame
        window.setSize(500, 300);
//        window.setLayout(new GridLayout(3,2));
        window.setVisible(true);
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

