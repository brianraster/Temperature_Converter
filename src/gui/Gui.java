/**
 * This class creates the User Interface for the Temperature Converter
 */
package gui;

import logic.Converter;
import javax.swing.*;
import java.awt.*;

public class Gui {
    static JFrame window;
    static JPanel subPanel;
    static JLabel tempText;
    static JTextField tempInput;
    static JButton convertB;
    static JRadioButton CtoF;
    static JRadioButton FtoC;
    static JRadioButton CtoK;
    static JRadioButton KtoC;
    static JRadioButton FtoK;
    static JRadioButton KtoF;
    static ButtonGroup rbg;
    static JLabel convertedTemp;
    static JLabel tempOutput;

    /**
     * This method creates the User Interface window for the Temperature Converter
     */
    public static void createUI () {
        window = new JFrame("Temperature Converter");
        subPanel = new JPanel();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tempText = new JLabel("Temperature to be Converted:");
//        tempText.setSize(50, 50);
        convertB = new JButton("Convert");
        convertB.addActionListener(e -> {
            String temp = tempInput.getText();
            double tempNum = Double.parseDouble(temp);
            if (CtoF.isSelected()) {
                convertedTemp.setVisible(true);
                double result = Converter.CToF(tempNum);
                String resultString = Double.toString(result);
                tempOutput.setText(resultString);
            } else if (FtoC.isSelected()) {
                convertedTemp.setVisible(true);
                double result = Converter.FToC(tempNum);
                String resultString = Double.toString(result);
                tempOutput.setText(resultString);
            } else if (CtoK.isSelected()) {
                convertedTemp.setVisible(true);
                double result = Converter.CToK(tempNum);
                String resultString = Double.toString(result);
                tempOutput.setText(resultString);
            } else if (KtoC.isSelected()) {
                convertedTemp.setVisible(true);
                double result = Converter.KToC(tempNum);
                String resultString = Double.toString(result);
                tempOutput.setText(resultString);
            } else if (KtoC.isSelected()) {
                convertedTemp.setVisible(true);
                double result = Converter.KToC(tempNum);
                String resultString = Double.toString(result);
                tempOutput.setText(resultString);
            } else if (FtoK.isSelected()) {
                convertedTemp.setVisible(true);
                double result = Converter.FToK(tempNum);
                String resultString = Double.toString(result);
                tempOutput.setText(resultString);
            } else if (KtoF.isSelected()) {
                convertedTemp.setVisible(true);
                double result = Converter.KToF(tempNum);
                String resultString = Double.toString(result);
                tempOutput.setText(resultString);
            }
            else {
                convertedTemp.setText("Something went wrong...");
                convertedTemp.setVisible(true);
            }
        });
        CtoF = new JRadioButton("Celsius to Fahrenheit");
        FtoC = new JRadioButton("Fahrenheit to Celsius");
        CtoK = new JRadioButton("Celsius to Kelvin    ");
        KtoC = new JRadioButton("Kelvin to Celsius    ");
        FtoK = new JRadioButton("Fahrenheit to Kelvin ");
        KtoF = new JRadioButton("Kelvin to Fahrenheit ");

        ButtonGroup rbg = new ButtonGroup();

        rbg.add(CtoF);
        rbg.add(FtoC);
        rbg.add(CtoK);
        rbg.add(KtoC);
        rbg.add(FtoK);
        rbg.add(KtoF);

        tempInput = new JTextField(6);
        tempInput.setSize(50,10);
        convertedTemp = new JLabel("The converted temperature is: ");
        convertedTemp.setVisible(false);
        tempOutput = new JLabel();

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new FlowLayout());

        mainPanel.add(tempText);
        mainPanel.add(tempInput);
        mainPanel.add(convertB);
        subPanel.add(CtoF);
        subPanel.add(FtoC);
        subPanel.add(CtoK);
        subPanel.add(KtoC);
        subPanel.add(FtoK);
        subPanel.add(KtoF);
        mainPanel.add(subPanel);

        mainPanel.add(convertedTemp);
        mainPanel.add(tempOutput);

        window.add(mainPanel);
        window.setSize(1000, 200);
        window.setVisible(true);
    }
}

