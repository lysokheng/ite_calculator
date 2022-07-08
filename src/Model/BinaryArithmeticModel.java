package Model;


import javax.swing.*;
import java.math.BigDecimal;

public class BinaryArithmeticModel {
    //... Constants
    private static final String INITIAL_VALUE = "0";

    //... Member variable defining state of calculator.
    private BigDecimal result;
    private int count;

    //============================================================== constructor
    /** Constructor */
    public BinaryArithmeticModel() {
        reset();
    }

    //==================================================================== reset
    /** Reset to initial value. */
    public void reset() {
        result = new BigDecimal(INITIAL_VALUE);
    }

    //=============================================================== calculation

    public void addition(String a, String b, JTextArea history) {

        // convert int to BigInteger
        BigDecimal first = BigDecimal.valueOf(Long.parseLong(a));
        BigDecimal second = BigDecimal.valueOf(Long.parseLong(b));

        //Calculate the output
        result = first.add(second);

        count++;
        history.append(count + ". " + "Addition" + "\n"
                + "A: " + a + "\nB: " + b + "\nResult: " + result + "\n\n");
    }

    public void subtraction(String a, String b, JTextArea history) {

        // convert int to BigInteger
        BigDecimal first = BigDecimal.valueOf(Long.parseLong(a));
        BigDecimal second = BigDecimal.valueOf(Long.parseLong(b));

        //Calculate the output
        result = first.subtract(second);

        count++;
        history.append(count + ". " + "Subtraction" + "\n"
                + "A: " + a + "\nB: " + b + "\nResult: " + result + "\n\n");
    }

    public void multiply(String a, String b, JTextArea history) {

        // convert int to BigInteger
        BigDecimal first = BigDecimal.valueOf(Long.parseLong(a));
        BigDecimal second = BigDecimal.valueOf(Long.parseLong(b));

        //Calculate the output
        result = first.multiply(second);

        count++;
        history.append(count + ". " + "Multiply" + "\n"
                + "A: " + a + "\nB: " + b + "\nResult: " + result + "\n\n");
    }

    public void divide(String a, String b, JTextArea history) {

        // convert int to BigInteger
        BigDecimal first = BigDecimal.valueOf(Long.parseLong(a));
        BigDecimal second = BigDecimal.valueOf(Long.parseLong(b));

        //Calculate the output
        result = first.divideToIntegralValue(second);

        count++;
        history.append(count + ". " + "Divide" + "\n"
                + "A: " + a + "\nB: " + b + "\nResult: " + result + "\n\n");
    }

    public void modulo(String a, String b, JTextArea history) {

        // convert int to BigInteger
        BigDecimal first = BigDecimal.valueOf(Long.parseLong(a));
        BigDecimal second = BigDecimal.valueOf(Long.parseLong(b));

        //Calculate the output
        result = first.remainder(second);

        count++;
        history.append(count + ". " + "Modulo" + "\n"
                + "A: " + a + "\nB: " + b + "\nResult: " + result + "\n\n");
    }

    //================================================================= getValue
    /** Return current calculator total. */
    public String getValue() {
        return result.toString();
    }
}