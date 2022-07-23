package Controller;

import Model.NSCOctalModel;
import Views.Detail.NSCOctalView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NSCOctalController {
    //... The Controller needs to interact with both the Model and View.
    private final NSCOctalModel nscOctalModel;
    private final NSCOctalView nscOctalView;

    //========================================================== constructor
    /** Constructor */
    public NSCOctalController(NSCOctalModel model, NSCOctalView view) {
        nscOctalModel = model;
        nscOctalView = view;

        //... Add listeners to the view.
        view.addButtonListener(new NSCOctalListener());
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
    class NSCOctalListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String amount = "";
            JTextArea history;
            try {
                amount = nscOctalView.getAmount();
                history = nscOctalView.getHistoryField();

                if (e.getSource() == nscOctalView.getOctalToBinaryButton()){
                    nscOctalModel.octal2Binary(amount, history);

                } else if (e.getSource() == nscOctalView.getOctalToDecimalButton()) {
                    nscOctalModel.octal2Decimal(amount, history);

                } else if (e.getSource() == nscOctalView.getOctalToHexadecimalButton()) {
                    nscOctalModel.octal2Hex(amount, history);

                }

                nscOctalView.setResultField(nscOctalModel.getValue());

            } catch (NumberFormatException next) {
                nscOctalView.showError("Bad input: '" + amount +  "'");
            }
        }
    }//end inner class MultiplyListener


    //////////////////////////////////////////// inner class ClearListener
    /**  1. Reset model.
     *   2. Reset View.
     */
    class ClearListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            nscOctalModel.reset();
            nscOctalView.reset();
        }
    }// end inner class ClearListener
}
