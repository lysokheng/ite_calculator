package Model;

import javax.swing.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class ArithmeticModel {
    //... Constants
    private static final String INITIAL_VALUE = "0";

    //... Member variable defining state of calculator.
    private String result;
    private int count;
    private BigDecimal first;
    private  BigDecimal second;

    //============================================================== constructor
    /** Constructor */
    public ArithmeticModel() {
        reset();
    }

    //==================================================================== reset
    /** Reset to initial value. */
    public void reset() {
        result = INITIAL_VALUE;
        count = 0;
    }

    //=============================================================== calculation

    public void addition(String a, String b, JTextArea history) {

        // convert int to BigInteger
        first = BigDecimal.valueOf(Long.parseLong(a));
        second = BigDecimal.valueOf(Long.parseLong(b));

        //Calculate the output
        result = String.valueOf(first.add(second));

        count++;
        history.append(count + ". " + "Addition" + "\n"
                + "A: " + a + "\nB: " + b + "\nResult: " + result + "\n\n");
    }

    public void subtraction(String a, String b, JTextArea history) {

        // convert int to BigInteger
         first = BigDecimal.valueOf(Long.parseLong(a));
         second = BigDecimal.valueOf(Long.parseLong(b));

        //Calculate the output
        result = String.valueOf(first.subtract(second));

        count++;
        history.append(count + ". " + "Subtraction" + "\n"
                + "A: " + a + "\nB: " + b + "\nResult: " + result + "\n\n");
    }

    public void multiply(String a, String b, JTextArea history) {

        // convert int to BigInteger
         first = BigDecimal.valueOf(Long.parseLong(a));
         second = BigDecimal.valueOf(Long.parseLong(b));

        //Calculate the output
        result = String.valueOf(first.multiply(second));

        count++;
        history.append(count + ". " + "Multiply" + "\n"
                + "A: " + a + "\nB: " + b + "\nResult: " + result + "\n\n");
    }

    public void divide(String a, String b, JTextArea history) {

        // convert int to BigInteger
         first = BigDecimal.valueOf(Long.parseLong(a));
         second = BigDecimal.valueOf(Long.parseLong(b));

        //Calculate the output
        result = String.valueOf(first.divideToIntegralValue(second));

        count++;
        history.append(count + ". " + "Divide" + "\n"
                + "A: " + a + "\nB: " + b + "\nResult: " + result + "\n\n");
    }

    public void modulo(String a, String b, JTextArea history) {

        // convert int to BigInteger
         first = BigDecimal.valueOf(Long.parseLong(a));
         second = BigDecimal.valueOf(Long.parseLong(b));

        //Calculate the output
        result = String.valueOf(first.remainder(second));

        count++;
        history.append(count + ". " + "Modulo" + "\n"
                + "A: " + a + "\nB: " + b + "\nResult: " + result + "\n\n");
    }

    //================================================================= getValue
    /** Return current calculator total. */
    public String getValue() {
        return result;
    }
}