package Views.Widgets;

import Controller.BitwiseDecimalController;
import Views.Widgets.Components.HistoryArea;
import Views.Widgets.Components.InputFieldDecimal;
import Views.Widgets.Components.OutputArea;
import Views.Widgets.Components.TextBubbleBorder;
import Views.Widgets.Utils.AppButtons;
import Views.Widgets.Utils.AppTexts;

import javax.swing.*;
import javax.swing.border.AbstractBorder;

import java.awt.*;
import java.awt.event.ActionListener;

public class BitwiseDecimalView extends Component {
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

        //bitwiseANDButton
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(0, 0, 0, 0);
        c.gridx = 0;
        c.gridy = 0;
        operatorPanel.add(bitwiseANDButton, c);

        //bitwiseORButton
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 0;
        operatorPanel.add(bitwiseORButton, c);

        //bitwiseXORButton
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 1;
        operatorPanel.add(bitwiseXORButton, c);

        //bitwiseLeftShiftButton
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 1;
        operatorPanel.add(bitwiseLeftShiftButton, c);

        //bitwiseRightShiftButton
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 2;
        operatorPanel.add(bitwiseRightShiftButton, c);

        //bitwiseInversionButton
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 2;
        operatorPanel.add(bitwiseInversionButton, c);

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
