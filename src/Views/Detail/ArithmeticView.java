package Views.Detail;

import Views.Detail.Components.*;
import Views.Detail.Utils.AppButtons;
import Views.Detail.Utils.AppTexts;
import Views.UserInteract;

import javax.swing.*;
import javax.swing.border.AbstractBorder;

import java.awt.*;
import java.awt.event.ActionListener;

public class ArithmeticView extends Component implements UserInteract {
    //... Constants
    private static final String INITIAL_VALUE = "";

    //... create object
    private final AppTexts appTexts = new AppTexts();
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
        JPanel mainPanel = new JPanel(new GridBagLayout());

        //set border to radius
        AbstractBorder border = new TextBubbleBorder(Color.WHITE, 0, 15, 0);

        //custom rectangle
        mainPanel.setBackground(Color.WHITE);
        mainPanel.setBorder(border);

        //create grid custom object
        GridBagConstraints c = new GridBagConstraints();

        //view

        //A part
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 1;
        c.weighty = 1;
        c.gridx = 0;
        c.gridy = 0;
        mainPanel.add(appTexts.mediumText("A:"), c);

        JScrollPane areaScrollPaneA = new JScrollPane(a);
        areaScrollPaneA.setBorder(BorderFactory.createEmptyBorder());

        //TextField part
        c.gridx = 1;
        c.gridy = 0;
        c.ipadx = 120;
        c.ipady = 60;
        mainPanel.add(areaScrollPaneA, c);

        //B part
        c.insets = new Insets(15,0,0,0);
        c.gridx = 0;
        c.gridy = 1;
        c.ipadx = 0;
        c.ipady = 0;
        mainPanel.add(appTexts.mediumText("B:"), c);

        JScrollPane areaScrollPaneB = new JScrollPane(b);
        areaScrollPaneB.setBorder(BorderFactory.createEmptyBorder());

        //TextField part
        c.gridx = 1;
        c.gridy = 1;
        c.ipadx = 120;
        c.ipady = 60;
        mainPanel.add(areaScrollPaneB, c);

        return mainPanel;
    }
    public JPanel operator() {
        //main panel
        JPanel operatorPanel = new JPanel(new GridBagLayout());

        //set border to radius
        AbstractBorder border = new TextBubbleBorder(Color.WHITE, 0, 15, 0);

        //custom rectangle
        operatorPanel.setBackground(Color.WHITE);
        operatorPanel.setBorder(border);

        //create grid custom object
        GridBagConstraints c = new GridBagConstraints();

        //view

        //Addition
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(0, 0, 0, 0);
        c.weightx = 1;
        c.weighty = 1 ;
        c.gridx = 0;
        c.gridy = 0;
        operatorPanel.add(additionButton, c);

        //Subtraction
        c.gridx = 1;
        c.gridy = 0;
        operatorPanel.add(subtractionButton, c);

        //Multiplication
        c.gridx = 0;
        c.gridy = 1;
        operatorPanel.add(multiplicationButton, c);

        //Division
        c.gridx = 1;
        c.gridy = 1;
        operatorPanel.add(divisionButton, c);

        //Modulo
        c.gridx = 0;
        c.gridy = 2;
        operatorPanel.add(moduloButton, c);

        return operatorPanel;
    }
    public JPanel output() {
        //main panel
        JPanel outputPanel = new JPanel(new GridBagLayout());

        //set border to radius
        AbstractBorder border = new TextBubbleBorder(Color.WHITE, 0, 15, 0);

        //custom rectangle
        outputPanel.setBackground(Color.WHITE);
        outputPanel.setBorder(border);

        //create grid custom object
        GridBagConstraints c = new GridBagConstraints();

        //view

        JScrollPane areaScrollPane = new JScrollPane(resultField);

        areaScrollPane.setBorder(BorderFactory.createEmptyBorder());

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 0;
        c.weighty = 1;
        c.weightx = 1;
        c.ipady = 10;
        outputPanel.add(appTexts.mediumText("Result"), c);

        c.insets = new Insets(15,0,0,0);
        c.gridx = 0;
        c.gridy = 1;
        c.ipadx = 120;
        c.ipady = 70;
        outputPanel.add(areaScrollPane, c);

        return outputPanel;
    }
    public JPanel history() {

        //main panel
        JPanel historyPanel = new JPanel(new GridBagLayout());

        //set border to radius
        AbstractBorder border = new TextBubbleBorder(Color.WHITE, 0, 15, 0);

        //custom rectangle
        historyPanel.setBackground(Color.WHITE);
        historyPanel.setBorder(border);

        //create grid custom object
        GridBagConstraints c = new GridBagConstraints();

        //view

        JScrollPane areaScrollPane = new JScrollPane(historyField);

        areaScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        areaScrollPane.setBorder(BorderFactory.createEmptyBorder());
        areaScrollPane.getVerticalScrollBar().setUnitIncrement(6);
        areaScrollPane.setBorder(border);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 0;
        c.ipadx = 360;
        c.ipady = 260;
        historyPanel.add(areaScrollPane, c);

        return historyPanel;
    }

    //======================================================= add button to controller
    public void addArithmeticListener(ActionListener button) {
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
