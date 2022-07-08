package Controller;

import javax.swing.*;

public class StorageConverterCalculation {
    public int a, b, result, count;

    public void performReset(JButton button, JTextField amountField, JTextArea resultField, JTextArea historyField){
        button.addActionListener(e -> {
            amountField.setText("");
            resultField.setText("");
            historyField.setText("");
            count = 0;
        });
    }

    public void byte2KBResult(JButton button, JTextField amountField, JTextArea outputField, JTextArea historyField){
        button.addActionListener(e -> {

            //Get the inputs
            double amount = Double.parseDouble(amountField.getText());

            //Calculate the output
            double result = amount / Math.pow(1024, 1);

            System.out.println(amount + " Byte = " + result + " Kilobyte");

            //Show the output
            outputField.setText(String.valueOf(result));

            //print history
            count++;
            System.out.println(count);
            historyField.append(count + ". " + "Byte to Kilobyte" + "\n"
                    + amount + " Byte = " + result + " Kilobyte" + "\n\n");
        });
    }

    public void byte2MBResult(JButton button, JTextField amountField, JTextArea outputField, JTextArea historyField){
        button.addActionListener(e -> {

            //Get the inputs
            double amount = Double.parseDouble(amountField.getText());

            //Calculate the output
            double result = amount / Math.pow(1024, 2);

            System.out.println(amount + " Byte = " + result + " Megabyte");

            //Show the output
            outputField.setText(String.valueOf(result));

            //print history
            count++;
            System.out.println(count);
            historyField.append(count + ". " + "Byte to Megabyte" + "\n"
                    + amount + " Byte = " + result + " Megabyte" + "\n\n");
        });
    }

    public void byte2GBResult(JButton button, JTextField amountField, JTextArea outputField, JTextArea historyField){
        button.addActionListener(e -> {

            //Get the inputs
            double amount = Double.parseDouble(amountField.getText());

            //Calculate the output
            double result = amount / Math.pow(1024, 3);

            System.out.println(amount + " Byte = " + result + " Gigabyte");

            //Show the output
            outputField.setText(String.valueOf(result));

            //print history
            count++;
            System.out.println(count);
            historyField.append(count + ". " + "Byte to Gigabyte" + "\n"
                    + amount + " Byte = " + result + " Gigabyte" + "\n\n");
        });
    }

    public void byte2TBResult(JButton button, JTextField amountField, JTextArea outputField, JTextArea historyField){
        button.addActionListener(e -> {

            //Get the inputs
            double amount = Double.parseDouble(amountField.getText());

            //Calculate the output
            double result = amount / Math.pow(1024, 4);

            System.out.println(amount + " Byte = " + result + " Terabyte");

            //Show the output
            outputField.setText(String.valueOf(result));

            //print history
            count++;
            System.out.println(count);
            historyField.append(count + ". " + "Byte to Terabyte" + "\n"
                    + amount + " Byte = " + result + " Terabyte" + "\n\n");
        });
    }

    public void byte2PBResult(JButton button, JTextField amountField, JTextArea outputField, JTextArea historyField){
        button.addActionListener(e -> {

            //Get the inputs
            double amount = Double.parseDouble(amountField.getText());

            //Calculate the output
            double result = amount / Math.pow(1024, 5);

            System.out.println(amount + " Byte = " + result + " Petabyte");

            //Show the output
            outputField.setText(String.valueOf(result));

            //print history
            count++;
            System.out.println(count);
            historyField.append(count + ". " + "Byte to Petabyte" + "\n"
                    + amount + " Byte = " + result + " Petabyte" + "\n\n");
        });
    }

    public void kb2ByteResult(JButton button, JTextField amountField, JTextArea outputField, JTextArea historyField){
        button.addActionListener(e -> {

            //Get the inputs
            double amount = Double.parseDouble(amountField.getText());

            //Calculate the output
            double result = amount * Math.pow(1024, 1);

            System.out.println(amount + " Kilobyte = " + result + " Byte");

            //Show the output
            outputField.setText(String.valueOf(result));

            //print history
            count++;
            System.out.println(count);
            historyField.append(count + ". " + "Kilobyte to Byte" + "\n"
                    + amount + " Kilobyte = " + result + " Byte" + "\n\n");
        });
    }

