package Controller;

import Model.NSCHexadecimalModel;
import View.NSCHexadecimalView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NSCHexadecimalController {
    // ... The Controller needs to interact with both the Model and View.
    private final NSCHexadecimalModel nscHexadecimalModel;
    private final NSCHexadecimalView nscHexadecimalView;

    // ========================================================== constructor
    /** Constructor */
    public NSCHexadecimalController(NSCHexadecimalModel model, NSCHexadecimalView view) {
        nscHexadecimalModel = model;
        nscHexadecimalView = view;

        // ... Add listeners to the view.
        view.addButtonListener(new NSCHexadecimalListener());
        view.addClearListener(new ClearListener());
    }

    ////////////////////////////////////////// inner class NSCHexadecimalListener
    /**
     * When a calculation is requested.
     * 1. Get the user input number from the View.
     * 2. Call the model to calculate by this number.
     * 3. Get the result from the Model.
     * 4. Tell the View to display the result.
     * If there was an error, tell the View to display it.
     */
    class NSCHexadecimalListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String amount = "";
            JTextArea history;
            try {
                amount = nscHexadecimalView.getAmount();
                history = nscHexadecimalView.getHistoryField();

                nscHexadecimalView.resetAmount();
                
                if (e.getSource() == nscHexadecimalView.getHexadecimalToDecimalButton()) {
                    nscHexadecimalModel.hex2Decimal(amount, history);

                } else if (e.getSource() == nscHexadecimalView.getHexadecimalToBinaryButton()) {
                    nscHexadecimalModel.hex2Binary(amount, history);

                } else if (e.getSource() == nscHexadecimalView.getHexadecimalToOctalButton()) {
                    nscHexadecimalModel.hex2Octal(amount, history);

                }

                nscHexadecimalView.setResultField(nscHexadecimalModel.getValue());

            } catch (NumberFormatException next) {
                nscHexadecimalView.showError("Amount must be entered." +
                        "\nAmount: " + amount, "Error");
            }
        }
    }// end inner class NSCHexadecimalListener

    //////////////////////////////////////////// inner class ClearListener
    /**
     * 1. Reset model.
     * 2. Reset View.
     */
    class ClearListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            nscHexadecimalModel.reset();
            nscHexadecimalView.reset();
        }
    }// end inner class ClearListener
}
