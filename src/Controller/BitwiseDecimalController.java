package Controller;

import Model.BitwiseDecimalModel;
import View.BitwiseDecimalView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BitwiseDecimalController {
    // ... The Controller needs to interact with both the Model and View.
    private final BitwiseDecimalModel bitwiseDecimalModel;
    private final BitwiseDecimalView bitwiseDecimalView;

    // ========================================================== constructor
    /** Constructor */
    public BitwiseDecimalController(BitwiseDecimalModel model, BitwiseDecimalView view) {
        bitwiseDecimalModel = model;
        bitwiseDecimalView = view;

        // ... Add listeners to the view.
        view.addButtonListener(new BitwiseDecimalListener());
        view.addClearListener(new ClearListener());
    }

    ////////////////////////////////////////// inner class BitwiseDecimalListener
    /**
     * When a calculation is requested.
     * 1. Get the user input number from the View.
     * 2. Call the model to calculate by this number.
     * 3. Get the result from the Model.
     * 4. Tell the View to display the result.
     * If there was an error, tell the View to display it.
     */
    class BitwiseDecimalListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String a = "", b = "";
            JTextArea history;
            try {
                a = bitwiseDecimalView.getA();
                b = bitwiseDecimalView.getB();
                history = bitwiseDecimalView.getHistoryField();

                bitwiseDecimalView.resetAB();
                
                if (e.getSource() == bitwiseDecimalView.getBitwiseANDButton()) {
                    bitwiseDecimalModel.bitwiseAND(a, b, history);

                } else if (e.getSource() == bitwiseDecimalView.getBitwiseORButton()) {
                    bitwiseDecimalModel.bitwiseOR(a, b, history);

                } else if (e.getSource() == bitwiseDecimalView.getBitwiseXORButton()) {
                    bitwiseDecimalModel.bitwiseXOR(a, b, history);

                } else if (e.getSource() == bitwiseDecimalView.getBitwiseLeftShiftButton()) {
                    bitwiseDecimalModel.bitwiseLeftShift(a, b, history);

                } else if (e.getSource() == bitwiseDecimalView.getBitwiseRightShiftButton()) {
                    bitwiseDecimalModel.bitwiseRightShift(a, b, history);

                } else if (e.getSource() == bitwiseDecimalView.getBitwiseInversionButton()) {
                    bitwiseDecimalModel.bitwiseInversion(a, b, history);

                }

                bitwiseDecimalView.setResultField(bitwiseDecimalModel.getValue());

            } catch (NumberFormatException next) {
                bitwiseDecimalView.showError("A and B must be entered." +
                        "\nA: " + a + "\nB: " + b + "\n", "Error");
            }
        }
    }// end inner class BitwiseDecimalListener

    //////////////////////////////////////////// inner class ClearListener
    /**
     * 1. Reset model.
     * 2. Reset View.
     */
    class ClearListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            bitwiseDecimalModel.reset();
            bitwiseDecimalView.reset();
        }
    }// end inner class ClearListener
}