    public void kb2MBResult(JButton button, JTextField amountField, JTextArea outputField, JTextArea historyField){
        button.addActionListener(e -> {

            //Get the inputs
            double amount = Double.parseDouble(amountField.getText());

            //Calculate the output
            double result = amount / Math.pow(1024, 1);

            System.out.println(amount + " Kilobyte = " + result + " Megabyte");

            //Show the output
            outputField.setText(String.valueOf(result));

            //print history
            count++;
            System.out.println(count);
            historyField.append(count + ". " + "Kilobyte to Megabyte" + "\n"
                    + amount + " Kilobyte = " + result + " Megabyte" + "\n\n");
        });
    }

    public void kb2GBResult(JButton button, JTextField amountField, JTextArea outputField, JTextArea historyField){
        button.addActionListener(e -> {

            //Get the inputs
            double amount = Double.parseDouble(amountField.getText());

            //Calculate the output
            double result = amount / Math.pow(1024, 2);

            System.out.println(amount + " Kilobyte = " + result + " Gigabyte");

            //Show the output
            outputField.setText(String.valueOf(result));

            //print history
            count++;
            System.out.println(count);
            historyField.append(count + ". " + "Kilobyte to Gigabyte" + "\n"
                    + amount + " Kilobyte = " + result + " Gigabyte" + "\n\n");
        });
    }

    public void kb2TBResult(JButton button, JTextField amountField, JTextArea outputField, JTextArea historyField){
        button.addActionListener(e -> {

            //Get the inputs
            double amount = Double.parseDouble(amountField.getText());

            //Calculate the output
            double result = amount / Math.pow(1024, 3);

            System.out.println(amount + " Kilobyte = " + result + " Terabyte");

            //Show the output
            outputField.setText(String.valueOf(result));

            //print history
            count++;
            System.out.println(count);
            historyField.append(count + ". " + "Kilobyte to Terabyte" + "\n"
                    + amount + " Kilobyte = " + result + " Terabyte" + "\n\n");
        });
    }

    public void kb2PBResult(JButton button, JTextField amountField, JTextArea outputField, JTextArea historyField){
        button.addActionListener(e -> {

            //Get the inputs
            double amount = Double.parseDouble(amountField.getText());

            //Calculate the output
            double result = amount / Math.pow(1024, 4);

            System.out.println(amount + " Kilobyte = " + result + " Petabyte");

            //Show the output
            outputField.setText(String.valueOf(result));

            //print history
            count++;
            System.out.println(count);
            historyField.append(count + ". " + "Kilobyte to Petabyte" + "\n"
                    + amount + " Kilobyte = " + result + " Petabyte" + "\n\n");
        });
    }

    public void mb2ByteResult(JButton button, JTextField amountField, JTextArea outputField, JTextArea historyField){
        button.addActionListener(e -> {

            //Get the inputs
            double amount = Double.parseDouble(amountField.getText());

            //Calculate the output
            double result = amount * Math.pow(1024, 2);

            System.out.println(amount + " Megabyte = " + result + " Byte");

            //Show the output
            outputField.setText(String.valueOf(result));

            //print history
            count++;
            System.out.println(count);
            historyField.append(count + ". " + "Megabyte to Byte" + "\n"
                    + amount + " Megabyte = " + result + " Byte" + "\n\n");
        });
    }

    public void mb2KilobyteResult(JButton button, JTextField amountField, JTextArea outputField, JTextArea historyField){
        button.addActionListener(e -> {

            //Get the inputs
            double amount = Double.parseDouble(amountField.getText());

            //Calculate the output
            double result = amount * Math.pow(1024, 1);

            System.out.println(amount + " Megabyte = " + result + " Kilobyte");

            //Show the output
            outputField.setText(String.valueOf(result));

            //print history
            count++;
            System.out.println(count);
            historyField.append(count + ". " + "Megabyte to Kilobyte" + "\n"
                    + amount + " Megabyte = " + result + " Kilobyte" + "\n\n");
        });
    }

