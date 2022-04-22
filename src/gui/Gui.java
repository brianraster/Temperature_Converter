package gui;

import javax.swing.*;
//import javax.swing.ButtonGroup;
import java.awt.*;

public class Gui {
    static JFrame window;
    static JLabel tempText;
    static JTextField tempInput;
    static JButton convertB;
    static JRadioButton rb1;
    static JRadioButton rb2;
    static ButtonGroup rbg;
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
        convertB = new JButton("Convert");
        rb1 = new JRadioButton("Celsius to Fahrenheit");
        rb2 = new JRadioButton("Fahrenheit to Celsius ");
        ButtonGroup rbg = new ButtonGroup();
        rbg.add(rb1);
        rbg.add(rb2);
        tempInput = new JTextField(6);
        tempInput.setSize(50,10);

        // create a panel to add buttons and textfield
        JPanel mainPanel = new JPanel();
//        mainPanel.setLayout(new GridLayout(3,2, 10, 10));
        mainPanel.setLayout(new FlowLayout());

        // add buttons and textfield to panel
        mainPanel.add(tempText);
        mainPanel.add(tempInput);
        mainPanel.add(convertB);
//        mainPanel.add(rbg);
        mainPanel.add(rb1);
        mainPanel.add(rb2);
//        mainPanel.add(l);

        // add panel to frame
        window.add(mainPanel);

        // set the size of the frame
        window.setSize(400, 300);
//        window.setLayout(new GridLayout(3,2));
        window.setVisible(true);
    }

}

