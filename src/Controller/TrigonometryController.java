package Controller;

import javax.swing.*;

public class TrigonometryController {
    public int amount, result, count;

    public void performReset(JButton button, JTextField amountField, JTextArea resultField, JTextArea historyField){
        button.addActionListener(e -> {
            amountField.setText("");
            resultField.setText("");
            historyField.setText("");
            count = 0;
        });
    }

    public void sinToRadianResult(JButton button, JTextField amountField, JTextArea resultField, JTextArea historyField){
        button.addActionListener(e -> {

            //Get the inputs
            amount = Integer.parseInt(amountField.getText());

            // convert degrees to radians
            double radians = Math.toRadians(amount);
            // sin() method to get the sine value
            double sinValue = Math.sin(radians);
            // prints the sine value
            System.out.println("sin(" + amount + " degrees) = " + sinValue + " radians");

            //Show the output
            resultField.setText(String.valueOf(sinValue));

            //print history
            count++;
            System.out.println(count);
            historyField.append(count + ". " + "Sin to Radian" + "\n"
                    + "sin(" + amount + " degrees) = " + sinValue + " radians" + "\n\n");
        });
    }

    public void sinToDegreeResult(JButton button, JTextField amountField, JTextArea resultField, JTextArea historyField){
        button.addActionListener(e -> {

            //Get the inputs
            amount = Integer.parseInt(amountField.getText());

            // convert radians to degrees
            double radians = Math.toDegrees(amount);
            // sin() method to get the sine value
            double sinValue = Math.sin(radians);
            // prints the sine value
            System.out.println("sin(" + amount + " radians) = " + sinValue + " degrees");

            //Show the output
            resultField.setText(String.valueOf(sinValue));

            //print history
            count++;
            System.out.println(count);
            historyField.append(count + ". " + "Sin to Degree" + "\n"
                    + "sin(" + amount + " radians) = " + sinValue + " degrees" + "\n\n");
        });
    }

    public void cosToRadianResult(JButton button, JTextField amountField, JTextArea resultField, JTextArea historyField){
        button.addActionListener(e -> {

            //Get the inputs
            amount = Integer.parseInt(amountField.getText());

            // convert degrees to radians
            double radians = Math.toRadians(amount);
            // cos() method to get the cosine value
            double cosValue = Math.cos(radians);
            // prints the cosine value
            System.out.println("cos(" + amount + " degrees) = " + cosValue + " radians");

            //Show the output
            resultField.setText(String.valueOf(cosValue));

            //print history
            count++;
            System.out.println(count);
            historyField.append(count + ". " + "Cos to Radians" + "\n"
                    + "cos(" + amount + " degrees) = " + cosValue + " radians" + "\n\n");
        });
    }

    public void cosToDegreeResult(JButton button, JTextField amountField, JTextArea resultField, JTextArea historyField){
        button.addActionListener(e -> {

            //Get the inputs
            amount = Integer.parseInt(amountField.getText());

            // convert radians to degrees
            double radians = Math.toDegrees(amount);
            // cos() method to get the cosine value
            double cosValue = Math.cos(radians);
            // prints the cosine value
            System.out.println("cos(" + amount + " radians) = " + cosValue + " degrees");

            //Show the output
            resultField.setText(String.valueOf(cosValue));

            //print history
            count++;
            System.out.println(count);
            historyField.append(count + ". " + "Cos to Degree" + "\n"
                    + "cos(" + amount + " radians) = " + cosValue + " degrees" + "\n\n");
        });
    }

    public void tanToRadianResult(JButton button, JTextField amountField, JTextArea resultField, JTextArea historyField){
        button.addActionListener(e -> {

            //Get the inputs
            amount = Integer.parseInt(amountField.getText());

            // convert degrees to radians
            double radians = Math.toRadians(amount);
            // tan() method to get the tangent value
            double tanValue = Math.tan(radians);
            // prints the tangent value
            System.out.println("tan(" + amount + " degrees) = " + tanValue + " radians");

            //Show the output
            resultField.setText(String.valueOf(tanValue));

            //print history
            count++;
            System.out.println(count);
            historyField.append(count + ". " + "Tan to Radian" + "\n"
                    + "tan(" + amount + " degrees) = " + tanValue + " radians" + "\n\n");
        });
    }

