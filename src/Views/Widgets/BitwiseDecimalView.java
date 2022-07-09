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

public class BitwiseDecimalView {
    //create object
    AppTexts appTexts = new AppTexts();
    AppButtons appButtons = new AppButtons();
    InputFieldDecimal inputFieldDecimal = new InputFieldDecimal();
    OutputArea outputArea = new OutputArea();
    HistoryArea historyArea = new HistoryArea();
    BitwiseDecimalController bitwiseDecimalController = new BitwiseDecimalController();

    //name of new object
    JTextField a = inputFieldDecimal.inputField();
    JTextField b = inputFieldDecimal.inputField();
    JTextArea resultField = outputArea.outputArea();
    JTextArea historyField = historyArea.historyArea();
    JButton bitwiseANDButton = appButtons.bitwiseANDButton();
    JButton bitwiseORButton = appButtons.bitwiseORButton();
    JButton bitwiseXORButton = appButtons.bitwiseXORButton();
    JButton bitwiseLeftShiftButton = appButtons.bitwiseLeftShiftButton();
    JButton bitwiseRightShiftButton = appButtons.bitwiseRightShiftButton();
    JButton bitwiseInversionButton = appButtons.bitwiseInversionButton();
    JButton resetButton = appButtons.clearButton();

    public JPanel bitwiseInput() {
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

    public JPanel bitwiseOperator() {
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

    public JPanel bitwiseOutput() {
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

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 0;
        outputPanel.add(appTexts.mediumText("Result"), c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(15,0,0,0);
        c.gridx = 0;
        c.gridy = 1;
        outputPanel.add(resultField, c);

        return outputPanel;
    }

    public JPanel bitwiseHistory() {

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

        //perform calculate
        bitwiseDecimalController.bitwiseANDResult(bitwiseANDButton, a, b, resultField, historyField);
        bitwiseDecimalController.bitwiseORResult(bitwiseORButton, a, b, resultField, historyField);
        bitwiseDecimalController.bitwiseXORResult(bitwiseXORButton, a, b, resultField, historyField);
        bitwiseDecimalController.bitwiseLeftShiftResult(bitwiseLeftShiftButton, a, b, resultField, historyField);
        bitwiseDecimalController.bitwiseRightShiftResult(bitwiseRightShiftButton, a, b, resultField, historyField);
        bitwiseDecimalController.bitwiseInversionResult(bitwiseInversionButton, a, resultField, historyField);

        return historyPanel;
    }

    public JButton bitwiseReset(){
        bitwiseDecimalController.performReset(resetButton, a, b, resultField, historyField);
        return resetButton;
    }

}