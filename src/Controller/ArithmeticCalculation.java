package Controller;

import Model.ArithmeticModel;
import Views.Widgets.ArithmeticWidgets;

import javax.swing.*;
import java.math.BigInteger;


public class ArithmeticCalculation {
    public int a, b, result, count;
    private ArithmeticModel arithmeticModel;
    private ArithmeticWidgets arithmeticWidgets;

    public ArithmeticCalculation(ArithmeticModel model, ArithmeticWidgets view){
        arithmeticModel = model;
        arithmeticWidgets = view;
    }

    public void performReset(JButton button, JTextField aField, JTextField bField, JTextArea resultField, JTextArea historyField){
        button.addActionListener(e -> {
            aField.setText("");
            bField.setText("");
            resultField.setText("");
            historyField.setText("");
            count = 0;
        });
    }

    public void additionResult(JButton button, JTextField aField, JTextField bField, JTextArea outputField, JTextArea historyField){
        button.addActionListener(e -> {

            //Get the inputs
            a = Integer.parseInt(aField.getText());
            b = Integer.parseInt(bField.getText());

            // convert int to BigInteger
            BigInteger first = BigInteger.valueOf(a);
            BigInteger second = BigInteger.valueOf(b);

            //Calculate the output
            BigInteger result = first.add(second);
            System.out.println(a + " + " + b + " = " + result);

            //Show the output
            outputField.setText(String.valueOf(result));

            //print history
            count++;
            System.out.println(count);
            historyField.append(count + ". " + "Addition" + "\n"
                    + "A: " + a + ", B: " + b + ", Result: " + result + "\n\n");
        });
    }

    public void subtractionResult(JButton button, JTextField aField, JTextField bField, JTextArea outputField, JTextArea historyField){
        button.addActionListener(e -> {

            //Get the inputs
            a = Integer.parseInt(aField.getText());
            b = Integer.parseInt(bField.getText());

            //Calculate the output
            result = a - b;
            System.out.println(a + " - " + b + " = " + result);

            //Show the output
            outputField.setText(String.valueOf(result));

            //print history
            count++;
            System.out.println(count);
            historyField.append(count + ". " + "Subtraction" + "\n"
                    + "A: " + a + ", B: " + b + ", Result: " + result + "\n\n");        });
    }

    public void multiplicationResult(JButton button, JTextField aField, JTextField bField, JTextArea outputField, JTextArea historyField){
        button.addActionListener(e -> {

            //Get the inputs
            a = Integer.parseInt(aField.getText());
            b = Integer.parseInt(bField.getText());

            //Calculate the output
            result = a * b;
            System.out.println(a + " * " + b + " = " + result);

            //Show the output
            outputField.setText(String.valueOf(result));

            //print history
            count++;
            System.out.println(count);
            historyField.append(count + ". " + "Multiplication" + "\n"
                    + "A: " + a + ", B: " + b + ", Result: " + result + "\n\n");        });
    }

    public void divisionResult(JButton button, JTextField aField, JTextField bField, JTextArea outputField, JTextArea historyField){
        button.addActionListener(e -> {

            //Get the inputs
            a = Integer.parseInt(aField.getText());
            b = Integer.parseInt(bField.getText());

            //Calculate the output
            result = a / b;
            System.out.println(a + " / " + b + " = " + result);

            //Show the output
            outputField.setText(String.valueOf(result));

            //print history
            count++;
            System.out.println(count);
            historyField.append(count + ". " + "Division" + "\n"
                    + "A: " + a + ", B: " + b + ", Result: " + result + "\n\n");
        });
    }

    public void moduloResult(JButton button, JTextField aField, JTextField bField, JTextArea outputField, JTextArea historyField){
        button.addActionListener(e -> {

            //Get the inputs
            a = Integer.parseInt(aField.getText());
            b = Integer.parseInt(bField.getText());

            //Calculate the output
            result = a % b;
            System.out.println(a + " % " + b + " = " + result);

            //Show the output
            outputField.setText(String.valueOf(result));

            //print history
            count++;
            System.out.println(count);
            historyField.append(count + ". " + "Modulo" + "\n"
                    + "A: " + a + ", B: " + b + ", Result: " + result + "\n\n");
        });
    }

}
