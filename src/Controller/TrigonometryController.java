package Controller;

import Model.TrigonometryModel;
import Views.Detail.TrigonometryView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TrigonometryController {
    //... The Controller needs to interact with both the Model and View.
    private final TrigonometryModel trigonometryModel;
    private final TrigonometryView trigonometryView;

    //========================================================== constructor
    /** Constructor */
    public TrigonometryController(TrigonometryModel model, TrigonometryView view) {
        trigonometryModel = model;
        trigonometryView = view;

        //... Add listeners to the view.
        view.addButtonListener(new TrigonometryListener());
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
    class TrigonometryListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String amount = "";
            JTextArea history;
            try {
                amount = trigonometryView.getAmount();
                history = trigonometryView.getHistoryField();

                if (e.getSource() == trigonometryView.getSinToDegreeButton()){
                    trigonometryModel.sinToDegree(amount, history);

                } else if (e.getSource() == trigonometryView.getSinToRadianButton()) {
                    trigonometryModel.sinToRadian(amount, history);

                } else if (e.getSource() == trigonometryView.getCosToDegreeButton()) {
                    trigonometryModel.cosToDegree(amount, history);

                } else if (e.getSource() == trigonometryView.getCosToRadianButton()) {
                    trigonometryModel.cosToRadian(amount, history);

                } else if (e.getSource() == trigonometryView.getTanToDegreeButton()) {
                    trigonometryModel.tanToDegree(amount, history);

                } else if (e.getSource() == trigonometryView.getTanToRadianButton()) {
                    trigonometryModel.tanToRadian(amount, history);

                } else if (e.getSource() == trigonometryView.getSquare2InFloatingPointButton()) {
                    trigonometryModel.square2InFloating_point(amount, history);

                } else if (e.getSource() == trigonometryView.getSquare2InIntegerButton()) {
                    trigonometryModel.square2InInt(amount, history);

                } else if (e.getSource() == trigonometryView.getSquare3InIntegerButton()) {
                    trigonometryModel.square3InInt(amount, history);

                } else if (e.getSource() == trigonometryView.getSquare3InFloatingPointButton()) {
                    trigonometryModel.square3InFloating_point(amount, history);

                } else if (e.getSource() == trigonometryView.getDegreeToRadianButton()) {
                    trigonometryModel.degreeToRadian(amount, history);

                }

                trigonometryView.setResultField(trigonometryModel.getValue());

            } catch (NumberFormatException next) {
                trigonometryView.showError("Bad input: '" + amount +  "'");
            }
        }
    }//end inner class MultiplyListener


    //////////////////////////////////////////// inner class ClearListener
    /**  1. Reset model.
     *   2. Reset View.
     */
    class ClearListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            trigonometryModel.reset();
            trigonometryView.reset();
        }
    }// end inner class ClearListener
}
