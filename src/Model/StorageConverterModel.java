package Model;

import javax.swing.*;

public class StorageConverterModel {
    //... Constants
    private static final String INITIAL_VALUE = "0";

    //... Member variable defining state of calculator.
    private String result;
    private int count;
    private double amount;

    //... create object
    ConvertNumber convertNumber = new ConvertNumber();

    //============================================================== constructor
    /** Constructor */
    public StorageConverterModel() {
        reset();
    }

    //==================================================================== reset
    /** Reset to initial value. */
    public void reset() {
        result = INITIAL_VALUE;
        count = 0;
    }

    //=============================================================== calculation

    public void byte2KB(String amountField, JTextArea history) {

        //Get the inputs
         amount = Double.parseDouble(amountField);

        //Calculate the output
        result = String.valueOf(amount / Math.pow(1024, 1));

        count++;
        history.append(count + ". " + "Byte to Kilobyte" + "\n"
                + amount + " Byte\n=\n" + result + " Kilobyte" + "\n\n");
    }

    public void byte2MB(String amountField, JTextArea history) {

        //Get the inputs
         amount = Double.parseDouble(amountField);

        //Calculate the output
        result = String.valueOf(amount / Math.pow(1024, 2));

        count++;
        history.append(count + ". " + "Byte to Megabyte" + "\n"
                + amount + " Byte\n=\n" + result + " Megabyte" + "\n\n");
    }

    public void byte2GB(String amountField, JTextArea history) {

        //Get the inputs
         amount = Double.parseDouble(amountField);

        //Calculate the output
        result = String.valueOf(amount / Math.pow(1024, 3));

        count++;
        history.append(count + ". " + "Byte to Gigabyte" + "\n"
                + amount + " Byte\n=\n" + result + " Gigabyte" + "\n\n");
    }

    public void byte2TB(String amountField, JTextArea history) {

        //Get the inputs
         amount = Double.parseDouble(amountField);

        //Calculate the output
        result = String.valueOf(amount / Math.pow(1024, 4));

        count++;
        history.append(count + ". " + "Byte to Terabyte" + "\n"
                + amount + " Byte\n=\n" + result + " Terabyte" + "\n\n");
    }

    public void byte2PB(String amountField, JTextArea history) {

        //Get the inputs
         amount = Double.parseDouble(amountField);

        //Calculate the output
        result = String.valueOf(amount / Math.pow(1024, 5));

        count++;
        history.append(count + ". " + "Byte to Petabyte" + "\n"
                + amount + " Byte\n=\n" + result + " Petabyte" + "\n\n");
    }


    public void kb2byte(String amountField, JTextArea history) {

        //Get the inputs
         amount = Double.parseDouble(amountField);

        //Calculate the output
        result = String.valueOf(amount * Math.pow(1024, 1));

        count++;
        history.append(count + ". " + "Kilobyte to Byte" + "\n"
                + amount + " Kilobyte\n=\n" + result + " Byte" + "\n\n");
    }

    public void kb2MB(String amountField, JTextArea history) {

        //Get the inputs
         amount = Double.parseDouble(amountField);

        //Calculate the output
        result = String.valueOf(amount / Math.pow(1024, 1));

        count++;
        history.append(count + ". " + "Kilobyte to Megabyte" + "\n"
                + amount + " Kilobyte\n=\n" + result + " Megabyte" + "\n\n");
    }

    public void kb2GB(String amountField, JTextArea history) {

        //Get the inputs
         amount = Double.parseDouble(amountField);

        //Calculate the output
        result = String.valueOf(amount / Math.pow(1024, 2));

        count++;
        history.append(count + ". " + "Kilobyte to Gigabyte" + "\n"
                + amount + " Kilobyte\n=\n" + result + " Gigabyte" + "\n\n");
    }

    public void kb2TB(String amountField, JTextArea history) {

        //Get the inputs
         amount = Double.parseDouble(amountField);

        //Calculate the output
        result = String.valueOf(amount / Math.pow(1024, 3));

        count++;
        history.append(count + ". " + "Kilobyte to Terabyte" + "\n"
                + amount + " Kilobyte\n=\n" + result + " Terabyte" + "\n\n");
    }

