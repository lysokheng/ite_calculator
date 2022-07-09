package Views.Widgets;

import Views.Widgets.Components.*;
import Views.Widgets.Utils.AppButtons;
import Views.Widgets.Utils.AppTexts;

import javax.swing.*;
import javax.swing.border.AbstractBorder;

import java.awt.*;
import java.awt.event.ActionListener;

public class BinaryArithmeticView extends Component {
    //... Constants
    private static final String INITIAL_VALUE = "";

    //... create object
    private final AppTexts appTexts = new AppTexts();
    private final AppButtons appButtons = new AppButtons();
    private final InputFieldBinary inputFieldBinary = new InputFieldBinary();
    private final OutputArea outputArea = new OutputArea();
    private final HistoryArea historyArea = new HistoryArea();

    //... name of new object
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

    //======================================================= components
    public JPanel input() {
        //main panel
        JPanel generatorPanel = new JPanel(new GridBagLayout());

        //set border to radius
        AbstractBorder border = new TextBubbleBorder(Color.WHITE, 0, 30, 0);

        //custom rectangle
        generatorPanel.setBackground(Color.WHITE);
        generatorPanel.setBorder(border);

        //create grid custom object
        GridBagConstraints c = new GridBagConstraints();

        //view

        //A part
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 0;
        c.ipadx = 0;
        generatorPanel.add(appTexts.mediumText("A:"), c);

        //TextField part
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 0;
        c.ipadx = 100;
        generatorPanel.add(a, c);

        //B part
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(15,0,0,0);
        c.gridx = 0;
        c.gridy = 1;
        c.ipadx = 0;
        generatorPanel.add(appTexts.mediumText("B:"), c);

        //TextField part
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 1;
        c.ipadx = 100;
        generatorPanel.add(b, c);

        return generatorPanel;
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

        //Addition
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(0, 0, 0, 0);
        c.gridx = 0;
        c.gridy = 0;
        operatorPanel.add(additionButton, c);

        //Subtraction
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 0;
        operatorPanel.add(subtractionButton, c);

        //additionWith2NdComplementButton
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 1;
        operatorPanel.add(additionWith2NdComplementButton, c);

        //subtractionWith2NdComplementButton
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 1;
        operatorPanel.add(subtractionWith2NdComplementButton, c);

        //multiplyButton
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 2;
        operatorPanel.add(multiplyButton, c);

        //multiplyButton
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 2;
        operatorPanel.add(divideButton, c);

        return operatorPanel;
    }
    public JPanel output() {
        //main panel
        JPanel outputPanel = new JPanel(new GridBagLayout());

        //set border to radius
        AbstractBorder border = new TextBubbleBorder(Color.WHITE, 0, 30, 0);

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
        outputPanel.add(appTexts.mediumText("Result"), c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(15,0,0,0);
        c.gridx = 0;
        c.gridy = 1;
        c.ipadx = 160;
        c.ipady = 60;
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
        c.ipadx = 400;
        c.ipady = 340;
        historyPanel.add(areaScrollPane, c);

        return historyPanel;
    }

    //======================================================= add button to controller
    public void addArithmeticListener(ActionListener button) {
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

    //======================================================= additional method
    public void reset(){
        resultField.setText(INITIAL_VALUE);
        a.setText("");
        b.setText("");
        historyField.setText("");
    }
    public void showError(String errMessage) {
        JOptionPane.showMessageDialog(this, errMessage);
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