    public void mb2GBResult(JButton button, JTextField amountField, JTextArea outputField, JTextArea historyField){
        button.addActionListener(e -> {

            //Get the inputs
            double amount = Double.parseDouble(amountField.getText());

            //Calculate the output
            double result = amount / Math.pow(1024, 1);

            System.out.println(amount + " Megabyte = " + result + " Gigabyte");

            //Show the output
            outputField.setText(String.valueOf(result));

            //print history
            count++;
            System.out.println(count);
            historyField.append(count + ". " + "Megabyte to Gigabyte" + "\n"
                    + amount + " Megabyte = " + result + " Gigabyte" + "\n\n");
        });
    }

    public void mb2TBResult(JButton button, JTextField amountField, JTextArea outputField, JTextArea historyField){
        button.addActionListener(e -> {

            //Get the inputs
            double amount = Double.parseDouble(amountField.getText());

            //Calculate the output
            double result = amount / Math.pow(1024, 2);

            System.out.println(amount + " Megabyte = " + result + " Terabyte");

            //Show the output
            outputField.setText(String.valueOf(result));

            //print history
            count++;
            System.out.println(count);
            historyField.append(count + ". " + "Megabyte to Terabyte" + "\n"
                    + amount + " Megabyte = " + result + " Terabyte" + "\n\n");
        });
    }

    public void mb2PBResult(JButton button, JTextField amountField, JTextArea outputField, JTextArea historyField){
        button.addActionListener(e -> {

            //Get the inputs
            double amount = Double.parseDouble(amountField.getText());

            //Calculate the output
            double result = amount / Math.pow(1024, 3);

            System.out.println(amount + " Megabyte = " + result + " Petabyte");

            //Show the output
            outputField.setText(String.valueOf(result));

            //print history
            count++;
            System.out.println(count);
            historyField.append(count + ". " + "Megabyte to Petabyte" + "\n"
                    + amount + " Megabyte = " + result + " Petabyte" + "\n\n");
        });
    }

    public void gb2ByteResult(JButton button, JTextField amountField, JTextArea outputField, JTextArea historyField){
        button.addActionListener(e -> {

            //Get the inputs
            double amount = Double.parseDouble(amountField.getText());

            //Calculate the output
            double result = amount * Math.pow(1024, 3);

            System.out.println(amount + " Gigabyte = " + result + " Byte");

            //Show the output
            outputField.setText(String.valueOf(result));

            //print history
            count++;
            System.out.println(count);
            historyField.append(count + ". " + "Gigabyte to Byte" + "\n"
                    + amount + " Gigabyte = " + result + " Byte" + "\n\n");
        });
    }

    public void gb2KBResult(JButton button, JTextField amountField, JTextArea outputField, JTextArea historyField){
        button.addActionListener(e -> {

            //Get the inputs
            double amount = Double.parseDouble(amountField.getText());

            //Calculate the output
            double result = amount * Math.pow(1024, 2);

            System.out.println(amount + " Gigabyte = " + result + " Kilobyte");

            //Show the output
            outputField.setText(String.valueOf(result));

            //print history
            count++;
            System.out.println(count);
            historyField.append(count + ". " + "Gigabyte to Kilobyte" + "\n"
                    + amount + " Gigabyte = " + result + " Kilobyte" + "\n\n");
        });
    }

    public void gb2MBResult(JButton button, JTextField amountField, JTextArea outputField, JTextArea historyField){
        button.addActionListener(e -> {

            //Get the inputs
            double amount = Double.parseDouble(amountField.getText());

            //Calculate the output
            double result = amount * Math.pow(1024, 1);

            System.out.println(amount + " Gigabyte = " + result + " Megabyte");

            //Show the output
            outputField.setText(String.valueOf(result));

            //print history
            count++;
            System.out.println(count);
            historyField.append(count + ". " + "Gigabyte to Megabyte" + "\n"
                    + amount + " Gigabyte = " + result + " Megabyte" + "\n\n");
        });
    }