    public void kb2PB(String amountField, JTextArea history) {

        //Get the inputs
         amount = Double.parseDouble(amountField);

        //Calculate the output
        result = String.valueOf(amount / Math.pow(1024, 4));

        count++;
        history.append(count + ". " + "Kilobyte to Petabyte" + "\n"
                + amount + " Kilobyte\n=\n" + result + " Petabyte" + "\n\n");
    }

    public void mb2byte(String amountField, JTextArea history) {

        //Get the inputs
        amount = Double.parseDouble(amountField);

        //Calculate the output
        result = String.valueOf(amount * Math.pow(1024, 2));

        count++;
        history.append(count + ". " + "Megabyte to Byte" + "\n"
                + amount + " Megabyte\n=\n" + result + " Byte" + "\n\n");
    }

    public void mb2KB(String amountField, JTextArea history) {

        //Get the inputs
        amount = Double.parseDouble(amountField);

        //Calculate the output
        result = String.valueOf(amount * Math.pow(1024, 1));

        count++;
        history.append(count + ". " + "Megabyte to Kilobyte" + "\n"
                + amount + " Megabyte\n=\n" + result + " Kilobyte" + "\n\n");
    }

    public void mb2GB(String amountField, JTextArea history) {

        //Get the inputs
        amount = Double.parseDouble(amountField);

        //Calculate the output
        result = String.valueOf(amount / Math.pow(1024, 1));

        count++;
        history.append(count + ". " + "Megabyte to Gigabyte" + "\n"
                + amount + " Megabyte\n=\n" + result + " Gigabyte" + "\n\n");
    }

    public void mb2TB(String amountField, JTextArea history) {

        //Get the inputs
        amount = Double.parseDouble(amountField);

        //Calculate the output
        result = String.valueOf(amount / Math.pow(1024, 2));

        count++;
        history.append(count + ". " + "Megabyte to Terabyte" + "\n"
                + amount + " Megabyte\n=\n" + result + " Terabyte" + "\n\n");
    }

    public void mb2PB(String amountField, JTextArea history) {

        //Get the inputs
        amount = Double.parseDouble(amountField);

        //Calculate the output
        result = String.valueOf(amount / Math.pow(1024, 3));

        count++;
        history.append(count + ". " + "Megabyte to Petabyte" + "\n"
                + amount + " Megabyte\n=\n" + result + " Petabyte" + "\n\n");
    }


    public void gb2byte(String amountField, JTextArea history) {

        //Get the inputs
        amount = Double.parseDouble(amountField);

        //Calculate the output
        result = String.valueOf(amount * Math.pow(1024, 3));

        count++;
        history.append(count + ". " + "Gigabyte to Byte" + "\n"
                + amount + " Gigabyte\n=\n" + result + " Byte" + "\n\n");
    }

    public void gb2KB(String amountField, JTextArea history) {

        //Get the inputs
        amount = Double.parseDouble(amountField);

        //Calculate the output
        result = String.valueOf(amount * Math.pow(1024, 2));

        count++;
        history.append(count + ". " + "Gigabyte to Kilobyte" + "\n"
                + amount + " Gigabyte\n=\n" + result + " Kilobyte" + "\n\n");
    }

    public void gb2MB(String amountField, JTextArea history) {

        //Get the inputs
        amount = Double.parseDouble(amountField);

        //Calculate the output
        result = String.valueOf(amount * Math.pow(1024, 1));

        count++;
        history.append(count + ". " + "Gigabyte to Megabyte" + "\n"
                + amount + " Gigabyte\n=\n" + result + " Megabyte" + "\n\n");
    }

    public void gb2TB(String amountField, JTextArea history) {

        //Get the inputs
        amount = Double.parseDouble(amountField);

        //Calculate the output
        result = String.valueOf(amount / Math.pow(1024, 1));

        count++;
        history.append(count + ". " + "Gigabyte to Terabyte" + "\n"
                + amount + " Gigabyte\n=\n" + result + " Terabyte" + "\n\n");
    }

    public void gb2PB(String amountField, JTextArea history) {

        //Get the inputs
        amount = Double.parseDouble(amountField);

        //Calculate the output
        result = String.valueOf(amount / Math.pow(1024, 2));

        count++;
        history.append(count + ". " + "Gigabyte to Petabyte" + "\n"
                + amount + " Gigabyte\n=\n" + result + " Petabyte" + "\n\n");
    }


