package Views.Widgets;

import Controller.ArithmeticCalculation;
import Model.ArithmeticModel;
import Views.Widgets.Components.HistoryArea;
import Views.Widgets.Components.InputFieldDecimal;
import Views.Widgets.Components.OutputArea;
import Views.Widgets.Components.TextBubbleBorder;
import Views.Widgets.Utils.AppButtons;
import Views.Widgets.Utils.AppTexts;

import javax.swing.*;
import javax.swing.border.AbstractBorder;

import java.awt.*;

public class ArithmeticWidgets{
    //create object
    AppTexts appTexts = new AppTexts();
    AppButtons appButtons = new AppButtons();
    InputFieldDecimal inputFieldDecimal = new InputFieldDecimal();
    OutputArea outputArea = new OutputArea();
    HistoryArea historyArea = new HistoryArea();
    ArithmeticWidgets arithmeticWidgets = new ArithmeticWidgets();
    ArithmeticModel arithmeticModel = new ArithmeticModel();
    ArithmeticCalculation arithmeticCalculation = new ArithmeticCalculation(arithmeticModel, arithmeticWidgets);

    //name of new object
    JTextField a = inputFieldDecimal.inputField();
    JTextField b = inputFieldDecimal.inputField();
    JTextArea resultField = outputArea.outputArea();
    JTextArea historyField = historyArea.historyArea();
    JButton additionButton = appButtons.additionButton();
    JButton subtractionButton = appButtons.subtractionButton();
    JButton multiplicationButton = appButtons.multiplicationButton();
    JButton divisionButton = appButtons.divisionButton();
    JButton moduloButton = appButtons.moduloButton();
    JButton resetButton = appButtons.clearButton();

    public JPanel arithmeticInput() {
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

    public JPanel arithmeticOperator() {
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

        //Multiplication
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 1;
        operatorPanel.add(multiplicationButton, c);

        //Division
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 1;
        operatorPanel.add(divisionButton, c);

        //Modulo
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 2;
        operatorPanel.add(moduloButton, c);

        return operatorPanel;
    }

    public JPanel arithmeticOutput() {
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

    public JPanel arithmeticHistory() {

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
        arithmeticCalculation.additionResult(additionButton, a, b, resultField, historyField);
        arithmeticCalculation.subtractionResult(subtractionButton, a, b, resultField, historyField);
        arithmeticCalculation.multiplicationResult(multiplicationButton, a, b, resultField, historyField);
        arithmeticCalculation.divisionResult(divisionButton, a, b, resultField, historyField);
        arithmeticCalculation.moduloResult(moduloButton, a, b, resultField, historyField);

        return historyPanel;
    }

    public JButton arithmeticReset(){
        arithmeticCalculation.performReset(resetButton, a, b, resultField, historyField);
        return resetButton;
    }

}
