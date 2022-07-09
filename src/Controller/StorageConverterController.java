package Controller;

import Model.NSCBinaryModel;
import Model.StorageConverterModel;
import Views.Widgets.NSCBinaryView;
import Views.Widgets.StorageConverterView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StorageConverterController {
    //... The Controller needs to interact with both the Model and View.
    private final StorageConverterModel storageConverterModel;
    private final StorageConverterView storageConverterView;

    //========================================================== constructor
    /** Constructor */
    public StorageConverterController(StorageConverterModel model, StorageConverterView view) {
        storageConverterModel = model;
        storageConverterView = view;

        //... Add listeners to the view.
        view.addStorageConverterListener(new NSCStorageConverterListener());
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
    class NSCStorageConverterListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String amount = "";
            JTextArea history;
            try {
                amount = storageConverterView.getAmount();
                history = storageConverterView.getHistoryField();

                if (e.getSource() == storageConverterView.getByteToKilobyteButton()){
                    storageConverterModel.binary2Decimal(amount, history);

                } else if (e.getSource() == storageConverterView.getByteToMegabyteButton()) {
                    storageConverterModel.binary2Hex(amount, history);

                } else if (e.getSource() == storageConverterView.getByteToGigabyteButton()) {
                    storageConverterModel.binary2Octal(amount, history);

                } else if (e.getSource() == storageConverterView.getByteToPetabyteButton()) {
                    storageConverterModel.binary2Hex(amount, history);

                } else if (e.getSource() == storageConverterView.getByteToTerabyteButton()) {
                    storageConverterModel.binary2Octal(amount, history);


                } else if (e.getSource() == storageConverterView.getKilobyteToByteButton()) {
                    storageConverterModel.binary2Hex(amount, history);

                } else if (e.getSource() == storageConverterView.getKilobyteToMegabyteButton()) {
                    storageConverterModel.binary2Octal(amount, history);

                } else if (e.getSource() == storageConverterView.getKilobyteToGigabyteButton()) {
                    storageConverterModel.binary2Hex(amount, history);

                } else if (e.getSource() == storageConverterView.getKilobyteToPetabyteButton()) {
                    storageConverterModel.binary2Octal(amount, history);

                } else if (e.getSource() == storageConverterView.getKilobyteToTerabyteButton()) {
                    storageConverterModel.binary2Octal(amount, history);


                } else if (e.getSource() == storageConverterView.getMegabyteToByteButton()) {
                    storageConverterModel.binary2Hex(amount, history);

                } else if (e.getSource() == storageConverterView.getMegabyteToKilobyteButton()) {
                    storageConverterModel.binary2Octal(amount, history);

                } else if (e.getSource() == storageConverterView.getMegabyteToGigabyteButton()) {
                    storageConverterModel.binary2Hex(amount, history);

                } else if (e.getSource() == storageConverterView.getMegabyteToPetabyteButton()) {
                    storageConverterModel.binary2Octal(amount, history);

                } else if (e.getSource() == storageConverterView.getMegabyteToTerabyteButton()) {
                    storageConverterModel.binary2Octal(amount, history);


                } else if (e.getSource() == storageConverterView.getGigabyteToByteButton()) {
                    storageConverterModel.binary2Hex(amount, history);

                } else if (e.getSource() == storageConverterView.getGigabyteToKilobyteButton()) {
                    storageConverterModel.binary2Octal(amount, history);

                } else if (e.getSource() == storageConverterView.getGigabyteToMegabyteButton()) {
                    storageConverterModel.binary2Hex(amount, history);

                } else if (e.getSource() == storageConverterView.getGigabyteToPetabyteButton()) {
                    storageConverterModel.binary2Octal(amount, history);

                } else if (e.getSource() == storageConverterView.getGigabyteToTerabyteButton()) {
                    storageConverterModel.binary2Octal(amount, history);


                } else if (e.getSource() == storageConverterView.getPetabyteToByteButton()) {
                    storageConverterModel.binary2Hex(amount, history);

                } else if (e.getSource() == storageConverterView.getPetabyteToKilobyteButton()) {
                    storageConverterModel.binary2Octal(amount, history);

                } else if (e.getSource() == storageConverterView.getPetabyteToMegabyteButton()) {
                    storageConverterModel.binary2Hex(amount, history);

                } else if (e.getSource() == storageConverterView.getPetabyteToGigabyteButton()) {
                    storageConverterModel.binary2Octal(amount, history);

                } else if (e.getSource() == storageConverterView.getPetabyteToTerabyteButton()) {
                    storageConverterModel.binary2Octal(amount, history);


                } else if (e.getSource() == storageConverterView.getTerabyteToByteButton()) {
                    storageConverterModel.binary2Hex(amount, history);

                } else if (e.getSource() == storageConverterView.getTerabyteToKilobyteButton()) {
                    storageConverterModel.binary2Octal(amount, history);

                } else if (e.getSource() == storageConverterView.getTerabyteToMegabyteButton()) {
                    storageConverterModel.binary2Hex(amount, history);

                } else if (e.getSource() == storageConverterView.getTerabyteToGigabyteButton()) {
                    storageConverterModel.binary2Octal(amount, history);

                } else if (e.getSource() == storageConverterView.getTerabyteToPetabyteButton()) {
                    storageConverterModel.binary2Octal(amount, history);

                }

                storageConverterView.setResultField(storageConverterModel.getValue());

            } catch (NumberFormatException next) {
                storageConverterView.showError("Bad input: '" + amount +  "'");
            }
        }
    }//end inner class MultiplyListener


    //////////////////////////////////////////// inner class ClearListener
    /**  1. Reset model.
     *   2. Reset View.
     */
    class ClearListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            storageConverterModel.reset();
            storageConverterView.reset();
        }
    }// end inner class ClearListener
}