    public void tb2byte(String amountField, JTextArea history) {

        //Get the inputs
        amount = Double.parseDouble(amountField);

        //Calculate the output
        result = String.valueOf(amount * Math.pow(1024, 4));

        count++;
        history.append(count + ". " + "Terabyte to Byte" + "\n"
                + amount + " Terabyte\n=\n" + result + " Byte" + "\n\n");
    }

    public void tb2KB(String amountField, JTextArea history) {

        //Get the inputs
        amount = Double.parseDouble(amountField);

        //Calculate the output
        result = String.valueOf(amount * Math.pow(1024, 3));

        count++;
        history.append(count + ". " + "Terabyte to Kilobyte" + "\n"
                + amount + " Terabyte\n=\n" + result + " Kilobyte" + "\n\n");
    }

    public void tb2MB(String amountField, JTextArea history) {

        //Get the inputs
        amount = Double.parseDouble(amountField);

        //Calculate the output
        result = String.valueOf(amount * Math.pow(1024, 2));

        count++;
        history.append(count + ". " + "Terabyte to Megabyte" + "\n"
                + amount + " Terabyte\n=\n" + result + " Megabyte" + "\n\n");
    }

    public void tb2GB(String amountField, JTextArea history) {

        //Get the inputs
        amount = Double.parseDouble(amountField);

        //Calculate the output
        result = String.valueOf(amount * Math.pow(1024, 1));

        count++;
        history.append(count + ". " + "Terabyte to Gigabyte" + "\n"
                + amount + " Terabyte\n=\n" + result + " Gigabyte" + "\n\n");
    }

    public void tb2PB(String amountField, JTextArea history) {

        //Get the inputs
        amount = Double.parseDouble(amountField);

        //Calculate the output
        result = String.valueOf(amount / Math.pow(1024, 1));

        count++;
        history.append(count + ". " + "Terabyte to Petabyte" + "\n"
                + amount + " Terabyte\n=\n" + result + " Petabyte" + "\n\n");
    }

    public void pb2Byte(String amountField, JTextArea history) {

        //Get the inputs
        amount = Double.parseDouble(amountField);

        //Calculate the output
        result = String.valueOf(amount * Math.pow(1024, 5));

        count++;
        history.append(count + ". " + "Petabyte to Byte" + "\n"
                + amount + " Petabyte\n=\n" + result + " Byte" + "\n\n");
    }

    public void pb2KB(String amountField, JTextArea history) {

        //Get the inputs
        amount = Double.parseDouble(amountField);

        //Calculate the output
        result = String.valueOf(amount * Math.pow(1024, 4));

        count++;
        history.append(count + ". " + "Petabyte to Kilobyte" + "\n"
                + amount + " Petabyte\n=\n" + result + " Kilobyte" + "\n\n");
    }

    public void pb2MB(String amountField, JTextArea history) {

        //Get the inputs
        amount = Double.parseDouble(amountField);

        //Calculate the output
        result = String.valueOf(amount * Math.pow(1024, 3));

        count++;
        history.append(count + ". " + "Petabyte to Megabyte" + "\n"
                + amount + " Petabyte\n=\n" + result + " Megabyte" + "\n\n");
    }

    public void pb2GB(String amountField, JTextArea history) {

        //Get the inputs
        amount = Double.parseDouble(amountField);

        //Calculate the output
        result = String.valueOf(amount * Math.pow(1024, 2));

        count++;
        history.append(count + ". " + "Petabyte to Gigabyte" + "\n"
                + amount + " Petabyte\n=\n" + result + " Gigabyte" + "\n\n");
    }

    public void pb2TB(String amountField, JTextArea history) {

        //Get the inputs
        amount = Double.parseDouble(amountField);

        //Calculate the output
        result = String.valueOf(amount * Math.pow(1024, 1));

        count++;
        history.append(count + ". " + "Petabyte to Terabyte" + "\n"
                + amount + " Petabyte\n=\n" + result + " Terabyte" + "\n\n");
    }

    //================================================================= getValue
    /** Return current calculator total. */
    public String getValue() {
        return result;
    }
}
