package Controller;

import javax.swing.*;

public class NumberSystemConversionOctalController {
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

    public void octal2DecimalResult(JButton button, JTextField amountField, JTextArea outputField, JTextArea historyField){
        button.addActionListener(e -> {

            //Get the inputs
            long Amount = Long.parseLong(amountField.getText());

            // binary to decimal
            System.out.println(
                    Amount + " in octal = " + convertNumber.octal2Decimal(Amount) + " in decimal");

            //Show the output
            outputField.setText(String.valueOf(convertNumber.octal2Decimal(Amount)));

            //print history
            count++;
            System.out.println(count);
            historyField.append(count + ". " + "Octal To Decimal" + "\n"
                    + Amount + " in octal = " + convertNumber.octal2Decimal(Amount) + " in decimal"
                    + "\n\n");
        });
    }

    public void octal2BinaryResult(JButton button, JTextField amountField, JTextArea outputField, JTextArea historyField){
        button.addActionListener(e -> {

            //Get the inputs
            Long Amount = Long.parseLong(amountField.getText());

            // binary to decimal
            System.out.println(
                    Amount + " in octal = " + convertNumber.octal2Binary(String.valueOf(Amount)) + " in decimal");

            //Show the output
            outputField.setText(String.valueOf(convertNumber.octal2Binary(String.valueOf(Amount))));

            //print history
            count++;
            System.out.println(count);
            historyField.append(count + ". " + "octal To binary" + "\n"
                    + Amount + " in octal = " + convertNumber.octal2Binary(String.valueOf(Amount)) + " in binary"
                    + "\n\n");
        });
    }

    public void octal2HexResult(JButton button, JTextField amountField, JTextArea outputField, JTextArea historyField){
        button.addActionListener(e -> {

            //Get the inputs
            long Amount = Long.parseLong(amountField.getText());

            // binary to decimal
            System.out.println(
                    Amount + " in octal = " + convertNumber.octal2Hex(Amount) + " in hexadecimal");

            //Show the output
            outputField.setText(String.valueOf(convertNumber.octal2Hex(Amount)));

            //print history
            count++;
            System.out.println(count);
            historyField.append(count + ". " + "Octal To Decimal" + "\n"
                    + Amount + " in octal = " + convertNumber.octal2Hex(Amount) + " in hexadecimal"
                    + "\n\n");
        });
    }

}
