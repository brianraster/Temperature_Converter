package gui;

import javax.swing.*;

public class Gui {
    public static JFrame createGui() {
        JFrame frame = new JFrame("Temperature Converter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        JLabel temp = new JLabel("Enter Temperature");
        frame.setVisible(true);

        return frame;
    }
}
