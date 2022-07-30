package View;

import View.Components.*;
import View.Utils.AppButtons;

import javax.swing.*;
import javax.swing.border.AbstractBorder;
import java.awt.*;
import java.awt.event.ActionListener;

public class NSCDecimalView extends DetailLayout {
    // ... Constants
    private static final String INITIAL_VALUE = "";

    // ... create object
    private final AppButtons appButtons = new AppButtons();
    private final InputFieldDecimal inputFieldDecimal = new InputFieldDecimal();
    private final OutputArea outputArea = new OutputArea();
    private final HistoryArea historyArea = new HistoryArea();

    // ... name of new object
    private JTextField amount = inputFieldDecimal.inputField();
    private final JTextArea resultField = outputArea.outputArea();
    private JTextArea historyField = historyArea.historyArea();
    private final JButton decimalToBinaryButton = appButtons.decimalToBinaryButton();
    private final JButton decimalToHexadecimalButton = appButtons.decimalToHexadecimalButton();
    private final JButton decimalToOctalButton = appButtons.decimalToOctalButton();
    private JButton resetButton = appButtons.clearButton();

    // ======================================================= components
    public JPanel input() {
        // panel
        JPanel inputPanel = new JPanel(new GridBagLayout());
        NSCDecimalView nscDecimalView = new NSCDecimalView();
        nscDecimalView.inputAmount(inputPanel, amount);

        return inputPanel;
    }

    public JPanel operator() {
        // main panel
        JPanel operatorPanel = new JPanel(new GridBagLayout());

        // set border to radius
        AbstractBorder border = new TextBubbleBorder(Color.WHITE, 0, 30, 0);

        // custom rectangle
        operatorPanel.setBackground(Color.WHITE);
        operatorPanel.setBorder(border);

        // create grid custom object
        GridBagConstraints c = new GridBagConstraints();

        // view

        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(0, 0, 0, 0);
        c.weightx = 1;
        c.weighty = 1;
        c.gridx = 0;
        c.gridy = 0;
        operatorPanel.add(decimalToBinaryButton, c);

        c.gridx = 1;
        c.gridy = 0;
        operatorPanel.add(decimalToHexadecimalButton, c);

        c.gridx = 0;
        c.gridy = 1;
        operatorPanel.add(decimalToOctalButton, c);

        return operatorPanel;
    }

    public JPanel output() {
        // main panel
        JPanel outputPanel = new JPanel(new GridBagLayout());
        NSCDecimalView nscDecimalView = new NSCDecimalView();
        nscDecimalView.output(outputPanel, resultField);

        return outputPanel;
    }

    public JPanel history() {

        // main panel
        JPanel historyPanel = new JPanel(new GridBagLayout());
        NSCDecimalView nscDecimalView = new NSCDecimalView();
        nscDecimalView.history(historyPanel, historyField);

        return historyPanel;
    }

    // ======================================================= add button to
    // controller
    public void addButtonListener(ActionListener button) {
        decimalToBinaryButton.addActionListener(button);
        decimalToHexadecimalButton.addActionListener(button);
        decimalToOctalButton.addActionListener(button);
    }

    public void addClearListener(ActionListener button) {
        resetButton.addActionListener(button);
    }

    // ======================================================= additional method
    public void reset() {
        resultField.setText(INITIAL_VALUE);
        amount.setText("");
        historyField.setText("");
    }

    public void showError(String errMessage, String title) {
        JOptionPane.showMessageDialog(null, errMessage, title, JOptionPane.ERROR_MESSAGE);
    }

    // ======================================================= getter and setter
    // methods
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

    public JButton getDecimalToBinaryButton() {
        return decimalToBinaryButton;
    }

    public JButton getDecimalToHexadecimalButton() {
        return decimalToHexadecimalButton;
    }

    public JButton getDecimalToOctalButton() {
        return decimalToOctalButton;
    }

    public JButton getResetButton() {
        return resetButton;
    }

    public void setResetButton(JButton resetButton) {
        this.resetButton = resetButton;
    }
}
