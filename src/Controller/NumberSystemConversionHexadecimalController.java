package Controller;

import javax.swing.*;

public class NumberSystemConversionHexadecimalController {
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

    public void hex2DecimalResult(JButton button, JTextField amountField, JTextArea outputField, JTextArea historyField){
        button.addActionListener(e -> {

            //Get the inputs
            String amount = amountField.getText();

            // binary to decimal
            System.out.println(
                    amount + " in hexadecimal = " + convertNumber.hex2Decimal(amount) + " in decimal");

            //Show the output
            outputField.setText(String.valueOf(convertNumber.hex2Decimal(amount)));

            //print history
            count++;
            System.out.println(count);
            historyField.append(count + ". " + "Hexadecimal To Decimal" + "\n"
                    + amount + " in hexadecimal = " + convertNumber.hex2Decimal(amount) + " in decimal"
                    + "\n\n");
        });
    }

    public void hex2OctalResult(JButton button, JTextField amountField, JTextArea outputField, JTextArea historyField){
        button.addActionListener(e -> {

            //Get the inputs
            String amount = amountField.getText();

            // binary to decimal
            System.out.println(
                    amount + " in hexadecimal = " + convertNumber.hex2Octal(amount) + " in octal");

            //Show the output
            outputField.setText(String.valueOf(convertNumber.hex2Octal(amount)));

            //print history
            count++;
            System.out.println(count);
            historyField.append(count + ". " + "Hexadecimal To Octal" + "\n"
                    + amount + " in hexadecimal = " + convertNumber.hex2Octal(amount) + " in octal"
                    + "\n\n");
        });
    }

    public void hex2BinaryResult(JButton button, JTextField amountField, JTextArea outputField, JTextArea historyField){
        button.addActionListener(e -> {

            //Get the inputs
            String Amount = amountField.getText();

            char[] hex = Amount.toCharArray();

            // use loop for every character
            int i;
            for (i = 0; i < hex.length; i++) {
                System.out.print(hex[i]);
            }

            // binary to decimal
            System.out.println(
                    Amount + " in hexadecimal = " + convertNumber.hex2Binary(hex) + " in binary");

            //Show the output
            outputField.setText(convertNumber.hex2Binary(hex));

            //print history
            count++;
            System.out.println(count);
            historyField.append(count + ". " + "Hexadecimal To Binary" + "\n"
                    + Amount + " in hexadecimal = " + convertNumber.hex2Binary(hex) + " in binary"
                    + "\n\n");
        });
    }

}
