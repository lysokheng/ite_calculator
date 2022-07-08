package Controller.NumberSystemConversionCalculation;

import Controller.Tools.ConvertNumber;

import javax.swing.*;

public class NumberSystemConversionDecimalCalculation {
    public int a, b, count;

    ConvertNumber convertNumber = new ConvertNumber();

    public void performReset(JButton button, JTextField amountField, JTextArea resultField, JTextArea historyField){
        button.addActionListener(e -> {
            amountField.setText("");
            resultField.setText("");
            historyField.setText("");
            count = 0;
        });
    }

    public void dec2HexaResult(JButton button, JTextField amountField, JTextArea outputField, JTextArea historyField){
        button.addActionListener(e -> {

            //Get the inputs
            long Amount = Long.parseLong(amountField.getText());

            // binary to decimal
            System.out.println(
                    Amount + " in decimal = " + convertNumber.dec2Hexa(Amount) + " in hexadecimal");

            //Show the output
            outputField.setText(String.valueOf(convertNumber.dec2Hexa(Amount)));

            //print history
            count++;
            System.out.println(count);
            historyField.append(count + ". " + "Decimal To Hexadecimal" + "\n"
                    + Amount + " in decimal = " + convertNumber.dec2Hexa(Amount) + " in hexadecimal"
                    + "\n\n");
        });
    }

    public void dec2OctalResult(JButton button, JTextField amountField, JTextArea outputField, JTextArea historyField){
        button.addActionListener(e -> {

            //Get the inputs
            long Amount = Long.parseLong(amountField.getText());

            // binary to decimal
            System.out.println(
                    Amount + " in decimal = " + convertNumber.dec2Octal(Amount) + " in octal");

            //Show the output
            outputField.setText(convertNumber.dec2Octal(Amount));

            //print history
            count++;
            System.out.println(count);
            historyField.append(count + ". " + "Decimal To Octal" + "\n"
                    + Amount + " in decimal = " + convertNumber.dec2Octal(Amount) + " in octal"
                    + "\n\n");
        });
    }

    public void dec2BinaryResult(JButton button, JTextField amountField, JTextArea outputField, JTextArea historyField){
        button.addActionListener(e -> {

            //Get the inputs
            long Amount = Long.parseLong(amountField.getText());

            // binary to decimal
            System.out.println(
                    Amount + " in decimal = " + convertNumber.dec2Binary(Amount) + " in binary");

            //Show the output
            outputField.setText(convertNumber.dec2Binary(Amount));

            //print history
            count++;
            System.out.println(count);
            historyField.append(count + ". " + "Decimal To Binary" + "\n"
                    + Amount + " in decimal = " + convertNumber.dec2Binary(Amount) + " in binary"
                    + "\n\n");
        });
    }
}
