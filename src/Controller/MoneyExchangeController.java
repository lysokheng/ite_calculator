package Controller;

import javax.swing.*;
import java.text.DecimalFormat;

public class MoneyExchangeController {
    public int a, b, count;
    double result;

    // Format number to 00.00
    DecimalFormat f = new DecimalFormat("##.###");

    public void performReset(JButton button, JTextField amountField, JTextArea resultField, JTextArea historyField){
        button.addActionListener(e -> {
            amountField.setText("");
            resultField.setText("");
            historyField.setText("");
            count = 0;
        });
    }

    public void rielToDollarResult(JButton button, JTextField amountField, JTextArea outputField, JTextArea historyField){
        button.addActionListener(e -> {

            //Get the inputs
            double Amount = Double.parseDouble(amountField.getText());

            //Calculate the output
            result = Amount / 4100;
            System.out.println(Amount + " Riel = " + f.format(result) + " Dollar");

            //Show the output
            outputField.setText(String.valueOf(f.format(result) + " Dollar"));

            //print history
            count++;
            System.out.println(count);
            historyField.append(count + ". " + "Riel To Dollar" + "\n"
                    + Amount + " Riel = " + f.format(result) + " Dollar" + "\n\n");
        });
    }

    public void rielToEuroResult(JButton button, JTextField amountField, JTextArea outputField, JTextArea historyField){
        button.addActionListener(e -> {

            //Get the inputs
            double Amount = Double.parseDouble(amountField.getText());

            //Calculate the output
            result = Amount / 4600;
            System.out.println(Amount + " Riel = " + f.format(result) + " Euro");

            //Show the output
            outputField.setText(String.valueOf(f.format(result) + " Euro"));

            //print history
            count++;
            System.out.println(count);
            historyField.append(count + ". " + "Riel To Euro" + "\n"
                    + Amount + " Riel = " + f.format(result) + " Euro" + "\n\n");
        });
    }

    public void rielToFranceResult(JButton button, JTextField amountField, JTextArea outputField, JTextArea historyField){
        button.addActionListener(e -> {

            //Get the inputs
            double Amount = Double.parseDouble(amountField.getText());

            //Calculate the output
            result = Amount / 4400;
            System.out.println(Amount + " Riel = " + f.format(result) + " France");

            //Show the output
            outputField.setText(String.valueOf(f.format(result) + " France"));

            //print history
            count++;
            System.out.println(count);
            historyField.append(count + ". " + "Riel To France" + "\n"
                    + Amount + " Riel = " + f.format(result) + " France" + "\n\n");
        });
    }

    public void rielToPoundResult(JButton button, JTextField amountField, JTextArea outputField, JTextArea historyField){
        button.addActionListener(e -> {

            //Get the inputs
            double Amount = Double.parseDouble(amountField.getText());

            //Calculate the output
            result = Amount / 5600;
            System.out.println(Amount + " Riel = " + f.format(result) + " Pound");

            //Show the output
            outputField.setText(String.valueOf(f.format(result) + " Pound"));

            //print history
            count++;
            System.out.println(count);
            historyField.append(count + ". " + "Riel To Pound" + "\n"
                    + Amount + " Riel = " + f.format(result) + " Pound" + "\n\n");
        });
    }

    public void rielToBahtResult(JButton button, JTextField amountField, JTextArea outputField, JTextArea historyField){
        button.addActionListener(e -> {

            //Get the inputs
            double Amount = Double.parseDouble(amountField.getText());

            //Calculate the output
            result = Amount / 122;
            System.out.println(Amount + " Riel = " + f.format(result) + " Baht");

            //Show the output
            outputField.setText(String.valueOf(f.format(result) + " Baht"));

            //print history
            count++;
            System.out.println(count);
            historyField.append(count + ". " + "Riel To Baht" + "\n"
                    + Amount + " Riel = " + f.format(result) + " Baht" + "\n\n");
        });
    }

    public void dollarToRielResult(JButton button, JTextField amountField, JTextArea outputField, JTextArea historyField){
        button.addActionListener(e -> {

            //Get the inputs
            double Amount = Double.parseDouble(amountField.getText());

            //Calculate the output
            result = Amount * 4100;
            System.out.println(Amount + " Dollar = " + f.format(result) + " Riel");

            //Show the output
            outputField.setText(String.valueOf(f.format(result) + " Riel"));

            //print history
            count++;
            System.out.println(count);
            historyField.append(count + ". " + "Dollar To Riel" + "\n"
                    + Amount + " Dollar = " + f.format(result) + " Riel" + "\n\n");
        });
    }

    public void euroToRielResult(JButton button, JTextField amountField, JTextArea outputField, JTextArea historyField){
        button.addActionListener(e -> {

            //Get the inputs
            double Amount = Double.parseDouble(amountField.getText());

            //Calculate the output
            result = Amount * 4600;
            System.out.println(Amount + " Euro = " + f.format(result) + " Riel");

            //Show the output
            outputField.setText(String.valueOf(f.format(result) + " Riel"));

            //print history
            count++;
            System.out.println(count);
            historyField.append(count + ". " + "Euro To Riel" + "\n"
                    + Amount + " Euro = " + f.format(result) + " Riel" + "\n\n");
        });
    }

    public void francToRielResult(JButton button, JTextField amountField, JTextArea outputField, JTextArea historyField){
        button.addActionListener(e -> {

            //Get the inputs
            double Amount = Double.parseDouble(amountField.getText());

            //Calculate the output
            result = Amount * 4400;
            System.out.println(Amount + " Franc = " + f.format(result) + " Riel");

            //Show the output
            outputField.setText(String.valueOf(f.format(result) + " Riel"));

            //print history
            count++;
            System.out.println(count);
            historyField.append(count + ". " + "Franc To Riel" + "\n"
                    + Amount + " Franc = " + f.format(result) + " Riel" + "\n\n");
        });
    }

    public void poundToRielResult(JButton button, JTextField amountField, JTextArea outputField, JTextArea historyField){
        button.addActionListener(e -> {

            //Get the inputs
            double Amount = Double.parseDouble(amountField.getText());

            //Calculate the output
            result = Amount * 5600;
            System.out.println(Amount + " Pound = " + f.format(result) + " Riel");

            //Show the output
            outputField.setText(String.valueOf(f.format(result) + " Riel"));

            //print history
            count++;
            System.out.println(count);
            historyField.append(count + ". " + "Pound To Riel" + "\n"
                    + Amount + " Pound = " + f.format(result) + " Riel" + "\n\n");
        });
    }

    public void bahtToRielResult(JButton button, JTextField amountField, JTextArea outputField, JTextArea historyField){
        button.addActionListener(e -> {

            //Get the inputs
            double Amount = Double.parseDouble(amountField.getText());

            //Calculate the output
            result = Amount * 122;
            System.out.println(Amount + " Baht = " + f.format(result) + " Riel");

            //Show the output
            outputField.setText(String.valueOf(f.format(result) + " Riel"));

            //print history
            count++;
            System.out.println(count);
            historyField.append(count + ". " + "Baht To Riel" + "\n"
                    + Amount + " Baht = " + f.format(result) + " Riel" + "\n\n");
        });
    }

}
