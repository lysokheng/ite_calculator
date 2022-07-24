package Views;

import Views.Components.*;
import Views.Utils.AppButtons;
import Views.Utils.AppColors;
import Views.Utils.AppTexts;

import javax.swing.*;
import javax.swing.border.AbstractBorder;
import java.awt.*;
import java.awt.event.ActionListener;

public class TrigonometryViews extends DetailLayout implements ViewsInterface {
    //... Constants
    private static final String INITIAL_VALUE = "";

    //... create object
    private final AppTexts appTexts = new AppTexts();
    private final AppButtons appButtons = new AppButtons();
    private final InputFieldDecimalWithDot inputFieldDecimalWithDot = new InputFieldDecimalWithDot();
    private final OutputArea outputArea = new OutputArea();
    private final HistoryArea historyArea = new HistoryArea();
    private final AppColors appColors = new AppColors();

    //... name of new object
    private JTextField amount = inputFieldDecimalWithDot.inputField();
    private final JTextArea resultField = outputArea.outputArea();
    private JTextArea historyField = historyArea.historyArea();
    private final JButton sinToRadianButton = appButtons.sinToRadianButton();
    private final JButton sinToDegreeButton = appButtons.sinToDegreeButton();
    private final JButton cosToRadianButton = appButtons.cosToRadianButton();
    private final JButton cosToDegreeButton = appButtons.cosToDegreeButton();
    private final JButton tanToRadianButton = appButtons.tanToRadianButton();
    private final JButton tanToDegreeButton = appButtons.tanToDegreeButton();
    private final JButton square2InIntegerButton = appButtons.square2InIntegerButton();
    private final JButton square2InFloatingPointButton = appButtons.square2InFloatingPointButton();
    private final JButton square3InIntegerButton = appButtons.square3InIntegerButton();
    private final JButton square3InFloatingPointButton = appButtons.square3InFloatingPointButton();
    private final JButton degreeToRadianButton = appButtons.degreeToRadianButton();

    private JButton resetButton = appButtons.clearButton();

    //======================================================= components
    public JPanel input() {
        //panel
        JPanel inputPanel = new JPanel(new GridBagLayout());
        TrigonometryViews trigonometryView = new TrigonometryViews();
        trigonometryView.inputAmount(inputPanel, amount);

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

        //Addition
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(0, 0, 0, 0);
        c.gridx = 0;
        c.gridy = 0;
        operatorPanel.add(sinToRadianButton, c);

        //Subtraction
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 0;
        operatorPanel.add(sinToDegreeButton, c);

        //Multiplication
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 1;
        operatorPanel.add(cosToRadianButton, c);

        //Division
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 1;
        operatorPanel.add(cosToDegreeButton, c);

        //Modulo
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 2;
        operatorPanel.add(tanToRadianButton, c);

        //Modulo
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 2;
        operatorPanel.add(tanToDegreeButton, c);

        //Modulo
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 2;
        operatorPanel.add(square2InIntegerButton, c);

        //Modulo
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 3;
        operatorPanel.add(square2InFloatingPointButton, c);

        //Modulo
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 3;
        operatorPanel.add(square3InIntegerButton, c);

        //Modulo
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 4;
        operatorPanel.add(square3InFloatingPointButton, c);

        //Modulo
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 4;
        operatorPanel.add(degreeToRadianButton, c);

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
        TrigonometryViews trigonometryView = new TrigonometryViews();
        trigonometryView.output(outputPanel, resultField);

        return outputPanel;
    }
    public JPanel history() {

        //main panel
        JPanel historyPanel = new JPanel(new GridBagLayout());
        TrigonometryViews trigonometryView = new TrigonometryViews();
        trigonometryView.history(historyPanel, historyField);

        return historyPanel;
    }

    //======================================================= add button to controller
    public void addButtonListener(ActionListener button) {
        sinToRadianButton.addActionListener(button);
        sinToDegreeButton.addActionListener(button);
        cosToDegreeButton.addActionListener(button);
        cosToRadianButton.addActionListener(button);
        tanToDegreeButton.addActionListener(button);
        tanToRadianButton.addActionListener(button);
        square2InFloatingPointButton.addActionListener(button);
        square2InIntegerButton.addActionListener(button);
        square3InFloatingPointButton.addActionListener(button);
        square3InIntegerButton.addActionListener(button);
        degreeToRadianButton.addActionListener(button);
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

    public JButton getSinToRadianButton() {
        return sinToRadianButton;
    }

    public JButton getSinToDegreeButton() {
        return sinToDegreeButton;
    }

    public JButton getCosToRadianButton() {
        return cosToRadianButton;
    }

    public JButton getCosToDegreeButton() {
        return cosToDegreeButton;
    }

    public JButton getTanToRadianButton() {
        return tanToRadianButton;
    }

    public JButton getTanToDegreeButton() {
        return tanToDegreeButton;
    }

    public JButton getSquare2InIntegerButton() {
        return square2InIntegerButton;
    }

    public JButton getSquare2InFloatingPointButton() {
        return square2InFloatingPointButton;
    }

    public JButton getSquare3InIntegerButton() {
        return square3InIntegerButton;
    }

    public JButton getSquare3InFloatingPointButton() {
        return square3InFloatingPointButton;
    }

    public JButton getDegreeToRadianButton() {
        return degreeToRadianButton;
    }

    public JButton getResetButton() {
        return resetButton;
    }

    public void setResetButton(JButton resetButton) {
        this.resetButton = resetButton;
    }
}
