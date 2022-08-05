package Controller;

import Model.ArithmeticModel;
import View.ArithmeticView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ArithmeticController {
    // ... The Controller needs to interact with both the Model and View.
    private final ArithmeticModel arithmeticModel;
    private final ArithmeticView arithmeticView;

    // ========================================================== constructor
    /** Constructor */
    public ArithmeticController(ArithmeticModel model, ArithmeticView view) {
        arithmeticModel = model;
        arithmeticView = view;

        // ... Add listeners to the view.
        view.addButtonListener(new ArithmeticListener());
        view.addClearListener(new ClearListener());
    }

    ////////////////////////////////////////// inner class ArithmeticListener
    /**
     * When a calculation is requested.
     * 1. Get the user input number from the View.
     * 2. Call the model to calculate by this number.
     * 3. Get the result from the Model.
     * 4. Tell the View to display the result.
     * If there was an error, tell the View to display it.
     */
    class ArithmeticListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String a = "", b = "";
            JTextArea history;
            try {
                a = arithmeticView.getA();
                b = arithmeticView.getB();
                history = arithmeticView.getHistoryField();

                arithmeticView.resetAB();

                if (e.getSource() == arithmeticView.getAdditionButton()) {
                    arithmeticModel.addition(a, b, history);

                } else if (e.getSource() == arithmeticView.getSubtractionButton()) {
                    arithmeticModel.subtraction(a, b, history);

                } else if (e.getSource() == arithmeticView.getMultiplicationButton()) {
                    arithmeticModel.multiply(a, b, history);

                } else if (e.getSource() == arithmeticView.getDivisionButton()) {
                    arithmeticModel.divide(a, b, history);

                } else if (e.getSource() == arithmeticView.getModuloButton()) {
                    arithmeticModel.modulo(a, b, history);

                }

                arithmeticView.setResultField(arithmeticModel.getValue());

            } catch (NumberFormatException next) {
                arithmeticView.showError("A and B must be entered only with one period in each field." +
                        "\nA: " + a + "\nB: " + b + "\n", "Error");
            }
        }
    }// end inner class ArithmeticListener

    //////////////////////////////////////////// inner class ClearListener
    /**
     * 1. Reset model.
     * 2. Reset View.
     */
    class ClearListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            arithmeticModel.reset();
            arithmeticView.reset();
        }
    }// end inner class ClearListener
}
