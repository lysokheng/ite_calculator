package Views;

import Views.Components.*;
import Views.Utils.AppButtons;
import Screen.UserInteract;

import javax.swing.*;
import javax.swing.border.AbstractBorder;

import java.awt.*;
import java.awt.event.ActionListener;

public class ArithmeticView extends DetailLayout implements UserInteract {
    //... Constants
    private static final String INITIAL_VALUE = "";

    //... create object
    private final AppButtons appButtons = new AppButtons();
    private final InputFieldDecimalWithDot inputFieldDecimalWithDot = new InputFieldDecimalWithDot();
    private final OutputArea outputArea = new OutputArea();
    private final HistoryArea historyArea = new HistoryArea();

    //... name of new object
    private JTextField a = inputFieldDecimalWithDot.inputField();
    private JTextField b = inputFieldDecimalWithDot.inputField();
    private final JTextArea resultField = outputArea.outputArea();
    private JTextArea historyField = historyArea.historyArea();
    private final JButton additionButton = appButtons.additionButton();
    private final JButton subtractionButton = appButtons.subtractionButton();
    private final JButton multiplicationButton = appButtons.multiplicationButton();
    private final JButton divisionButton = appButtons.divisionButton();
    private final JButton moduloButton = appButtons.moduloButton();
    private JButton resetButton = appButtons.clearButton();

    //======================================================= components
    public JPanel input() {
        //main panel
        JPanel inputPanel = new JPanel(new GridBagLayout());
        ArithmeticView arithmeticView = new ArithmeticView();
        arithmeticView.inputAB(inputPanel, a, b);


        return inputPanel;
    }
    public JPanel operator() {
        //panel
        JPanel operatorPanel = new JPanel(new GridBagLayout());

        //set border to radius
        AbstractBorder border = new TextBubbleBorder(Color.WHITE, 0, 15, 0);

        //custom rectangle
        operatorPanel.setBackground(Color.WHITE);
        operatorPanel.setBorder(border);

        //create grid custom object
        GridBagConstraints c = new GridBagConstraints();

        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(0, 0, 0, 0);
        c.weightx = 1;
        c.weighty = 1 ;
        c.gridx = 0;
        c.gridy = 0;
        operatorPanel.add(additionButton, c);

        c.gridx = 1;
        c.gridy = 0;
        operatorPanel.add(subtractionButton, c);

        c.gridx = 0;
        c.gridy = 1;
        operatorPanel.add(multiplicationButton, c);

        c.gridx = 1;
        c.gridy = 1;
        operatorPanel.add(divisionButton, c);

        c.gridx = 0;
        c.gridy = 2;
        operatorPanel.add(moduloButton, c);

        return operatorPanel;
    }
    public JPanel output() {
        //panel
        JPanel outputPanel = new JPanel(new GridBagLayout());
        ArithmeticView arithmeticView = new ArithmeticView();
        arithmeticView.output(outputPanel, resultField);

        return outputPanel;
    }
    public JPanel history() {

        //panel
        JPanel historyPanel = new JPanel(new GridBagLayout());
        ArithmeticView arithmeticView = new ArithmeticView();
        arithmeticView.history(historyPanel, historyField);

        return historyPanel;
    }

    //======================================================= add button to controller
    public void addButtonListener(ActionListener button) {
        additionButton.addActionListener(button);
        subtractionButton.addActionListener(button);
        multiplicationButton.addActionListener(button);
        divisionButton.addActionListener(button);
        moduloButton.addActionListener(button);
    }
    public void addClearListener(ActionListener button) {
        resetButton.addActionListener(button);
    }

    //======================================================= additional method
    public void reset(){
        resultField.setText(INITIAL_VALUE);
        a.setText("");
        b.setText("");
        historyField.setText("");
    }
    public void showError(String errMessage) {
        JOptionPane.showMessageDialog(a, errMessage);
    }

    //======================================================= getter and setter methods
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

    public void setResultField(String newText) {
        resultField.setText(newText);
    }

    public JTextArea getHistoryField() {
        return historyField;
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

    public JButton getMultiplicationButton() {
        return multiplicationButton;
    }

    public JButton getDivisionButton() {
        return divisionButton;
    }

    public JButton getModuloButton() {
        return moduloButton;
    }

    public JButton getResetButton() {
        return resetButton;
    }

    public void setResetButton(JButton resetButton) {
        this.resetButton = resetButton;
    }

}
