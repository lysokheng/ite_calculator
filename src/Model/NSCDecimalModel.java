package Model;

import Controller.ConvertNumber;

import javax.swing.*;

public class NSCDecimalModel {
    //... Constants
    private static final String INITIAL_VALUE = "0";

    //... Member variable defining state of calculator.
    private String result;
    private int count;

    //... create object
    ConvertNumber convertNumber = new ConvertNumber();

    //============================================================== constructor
    /** Constructor */
    public NSCDecimalModel() {
        reset();
    }

    //==================================================================== reset
    /** Reset to initial value. */
    public void reset() {
        result = INITIAL_VALUE;
        count = 0;
    }

    //=============================================================== calculation

    public void dec2Binary(String amountField, JTextArea history) {

        //Get the inputs
        long Amount = Long.parseLong(amountField);

        result = convertNumber.dec2Binary(Amount);

        count++;
        history.append(count + ". " + "Decimal To Binary" + "\n"
                + Amount + " in Decimal\n=\n" + result + " in Binary"
                + "\n\n");
    }

    public void dec2Hex(String amountField, JTextArea history) {

        //Get the inputs
        long Amount = Long.parseLong(amountField);

        result = convertNumber.dec2Hexa(Amount);

        count++;
        history.append(count + ". " + "Decimal To Hexadecimal" + "\n"
                + Amount + " in Decimal\n=\n" + result + " in Hexadecimal"
                + "\n\n");
    }

    public void dec2Octal(String amountField, JTextArea history) {

        //Get the inputs
        long Amount = Long.parseLong(amountField);

        result = convertNumber.dec2Octal(Amount);

        count++;
        history.append(count + ". " + "Decimal To Octal" + "\n"
                + Amount + " in Decimal\n=\n" + result + " in Octal"
                + "\n\n");
    }

    //================================================================= getValue
    /** Return current calculator total. */
    public String getValue() {
        return result;
    }
}
