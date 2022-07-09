package Model;

import javax.swing.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class BitwiseBinaryModel {
    //... Constants
    private static final String INITIAL_VALUE = "";

    //... Member variable defining state of calculator.
    private String result;
    private int count;

    //============================================================== constructor
    /** Constructor */
    public BitwiseBinaryModel() {
        reset();
    }

    //==================================================================== reset
    /** Reset to initial value. */
    public void reset() {
        result = INITIAL_VALUE;
        count = 0;
    }

    //=============================================================== calculation

    public void bitwiseAND(String a, String b, JTextArea history) {

        BigInteger b1 = new BigInteger(a, 2);
        BigInteger b2 = new BigInteger(b, 2);

        //Calculate the output
        result = b1.and(b2).toString(2);

        count++;
        history.append(count + ". " + "Bitwise AND" + "\n"
                + "A: " + a + "\nB: " + b + "\nResult: " + result + "\n\n");
    }

    public void bitwiseOR(String a, String b, JTextArea history) {

        BigInteger b1 = new BigInteger(a, 2);
        BigInteger b2 = new BigInteger(b, 2);

        //Calculate the output
        result = b1.or(b2).toString(2);

        count++;
        history.append(count + ". " + "Bitwise OR" + "\n"
                + "A: " + a + "\nB: " + b + "\nResult: " + result + "\n\n");
    }

    public void bitwiseXOR(String a, String b, JTextArea history) {

        BigInteger b1 = new BigInteger(a, 2);
        BigInteger b2 = new BigInteger(b, 2);

        //Calculate the output
        result = b1.xor(b2).toString(2);

        count++;
        history.append(count + ". " + "Bitwise XOR" + "\n"
                + "A: " + a + "\nB: " + b + "\nResult: " + result + "\n\n");
    }

    public void bitwiseLeftShift(String a, String b, JTextArea history) {

        BigInteger b1 = new BigInteger(a, 2);
        int b2 = Integer.parseInt(b);

        System.out.println(b1.shiftLeft(b2).toString(2));

        //Calculate the output
        result = b1.shiftLeft(b2).toString(2);

        count++;
        history.append(count + ". " + "Bitwise LeftShift" + "\n"
                + "A: " + a + "\nB: " + b + "\nResult: " + result + "\n\n");
    }

    public void bitwiseRightShift(String a, String b, JTextArea history) {

        BigInteger b1 = new BigInteger(a, 2);
        int b2 = Integer.parseInt(b);

        System.out.println(b1.shiftRight(b2).toString(2));

        //Calculate the output
        result = b1.shiftLeft(b2).toString(2);

        count++;
        history.append(count + ". " + "Bitwise RightShift" + "\n"
                + "A: " + a + "\nB: " + b + "\nResult: " + result + "\n\n");
    }

    public void bitwiseInversion(String a, String b, JTextArea history) {

        BigInteger b1 = new BigInteger(a, 2);
        BigInteger b2 = new BigInteger(b, 2);

        System.out.println(b1.modInverse(b2).toString(2));

        //Calculate the output
        result = b1.modInverse(b2).toString(2);

        count++;
        history.append(count + ". " + "Bitwise Inverse" + "\n"
                + "A: " + a + "\nB: " + b + "\nResult: " + result + "\n\n");
    }

    //================================================================= getValue
    /** Return current calculator total. */
    public String getValue() {
        return result.toString();
    }
}