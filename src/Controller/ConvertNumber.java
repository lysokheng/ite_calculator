package Controller;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertNumber {

    /**
     * Function to convert binary to decimal
     */
    public int binary2Decimal(String binary) {

        int dec_value = 0;

        int len =  binary.length();
        BitSet bitSet = new BitSet(len);
        int i = len-1;
        for (char c:binary.toCharArray())
            bitSet.set(i--, c == '1');

            // Initializing base value to 1,
            // i.e 2^0
            int base = 1;

            for (int j = len - 1; j >= 0; j--) {
                if (binary.charAt(j) == '1')
                    dec_value += base;
                base = base * 2;
            }
        return dec_value;
    }

    public String reverseString(String binary) {
        char ch;
        StringBuilder nstr = new StringBuilder();
        for (int i = 0; i < binary.length(); i++) {
            ch = binary.charAt(i);
            nstr.insert(0, ch);
        }
        return nstr.toString();
    }

    public String binaryRep32(String binary) {

        StringBuilder binaryBuilder = new StringBuilder(binary);
        binaryBuilder.append("0".repeat(Math.max(0, 32 - binaryBuilder.length())));
        binary = binaryBuilder.toString();

        return binary;
    }

    /**
     * function to convert Hexadecimal to decimal Number
     */
    public int hex2Decimal(String hex) {

        return Integer.parseInt(hex, 16);
    }
    /**
     * function to convert Hexadecimal to octal Number
     *
     */
    public StringBuilder hex2Octal(String hexa) {

        int dec = 0;

        int c = hexa.length() - 1;

        // finding the decimal equivalent of the
        // hexadecimal number
        for(int i = 0; i < hexa.length() ; i ++ )
        {
            //extracting each character from the string.
            char ch = hexa.charAt(i);
            switch (ch) {
                case '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' -> {
                    dec = dec + Integer.parseInt(Character.toString(ch)) *
                            (int) Math.pow(16, c);
                    c--;
                }
                case 'a', 'A' -> {
                    dec = dec + 10 * (int) Math.pow(16, c);
                    c--;
                }
                case 'b', 'B' -> {
                    dec = dec + 11 * (int) Math.pow(16, c);
                    c--;
                }
                case 'c', 'C' -> {
                    dec = dec + 12 * (int) Math.pow(16, c);
                    c--;
                }
                case 'd', 'D' -> {
                    dec = dec + 13 * (int) Math.pow(16, c);
                    c--;
                }
                case 'e', 'E' -> {
                    dec = dec + 14 * (int) Math.pow(16, c);
                    c--;
                }
                case 'f', 'F' -> {
                    dec = dec + 15 * (int) Math.pow(16, c);
                    c--;
                }
                default -> System.out.println("Invalid hexa input");
            }
        }

        // String oct to store the octal equivalent of a hexadecimal number.
        StringBuilder oct = new StringBuilder();

        //converting decimal to octal number.
        while(dec > 0)
        {
            oct.insert(0, dec % 8);
            dec = dec / 8;
        }

        return oct;
    }

    /**
     * function to convert Hexadecimal to Binary Number
     */
    public String hex2Binary(char[] hex) {
        int i = 0;
        List<String> contain = new ArrayList<>();

        // If user input valid
        try {
            while (hex[i] != '\u0000') {

                switch (hex[i]) {
                    case '0' -> {
                        contain.add("0000");
                    }
                    case '1' -> {
                        contain.add("0001");
                    }
                    case '2' -> {
                        contain.add("0010");
                    }
                    case '3' -> {
                        contain.add("0011");
                    }
                    case '4' -> {
                        contain.add("0100");
                    }
                    case '5' -> {
                        contain.add("0101");
                    }
                    case '6' -> {
                        contain.add("0110");
                    }
                    case '7' -> {
                        contain.add("0111");
                    }
                    case '8' -> {
                        contain.add("1000");
                    }
                    case '9' -> {
                        contain.add("1001");
                    }
                    case 'A', 'a' -> {
                        contain.add("1010");
                    }
                    case 'B', 'b' -> {
                        contain.add("1011");
                    }
                    case 'C', 'c' -> {
                        contain.add("1100");
                    }
                    case 'D', 'd' -> {
                        contain.add("1101");
                    }
                    case 'E', 'e' -> {
                        contain.add("1110");
                    }
                    case 'F', 'f' -> {
                        contain.add("1111");
                    }
                    default -> System.out.print("\nInvalid hexadecimal digit " + hex[i]);
                }
                i++;
            }
            // If user input invalid
        } catch (Exception ignored) {

        }

        return contain.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(" ", "", ""));
    }

    /**
     * function to convert decimal to hexadecimal
     */
    public String dec2Hexa(long decimal) {
        // char array to store hexadecimal number
        char[] hexaDeciNum = new char[100];
        ArrayList<String> save = new ArrayList<String>();

        // counter for hexadecimal number array
        int i = 0, j;
        while (decimal != 0) {
            // temporary variable to store remainder
            long temp;

            // storing remainder in temp variable.
            temp = decimal % 16;

            // check if temp < 10
            if (temp < 10) {
                hexaDeciNum[i] = (char) (temp + 48);
            } else {
                hexaDeciNum[i] = (char) (temp + 55);
            }
            i++;

            decimal = decimal / 16;
        }

        // printing binary array in reverse order
        for (j = i - 1; j >= 0; j--)
            save.add(String.valueOf(hexaDeciNum[j]));

        return save.stream()
                .map(String::valueOf)
                .collect(Collectors.joining("", "", ""));
    }

    /**
     * Function to convert decimal to octal
     */
    public String dec2Octal(long decimal) {
        // array to store octal number
        long[] octalNum = new long[100];
        ArrayList<String> save = new ArrayList<>();

        // counter for octal number array
        int i = 0, j;
        while (decimal != 0) {
            // storing remainder in octal array
            octalNum[i] = decimal % 8;
            decimal = decimal / 8;
            i++;
        }

        // printing binary array in reverse order
        for (j = i - 1; j >= 0; j--)
            save.add(String.valueOf(octalNum[j]));

        return save.stream()
                .map(String::valueOf)
                .collect(Collectors.joining("", "", ""));
    }

    /**
     * Function to convert decimal to binary
     */
    public String dec2Binary(long decimal) {
        // array to store binary number
        long[] binaryNum = new long[1000];
        ArrayList<String> save = new ArrayList<>();

        // counter for binary array
        int i = 0, j;
        while (decimal > 0) {
            // storing remainder in binary array
            binaryNum[i] = decimal % 2;
            decimal = decimal / 2;
            i++;
        }

        // printing binary array in reverse order
        for (j = i - 1; j >= 0; j--)
            save.add(String.valueOf(binaryNum[j]));

        return save.stream()
                .map(String::valueOf)
                .collect(Collectors.joining("", "", ""));
    }

    /**
     * convert binary to octal
     */
    public int binary2Octal(long binary) {

        // variable to store the octal number
        int octalNumber = 0, i = 0;

        // variable to store the output
        // returned by the binary2Decimal()
        int decimalNumber = binary2Decimal(String.valueOf(binary));

        // loop to convert decimal to octal
        while (decimalNumber != 0) {

            // extracting the remainder on
            // multiplying by 8 and
            // dividing that with increasing
            // powers of 10
            octalNumber += (decimalNumber % 8) * ((int) Math.pow(10, i++));

            // removing the last digit by
            // dividing by 8
            decimalNumber /= 8;
        }

        // returning the converted octal number
        return octalNumber;
    }

    /**
     * method to convert binary to hex
     */
    public String binary2Hex(long binary) {

        // variable to store the output of
        // binary2Decimal() method
        int decimalNumber = binary2Decimal(String.valueOf(binary));

        // character array to represent double-digit remainders
        char[] arr = {'A', 'B', 'C', 'D', 'E', 'F'};

        // variable to store the remainder on
        // division by 16
        int remainder;

        // declaring the string that stores the
        // final hex string
        StringBuilder hexNumber = new StringBuilder();

        // loop to convert decimal to hex
        while (decimalNumber != 0) {

            // calculating the remainder of decimal
            // by dividing by 16
            remainder = decimalNumber % 16;

            // checking if the remainder is >= 10
            if (remainder >= 10)

                // replacing with the corresponding
                // alphabet from the array
                hexNumber.insert(0, arr[remainder - 10]);

            else

                hexNumber.insert(0, remainder);

            // update condition of dividing the
            // number by 16
            decimalNumber /= 16;
        }

        // returning the hex string
        return hexNumber.toString();
    }

    /**
     * method to convert decimal to decimal
     */
    public int octal2Decimal(long octal) {
        // Initialize result variable to 0.
        int result = 0;

        for (int i = 0; octal > 0; i++) {

            // Take the last digit
            long temp = octal % 10;

            // Appropriate power on 8 suitable to
            // its position.
            double p = Math.pow(8, i);

            // Multiply the digits to the into the Input
            // and
            // then add it to result
            result += (temp * p);
            octal = octal / 10;
        }
        return result;
    }

    /**
     * function to convert octal number to its binary equivalent value
     */
    public  String octal2Binary(String octal) {

        // integer variable to iterate
        // the input octal string
        int i = 0;

        // string to store the result
        StringBuilder binaryValue = new StringBuilder();

        // iterating the complete length
        // of octal string and assigning
        // the equivalent binary value
        // for each octal digit
        while (i < octal.length()) {

            // storing character according
            // to the number of iteration
            char c = octal.charAt(i);

            // switch case to check all
            // possible 8 conditions
            switch (c) {
                case '0' -> binaryValue.append("000");
                case '1' -> binaryValue.append("001");
                case '2' -> binaryValue.append("010");
                case '3' -> binaryValue.append("011");
                case '4' -> binaryValue.append("100");
                case '5' -> binaryValue.append("101");
                case '6' -> binaryValue.append("110");
                case '7' -> binaryValue.append("111");
            }
            i++;
        }

        // returning the final result
        return binaryValue.toString();
    }

    /**
     * method to convert octal to hexadecimal
     */
    public String octal2Hex(long octal) {

        // declare variable in datatype long
        long decimal = 0, i = 0, rem;
        // declare an in array to represent ,and it will use for remainder below
        char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        // declare hexadecimal in String to store result
        StringBuilder hexadecimal = new StringBuilder();

        // use while to make sure octal is never 0 ,it will skip if not
        while (octal != 0) {
            // At first, we are convert octal to decimal
            decimal = decimal + (octal % 10) * (int) Math.pow(8, i);
            i++;
            octal = octal / 10;
        }
        // use while to make sure decimal is never 0 ,it will skip if not
        while (decimal != 0) {
            // After we have decimal ,we can convert from decimal to hexadecimal
            rem = decimal % 16;
            hexadecimal.insert(0, a[(int) rem]);
            decimal = decimal / 16;
        }
        return hexadecimal.toString();
    }
    
    public static class Complement {

        /**
         * Returns '0' for '1' and '1' for '0'
         */
         char firstComplement(char c) {
            return (c == '0') ? '1' : '0';
        }

        /**
         * Print 1's and 2's complement of binary number
         * represented by "bin"
         */
        public String secondComplement(String bin) {
            int n = bin.length();
            int i;

            StringBuilder ones;
            String twos;
            ones = new StringBuilder();

            // for ones complement flip every bit
            for (i = 0; i < n; i++) {
                ones.append(firstComplement(bin.charAt(i)));
            }

            // for two's complement go from right to left in
            // ones complement and if we get 1 make, we make
            // them 0 and keep going left when we get first
            // 0, make that 1 and go out of loop
            twos = ones.toString();
            for (i = n - 1; i >= 0; i--) {
                if (ones.charAt(i) == '1') {
                    twos = twos.substring(0, i) + '0' + twos.substring(i + 1);
                } else {
                    twos = twos.substring(0, i) + '1' + twos.substring(i + 1);
                    break;
                }
            }

            // If No break : all are 1 as in 111 or 11111;
            // in such case, add extra 1 at beginning
            if (i == -1) {
                twos = '1' + twos;
            }

            System.out.println("1's complement: " + ones);

            System.out.println("2's complement: " + twos);

            return twos;
        }
    }

}
