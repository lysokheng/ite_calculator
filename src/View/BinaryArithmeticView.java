package View;

import View.Components.*;
import View.Utils.AppButtons;

import javax.swing.*;
import javax.swing.border.AbstractBorder;
import java.awt.*;
import java.awt.event.ActionListener;

public class BinaryArithmeticView extends DetailLayout {
    // ... Constants
    private static final String INITIAL_VALUE = "";

    // ... create object
    private final AppButtons appButtons = new AppButtons();
    private final InputFieldBinary inputFieldBinary = new InputFieldBinary();
    private final OutputArea outputArea = new OutputArea();
    private final HistoryArea historyArea = new HistoryArea();

    // ... name of new object
    private JTextField a = inputFieldBinary.inputField();
    private JTextField b = inputFieldBinary.inputField();
    private final JTextArea resultField = outputArea.outputArea();
    private JTextArea historyField = historyArea.historyArea();
    private final JButton additionButton = appButtons.additionButton();
    private final JButton subtractionButton = appButtons.subtractionButton();
    private final JButton additionWith2NdComplementButton = appButtons.additionWith2NdComplementButton();
    private final JButton subtractionWith2NdComplementButton = appButtons.subtractionWith2NdComplementButton();
    private final JButton multiplyButton = appButtons.multiplyButton();
    private final JButton divideButton = appButtons.divideButton();
    private JButton resetButton = appButtons.clearButton();

    // ======================================================= components
    public JPanel input() {
        // panel
        JPanel inputPanel = new JPanel(new GridBagLayout());
        BinaryArithmeticView binaryArithmeticView = new BinaryArithmeticView();
        binaryArithmeticView.inputAB(inputPanel, a, b);

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
        operatorPanel.add(additionButton, c);

        // Subtraction
        c.gridx = 1;
        c.gridy = 0;
        operatorPanel.add(subtractionButton, c);

        // additionWith2NdComplementButton
        c.gridx = 0;
        c.gridy = 1;
        operatorPanel.add(additionWith2NdComplementButton, c);

        // subtractionWith2NdComplementButton
        c.gridx = 1;
        c.gridy = 1;
        operatorPanel.add(subtractionWith2NdComplementButton, c);

        // multiplyButton
        c.gridx = 0;
        c.gridy = 2;
        operatorPanel.add(multiplyButton, c);

        // divideButton
        c.gridx = 1;
        c.gridy = 2;
        operatorPanel.add(divideButton, c);

        return operatorPanel;
    }

    public JPanel output() {
        // panel
        JPanel outputPanel = new JPanel(new GridBagLayout());
        BinaryArithmeticView binaryArithmeticView = new BinaryArithmeticView();
        binaryArithmeticView.output(outputPanel, resultField);

        return outputPanel;
    }

    public JPanel history() {

        // panel
        JPanel historyPanel = new JPanel(new GridBagLayout());
        BinaryArithmeticView binaryArithmeticView = new BinaryArithmeticView();
        binaryArithmeticView.history(historyPanel, historyField);

        return historyPanel;
    }

    // ======================================================= add button to
    // controller
    public void addButtonListener(ActionListener button) {
        additionButton.addActionListener(button);
        subtractionButton.addActionListener(button);
        additionWith2NdComplementButton.addActionListener(button);
        subtractionWith2NdComplementButton.addActionListener(button);
        multiplyButton.addActionListener(button);
        divideButton.addActionListener(button);
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

    public JButton getAdditionButton() {
        return additionButton;
    }

    public JButton getSubtractionButton() {
        return subtractionButton;
    }

    public JButton getAdditionWith2NdComplementButton() {
        return additionWith2NdComplementButton;
    }

    public JButton getSubtractionWith2NdComplementButton() {
        return subtractionWith2NdComplementButton;
    }

    public JButton getMultiplyButton() {
        return multiplyButton;
    }

    public JButton getDivideButton() {
        return divideButton;
    }

    public JButton getResetButton() {
        return resetButton;
    }

    public void setResetButton(JButton resetButton) {
        this.resetButton = resetButton;
    }

}
