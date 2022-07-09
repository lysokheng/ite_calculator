package Model;

import javax.swing.*;

public class BitwiseDecimalModel {
    //... Constants
    private static final String INITIAL_VALUE = "";
    private int a, b;

    //... Member variable defining state of calculator.
    private String result;
    private int count;

    //============================================================== constructor
    /** Constructor */
    public BitwiseDecimalModel() {
        reset();
    }

    //==================================================================== reset
    /** Reset to initial value. */
    public void reset() {
        result = INITIAL_VALUE;
        count = 0;
    }

    //=============================================================== calculation

    public void bitwiseAND(String aField, String bField, JTextArea history) {

        //Get the inputs
        a = Integer.parseInt(aField);
        b = Integer.parseInt(bField);

        //Calculate the output
        result = String.valueOf(a & b);

        count++;
        history.append(count + ". " + "Bitwise AND" + "\n"
                + "A: " + a + "\nB: " + b + "\nResult: " + result + "\n\n");
    }

    public void bitwiseOR(String aField, String bField, JTextArea history) {

        //Get the inputs
        a = Integer.parseInt(aField);
        b = Integer.parseInt(bField);

        //Calculate the output
        result = String.valueOf(a | b);

        count++;
        history.append(count + ". " + "Bitwise OR" + "\n"
                + "A: " + a + "\nB: " + b + "\nResult: " + result + "\n\n");
    }

    public void bitwiseXOR(String aField, String bField, JTextArea history) {

        //Get the inputs
        a = Integer.parseInt(aField);
        b = Integer.parseInt(bField);

        //Calculate the output
        result = String.valueOf(a ^ b);

        count++;
        history.append(count + ". " + "Bitwise XOR" + "\n"
                + "A: " + a + "\nB: " + b + "\nResult: " + result + "\n\n");
    }

    public void bitwiseLeftShift(String aField, String bField, JTextArea history) {

        //Get the inputs
        a = Integer.parseInt(aField);
        b = Integer.parseInt(bField);

        //Calculate the output
        result = String.valueOf(a << b);

        count++;
        history.append(count + ". " + "Bitwise LeftShift" + "\n"
                + "A: " + a + "\nB: " + b + "\nResult: " + result + "\n\n");
    }

    public void bitwiseRightShift(String aField, String bField, JTextArea history) {

        //Get the inputs
        a = Integer.parseInt(aField);
        b = Integer.parseInt(bField);

        //Calculate the output
        result = String.valueOf(a >> b);

        count++;
        history.append(count + ". " + "Bitwise RightShift" + "\n"
                + "A: " + a + "\nB: " + b + "\nResult: " + result + "\n\n");
    }

    public void bitwiseInversion(String aField, String b, JTextArea history) {

        //Get the inputs
        a = Integer.parseInt(aField);

        //Calculate the output
        result = String.valueOf(~a);

        count++;
        history.append(count + ". " + "Bitwise Inverse" + "\n"
                + "A: " + a + "\nB: " + b + "\nResult: " + result + "\n\n");
    }

    //================================================================= getValue
    /** Return current calculator total. */
    public String getValue() {
        return result;
    }
}