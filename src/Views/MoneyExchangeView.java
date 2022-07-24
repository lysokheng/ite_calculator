package Views;

import Views.Components.*;
import Views.Utils.AppButtons;
import Views.Utils.AppColors;
import Views.Utils.AppTexts;
import Screen.UserInteract;

import javax.swing.*;
import javax.swing.border.AbstractBorder;

import java.awt.*;
import java.awt.event.ActionListener;

public class MoneyExchangeView extends DetailLayout implements UserInteract {
    //... Constants
    private static final String INITIAL_VALUE = "";

    //... create object
    private final AppTexts appTexts = new AppTexts();
    private final AppButtons appButtons = new AppButtons();
    private final InputFieldDecimal inputFieldDecimal = new InputFieldDecimal();
    private final OutputArea outputArea = new OutputArea();
    private final HistoryArea historyArea = new HistoryArea();
    private final AppColors appColors = new AppColors();

    //... name of new object
    private JTextField amount = inputFieldDecimal.inputField();
    private final JTextArea resultField = outputArea.outputArea();
    private JTextArea historyField = historyArea.historyArea();
    private final JButton rielToDollarButton = appButtons.rielToDollarButton();
    private final JButton rielToEuroButton = appButtons.rielToEuroButton();
    private final JButton rielToFranceButton = appButtons.rielToFranceButton();
    private final JButton rielToPoundButton = appButtons.rielToPoundButton();
    private final JButton rielToBahtButton = appButtons.rielToBahtButton();
    private final JButton dollarToRielButton = appButtons.dollarToRielButton();
    private final JButton euroToRielButton = appButtons.euroToRielButton();
    private final JButton franceToRielButton = appButtons.franceToRielButton();
    private final JButton poundToRielButton = appButtons.poundToRielButton();
    private final JButton bahtToRielButton = appButtons.bahtToRielButton();
    private JButton resetButton = appButtons.clearButton();

    //======================================================= components
    public JPanel input() {
        //panel
        JPanel inputPanel = new JPanel(new GridBagLayout());
        MoneyExchangeView moneyExchangeView = new MoneyExchangeView();
        moneyExchangeView.inputAmount(inputPanel, amount);

        return inputPanel;
    }
    public JPanel operator() {
        //Create JPanel
        JPanel operatorPanel = new JPanel(new GridBagLayout());
        operatorPanel.setBackground(Color.WHITE);

        //main
        JPanel mainPanel = new JPanel();
        mainPanel.setBackground(appColors.getBACKGROUND_COLOR());

        //create grid custom object
        GridBagConstraints c = new GridBagConstraints();

        //view

        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(0, 0, 0, 0);
        c.weightx = 1;
        c.weighty = 1 ;
        c.gridx = 0;
        c.gridy = 0;
        operatorPanel.add(rielToDollarButton, c);

        c.gridx = 1;
        c.gridy = 0;
        operatorPanel.add(rielToEuroButton, c);

        c.gridx = 0;
        c.gridy = 1;
        operatorPanel.add(rielToFranceButton, c);

        c.gridx = 1;
        c.gridy = 1;
        operatorPanel.add(rielToPoundButton, c);

        c.gridx = 0;
        c.gridy = 2;
        operatorPanel.add(rielToBahtButton, c);

        c.gridx = 1;
        c.gridy = 2;
        operatorPanel.add(dollarToRielButton, c);

        c.gridx = 0;
        c.gridy = 3;
        operatorPanel.add(euroToRielButton, c);

        c.gridx = 1;
        c.gridy = 3;
        operatorPanel.add(franceToRielButton, c);

        c.gridx = 0;
        c.gridy = 4;
        operatorPanel.add(bahtToRielButton, c);

        JScrollPane areaScrollPane = new JScrollPane(operatorPanel);

        //set border to radius
        AbstractBorder border = new TextBubbleBorder(Color.WHITE, 0, 15, 0);

        areaScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        areaScrollPane.setPreferredSize(new Dimension(400, 300));
        areaScrollPane.setBorder(BorderFactory.createEmptyBorder());
        areaScrollPane.getVerticalScrollBar().setUnitIncrement(6);
        areaScrollPane.setBorder(border);

        mainPanel.add(areaScrollPane, BorderLayout.CENTER);

        return mainPanel;
    }
    public JPanel output() {
        //panel
        JPanel outputPanel = new JPanel(new GridBagLayout());
        MoneyExchangeView moneyExchangeView = new MoneyExchangeView();
        moneyExchangeView.output(outputPanel, resultField);

        return outputPanel;
    }
    public JPanel history() {

        //panel
        JPanel historyPanel = new JPanel(new GridBagLayout());
        MoneyExchangeView moneyExchangeView = new MoneyExchangeView();
        moneyExchangeView.history(historyPanel, historyField);

        return historyPanel;
    }

    //======================================================= add button to controller
    public void addButtonListener(ActionListener button) {
        rielToDollarButton.addActionListener(button);
        rielToEuroButton.addActionListener(button);
        rielToFranceButton.addActionListener(button);
        rielToPoundButton.addActionListener(button);
        rielToBahtButton.addActionListener(button);
        dollarToRielButton.addActionListener(button);
        euroToRielButton.addActionListener(button);
        franceToRielButton.addActionListener(button);
        poundToRielButton.addActionListener(button);
        bahtToRielButton.addActionListener(button);
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

    public JButton getRielToDollarButton() {
        return rielToDollarButton;
    }

    public JButton getRielToEuroButton() {
        return rielToEuroButton;
    }

    public JButton getRielToFranceButton() {
        return rielToFranceButton;
    }

    public JButton getRielToPoundButton() {
        return rielToPoundButton;
    }

    public JButton getRielToBahtButton() {
        return rielToBahtButton;
    }

    public JButton getDollarToRielButton() {
        return dollarToRielButton;
    }

    public JButton getEuroToRielButton() {
        return euroToRielButton;
    }

    public JButton getFranceToRielButton() {
        return franceToRielButton;
    }

    public JButton getPoundToRielButton() {
        return poundToRielButton;
    }

    public JButton getBahtToRielButton() {
        return bahtToRielButton;
    }

    public JButton getResetButton() {
        return resetButton;
    }

    public void setResetButton(JButton resetButton) {
        this.resetButton = resetButton;
    }
}
