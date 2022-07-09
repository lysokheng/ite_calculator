package Model;

import Controller.ConvertNumber;

import javax.swing.*;

public class NSCOctalModel {
    //... Constants
    private static final String INITIAL_VALUE = "0";

    //... Member variable defining state of calculator.
    private String result;
    private int count;

    //... create object
    ConvertNumber convertNumber = new ConvertNumber();

    //============================================================== constructor
    /** Constructor */
    public NSCOctalModel() {
        reset();
    }

    //==================================================================== reset
    /** Reset to initial value. */
    public void reset() {
        result = INITIAL_VALUE;
        count = 0;
    }

    //=============================================================== calculation

    public void octal2Decimal(String amountField, JTextArea history) {

        //Get the inputs
        long Amount = Long.parseLong(amountField);

        result = String.valueOf(convertNumber.octal2Decimal(Amount));

        count++;
        history.append(count + ". " + "Octal To Decimal" + "\n"
                + Amount + " in Octal = " + result + " in Decimal"
                + "\n\n");
    }

    public void octal2Binary(String amountField, JTextArea history) {

        //Get the inputs
        long Amount = Long.parseLong(amountField);

        result = String.valueOf(convertNumber.octal2Binary(String.valueOf(Amount)));

        count++;
        history.append(count + ". " + "Octal To Binary" + "\n"
                + Amount + " in Octal = " + result + " in Binary"
                + "\n\n");
    }

    public void octal2Hex(String amountField, JTextArea history) {

        //Get the inputs
        long Amount = Long.parseLong(amountField);

        result = String.valueOf(convertNumber.octal2Hex(Amount));

        count++;
        history.append(count + ". " + "Octal To Hexadecimal" + "\n"
                + Amount + " in Octal = " + result + " in Hexadecimal"
                + "\n\n");
    }

    //================================================================= getValue
    /** Return current calculator total. */
    public String getValue() {
        return result;
    }
}
