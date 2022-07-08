package Controller;

import javax.swing.*;

public class BitwiseDecimalController {
    public int a, b, result, count;

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

            //Get the inputs
            a = Integer.parseInt(aField.getText());
            b = Integer.parseInt(bField.getText());

            //Calculate the output
            result = a & b;
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

            //Get the inputs
            a = Integer.parseInt(aField.getText());
            b = Integer.parseInt(bField.getText());

            //Calculate the output
            result = a | b;
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

            //Get the inputs
            a = Integer.parseInt(aField.getText());
            b = Integer.parseInt(bField.getText());

            //Calculate the output
            result = a ^ b;
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

            //Get the inputs
            a = Integer.parseInt(aField.getText());
            b = Integer.parseInt(bField.getText());

            //Calculate the output
            result = a << b;
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

            //Get the inputs
            a = Integer.parseInt(aField.getText());
            b = Integer.parseInt(bField.getText());

            //Calculate the output
            result = a >> b;
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

    public void bitwiseInversionResult(JButton button, JTextField aField, JTextArea outputField, JTextArea historyField){
        button.addActionListener(e -> {

            //Get the inputs
            a = Integer.parseInt(aField.getText());

            //Calculate the output
            result = ~a;
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