    public void gb2TBResult(JButton button, JTextField amountField, JTextArea outputField, JTextArea historyField){
        button.addActionListener(e -> {

            //Get the inputs
            double amount = Double.parseDouble(amountField.getText());

            //Calculate the output
            double result = amount / Math.pow(1024, 1);

            System.out.println(amount + " Gigabyte = " + result + " Terabyte");

            //Show the output
            outputField.setText(String.valueOf(result));

            //print history
            count++;
            System.out.println(count);
            historyField.append(count + ". " + "Gigabyte to Terabyte" + "\n"
                    + amount + " Gigabyte = " + result + " Terabyte" + "\n\n");
        });
    }

    public void gb2PBResult(JButton button, JTextField amountField, JTextArea outputField, JTextArea historyField){
        button.addActionListener(e -> {

            //Get the inputs
            double amount = Double.parseDouble(amountField.getText());

            //Calculate the output
            double result = amount / Math.pow(1024, 2);

            System.out.println(amount + " Gigabyte = " + result + " Petabyte");

            //Show the output
            outputField.setText(String.valueOf(result));

            //print history
            count++;
            System.out.println(count);
            historyField.append(count + ". " + "Gigabyte to Petabyte" + "\n"
                    + amount + " Gigabyte = " + result + " Petabyte" + "\n\n");
        });
    }

    public void tb2ByteResult(JButton button, JTextField amountField, JTextArea outputField, JTextArea historyField){
        button.addActionListener(e -> {

            //Get the inputs
            double amount = Double.parseDouble(amountField.getText());

            //Calculate the output
            double result = amount * Math.pow(1024, 4);

            System.out.println(amount + " Terabyte = " + result + " Byte");

            //Show the output
            outputField.setText(String.valueOf(result));

            //print history
            count++;
            System.out.println(count);
            historyField.append(count + ". " + "Terabyte to Byte\"" + "\n"
                    + amount + " Terabyte = " + result + " Byte\"" + "\n\n");
        });
    }

    public void tb2KBResult(JButton button, JTextField amountField, JTextArea outputField, JTextArea historyField){
        button.addActionListener(e -> {

            //Get the inputs
            double amount = Double.parseDouble(amountField.getText());

            //Calculate the output
            double result = amount * Math.pow(1024, 3);

            System.out.println(amount + " Terabyte = " + result + " Kilobyte");

            //Show the output
            outputField.setText(String.valueOf(result));

            //print history
            count++;
            System.out.println(count);
            historyField.append(count + ". " + "Terabyte to Kilobyte\"" + "\n"
                    + amount + " Terabyte = " + result + " Kilobyte\"" + "\n\n");
        });
    }

    public void tb2MBResult(JButton button, JTextField amountField, JTextArea outputField, JTextArea historyField){
        button.addActionListener(e -> {

            //Get the inputs
            double amount = Double.parseDouble(amountField.getText());

            //Calculate the output
            double result = amount * Math.pow(1024, 2);

            System.out.println(amount + " Terabyte = " + result + " Megabyte");

            //Show the output
            outputField.setText(String.valueOf(result));

            //print history
            count++;
            System.out.println(count);
            historyField.append(count + ". " + "Terabyte to Megabyte" + "\n"
                    + amount + " Terabyte = " + result + " Megabyte" + "\n\n");
        });
    }

    public void tb2GBResult(JButton button, JTextField amountField, JTextArea outputField, JTextArea historyField){
        button.addActionListener(e -> {

            //Get the inputs
            double amount = Double.parseDouble(amountField.getText());

            //Calculate the output
            double result = amount * Math.pow(1024, 1);

            System.out.println(amount + " Terabyte = " + result + " Gigabyte");

            //Show the output
            outputField.setText(String.valueOf(result));

            //print history
            count++;
            System.out.println(count);
            historyField.append(count + ". " + "Terabyte to Gigabyte" + "\n"
                    + amount + " Terabyte = " + result + " Gigabyte" + "\n\n");
        });
    }

