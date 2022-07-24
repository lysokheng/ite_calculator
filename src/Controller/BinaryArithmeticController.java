package Controller;

import Model.BinaryArithmeticModel;
import Views.BinaryArithmeticView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BinaryArithmeticController {
    //... The Controller needs to interact with both the Model and View.
    private final BinaryArithmeticModel binaryArithmeticModel;
    private final BinaryArithmeticView binaryArithmeticView;

    //========================================================== constructor
    /** Constructor */
    public BinaryArithmeticController(BinaryArithmeticModel model, BinaryArithmeticView view) {
        binaryArithmeticModel = model;
        binaryArithmeticView = view;

        //... Add listeners to the view.
        view.addButtonListener(new BinaryArithmeticListener());
        view.addClearListener(new ClearListener());
    }

    ////////////////////////////////////////// inner class MultiplyListener
    /** When a calculation is requested.
     *  1. Get the user input number from the View.
     *  2. Call the model to calculate by this number.
     *  3. Get the result from the Model.
     *  4. Tell the View to display the result.
     * If there was an error, tell the View to display it.
     */
    class BinaryArithmeticListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String a = "", b = "";
            JTextArea history;
            try {
                a = binaryArithmeticView.getA();
                b = binaryArithmeticView.getB();
                history = binaryArithmeticView.getHistoryField();

                if (e.getSource() == binaryArithmeticView.getAdditionButton()){
                    binaryArithmeticModel.addition(a, b, history);

                } else if (e.getSource() == binaryArithmeticView.getSubtractionButton()) {
                    binaryArithmeticModel.subtraction(a, b, history);

                } else if (e.getSource() == binaryArithmeticView.getAdditionWith2NdComplementButton()) {
                    binaryArithmeticModel.additionWith2ndComplement(a, b, history);

                } else if (e.getSource() == binaryArithmeticView.getSubtractionWith2NdComplementButton()) {
                    binaryArithmeticModel.subtractionWith2ndComplement(a, b, history);

                } else if (e.getSource() == binaryArithmeticView.getMultiplyButton()) {
                    binaryArithmeticModel.multiply(a, b, history);

                } else if (e.getSource() == binaryArithmeticView.getDivideButton()) {
                    binaryArithmeticModel.divide(a, b, history);

                }

                binaryArithmeticView.setResultField(binaryArithmeticModel.getValue());

            } catch (NumberFormatException next) {
                binaryArithmeticView.showError("Bad input: '" + a + ", " + b +  "'");
            }
        }
    }//end inner class MultiplyListener


    //////////////////////////////////////////// inner class ClearListener
    /**  1. Reset model.
     *   2. Reset View.
     */
    class ClearListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            binaryArithmeticModel.reset();
            binaryArithmeticView.reset();
        }
    }// end inner class ClearListener
}
