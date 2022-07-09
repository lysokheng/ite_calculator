package Model;

import Controller.ConvertNumber;

import javax.swing.*;

public class NSCHexadecimalModel {
    //... Constants
    private static final String INITIAL_VALUE = "0";

    //... Member variable defining state of calculator.
    private String result;
    private int count;

    //... create object
    ConvertNumber convertNumber = new ConvertNumber();

    //============================================================== constructor
    /** Constructor */
    public NSCHexadecimalModel() {
        reset();
    }

    //==================================================================== reset
    /** Reset to initial value. */
    public void reset() {
        result = INITIAL_VALUE;
        count = 0;
    }

    //=============================================================== calculation

    public void hex2Decimal(String amount, JTextArea history) {

        result = String.valueOf(convertNumber.hex2Decimal(String.valueOf(amount)));

        count++;
        history.append(count + ". " + "Hexadecimal To Decimal" + "\n"
                + amount + " in Hexadecimal\n=\n" + result + " in Decimal"
                + "\n\n");
    }

    public void hex2Octal(String amount, JTextArea history) {

        result = String.valueOf(Long.parseLong(String.valueOf(convertNumber.hex2Octal(amount))));

        count++;
        history.append(count + ". " + "Hexadecimal To Octal" + "\n"
                + amount + " in Hexadecimal\n=\n" + result + " in Octal"
                + "\n\n");
    }

    public void hex2Binary(String amount, JTextArea history) {

        char[] hex = amount.toCharArray();

        // use loop for every character
        int i;
        for (i = 0; i < hex.length; i++) {
            System.out.print(hex[i]);
        }

        result = convertNumber.hex2Binary(hex);

        count++;
        history.append(count + ". " + "Hexadecimal To Binary" + "\n"
                + amount + " in Hexadecimal\n=\n" + result + " in Binary"
                + "\n\n");
    }

    //================================================================= getValue
    /** Return current calculator total. */
    public String getValue() {
        return result;
    }
}
