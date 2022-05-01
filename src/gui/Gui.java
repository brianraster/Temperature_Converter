/**
 * This class creates the User Interface for the Temperature Converter
 */
package gui;

import logic.Converter;
import javax.swing.*;
import java.awt.*;

public class Gui {
    static JFrame window;
    static JLabel tempText;
    static JTextField tempInput;
    static JButton convertB;
    static JRadioButton CtoF;
    static JRadioButton FtoC;
    static ButtonGroup rbg;
    static JLabel convertedTemp;
    static JLabel tempOutput;

    /**
     * This method creates the User Interface window for the Temperature Converter
     */
    public static void createUI () {
        window = new JFrame("Temperature Converter");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tempText = new JLabel("Temperature to be Converted:");
        tempText.setSize(50, 50);
        convertB = new JButton("Convert");
        convertB.addActionListener(e -> {
            String temp = tempInput.getText();
            double tempNum = Double.parseDouble(temp);
            if (CtoF.isSelected()) {
                double result = Converter.CToF(tempNum);
                String resultString = Double.toString(result);
                tempOutput.setText(resultString);
            }
            else {
                double result = Converter.FToC(tempNum);
                String resultString = Double.toString(result);
                tempOutput.setText(resultString);
            }
        });
        CtoF = new JRadioButton("Celsius to Fahrenheit");
        FtoC = new JRadioButton("Fahrenheit to Celsius ");
        ButtonGroup rbg = new ButtonGroup();
        rbg.add(CtoF);
        rbg.add(FtoC);
        tempInput = new JTextField(6);
        tempInput.setSize(50,10);
        convertedTemp = new JLabel("The converted temperature is: ");
        tempOutput = new JLabel();

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new FlowLayout());

        mainPanel.add(tempText);
        mainPanel.add(tempInput);
        mainPanel.add(convertB);
        mainPanel.add(CtoF);
        mainPanel.add(FtoC);
        mainPanel.add(convertedTemp);
        mainPanel.add(tempOutput);

        window.add(mainPanel);
        window.setSize(400, 300);
        window.setVisible(true);
    }
}

