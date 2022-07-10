package Model;

import Controller.ConvertNumber;

import javax.swing.*;

public class TrigonometryModel {
    //... Constants
    private static final String INITIAL_VALUE = "0";

    //... Member variable defining state of calculator.
    private String result;
    private int count;

    //... create object
    ConvertNumber convertNumber = new ConvertNumber();

    //============================================================== constructor
    /** Constructor */
    public TrigonometryModel() {
        reset();
    }

    //==================================================================== reset
    /** Reset to initial value. */
    public void reset() {
        result = INITIAL_VALUE;
        count = 0;
    }

    //=============================================================== calculation

    public void sinToRadian(String amount, JTextArea history) {

        // convert degrees to radians
        double radians = Math.toRadians(Double.parseDouble(amount));
        // sin() method to get the sine value
        double sinValue = Math.sin(radians);

        result = String.valueOf(sinValue);

        count++;
        history.append(count + ". " + "Sin to Radian" + "\n"
                + "sin(" + amount + " degrees)\n=\n" + result + " radians" + "\n\n");
    }

    public void sinToDegree(String amount, JTextArea history) {

        // convert radians to degrees
        double radians = Math.toDegrees(Double.parseDouble(amount));
        // sin() method to get the sine value
        double sinValue = Math.sin(radians);

        result = String.valueOf(sinValue);

        count++;
        history.append(count + ". " + "Sin to Degree" + "\n"
                + "sin(" + amount + " radians)\n=\n" + result + " degrees" + "\n\n");
    }

    public void cosToRadian(String amount, JTextArea history) {

        // convert degrees to radians
        double radians = Math.toRadians(Double.parseDouble(amount));
        // cos() method to get the cosine value
        double cosValue = Math.cos(radians);

        result = String.valueOf(cosValue);

        count++;
        history.append(count + ". " + "Cos to Radians" + "\n"
                + "cos(" + amount + " degrees)\n=\n" + result + " radians" + "\n\n");
    }

    public void cosToDegree(String amount, JTextArea history) {

        // convert radians to degrees
        double radians = Math.toDegrees(Double.parseDouble(amount));
        // cos() method to get the cosine value
        double cosValue = Math.cos(radians);

        result = String.valueOf(cosValue);

        count++;
        history.append(count + ". " + "Cos to Degree" + "\n"
                + "cos(" + amount + " radians)\n=\n" + result + " degrees" + "\n\n");
    }

    public void tanToRadian(String amount, JTextArea history) {

        // convert degrees to radians
        double radians = Math.toRadians(Double.parseDouble(amount));
        // tan() method to get the tangent value
        double tanValue = Math.tan(radians);

        result = String.valueOf(tanValue);

        count++;
        history.append(count + ". " + "Tan to Radian" + "\n"
                + "tan(" + amount + " degrees)\n=\n" + result + " radians" + "\n\n");
    }

    public void tanToDegree(String amount, JTextArea history) {

        // convert radians to degrees
        double Degree = Math.toDegrees(Double.parseDouble(amount));
        // tan() method to get the sine value
        double tanValue = Math.sin(Degree);

        result = String.valueOf(tanValue);

        count++;
        history.append(count + ". " + "Tan to Degree" + "\n"
                + "tan(" + amount + " radians)\n=\n" + result + " degrees" + "\n\n");
    }

    public void square2InInt(String amount, JTextArea history) {

        // Math.pow() method to get the square value
        double square = Math.pow(Double.parseDouble(amount), 2);

        result = String.valueOf((int) square);

        count++;
        history.append(count + ". " + "Square2 In Integer" + "\n"
                + "square2 in integer:\n" + amount + "\n=\n" + result + "\n\n");
    }

    public void square2InFloating_point(String amount, JTextArea history) {

        // Math.pow() method to get the square value
        double square = Math.pow(Double.parseDouble(amount), 2);

        result = String.valueOf((float) square);

        count++;
        history.append(count + ". " + "Square2 In Floating Point" + "\n"
                + "square2 in floating-point:\n" + amount + "\n=\n" + result + "\n\n");
    }

    public void square3InInt(String amount, JTextArea history) {

        // Math.pow() method to get the square value
        double square = Math.pow(Double.parseDouble(amount), 3);

        result = String.valueOf((int) square);

        count++;
        history.append(count + ". " + "Square3 in Integer" + "\n"
                + "square2 in integer:\n" + amount + "\n=\n" + result + "\n\n");
    }

    public void square3InFloating_point(String amount, JTextArea history) {

        // Math.pow() method to get the square value
        double square = Math.pow(Double.parseDouble(amount), 3);

        result = String.valueOf((int) square);

        count++;
        history.append(count + ". " + "Square3 in Floating Point" + "\n"
                + "square2 in floating-point:\n" + amount + "\n=\n" + result + "\n\n");
    }

    public void degreeToRadian(String amount, JTextArea history) {

        // convert degrees to radians
        double radians = Math.toRadians(Double.parseDouble(amount));

        result = String.valueOf(radians);

        count++;
        history.append(count + ". " + "Degree to Radian" + "\n"
                + amount + " degrees\n=\n" + radians + " radians" + "\n\n");
    }

    //================================================================= getValue
    /** Return current calculator total. */
    public String getValue() {
        return result;
    }
}