    public void tanToDegreeResult(JButton button, JTextField amountField, JTextArea resultField, JTextArea historyField){
        button.addActionListener(e -> {

            //Get the inputs
            amount = Integer.parseInt(amountField.getText());

            // convert radians to degrees
            double Degree = Math.toDegrees(amount);
            // tan() method to get the sine value
            double tanValue = Math.sin(Degree);
            // prints the tangent value
            System.out.println("tan(" + amount + " radians) = " + tanValue + " degrees");

            //Show the output
            resultField.setText(String.valueOf(tanValue));

            //print history
            count++;
            System.out.println(count);
            historyField.append(count + ". " + "Tan to Degree" + "\n"
                    + "tan(" + amount + " radians) = " + tanValue + " degrees" + "\n\n");
        });
    }

    public void square2InIntResult(JButton button, JTextField amountField, JTextArea resultField, JTextArea historyField){
        button.addActionListener(e -> {

            //Get the inputs
            amount = Integer.parseInt(amountField.getText());

            // Math.pow() method to get the square value
            double square = Math.pow(amount, 2);
            // prints the square value
            System.out.println("square2 in integer: " + amount + " = " + (int) square);

            //Show the output
            resultField.setText(String.valueOf(square));

            //print history
            count++;
            System.out.println(count);
            historyField.append(count + ". " + "Square2 In Integer" + "\n"
                    + "square2 in integer: " + amount + " = " + (int) square + "\n\n");
        });
    }

    public void square2InFloating_pointResult(JButton button, JTextField amountField, JTextArea resultField, JTextArea historyField){
        button.addActionListener(e -> {

            //Get the inputs
            amount = Integer.parseInt(amountField.getText());

            // Math.pow() method to get the square value
            double square = Math.pow(amount, 2);
            // prints the square value
            System.out.println("square2 in floating-point: " + amount + " = " + (float) square);

            //Show the output
            resultField.setText(String.valueOf(square));

            //print history
            count++;
            System.out.println(count);
            historyField.append(count + ". " + "Square2 in Floating Point" + "\n"
                    + "square2 in floating-point: " + amount + " = " + (float) square + "\n\n");
        });
    }

    public void square3InIntResult(JButton button, JTextField amountField, JTextArea resultField, JTextArea historyField){
        button.addActionListener(e -> {

            //Get the inputs
            amount = Integer.parseInt(amountField.getText());

            // Math.pow() method to get the square value
            double square = Math.pow(amount, 3);
            // prints the square value
            System.out.println("square3 in integer: " + amount + " = " + (int) square);

            //Show the output
            resultField.setText(String.valueOf(square));

            //print history
            count++;
            System.out.println(count);
            historyField.append(count + ". " + "Square3 in Integer" + "\n"
                    + "square3 in integer: " + amount + " = " + (int) square + "\n\n");
        });
    }

    public void square3InFloating_pointResult(JButton button, JTextField amountField, JTextArea resultField, JTextArea historyField){
        button.addActionListener(e -> {

            //Get the inputs
            amount = Integer.parseInt(amountField.getText());

            // Math.pow() method to get the square value
            double square = Math.pow(amount, 3);
            // prints the square value
            System.out.println("square3 in floating-point: " + amount + " = " + (float) square);

            //Show the output
            resultField.setText(String.valueOf(square));

            //print history
            count++;
            System.out.println(count);
            historyField.append(count + ". " + "Square3 in Floating Point" + "\n"
                    + "square3 in floating-point: " + amount + " = " + (float) square + "\n\n");
        });
    }

    public void degreeToRadianResult(JButton button, JTextField amountField, JTextArea resultField, JTextArea historyField){
        button.addActionListener(e -> {

            //Get the inputs
            amount = Integer.parseInt(amountField.getText());

            // convert degrees to radians
            double radians = Math.toRadians(amount);
            // prints the radians value
            System.out.println(amount + " degrees = " + radians + " radians");

            //Show the output
            resultField.setText(String.valueOf(radians));

            //print history
            count++;
            System.out.println(count);
            historyField.append(count + ". " + "Degree to Radian" + "\n"
                    + amount + " degrees = " + radians + " radians" + "\n\n");
        });
    }
}
