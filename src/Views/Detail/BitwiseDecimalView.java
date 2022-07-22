package Views.Detail;

import Views.Detail.Components.HistoryArea;
import Views.Detail.Components.InputFieldDecimal;
import Views.Detail.Components.OutputArea;
import Views.Detail.Components.TextBubbleBorder;
import Views.Detail.Utils.AppButtons;
import Views.Detail.Utils.AppTexts;
import Views.UserInteract;

import javax.swing.*;
import javax.swing.border.AbstractBorder;

import java.awt.*;
import java.awt.event.ActionListener;

public class BitwiseDecimalView extends Component implements UserInteract {
    //... Constants
    private static final String INITIAL_VALUE = "";

    //... create object
    private final AppTexts appTexts = new AppTexts();
    private final AppButtons appButtons = new AppButtons();
    private final InputFieldDecimal inputFieldDecimal = new InputFieldDecimal();
    private final OutputArea outputArea = new OutputArea();
    private final HistoryArea historyArea = new HistoryArea();

    //... name of new object
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

    //======================================================= components
    public JPanel input() {
        //main panel
        JPanel generatorPanel = new JPanel(new GridBagLayout());

        //set border to radius
        AbstractBorder border = new TextBubbleBorder(Color.WHITE, 0, 15, 0);

        //custom rectangle
        generatorPanel.setBackground(Color.WHITE);
        generatorPanel.setBorder(border);

        //create grid custom object
        GridBagConstraints c = new GridBagConstraints();

        //view

        //A part
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 1;
        c.weighty = 1;
        c.gridx = 0;
        c.gridy = 0;
        generatorPanel.add(appTexts.mediumText("A:"), c);

        JScrollPane areaScrollPaneA = new JScrollPane(a);
        areaScrollPaneA.setBorder(BorderFactory.createEmptyBorder());

        //TextField part
        c.gridx = 1;
        c.gridy = 0;
        c.ipadx = 120;
        c.ipady = 60;
        generatorPanel.add(areaScrollPaneA, c);

        //B part
        c.insets = new Insets(15,0,0,0);
        c.gridx = 0;
        c.gridy = 1;
        c.ipadx = 0;
        c.ipady = 0;
        generatorPanel.add(appTexts.mediumText("B:"), c);

        JScrollPane areaScrollPaneB = new JScrollPane(b);
        areaScrollPaneB.setBorder(BorderFactory.createEmptyBorder());

        //TextField part
        c.gridx = 1;
        c.gridy = 1;
        c.ipadx = 120;
        c.ipady = 60;
        generatorPanel.add(areaScrollPaneB, c);

        return generatorPanel;
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
        operatorPanel.add(bitwiseANDButton, c);

        //Subtraction
        c.gridx = 1;
        c.gridy = 0;
        operatorPanel.add(bitwiseORButton, c);

        //Multiplication
        c.gridx = 0;
        c.gridy = 1;
        operatorPanel.add(bitwiseXORButton, c);

        //Division
        c.gridx = 1;
        c.gridy = 1;
        operatorPanel.add(bitwiseLeftShiftButton, c);

        //Modulo
        c.gridx = 0;
        c.gridy = 2;
        operatorPanel.add(bitwiseRightShiftButton, c);

        c.gridx = 1;
        c.gridy = 2;
        operatorPanel.add(bitwiseInversionButton, c);

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
    public void addBitwiseDecimalListener(ActionListener button) {
        bitwiseANDButton.addActionListener(button);
        bitwiseORButton.addActionListener(button);
        bitwiseXORButton.addActionListener(button);
        bitwiseLeftShiftButton.addActionListener(button);
        bitwiseRightShiftButton.addActionListener(button);
        bitwiseInversionButton.addActionListener(button);
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
