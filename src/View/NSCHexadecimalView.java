package View;

import View.Components.*;
import View.Utils.AppButtons;

import javax.swing.*;
import javax.swing.border.AbstractBorder;
import java.awt.*;
import java.awt.event.ActionListener;

public class NSCHexadecimalView extends DetailLayout {
    // ... Constants
    private static final String INITIAL_VALUE = "";

    // ... create object
    private final AppButtons appButtons = new AppButtons();
    private final InputFieldHexadecimal inputFieldHexadecimal = new InputFieldHexadecimal();
    private final OutputArea outputArea = new OutputArea();
    private final HistoryArea historyArea = new HistoryArea();

    // ... name of new object
    private JTextField amount = inputFieldHexadecimal.inputField();
    private final JTextArea resultField = outputArea.outputArea();
    private JTextArea historyField = historyArea.historyArea();
    private final JButton hexadecimalToDecimalButton = appButtons.hexadecimalToDecimalButton();
    private final JButton hexadecimalToBinaryButton = appButtons.hexadecimalToBinaryButton();
    private final JButton hexadecimalToOctalButton = appButtons.hexadecimalToOctalButton();
    private JButton resetButton = appButtons.clearButton();

    // ======================================================= components
    public JPanel input() {
        // panel
        JPanel inputPanel = new JPanel(new GridBagLayout());
        NSCHexadecimalView nscHexadecimalView = new NSCHexadecimalView();
        nscHexadecimalView.inputAmount(inputPanel, amount);

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
        operatorPanel.add(hexadecimalToDecimalButton, c);

        c.gridx = 1;
        c.gridy = 0;
        operatorPanel.add(hexadecimalToBinaryButton, c);

        c.gridx = 0;
        c.gridy = 1;
        operatorPanel.add(hexadecimalToOctalButton, c);

        return operatorPanel;
    }

    public JPanel output() {
        // panel
        JPanel outputPanel = new JPanel(new GridBagLayout());
        NSCHexadecimalView nscHexadecimalView = new NSCHexadecimalView();
        nscHexadecimalView.output(outputPanel, resultField);

        return outputPanel;
    }

    public JPanel history() {

        // panel
        JPanel historyPanel = new JPanel(new GridBagLayout());
        NSCHexadecimalView nscHexadecimalView = new NSCHexadecimalView();
        nscHexadecimalView.history(historyPanel, historyField);

        return historyPanel;
    }

    // ======================================================= add button to
    // controller
    public void addButtonListener(ActionListener button) {
        hexadecimalToDecimalButton.addActionListener(button);
        hexadecimalToBinaryButton.addActionListener(button);
        hexadecimalToOctalButton.addActionListener(button);
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

    public void resetAmount() {
        amount.setText("");
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

    public JButton getHexadecimalToDecimalButton() {
        return hexadecimalToDecimalButton;
    }

    public JButton getHexadecimalToBinaryButton() {
        return hexadecimalToBinaryButton;
    }

    public JButton getHexadecimalToOctalButton() {
        return hexadecimalToOctalButton;
    }

    public JButton getResetButton() {
        return resetButton;
    }

    public void setResetButton(JButton resetButton) {
        this.resetButton = resetButton;
    }
}
