package Controller;

import Model.BitwiseBinaryModel;
import Views.Detail.BitwiseBinaryView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BitwiseBinaryController {
    //... The Controller needs to interact with both the Model and View.
    private final BitwiseBinaryModel bitwiseBinaryModel;
    private final BitwiseBinaryView bitwiseBinaryView;

    //========================================================== constructor
    /** Constructor */
    public BitwiseBinaryController(BitwiseBinaryModel model, BitwiseBinaryView view) {
        bitwiseBinaryModel = model;
        bitwiseBinaryView = view;

        //... Add listeners to the view.
        view.addBitwiseBinaryListener(new BitwiseBinaryListener());
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
    class BitwiseBinaryListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String a = "", b = "";
            JTextArea history;
            try {
                a = bitwiseBinaryView.getA();
                b = bitwiseBinaryView.getB();
                history = bitwiseBinaryView.getHistoryField();

                if (e.getSource() == bitwiseBinaryView.getBitwiseANDButton()){
                    bitwiseBinaryModel.bitwiseAND(a, b, history);

                } else if (e.getSource() == bitwiseBinaryView.getBitwiseORButton()) {
                    bitwiseBinaryModel.bitwiseOR(a, b, history);

                } else if (e.getSource() == bitwiseBinaryView.getBitwiseXORButton()) {
                    bitwiseBinaryModel.bitwiseXOR(a, b, history);

                } else if (e.getSource() == bitwiseBinaryView.getBitwiseLeftShiftButton()) {
                    bitwiseBinaryModel.bitwiseLeftShift(a, b, history);

                } else if (e.getSource() == bitwiseBinaryView.getBitwiseRightShiftButton()) {
                    bitwiseBinaryModel.bitwiseRightShift(a, b, history);

                } else if (e.getSource() == bitwiseBinaryView.getBitwiseInversionButton()) {
                    bitwiseBinaryModel.bitwiseInversion(a, b, history);

                }

                bitwiseBinaryView.setResultField(bitwiseBinaryModel.getValue());

            } catch (NumberFormatException next) {
                bitwiseBinaryView.showError("Bad input: '" + a + ", " + b +  "'");
            }
        }
    }//end inner class MultiplyListener


    //////////////////////////////////////////// inner class ClearListener
    /**  1. Reset model.
     *   2. Reset View.
     */
    class ClearListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            bitwiseBinaryModel.reset();
            bitwiseBinaryView.reset();
        }
    }// end inner class ClearListener
}
