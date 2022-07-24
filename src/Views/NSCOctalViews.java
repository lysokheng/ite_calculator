package Views;

import Views.Components.*;
import Views.Utils.AppButtons;
import Views.Utils.AppTexts;

import javax.swing.*;
import javax.swing.border.AbstractBorder;
import java.awt.*;
import java.awt.event.ActionListener;

public class NSCOctalViews extends DetailLayout implements ViewsInterface {
    //... Constants
    private static final String INITIAL_VALUE = "";

    //... create object
    private final AppTexts appTexts = new AppTexts();
    private final AppButtons appButtons = new AppButtons();
    private final InputFieldOctal inputFieldOctal = new InputFieldOctal();
    private final OutputArea outputArea = new OutputArea();
    private final HistoryArea historyArea = new HistoryArea();

    //... name of new object
    private JTextField amount = inputFieldOctal.inputField();
    private final JTextArea resultField = outputArea.outputArea();
    private JTextArea historyField = historyArea.historyArea();
    private final JButton octalToDecimalButton = appButtons.octalToDecimalButton();
    private final JButton octalToBinaryButton = appButtons.octalToBinaryButton();
    private final JButton octalToHexadecimalButton = appButtons.octalToHexadecimalButton();
    private JButton resetButton = appButtons.clearButton();

    //======================================================= components
    public JPanel input() {
        //panel
        JPanel inputPanel = new JPanel(new GridBagLayout());
        NSCOctalViews nscOctalView = new NSCOctalViews();
        nscOctalView.inputAmount(inputPanel, amount);

        return inputPanel;
    }
    public JPanel operator() {
        //main panel
        JPanel operatorPanel = new JPanel(new GridBagLayout());

        //set border to radius
        AbstractBorder border = new TextBubbleBorder(Color.WHITE, 0, 30, 0);

        //custom rectangle
        operatorPanel.setBackground(Color.WHITE);
        operatorPanel.setBorder(border);

        //create grid custom object
        GridBagConstraints c = new GridBagConstraints();

        //view

        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(0, 0, 0, 0);
        c.weightx = 1;
        c.weighty = 1 ;
        c.gridx = 0;
        c.gridy = 0;
        operatorPanel.add(octalToDecimalButton, c);

        c.gridx = 1;
        c.gridy = 0;
        operatorPanel.add(octalToBinaryButton, c);

        c.gridx = 0;
        c.gridy = 1;
        operatorPanel.add(octalToHexadecimalButton, c);

        return operatorPanel;
    }
    public JPanel output() {
        //panel
        JPanel outputPanel = new JPanel(new GridBagLayout());
        NSCOctalViews nscOctalView = new NSCOctalViews();
        nscOctalView.output(outputPanel, resultField);

        return outputPanel;
    }
    public JPanel history() {

        //panel
        JPanel historyPanel = new JPanel(new GridBagLayout());
        NSCOctalViews nscOctalView = new NSCOctalViews();
        nscOctalView.history(historyPanel, historyField);

        return historyPanel;
    }

    //======================================================= add button to controller
    public void addButtonListener(ActionListener button) {
        octalToBinaryButton.addActionListener(button);
        octalToDecimalButton.addActionListener(button);
        octalToHexadecimalButton.addActionListener(button);
    }
    public void addClearListener(ActionListener button) {
        resetButton.addActionListener(button);
    }

    //======================================================= additional method
    public void reset(){
        resultField.setText(INITIAL_VALUE);
        amount.setText("");
        historyField.setText("");
    }
    public void showError(String errMessage) {
        JOptionPane.showMessageDialog(amount, errMessage);
    }

    //======================================================= getter and setter methods
    public String getAmount() {
        return amount.getText();
    }

    public void setAmount(JTextField amount) {
        this.amount = amount;
    }

    public String getResultField() {
        return resultField.toString();
    }

    public JTextArea getHistoryField() {
        return historyField;
    }

    public void setResultField(String newText) {
        resultField.setText(newText);
    }

    public void setHistoryField(JTextArea historyField) {
        this.historyField = historyField;
    }

    public JButton getOctalToDecimalButton() {
        return octalToDecimalButton;
    }

    public JButton getOctalToBinaryButton() {
        return octalToBinaryButton;
    }

    public JButton getOctalToHexadecimalButton() {
        return octalToHexadecimalButton;
    }

    public JButton getResetButton() {
        return resetButton;
    }

    public void setResetButton(JButton resetButton) {
        this.resetButton = resetButton;
    }
}
