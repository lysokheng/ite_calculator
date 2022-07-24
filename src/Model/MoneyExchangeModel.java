package Model;

import javax.swing.*;
import java.text.DecimalFormat;

public class MoneyExchangeModel {
    //... Constants
    private static final String INITIAL_VALUE = "0";

    //... Member variable defining state of calculator.
    private double result;
    private int count;

    //... Format number to 00.00
    DecimalFormat f = new DecimalFormat("##.###");

    //============================================================== constructor
    /** Constructor */
    public MoneyExchangeModel() {
        reset();
    }

    //==================================================================== reset
    /** Reset to initial value. */
    public void reset() {
        result = Double.parseDouble(INITIAL_VALUE);
        count = 0;
    }

    //=============================================================== calculation

    public void rielToDollar(String amountField, JTextArea history) {

        //Get the inputs
        double Amount = Double.parseDouble(amountField);

        //Calculate the output
        result = Amount / 4100;

        count++;
        history.append(count + ". " + "Riel To Dollar" + "\n"
                + Amount + " Riel \n=\n " + f.format(result) + " Dollar" + "\n\n");
    }

    public void rielToEuro(String amountField, JTextArea history) {

        //Get the inputs
        double Amount = Double.parseDouble(amountField);

        //Calculate the output
        result = Amount / 4600;

        count++;
        history.append(count + ". " + "Riel To Euro" + "\n"
                + Amount + " Riel \n=\n " + f.format(result) + " Euro" + "\n\n");
    }

    public void rielToFrance(String amountField, JTextArea history) {

        //Get the inputs
        double Amount = Double.parseDouble(amountField);

        //Calculate the output
        result = Amount / 4400;

        count++;
        history.append(count + ". " + "Riel To France" + "\n"
                + Amount + " Riel \n=\n " + f.format(result) + " France" + "\n\n");
    }

    public void rielToPound(String amountField, JTextArea history) {

        //Get the inputs
        double Amount = Double.parseDouble(amountField);

        //Calculate the output
        result = Amount / 5600;

        count++;
        history.append(count + ". " + "Riel To Pound" + "\n"
                + Amount + " Riel \n=\n " + f.format(result) + " Pound" + "\n\n");
    }

    public void rielToBaht(String amountField, JTextArea history) {

        //Get the inputs
        double Amount = Double.parseDouble(amountField);

        //Calculate the output
        result = Amount / 122;

        count++;
        history.append(count + ". " + "Riel To Baht" + "\n"
                + Amount + " Riel \n=\n " + f.format(result) + " Baht" + "\n\n");
    }

    public void dollarToRiel(String amountField, JTextArea history) {

        //Get the inputs
        double Amount = Double.parseDouble(amountField);

        //Calculate the output
        result = Amount * 4100;

        count++;
        history.append(count + ". " + "Dollar To Riel" + "\n"
                + Amount + " Dollar \n=\n " + f.format(result) + " Riel" + "\n\n");
    }

    public void euroToRiel(String amountField, JTextArea history) {

        //Get the inputs
        double Amount = Double.parseDouble(amountField);

        //Calculate the output
        result = Amount * 4600;

        count++;
        history.append(count + ". " + "Euro To Riel" + "\n"
                + Amount + " Euro \n=\n " + f.format(result) + " Riel" + "\n\n");
    }

    public void franceToRiel(String amountField, JTextArea history) {

        //Get the inputs
        double Amount = Double.parseDouble(amountField);

        //Calculate the output
        result = Amount * 4400;

        count++;
        history.append(count + ". " + "France To Riel" + "\n"
                + Amount + " France \n=\n " + f.format(result) + " Riel" + "\n\n");
    }

    public void poundToRiel(String amountField, JTextArea history) {

        //Get the inputs
        double Amount = Double.parseDouble(amountField);

        //Calculate the output
        result = Amount * 5600;

        count++;
        history.append(count + ". " + "Pound To Riel" + "\n"
                + Amount + " Pound \n=\n " + f.format(result) + " Riel" + "\n\n");
    }

    public void bahtToRiel(String amountField, JTextArea history) {

        //Get the inputs
        double Amount = Double.parseDouble(amountField);

        //Calculate the output
        result = Amount * 122;

        count++;
        history.append(count + ". " + "Baht To Riel" + "\n"
                + Amount + " Baht \n=\n " + f.format(result) + " Riel" + "\n\n");
    }

    //================================================================= getValue
    /** Return current calculator total. */
    public String getValue() {
        return String.valueOf(f.format(result));
    }
}
