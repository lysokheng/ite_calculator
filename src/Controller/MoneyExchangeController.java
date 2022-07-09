package Controller;

import Model.ArithmeticModel;
import Model.MoneyExchangeModel;
import Views.Widgets.ArithmeticView;
import Views.Widgets.MoneyExchangeView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class MoneyExchangeController {
    //... The Controller needs to interact with both the Model and View.
    private final MoneyExchangeModel moneyExchangeModel;
    private final MoneyExchangeView moneyExchangeView;

    //========================================================== constructor
    /** Constructor */
    public MoneyExchangeController(MoneyExchangeModel model, MoneyExchangeView view) {
        moneyExchangeModel = model;
        moneyExchangeView = view;

        //... Add listeners to the view.
        view.addMoneyExchangeListener(new MoneyExchangeListener());
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
    class MoneyExchangeListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String amount = "";
            JTextArea history;
            try {
                amount = moneyExchangeView.getAmount();
                history = moneyExchangeView.getHistoryField();

                if (e.getSource() == moneyExchangeView.getRielToDollarButton()){
                    moneyExchangeModel.rielToDollar(amount, history);

                } else if (e.getSource() == moneyExchangeView.getRielToEuroButton()) {
                    moneyExchangeModel.rielToEuro(amount, history);

                } else if (e.getSource() == moneyExchangeView.getRielToPoundButton()) {
                    moneyExchangeModel.rielToPound(amount, history);

                } else if (e.getSource() == moneyExchangeView.getRielToFranceButton()) {
                    moneyExchangeModel.rielToFrance(amount, history);

                } else if (e.getSource() == moneyExchangeView.getRielToBahtButton()) {
                    moneyExchangeModel.rielToBaht(amount, history);

                } else if (e.getSource() == moneyExchangeView.getDollarToRielButton()) {
                    moneyExchangeModel.dollarToRiel(amount, history);

                } else if (e.getSource() == moneyExchangeView.getEuroToRielButton()) {
                    moneyExchangeModel.euroToRiel(amount, history);

                } else if (e.getSource() == moneyExchangeView.getFranceToRielButton()) {
                    moneyExchangeModel.franceToRiel(amount, history);

                } else if (e.getSource() == moneyExchangeView.getPoundToRielButton()) {
                    moneyExchangeModel.poundToRiel(amount, history);

                } else if (e.getSource() == moneyExchangeView.getBahtToRielButton()) {
                    moneyExchangeModel.bahtToRiel(amount, history);

                }

                moneyExchangeView.setResultField(moneyExchangeModel.getValue());

            } catch (NumberFormatException next) {
                moneyExchangeView.showError("Bad input: '" + amount +  "'");
            }
        }
    }//end inner class MultiplyListener


    //////////////////////////////////////////// inner class ClearListener
    /**  1. Reset model.
     *   2. Reset View.
     */
    class ClearListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            moneyExchangeModel.reset();
            moneyExchangeView.reset();
        }
    }// end inner class ClearListener
}
