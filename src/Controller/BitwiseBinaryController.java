package Controller;

import javax.swing.*;
import java.math.BigInteger;

public class BitwiseBinaryController {
    public int a;
    public int b;
    public String result;
    public int count;

    ConvertNumber convertNumber = new ConvertNumber();

    public void performReset(JButton button, JTextField aField, JTextField bField, JTextArea resultField, JTextArea historyField){
        button.addActionListener(e -> {
            aField.setText("");
            bField.setText("");
            resultField.setText("");
            historyField.setText("");
            count = 0;
        });
    }

    public void bitwiseANDResult(JButton button, JTextField aField, JTextField bField, JTextArea outputField, JTextArea historyField){
        button.addActionListener(e -> {

            //convert jTextField to string
            String a = aField.getText();
            String b = bField.getText();

            BigInteger b1 = new BigInteger(a, 2);
            BigInteger b2 = new BigInteger(b, 2);

            System.out.println(b1.and(b2).toString(2));

            //Calculate the output
            result = b1.and(b2).toString(2);
            System.out.println(a + " & " + b + " = " + result);

            //Show the output
            outputField.setText(String.valueOf(result));

            //print history
            count++;
            System.out.println(count);
            historyField.append(count + ". " + "Bitwise AND" + "\n"
                    + "A: " + a + ", B: " + b + ", Result: " + result + "\n\n");
        });
    }

    public void bitwiseORResult(JButton button, JTextField aField, JTextField bField, JTextArea outputField, JTextArea historyField){
        button.addActionListener(e -> {

            //convert jTextField to string
            String a = aField.getText();
            String b = bField.getText();

            BigInteger b1 = new BigInteger(a, 2);
            BigInteger b2 = new BigInteger(b, 2);

            System.out.println(b1.or(b2).toString(2));

            //Calculate the output
            result = b1.or(b2).toString(2);
            System.out.println(a + " | " + b + " = " + result);

            //Show the output
            outputField.setText(String.valueOf(result));

            //print history
            count++;
            System.out.println(count);
            historyField.append(count + ". " + "Bitwise OR" + "\n"
                    + "A: " + a + ", B: " + b + ", Result: " + result + "\n\n");        });
    }

    public void bitwiseXORResult(JButton button, JTextField aField, JTextField bField, JTextArea outputField, JTextArea historyField){
        button.addActionListener(e -> {

            //convert jTextField to string
            String a = aField.getText();
            String b = bField.getText();

            BigInteger b1 = new BigInteger(a, 2);
            BigInteger b2 = new BigInteger(b, 2);

            System.out.println(b1.xor(b2).toString(2));

            //Calculate the output
            result = b1.xor(b2).toString(2);
            System.out.println(a + " ^ " + b + " = " + result);

            //Show the output
            outputField.setText(String.valueOf(result));

            //print history
            count++;
            System.out.println(count);
            historyField.append(count + ". " + "Bitwise XOR" + "\n"
                    + "A: " + a + ", B: " + b + ", Result: " + result + "\n\n");        });
    }

    public void bitwiseLeftShiftResult(JButton button, JTextField aField, JTextField bField, JTextArea outputField, JTextArea historyField){
        button.addActionListener(e -> {

            //convert jTextField to string
            String a = aField.getText();
            String b = bField.getText();

            BigInteger b1 = new BigInteger(a, 2);
            int b2 = Integer.parseInt(b);

            System.out.println(b1.shiftLeft(b2).toString(2));

            //Calculate the output
            result = b1.shiftLeft(b2).toString(2);
            System.out.println(a + " << " + b + " = " + result);

            //Show the output
            outputField.setText(String.valueOf(result));

            //print history
            count++;
            System.out.println(count);
            historyField.append(count + ". " + "Bitwise Left Shift" + "\n"
                    + "A: " + a + ", B: " + b + ", Result: " + result + "\n\n");
        });
    }

    public void bitwiseRightShiftResult(JButton button, JTextField aField, JTextField bField, JTextArea outputField, JTextArea historyField){
        button.addActionListener(e -> {

            //convert jTextField to string
            String a = aField.getText();
            String b = bField.getText();

            BigInteger b1 = new BigInteger(a, 2);
            int b2 = Integer.parseInt(b);

            System.out.println(b1.shiftRight(b2).toString(2));

            //Calculate the output
            result = b1.shiftRight(b2).toString(2);
            System.out.println(a + " >> " + b + " = " + result);

            //Show the output
            outputField.setText(String.valueOf(result));

            //print history
            count++;
            System.out.println(count);
            historyField.append(count + ". " + "Bitwise Right Shift" + "\n"
                    + "A: " + a + ", B: " + b + ", Result: " + result + "\n\n");
        });
    }

    public void bitwiseInversionResult(JButton button, JTextField aField, JTextField bField, JTextArea outputField, JTextArea historyField){
        button.addActionListener(e -> {

            //convert jTextField to string
            String a = aField.getText();
            String b = bField.getText();

            BigInteger b1 = new BigInteger(a, 2);
            BigInteger b2 = new BigInteger(b, 2);

            System.out.println(b1.modInverse(b2).toString(2));

            //Calculate the output
            result = b1.modInverse(b2).toString(2);
            System.out.println(a + " = " + result);

            //Show the output
            outputField.setText(String.valueOf(result));

            //print history
            count++;
            System.out.println(count);
            historyField.append(count + ". " + "Bitwise Inversion" + "\n"
                    + "A: " + a + ", B: " + b + ", Result: " + result + "\n\n");
        });
    }

}
