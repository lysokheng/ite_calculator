package Model;


import javax.swing.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BinaryArithmeticModel {
    //... Constants
    private static final String INITIAL_VALUE = "";

    //... Member variable defining state of calculator.
    private String result;
    private int count;

    //... create object
    ConvertNumber convertNumber = new ConvertNumber();

    //============================================================== constructor
    /** Constructor */
    public BinaryArithmeticModel() {
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

        // Initialize result
        StringBuilder resultTemp = new StringBuilder();

        // Initialize digit sum
        int s = 0;

        // Traverse both strings starting
        // from last characters
        int i = a.length() - 1, j = b.length() - 1;
        while (i >= 0 || j >= 0 || s == 1) {

            // Compute sum of last
            // digits and carry
            s += ((i >= 0) ? a.charAt(i) - '0' : 0);
            s += ((j >= 0) ? b.charAt(j) - '0' : 0);

            // If current digit sum is
            // 1 or 3, add 1 to result
            resultTemp.append((char) (s % 2 + '0'));

            // Compute carry
            s /= 2;

            // Move to next digits
            i--;
            j--;
        }

        // Remove leading zeros, if any
        int start = resultTemp.length() - 1;

        while (start >= 0 && resultTemp.charAt(start) == '0') {
            start--;
        }

        if (start != resultTemp.length() - 1) {
            resultTemp.delete(start + 1, resultTemp.length());
        }

        result = resultTemp.reverse().toString();

        count++;
        history.append(count + ". " + "Addition" + "\n"
                + "A: " + a + "\nB: " + b + "\nResult: " + result + "\n\n");
    }

    public void subtraction(String aField, String bField, JTextArea history) {

        //convert jTextField to string
        StringBuilder a = new StringBuilder(aField);
        StringBuilder b = new StringBuilder(bField);

        // Declare variable
        StringBuilder resultTemp = new StringBuilder();
        String max;
        char j = '0';

        // if length of a is greater than length of b, let tf is true if false
        // return to false
        boolean tf = (a.length() >= b.length());
        int l1 = a.length(), l2 = b.length();

        // if l1 < l2 perform a = a + 0
        if (l1 < l2)
            for (int i = 1; i <= l2 - l1; i++)
                a.insert(0, '0');

            // if l2 < l1 perform b = b + 0
        else if (l2 < l1)
            for (int i = 1; i <= l1 - l2; i++)
                b.insert(0, "0");

        // if tf is false run a loop
        if (!tf)
            for (int i = l1 - 1; i >= 0; i--)
                // if a = b change b to max, a to b and max to a
                if (a.charAt(i) != b.charAt(i))
                    if (b.charAt(i) == '1') {
                        max = b.toString();
                        b = new StringBuilder(a.toString());
                        a = new StringBuilder(max);
                        break;
                    }

        // use loop "a" to perform
        for (int i = a.length() - 1; i >= 0; i--) {
            // if a equal to 1 and b equal to 0
            if (a.charAt(i) == '1' && b.charAt(i) == '0') {
                if (j == '1') {
                    resultTemp.insert(0, '0');
                    j = '0';
                } else
                    resultTemp.insert(0, '1');
            }

            // if a equal to a and b equal to 1
            else if (a.charAt(i) == b.charAt(i) && b.charAt(i) == '1') {
                if (j == '1') {
                    resultTemp.insert(0, '1');
                } else
                    resultTemp.insert(0, '0');
            }

            // if a equal to 0 and b equal to 1
            else if (a.charAt(i) == '0' && b.charAt(i) == '1') {
                if (j == '1')
                    resultTemp.insert(0, '0');
                else {
                    resultTemp.insert(0, '1');
                    j = '1';
                }
            } else {
                if (j == '1')
                    resultTemp.insert(0, '1');
                else
                    resultTemp.insert(0, '0');
            }
        } // end of circle i

        result = resultTemp.toString();

        count++;
        history.append(count + ". " + "Subtraction" + "\n"
                + "A: " + a + "\nB: " + b + "\nResult: " + result + "\n\n");
    }

    public void additionWith2ndComplement(String a, String b, JTextArea history) {

        // reverse string to add 0 , to complete 32 bits
        String b1_1 = convertNumber.reverseString(a);
        String b2_1 = convertNumber.reverseString(b);

        // add 0 to complete 32 bit
        String b1_2 = convertNumber.binaryRep32(b1_1);
        String b2_2 = convertNumber.binaryRep32(b2_1);

        // after add it and reverse it to calculate
        String _b1 = convertNumber.reverseString(b1_2);
        String _b2 = convertNumber.reverseString(b2_2);

        int len1 = _b1.length();
        int len2 = _b2.length();
        int carry = 0;
        StringBuilder res = new StringBuilder();
        // the final length of the result depends on the bigger length between b1
        // and b,
        // (also the value of carry, if carry = 1, add "1" at the head of result,
        // otherwise)
        int maxLen = Math.max(len1, len2);
        for (int i = 0; i <= maxLen; i++) {

            // start from last char of String b1 and b2
            // notice that left side is an int and right side is char,
            // so we need to minus the decimal value of '0'
            int p = i < len1 ? _b1.charAt(len1 - 1 - i) - '0' : 0;
            int q = i < len2 ? _b2.charAt(len2 - 1 - i) - '0' : 0;
            int tmp = p + q + carry;
            carry = tmp / 2;
            res.insert(0, tmp % 2);
        }

        result = (carry == 0) ? res.toString() : "1" + res;

        count++;
        history.append(count + ". " + "Addition With 2nd Complement" + "\n"
                + "A: " + a + "\nB: " + b + "\nResult: " + result + "\n\n");
    }

    public void subtractionWith2ndComplement(String a, String b, JTextArea history) {

        // reverse string to add 0 , to complete 32 bits
        String b1_1 = convertNumber.reverseString(a);
        String b2_1 = convertNumber.reverseString(b);

        // add 0 to complete 32 bit
        String b1_2 = convertNumber.binaryRep32(b1_1);
        String b2_2 = convertNumber.binaryRep32(b2_1);

        // after add it and reverse it to calculate
        String _b1 = convertNumber.reverseString(b1_2);
        String b2_3 = convertNumber.reverseString(b2_2);

        // use 2nd complement on _b2
        ConvertNumber.Complement sComplement = new ConvertNumber.Complement();
        String _b2 = sComplement.secondComplement(b2_3);

        int len1 = _b1.length();
        int len2 = _b2.length();
        int carry = 0;
        StringBuilder res = new StringBuilder();
        // the final length of the result depends on the bigger length between b1
        // and b,
        // (also the value of carry, if carry = 1, add "1" at the head of result,
        // otherwise)
        int maxLen = Math.max(len1, len2);
        for (int i = 0; i <= maxLen; i++) {

            // start from last char of String b1 and b2
            // notice that left side is an int and right side is char,
            // so we need to minus the decimal value of '0'
            int p = i < len1 ? _b1.charAt(len1 - 1 - i) - '0' : 0;
            int q = i < len2 ? _b2.charAt(len2 - 1 - i) - '0' : 0;
            int tmp = p + q + carry;
            carry = tmp / 2;
            res.insert(0, tmp % 2);
        }

        result = (carry == 0) ? res.toString() : "1" + res;

        count++;
        history.append(count + ". " + "Subtraction With 2nd Complement" + "\n"
                + "A: " + a + "\nB: " + b + "\nResult: " + result + "\n\n");
    }

    public void multiply(String a, String b, JTextArea history) {

        result = multiplyBinary(a, b);

        count++;
        history.append(count + ". " + "Subtraction With 2nd Complement" + "\n"
                + "A: " + a + "\nB: " + b + "\nResult: " + result + "\n\n");
    }

    public void divide(String a, String b, JTextArea history) {
        /*
         * Integer.parseInt() method will convert the string value to
         * the integer by treating them as a binary number
         */

        int dividend = Integer.parseInt(a, 2);
        // getting divisor binary number from user
        int divisor = Integer.parseInt(b, 2);

        // if divisor != 0
        String quotient = null;
        String remainder = null;

        if (divisor != 0) {
            quotient = Integer.toBinaryString((dividend / divisor));
            remainder = Integer.toBinaryString((dividend % divisor));

        } else
            // if divisor = 0 ,so the divide operation can not divide
            System.out.println("divisor can't be zero!");

        result = quotient;

        count++;
        history.append(count + ". " + "Divide" + "\n"
                + "A: " + a + "\nB: " + b
                + "\nQuotient: " + quotient
                + "\nRemainder: " + remainder + "\n\n");
    }

    //================================================================= additional method
    public String multiplyBinary(String a, String b) {

        try {
            a = a.substring(a.indexOf('1'));
            b = b.substring(b.indexOf('1'));
        } catch (StringIndexOutOfBoundsException e) {
            // some number is 0
            return "0";
        }

        // 1st step: multiply each bit of b by a
        String zero = IntStream.range(0, a.length()).mapToObj(v -> "0").collect(Collectors.joining());
        StringBuilder lpad = new StringBuilder(
                IntStream.range(0, b.length() - 1).mapToObj(v -> "0").collect(Collectors.joining()));
        StringBuilder rpad = new StringBuilder();
        String[] prod = new String[b.length()];

        for (int i = b.length() - 1, j = 0; i >= 0; i--, j++) {
            prod[j] = lpad.toString()
                    .concat(b.charAt(i) == '1' ? a : zero)
                    .concat(rpad.toString());
            if (lpad.length() > 0) {
                lpad.deleteCharAt(0);
                rpad.append('0');
            }
        }

        // 2nd step: sum the products
        String result = prod[0];

        for (int i = 1; i < prod.length; i++) {
            StringBuilder sum = new StringBuilder();
            int[] carry = new int[a.length() + b.length()];

            for (int j = b.length() + a.length() - 2; j >= 0; j--) {
                int r = result.charAt(j) - '0' + prod[i].charAt(j) - '0';

                if (r > 1) {
                    sum.append(carry[j + 1]);
                    carry[j] = 1;
                } else if ((r += carry[j + 1]) > 1) {
                    sum.append('0');
                    carry[j] = 1;
                } else {
                    sum.append(r);
                }
            }

            if (carry[0] == 1) {
                sum.append('1');
            }

            result = sum.reverse().toString();
        }

        return result;
    }

    //================================================================= getValue
    /** Return current calculator total. */
    public String getValue() {
        return result.toString();
    }
}