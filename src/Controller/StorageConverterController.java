package Controller;

import Model.StorageConverterModel;
import Views.StorageConverterViews;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StorageConverterController {
    //... The Controller needs to interact with both the Model and View.
    private final StorageConverterModel storageConverterModel;
    private final StorageConverterViews storageConverterView;

    //========================================================== constructor
    /** Constructor */
    public StorageConverterController(StorageConverterModel model, StorageConverterViews view) {
        storageConverterModel = model;
        storageConverterView = view;

        //... Add listeners to the view.
        view.addButtonListener(new NSCStorageConverterListener());
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
                    storageConverterModel.byte2KB(amount, history);

                } else if (e.getSource() == storageConverterView.getByteToMegabyteButton()) {
                    storageConverterModel.byte2MB(amount, history);

                } else if (e.getSource() == storageConverterView.getByteToGigabyteButton()) {
                    storageConverterModel.byte2GB(amount, history);

                } else if (e.getSource() == storageConverterView.getByteToPetabyteButton()) {
                    storageConverterModel.byte2PB(amount, history);

                } else if (e.getSource() == storageConverterView.getByteToTerabyteButton()) {
                    storageConverterModel.byte2TB(amount, history);


                } else if (e.getSource() == storageConverterView.getKilobyteToByteButton()) {
                    storageConverterModel.kb2byte(amount, history);

                } else if (e.getSource() == storageConverterView.getKilobyteToMegabyteButton()) {
                    storageConverterModel.kb2MB(amount, history);

                } else if (e.getSource() == storageConverterView.getKilobyteToGigabyteButton()) {
                    storageConverterModel.kb2GB(amount, history);

                } else if (e.getSource() == storageConverterView.getKilobyteToPetabyteButton()) {
                    storageConverterModel.kb2PB(amount, history);

                } else if (e.getSource() == storageConverterView.getKilobyteToTerabyteButton()) {
                    storageConverterModel.kb2TB(amount, history);


                } else if (e.getSource() == storageConverterView.getMegabyteToByteButton()) {
                    storageConverterModel.mb2byte(amount, history);

                } else if (e.getSource() == storageConverterView.getMegabyteToKilobyteButton()) {
                    storageConverterModel.mb2KB(amount, history);

                } else if (e.getSource() == storageConverterView.getMegabyteToGigabyteButton()) {
                    storageConverterModel.mb2GB(amount, history);

                } else if (e.getSource() == storageConverterView.getMegabyteToPetabyteButton()) {
                    storageConverterModel.mb2PB(amount, history);

                } else if (e.getSource() == storageConverterView.getMegabyteToTerabyteButton()) {
                    storageConverterModel.mb2TB(amount, history);


                } else if (e.getSource() == storageConverterView.getGigabyteToByteButton()) {
                    storageConverterModel.gb2byte(amount, history);

                } else if (e.getSource() == storageConverterView.getGigabyteToKilobyteButton()) {
                    storageConverterModel.gb2KB(amount, history);

                } else if (e.getSource() == storageConverterView.getGigabyteToMegabyteButton()) {
                    storageConverterModel.gb2MB(amount, history);

                } else if (e.getSource() == storageConverterView.getGigabyteToPetabyteButton()) {
                    storageConverterModel.gb2PB(amount, history);

                } else if (e.getSource() == storageConverterView.getGigabyteToTerabyteButton()) {
                    storageConverterModel.gb2TB(amount, history);


                } else if (e.getSource() == storageConverterView.getPetabyteToByteButton()) {
                    storageConverterModel.pb2Byte(amount, history);

                } else if (e.getSource() == storageConverterView.getPetabyteToKilobyteButton()) {
                    storageConverterModel.pb2KB(amount, history);

                } else if (e.getSource() == storageConverterView.getPetabyteToMegabyteButton()) {
                    storageConverterModel.pb2MB(amount, history);

                } else if (e.getSource() == storageConverterView.getPetabyteToGigabyteButton()) {
                    storageConverterModel.pb2GB(amount, history);

                } else if (e.getSource() == storageConverterView.getPetabyteToTerabyteButton()) {
                    storageConverterModel.pb2TB(amount, history);


                } else if (e.getSource() == storageConverterView.getTerabyteToByteButton()) {
                    storageConverterModel.tb2byte(amount, history);

                } else if (e.getSource() == storageConverterView.getTerabyteToKilobyteButton()) {
                    storageConverterModel.tb2KB(amount, history);

                } else if (e.getSource() == storageConverterView.getTerabyteToMegabyteButton()) {
                    storageConverterModel.tb2MB(amount, history);

                } else if (e.getSource() == storageConverterView.getTerabyteToGigabyteButton()) {
                    storageConverterModel.tb2GB(amount, history);

                } else if (e.getSource() == storageConverterView.getTerabyteToPetabyteButton()) {
                    storageConverterModel.tb2PB(amount, history);

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
