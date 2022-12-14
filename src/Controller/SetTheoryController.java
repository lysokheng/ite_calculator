package Controller;

import Model.SetTheoryModel;
import View.SetTheoryView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.InputMismatchException;

public class SetTheoryController {
    // ... The Controller needs to interact with both the Model and View.
    private final SetTheoryModel setTheoryModel;
    private final SetTheoryView setTheoryView;

    // ========================================================== constructor
    /** Constructor */
    public SetTheoryController(SetTheoryModel model, SetTheoryView view) {
        setTheoryModel = model;
        setTheoryView = view;

        // ... Add listeners to the view.
        view.addButtonListener(new SetTheoryListener());
        view.addClearListener(new ClearListener());
    }

    ////////////////////////////////////////// inner class SetTheoryListener
    /**
     * When a calculation is requested.
     * 1. Get the user input number from the View.
     * 2. Call the model to calculate by this number.
     * 3. Get the result from the Model.
     * 4. Tell the View to display the result.
     * If there was an error, tell the View to display it.
     */
    class SetTheoryListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String a = "", b = "";
            JTextArea history;
            try {
                a = setTheoryView.getA();
                b = setTheoryView.getB();
                history = setTheoryView.getHistoryField();

                setTheoryView.resetAB();
                
                if (e.getSource() == setTheoryView.getUnionButton()) {
                    setTheoryModel.union(a, b, history);

                } else if (e.getSource() == setTheoryView.getIntersectionButton()) {
                    setTheoryModel.intersection(a, b, history);

                } else if (e.getSource() == setTheoryView.getDifferenceButton()) {
                    setTheoryModel.difference(a, b, history);

                }

                setTheoryView.setResultField(setTheoryModel.getValue());

            } catch (InputMismatchException next) {
                setTheoryView.showError("A and B must be entered." +
                        "\nA: " + a + "\nB: " + b, "Error");
            }
        }
    }// end inner class SetTheoryListener

    //////////////////////////////////////////// inner class ClearListener
    /**
     * 1. Reset model.
     * 2. Reset View.
     */
    class ClearListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            setTheoryModel.reset();
            setTheoryView.reset();
        }
    }// end inner class ClearListener
}
