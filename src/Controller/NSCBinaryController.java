package Controller;

import Model.NSCBinaryModel;
import Views.Detail.NSCBinaryView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NSCBinaryController {
    //... The Controller needs to interact with both the Model and View.
    private final NSCBinaryModel nscBinaryModel;
    private final NSCBinaryView nscBinaryView;

    //========================================================== constructor
    /** Constructor */
    public NSCBinaryController(NSCBinaryModel model, NSCBinaryView view) {
        nscBinaryModel = model;
        nscBinaryView = view;

        //... Add listeners to the view.
        view.addNSCBinaryListener(new NSCBinaryListener());
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
    class NSCBinaryListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String amount = "";
            JTextArea history;
            try {
                amount = nscBinaryView.getAmount();
                history = nscBinaryView.getHistoryField();

                if (e.getSource() == nscBinaryView.getBinaryToDecimalButton()){
                    nscBinaryModel.binary2Decimal(amount, history);

                } else if (e.getSource() == nscBinaryView.getBinaryToHexadecimalButton()) {
                    nscBinaryModel.binary2Hex(amount, history);

                } else if (e.getSource() == nscBinaryView.getBinaryToOctalButton()) {
                    nscBinaryModel.binary2Octal(amount, history);

                }

                nscBinaryView.setResultField(nscBinaryModel.getValue());

            } catch (NumberFormatException next) {
                nscBinaryView.showError("Bad input: '" + amount +  "'");
            }
        }
    }//end inner class MultiplyListener


    //////////////////////////////////////////// inner class ClearListener
    /**  1. Reset model.
     *   2. Reset View.
     */
    class ClearListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            nscBinaryModel.reset();
            nscBinaryView.reset();
        }
    }// end inner class ClearListener
}
