package Views.Widgets.NumberSystemConversionWidgets;

import Controller.NumberSystemConversionCalculation.NumberSystemConversionDecimalCalculation;
import Views.Widgets.Components.HistoryArea;
import Views.Widgets.Components.InputFieldDecimal;
import Views.Widgets.Components.OutputArea;
import Views.Widgets.Components.TextBubbleBorder;
import Views.Widgets.Utils.AppButtons;
import Views.Widgets.Utils.AppColors;
import Views.Widgets.Utils.AppTexts;

import javax.swing.*;
import javax.swing.border.AbstractBorder;

import java.awt.*;

public class NumberSystemConversionDecimalWidgets {
    //create object
    AppTexts appTexts = new AppTexts();
    AppButtons appButtons = new AppButtons();
    InputFieldDecimal inputFieldDecimal = new InputFieldDecimal();
    OutputArea outputArea = new OutputArea();
    HistoryArea historyArea = new HistoryArea();
    AppColors appColors = new AppColors();
    NumberSystemConversionDecimalCalculation numberSystemConversionDecimalCalculation = new NumberSystemConversionDecimalCalculation();

    //name of new object
    JTextField amount = inputFieldDecimal.inputField();
    JTextArea resultField = outputArea.outputArea();
    JTextArea historyField = historyArea.historyArea();
    JButton decimalToBinaryButton = appButtons.decimalToBinaryButton();
    JButton decimalToHexadecimalButton = appButtons.decimalToHexadecimalButton();
    JButton decimalToOctalButton = appButtons.decimalToOctalButton();
    JButton binaryToDecimalButton = appButtons.binaryToDecimalButton();
    JButton binaryToHexadecimalButton = appButtons.binaryToHexadecimalButton();
    JButton binaryToOctalButton = appButtons.binaryToOctalButton();
    JButton octalToDecimalButton = appButtons.octalToDecimalButton();
    JButton octalToBinaryButton = appButtons.octalToBinaryButton();
    JButton octalToHexadecimalButton = appButtons.octalToHexadecimalButton();
    JButton hexadecimalToDecimalButton = appButtons.hexadecimalToDecimalButton();
    JButton hexadecimalToBinaryButton = appButtons.hexadecimalToBinaryButton();
    JButton hexadecimalToOctalButton = appButtons.hexadecimalToOctalButton();
    JButton resetButton = appButtons.clearButton();


    public JPanel numberSystemConversionInput() {
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

        //Amount part
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 0;
        c.ipadx = 0;
        generatorPanel.add(appTexts.mediumText("Amount:"), c);

        //TextField part
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(15,0,0,0);
        c.gridx = 0;
        c.gridy = 1;
        generatorPanel.add(amount, c);

        return generatorPanel;
    }

    public JPanel numberSystemConversionOperator() {
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

        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(0, 0, 0, 0);
        c.gridx = 0;
        c.gridy = 0;
        operatorPanel.add(decimalToBinaryButton, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 0;
        operatorPanel.add(decimalToHexadecimalButton, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 1;
        operatorPanel.add(decimalToOctalButton, c);

        return operatorPanel;
    }

    public JPanel numberSystemConversionOutput() {
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
        c.ipadx = 0;
        outputPanel.add(appTexts.mediumText("Result"), c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(15,0,0,0);
        c.gridx = 0;
        c.gridy = 1;
        outputPanel.add(resultField, c);

        return outputPanel;
    }

    public JPanel numberSystemConversionHistory() {

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
        numberSystemConversionDecimalCalculation.dec2BinaryResult(decimalToBinaryButton, amount, resultField, historyField);
        numberSystemConversionDecimalCalculation.dec2HexaResult(decimalToHexadecimalButton, amount, resultField, historyField);
        numberSystemConversionDecimalCalculation.dec2OctalResult(decimalToOctalButton, amount, resultField, historyField);

        return historyPanel;
    }

    public JButton numberSystemConversionReset(){
        numberSystemConversionDecimalCalculation.performReset(resetButton, amount, resultField, historyField);
        return resetButton;
    }
}
