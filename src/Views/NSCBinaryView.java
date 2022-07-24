package Views;

import Views.Components.*;
import Views.Utils.AppButtons;
import Views.Utils.AppTexts;
import Screen.UserInteract;

import javax.swing.*;
import javax.swing.border.AbstractBorder;
import java.awt.*;
import java.awt.event.ActionListener;

public class NSCBinaryView extends DetailLayout implements UserInteract {
    //... Constants
    private static final String INITIAL_VALUE = "";

    //... create object
    private final AppTexts appTexts = new AppTexts();
    private final AppButtons appButtons = new AppButtons();
    private final InputFieldBinary inputFieldBinary = new InputFieldBinary();
    private final OutputArea outputArea = new OutputArea();
    private final HistoryArea historyArea = new HistoryArea();

    //... name of new object
    private JTextField amount = inputFieldBinary.inputField();
    private final JTextArea resultField = outputArea.outputArea();
    private JTextArea historyField = historyArea.historyArea();
    private final JButton binaryToDecimalButton = appButtons.binaryToDecimalButton();
    private final JButton binaryToHexadecimalButton = appButtons.binaryToHexadecimalButton();
    private final JButton binaryToOctalButton = appButtons.binaryToOctalButton();
    private JButton resetButton = appButtons.clearButton();

    //======================================================= components
    public JPanel input() {
        //panel
        JPanel inputPanel = new JPanel(new GridBagLayout());
        NSCBinaryView nscBinaryView = new NSCBinaryView();
        nscBinaryView.inputAmount(inputPanel, amount);

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
        operatorPanel.add(binaryToDecimalButton, c);

        c.gridx = 1;
        c.gridy = 0;
        operatorPanel.add(binaryToHexadecimalButton, c);

        c.gridx = 0;
        c.gridy = 1;
        operatorPanel.add(binaryToOctalButton, c);

        return operatorPanel;
    }
    public JPanel output() {
        //panel
        JPanel outputPanel = new JPanel(new GridBagLayout());
        NSCBinaryView nscBinaryView = new NSCBinaryView();
        nscBinaryView.output(outputPanel, resultField);

        return outputPanel;
    }
    public JPanel history() {

        //panel
        JPanel historyPanel = new JPanel(new GridBagLayout());
        NSCBinaryView nscBinaryView = new NSCBinaryView();
        nscBinaryView.history(historyPanel, historyField);

        return historyPanel;
    }

    //======================================================= add button to controller
    public void addButtonListener(ActionListener button) {
        binaryToDecimalButton.addActionListener(button);
        binaryToHexadecimalButton.addActionListener(button);
        binaryToOctalButton.addActionListener(button);
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

    public JButton getBinaryToDecimalButton() {
        return binaryToDecimalButton;
    }

    public JButton getBinaryToHexadecimalButton() {
        return binaryToHexadecimalButton;
    }

    public JButton getBinaryToOctalButton() {
        return binaryToOctalButton;
    }

    public JButton getResetButton() {
        return resetButton;
    }

    public void setResetButton(JButton resetButton) {
        this.resetButton = resetButton;
    }
}
