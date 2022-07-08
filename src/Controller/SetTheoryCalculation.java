package Controller;

import javax.swing.*;
import java.util.*;

public class SetTheoryCalculation {
    public int a, b, result, count;

    String[] listA;
    String[] listB;

    public void performReset(JButton button, JTextField aField, JTextField bField, JTextArea resultField, JTextArea historyField){
        button.addActionListener(e -> {
            aField.setText("");
            bField.setText("");
            resultField.setText("");
            historyField.setText("");
            count = 0;
        });
    }

    public void unionResult(JButton button, JTextField aField, JTextField bField, JTextArea outputField, JTextArea historyField){
        button.addActionListener(e -> {

            //convert jTextField to string
            String a = aField.getText();
            String b = bField.getText();

            //detect use space to separate number
            listA = a.split(" ");
            listB = b.split(" ");

            // Create set A
            Set<String> setA = new HashSet<>(List.of(listA));

            // Create set B
            Set<String> setB = new HashSet<>(List.of(listB));

            //perform set A and set B
            Set<String> union = new HashSet<>(setA);
            union.addAll(setB);

            //Show the output
            outputField.setText(String.valueOf(union));

            //print history
            count++;
            System.out.println(count);
            historyField.append(count + ". " + "Union" + "\n"
                    + "Set A: " + Arrays.toString(listA) + ", Set B: " + Arrays.toString(listB) + "\nResult: " + union + " " +  "\n\n");
        });
    }

    public void intersectionResult(JButton button, JTextField aField, JTextField bField, JTextArea outputField, JTextArea historyField){
        button.addActionListener(e -> {

            //convert jTextField to string
            String a = aField.getText();
            String b = bField.getText();

            //detect use space to separate number
            listA = a.split(" ");
            listB = b.split(" ");

            // Create set A
            Set<String> setA = new HashSet<>(List.of(listA));

            // Create set B
            Set<String> setB = new HashSet<>(List.of(listB));

            //perform set A and set B
            Set<String> intersection = new HashSet<>(setA);
            intersection.retainAll(setB);

            //Show the output
            outputField.setText(String.valueOf(intersection));

            //print history
            count++;
            System.out.println(count);
            historyField.append(count + ". " + "Intersection" + "\n"
                    + "Set A: " + Arrays.toString(listA) + ", Set B: " + Arrays.toString(listB) + "\nResult: " + intersection + " " +  "\n\n");
        });
    }

    public void differenceResult(JButton button, JTextField aField, JTextField bField, JTextArea outputField, JTextArea historyField){
        button.addActionListener(e -> {

            //convert jTextField to string
            String a = aField.getText();
            String b = bField.getText();

            //detect use space to separate number
            listA = a.split(" ");
            listB = b.split(" ");

            // Create set A
            Set<String> setA = new HashSet<>(List.of(listA));

            // Create set B
            Set<String> setB = new HashSet<>(List.of(listB));

            //perform set A and set B
            Set<String> difference = new HashSet<>(setA);
            difference.retainAll(setB);

            //Show the output
            outputField.setText(String.valueOf(difference));

            //print history
            count++;
            System.out.println(count);
            historyField.append(count + ". " + "Difference" + "\n"
                    + "Set A: " + Arrays.toString(listA) + ", Set B: " + Arrays.toString(listB) + "\nResult: " + difference + " " +  "\n\n");
        });
    }

}
