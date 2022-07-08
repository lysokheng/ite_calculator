package Controller.Tools;

import java.util.Locale;

public class IsValidNumber {

    /**
     * Function to check if the string represents a binary number
     */
    public void isValidBinary(String binary) {
        // make sure binary variable is uppercase alphabet
        binary = binary.toUpperCase(Locale.ROOT);

        // Size of string
        int n = binary.length();

        // Iterate over string
        for (int i = 0; i < n; i++) {

            char ch = binary.charAt(i);

            // Check if the character
            // is invalid
            if (ch < '0' || ch > '1') {

                System.out.println("""
                        Binary number are contains only 0 and 1.
                        The number below is incorrect.
                        Please check your number again!
                        """);
                break;
            }
        }
    }

    /**
     * Function to check if number is decimal or not
     */
    public void isValidDecimal(String decimal) {

        // make sure hex variable is uppercase alphabet
        decimal = decimal.toUpperCase(Locale.ROOT);

        // Size of string
        int n = decimal.length();

        // Iterate over string
        for (int i = 0; i < n; i++) {

            char ch = decimal.charAt(i);

            // Check if the character
            // is invalid
            if (ch < '0' || ch > '9') {

                System.out.println("""
                        Decimal number are known only numeric.
                        The number below is incorrect.
                        Please check your number again!
                        """);

                break;
            }
        }

        // Print true if all
        // characters are valid
        System.out.println("Your number is decimal");
    }

    /**
     * Function to check if number is octal or not
     */
    public void isValidOctal(String octal) {
        // make sure hex variable is uppercase alphabet
        octal = octal.toUpperCase(Locale.ROOT);

        // Size of string
        int n = octal.length();

        // Iterate over string
        for (int i = 0; i < n; i++) {

            char ch = octal.charAt(i);

            // Check if the character
            // is invalid
            if (ch < '0' || ch > '8') {

                System.out.println("""
                        Octal number are contains only 0 to 8.
                        The number below is incorrect.
                        Please check your number again!
                        """);
                break;
            }
        }

        // Print true if all
        // characters are valid
        System.out.println("Your number is Octal");
    }

    /**
     * Function to check if the string represents a hexadecimal number
     */
    public void isValidHex(String hex) {
        // make sure hex variable is uppercase alphabet
        hex = hex.toUpperCase(Locale.ROOT);

        // Size of string
        int n = hex.length();

        // Iterate over string
        for (int i = 0; i < n; i++) {

            char ch = hex.charAt(i);

            // Check if the character
            // is invalid
            if ((ch < '0' || ch > '9') && (ch < 'A' || ch > 'F')) {

                System.out.println("""
                        Hexadecimal number are contains only 0 to F.
                        The number below is incorrect.
                        Please check your number again!
                        """);
                break;
            }
        }

        // Print true if all
        // characters are valid
        System.out.println("Your number is hexadecimal");
    }
}
