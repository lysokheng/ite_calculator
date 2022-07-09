package Model;

import Controller.ConvertNumber;

import javax.swing.*;
import java.text.DecimalFormat;

public class NSCBinaryModel {
    //... Constants
    private static final String INITIAL_VALUE = "0";

    //... Member variable defining state of calculator.
    private String result;
    private int count;

    //... create object
    ConvertNumber convertNumber = new ConvertNumber();

    //============================================================== constructor
    /** Constructor */
    public NSCBinaryModel() {
        reset();
    }

    //==================================================================== reset
    /** Reset to initial value. */
    public void reset() {
        result = INITIAL_VALUE;
        count = 0;
    }

    //=============================================================== calculation

    public void binary2Decimal(String amountField, JTextArea history) {

        //Get the inputs
        long Amount = Long.parseLong(amountField);

        result = String.valueOf(convertNumber.binary2Decimal(String.valueOf(Amount)));

        count++;
        history.append(count + ". " + "Binary To Decimal" + "\n"
                + Amount + " in Binary = " + result + " in Decimal"
                + "\n\n");
    }

    public void binary2Octal(String amountField, JTextArea history) {

        //Get the inputs
        long Amount = Long.parseLong(amountField);

        result = String.valueOf(convertNumber.binary2Octal(Long.parseLong(String.valueOf(Amount))));

        count++;
        history.append(count + ". " + "Binary To Octal" + "\n"
                + Amount + " in Binary = " + result + " in Octal"
                + "\n\n");
    }

    public void binary2Hex(String amountField, JTextArea history) {

        //Get the inputs
        long Amount = Long.parseLong(amountField);

        result = String.valueOf(convertNumber.binary2Hex(Amount));

        count++;
        history.append(count + ". " + "Binary To Hexadecimal" + "\n"
                + Amount + " in Binary = " + result + " in Hexadecimal"
                + "\n\n");
    }

    //================================================================= getValue
    /** Return current calculator total. */
    public String getValue() {
        return result;
    }
}