    public void tb2PBResult(JButton button, JTextField amountField, JTextArea outputField, JTextArea historyField){
        button.addActionListener(e -> {

            //Get the inputs
            double amount = Double.parseDouble(amountField.getText());

            //Calculate the output
            double result = amount / Math.pow(1024, 1);

            System.out.println(amount + " Terabyte = " + result + " Petabyte");

            //Show the output
            outputField.setText(String.valueOf(result));

            //print history
            count++;
            System.out.println(count);
            historyField.append(count + ". " + "Terabyte to Petabyte" + "\n"
                    + amount + " Terabyte = " + result + " Petabyte" + "\n\n");
        });
    }

    public void pb2ByteResult(JButton button, JTextField amountField, JTextArea outputField, JTextArea historyField){
        button.addActionListener(e -> {

            //Get the inputs
            double amount = Double.parseDouble(amountField.getText());

            //Calculate the output
            double result = amount * Math.pow(1024, 5);

            System.out.println(amount + " Petabyte = " + result + " Byte");

            //Show the output
            outputField.setText(String.valueOf(result));

            //print history
            count++;
            System.out.println(count);
            historyField.append(count + ". " + "Petabyte to Byte" + "\n"
                    + amount + " Petabyte = " + result + " Byte" + "\n\n");
        });
    }

    public void pb2KBResult(JButton button, JTextField amountField, JTextArea outputField, JTextArea historyField){
        button.addActionListener(e -> {

            //Get the inputs
            double amount = Double.parseDouble(amountField.getText());

            //Calculate the output
            double result = amount * Math.pow(1024, 4);

            System.out.println(amount + " Petabyte = " + result + " Kilobyte");

            //Show the output
            outputField.setText(String.valueOf(result));

            //print history
            count++;
            System.out.println(count);
            historyField.append(count + ". " + "Petabyte to Kilobyte" + "\n"
                    + amount + " Petabyte = " + result + " Kilobyte" + "\n\n");
        });
    }

    public void pb2MBResult(JButton button, JTextField amountField, JTextArea outputField, JTextArea historyField){
        button.addActionListener(e -> {

            //Get the inputs
            double amount = Double.parseDouble(amountField.getText());

            //Calculate the output
            double result = amount * Math.pow(1024, 3);

            System.out.println(amount + " Petabyte = " + result + " Megabyte");

            //Show the output
            outputField.setText(String.valueOf(result));

            //print history
            count++;
            System.out.println(count);
            historyField.append(count + ". " + "Petabyte to Megabyte" + "\n"
                    + amount + " Petabyte = " + result + " Megabyte" + "\n\n");
        });
    }

    public void pb2GBResult(JButton button, JTextField amountField, JTextArea outputField, JTextArea historyField){
        button.addActionListener(e -> {

            //Get the inputs
            double amount = Double.parseDouble(amountField.getText());

            //Calculate the output
            double result = amount * Math.pow(1024, 2);

            System.out.println(amount + " Petabyte = " + result + " Gigabyte");

            //Show the output
            outputField.setText(String.valueOf(result));

            //print history
            count++;
            System.out.println(count);
            historyField.append(count + ". " + "Petabyte to Gigabyte" + "\n"
                    + amount + " Petabyte = " + result + " Gigabyte" + "\n\n");
        });
    }

    public void pb2TBResult(JButton button, JTextField amountField, JTextArea outputField, JTextArea historyField){
        button.addActionListener(e -> {

            //Get the inputs
            double amount = Double.parseDouble(amountField.getText());

            //Calculate the output
            double result = amount * Math.pow(1024, 1);

            System.out.println(amount + " Petabyte = " + result + " Terabyte");

            //Show the output
            outputField.setText(String.valueOf(result));

            //print history
            count++;
            System.out.println(count);
            historyField.append(count + ". " + "Petabyte to Terabyte" + "\n"
                    + amount + " Petabyte = " + result + " Terabyte" + "\n\n");
        });
    }

}
