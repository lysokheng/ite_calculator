package Controller.NumberSystemConversionCalculation;

import Controller.Tools.ConvertNumber;

import javax.swing.*;

public class NumberSystemConversionBinaryCalculation {
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

    public void binary2DecimalResult(JButton button, JTextField amountField, JTextArea outputField, JTextArea historyField){
        button.addActionListener(e -> {

            //Get the inputs
            long Amount = Long.parseLong(amountField.getText());

            // binary to decimal
            System.out.println(
                    Amount + " in binary = " + convertNumber.binary2Decimal(String.valueOf(Amount)) + " in decimal");

            //Show the output
            outputField.setText(String.valueOf(convertNumber.binary2Decimal(String.valueOf(Amount))));

            //print history
            count++;
            System.out.println(count);
            historyField.append(count + ". " + "Binary To Decimal" + "\n"
                    + Amount + " in binary = " + convertNumber.binary2Decimal(String.valueOf(Amount)) + " in decimal"
                    + "\n\n");
        });
    }

    public void binary2OctalResult(JButton button, JTextField amountField, JTextArea outputField, JTextArea historyField){
        button.addActionListener(e -> {

            //Get the inputs
            long Amount = Long.parseLong(amountField.getText());

            // binary to decimal
            System.out.println(
                    Amount + " in binary = " + convertNumber.binary2Octal(Amount) + " in octal");

            //Show the output
            outputField.setText(String.valueOf(convertNumber.binary2Octal(Amount)));

            //print history
            count++;
            System.out.println(count);
            historyField.append(count + ". " + "Binary To Octal" + "\n"
                    + Amount + " in binary = " + convertNumber.binary2Octal(Amount) + " in octal"
                    + "\n\n");
        });
    }

    public void binary2HexResult(JButton button, JTextField amountField, JTextArea outputField, JTextArea historyField){
        button.addActionListener(e -> {

            //Get the inputs
            long Amount = Long.parseLong(amountField.getText());

            // binary to decimal
            System.out.println(
                    Amount + " in binary = " + convertNumber.binary2Hex(Amount) + " in hexadecimal");

            //Show the output
            outputField.setText(String.valueOf(convertNumber.binary2Hex(Amount)));

            //print history
            count++;
            System.out.println(count);
            historyField.append(count + ". " + "Binary To Hexadecimal" + "\n"
                    + Amount + " in binary = " + convertNumber.binary2Hex(Amount) + " in hexadecimal"
                    + "\n\n");
        });
    }
}
