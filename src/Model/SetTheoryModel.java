package Model;

import javax.swing.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetTheoryModel {
    //... Constants
    private static final String INITIAL_VALUE = "0";

    //... Member variable defining state of calculator.
    private String result;
    private int count;
    private String[] listA;
    private String[] listB;

    //============================================================== constructor
    /** Constructor */
    public SetTheoryModel() {
        reset();
    }

    //==================================================================== reset
    /** Reset to initial value. */
    public void reset() {
        result = INITIAL_VALUE;
        count = 0;
    }

    //=============================================================== calculation

    public void union(String a, String b, JTextArea history) {

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

        result = String.valueOf(union);

        count++;
        history.append(count + ". " + "Union" + "\n"
                + "A: " + a + "\nB: " + b + "\nResult: " + result + "\n\n");
    }

    public void intersection(String a, String b, JTextArea history) {

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

        result = String.valueOf(intersection);

        count++;
        history.append(count + ". " + "Intersection" + "\n"
                + "A: " + a + "\nB: " + b + "\nResult: " + result + "\n\n");
    }

    public void difference(String a, String b, JTextArea history) {

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

        result = String.valueOf(difference);

        count++;
        history.append(count + ". " + "Difference" + "\n"
                + "A: " + a + "\nB: " + b + "\nResult: " + result + "\n\n");
    }

    //================================================================= getValue
    /** Return current calculator total. */
    public String getValue() {
        return result;
    }
}