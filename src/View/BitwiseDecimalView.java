package View;

import View.Components.*;
import View.Utils.AppButtons;

import javax.swing.*;
import javax.swing.border.AbstractBorder;
import java.awt.*;
import java.awt.event.ActionListener;

public class BitwiseDecimalView extends DetailLayout {
    // ... Constants
    private static final String INITIAL_VALUE = "";

    // ... create object
    private final AppButtons appButtons = new AppButtons();
    private final InputFieldDecimal inputFieldDecimal = new InputFieldDecimal();
    private final OutputArea outputArea = new OutputArea();
    private final HistoryArea historyArea = new HistoryArea();

    // ... name of new object
    private JTextField a = inputFieldDecimal.inputField();
    private JTextField b = inputFieldDecimal.inputField();
    private JTextArea resultField = outputArea.outputArea();
    private JTextArea historyField = historyArea.historyArea();
    private final JButton bitwiseANDButton = appButtons.bitwiseANDButton();
    private final JButton bitwiseORButton = appButtons.bitwiseORButton();
    private final JButton bitwiseXORButton = appButtons.bitwiseXORButton();
    private final JButton bitwiseLeftShiftButton = appButtons.bitwiseLeftShiftButton();
    private final JButton bitwiseRightShiftButton = appButtons.bitwiseRightShiftButton();
    private final JButton bitwiseInversionButton = appButtons.bitwiseInversionButton();
    private JButton resetButton = appButtons.clearButton();

    // ======================================================= components
    public JPanel input() {
        // panel
        JPanel inputPanel = new JPanel(new GridBagLayout());
        BitwiseDecimalView bitwiseDecimalView = new BitwiseDecimalView();
        bitwiseDecimalView.inputAB(inputPanel, a, b);

        return inputPanel;
    }

    public JPanel operator() {
        // main panel
        JPanel operatorPanel = new JPanel(new GridBagLayout());

        // set border to radius
        AbstractBorder border = new TextBubbleBorder(Color.WHITE, 0, 15, 0);

        // custom rectangle
        operatorPanel.setBackground(Color.WHITE);
        operatorPanel.setBorder(border);

        // create grid custom object
        GridBagConstraints c = new GridBagConstraints();

        // view

        // Addition
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(0, 0, 0, 0);
        c.weightx = 1;
        c.weighty = 1;
        c.gridx = 0;
        c.gridy = 0;
        operatorPanel.add(bitwiseANDButton, c);

        // Subtraction
        c.gridx = 1;
        c.gridy = 0;
        operatorPanel.add(bitwiseORButton, c);

        // Multiplication
        c.gridx = 0;
        c.gridy = 1;
        operatorPanel.add(bitwiseXORButton, c);

        // Division
        c.gridx = 1;
        c.gridy = 1;
        operatorPanel.add(bitwiseLeftShiftButton, c);

        // Modulo
        c.gridx = 0;
        c.gridy = 2;
        operatorPanel.add(bitwiseRightShiftButton, c);

        c.gridx = 1;
        c.gridy = 2;
        operatorPanel.add(bitwiseInversionButton, c);

        return operatorPanel;
    }

    public JPanel output() {
        // panel
        JPanel outputPanel = new JPanel(new GridBagLayout());
        BitwiseDecimalView bitwiseDecimalView = new BitwiseDecimalView();
        bitwiseDecimalView.output(outputPanel, resultField);

        return outputPanel;
    }

    public JPanel history() {

        // panel
        JPanel historyPanel = new JPanel(new GridBagLayout());
        BitwiseDecimalView bitwiseDecimalView = new BitwiseDecimalView();
        bitwiseDecimalView.history(historyPanel, historyField);

        return historyPanel;
    }

    // ======================================================= add button to
    // controller
    public void addButtonListener(ActionListener button) {
        bitwiseANDButton.addActionListener(button);
        bitwiseORButton.addActionListener(button);
        bitwiseXORButton.addActionListener(button);
        bitwiseLeftShiftButton.addActionListener(button);
        bitwiseRightShiftButton.addActionListener(button);
        bitwiseInversionButton.addActionListener(button);
    }
    
    public void resetAB() {
        a.setText("");
        b.setText("");
    }

    public void addClearListener(ActionListener button) {
        resetButton.addActionListener(button);
    }

    // ======================================================= additional method
    public void reset() {
        resultField.setText(INITIAL_VALUE);
        a.setText("");
        b.setText("");
        historyField.setText("");
    }

    public void showError(String errMessage, String title) {
        JOptionPane.showMessageDialog(null, errMessage, title, JOptionPane.ERROR_MESSAGE);
    }

    // ======================================================= getter and setter
    // methods
    public String getA() {
        return a.getText();
    }

    public void setA(JTextField a) {
        this.a = a;
    }

    public String getB() {
        return b.getText();
    }

    public void setB(JTextField b) {
        this.b = b;
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

    public JButton getBitwiseANDButton() {
        return bitwiseANDButton;
    }

    public JButton getBitwiseORButton() {
        return bitwiseORButton;
    }

    public JButton getBitwiseXORButton() {
        return bitwiseXORButton;
    }

    public JButton getBitwiseLeftShiftButton() {
        return bitwiseLeftShiftButton;
    }

    public JButton getBitwiseRightShiftButton() {
        return bitwiseRightShiftButton;
    }

    public JButton getBitwiseInversionButton() {
        return bitwiseInversionButton;
    }

    public JButton getResetButton() {
        return resetButton;
    }

    public void setResetButton(JButton resetButton) {
        this.resetButton = resetButton;
    }

}
