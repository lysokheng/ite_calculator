package Controller;

import Model.NSCBinaryModel;
import Model.NSCDecimalModel;
import Views.Widgets.NSCBinaryView;
import Views.Widgets.NSCDecimalView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NSCDecimalController {
    //... The Controller needs to interact with both the Model and View.
    private final NSCDecimalModel nscDecimalModel;
    private final NSCDecimalView nscDecimalView;

    //========================================================== constructor
    /** Constructor */
    public NSCDecimalController(NSCDecimalModel model, NSCDecimalView view) {
        nscDecimalModel = model;
        nscDecimalView = view;

        //... Add listeners to the view.
        view.addNSCDecimalListener(new NSCDecimalListener());
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
    class NSCDecimalListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String amount = "";
            JTextArea history;
            try {
                amount = nscDecimalView.getAmount();
                history = nscDecimalView.getHistoryField();

                if (e.getSource() == nscDecimalView.getDecimalToBinaryButton()){
                    nscDecimalModel.dec2Binary(amount, history);

                } else if (e.getSource() == nscDecimalView.getDecimalToHexadecimalButton()) {
                    nscDecimalModel.dec2Hex(amount, history);

                } else if (e.getSource() == nscDecimalView.getDecimalToOctalButton()) {
                    nscDecimalModel.dec2Octal(amount, history);

                }

                nscDecimalView.setResultField(nscDecimalModel.getValue());

            } catch (NumberFormatException next) {
                nscDecimalView.showError("Bad input: '" + amount +  "'");
            }
        }
    }//end inner class MultiplyListener


    //////////////////////////////////////////// inner class ClearListener
    /**  1. Reset model.
     *   2. Reset View.
     */
    class ClearListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            nscDecimalModel.reset();
            nscDecimalView.reset();
        }
    }// end inner class ClearListener
}
