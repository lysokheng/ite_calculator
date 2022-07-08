package Views.Widgets;

import Controller.MoneyExchangeCalculation;
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

public class MoneyExchangeWidgets{
    //create object
    AppTexts appTexts = new AppTexts();
    AppButtons appButtons = new AppButtons();
    InputFieldDecimal inputFieldDecimal = new InputFieldDecimal();
    OutputArea outputArea = new OutputArea();
    HistoryArea historyArea = new HistoryArea();
    AppColors appColors = new AppColors();
    MoneyExchangeCalculation moneyExchangeCalculation = new MoneyExchangeCalculation();

    //name of new object
    JTextField amount = inputFieldDecimal.inputField();
    JTextArea resultField = outputArea.outputArea();
    JTextArea historyField = historyArea.historyArea();
    JButton rielToDollarButton = appButtons.rielToDollarButton();
    JButton rielToEuroButton = appButtons.rielToEuroButton();
    JButton rielToFranceButton = appButtons.rielToFranceButton();
    JButton rielToPoundButton = appButtons.rielToPoundButton();
    JButton rielToBahtButton = appButtons.rielToBahtButton();
    JButton dollarToRielButton = appButtons.dollarToRielButton();
    JButton euroToRielButton = appButtons.euroToRielButton();
    JButton franceToRielButton = appButtons.franceToRielButton();
    JButton poundToRielButton = appButtons.poundToRielButton();
    JButton bahtToRielButton = appButtons.bahtToRielButton();
    JButton resetButton = appButtons.clearButton();


    public JPanel moneyExchangeInput() {
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
        c.ipadx = 100;
        generatorPanel.add(amount, c);

        return generatorPanel;
    }

    public JPanel moneyExchangeOperator() {
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
        operatorPanel.add(rielToDollarButton, c);

        //Subtraction
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 0;
        operatorPanel.add(rielToEuroButton, c);

        //Multiplication
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 1;
        operatorPanel.add(rielToFranceButton, c);

        //Division
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 1;
        operatorPanel.add(rielToPoundButton, c);

        //Modulo
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 2;
        operatorPanel.add(rielToBahtButton, c);

        //Modulo
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 2;
        operatorPanel.add(rielToBahtButton, c);

        //Modulo
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 2;
        operatorPanel.add(dollarToRielButton, c);

        //Modulo
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 3;
        operatorPanel.add(euroToRielButton, c);

        //Modulo
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 3;
        operatorPanel.add(franceToRielButton, c);

        //Modulo
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 4;
        operatorPanel.add(poundToRielButton, c);

        //Modulo
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 4;
        operatorPanel.add(bahtToRielButton, c);

        JScrollPane areaScrollPane = new JScrollPane(operatorPanel);

        //set border to radius
        AbstractBorder border = new TextBubbleBorder(Color.WHITE, 15, 30, 0);

        areaScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        areaScrollPane.setPreferredSize(new Dimension(520, 440));
        areaScrollPane.setBorder(BorderFactory.createEmptyBorder());
        areaScrollPane.getVerticalScrollBar().setUnitIncrement(6);
        areaScrollPane.setBorder(border);

        mainPanel.add(areaScrollPane, BorderLayout.CENTER);

        return mainPanel;
    }

    public JPanel moneyExchangeOutput() {
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

    public JPanel moneyExchangeHistory() {

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
        moneyExchangeCalculation.rielToDollarResult(rielToDollarButton, amount, resultField, historyField);
        moneyExchangeCalculation.rielToEuroResult(rielToEuroButton, amount, resultField, historyField);
        moneyExchangeCalculation.rielToFranceResult(rielToFranceButton, amount, resultField, historyField);
        moneyExchangeCalculation.rielToPoundResult(rielToPoundButton, amount, resultField, historyField);
        moneyExchangeCalculation.rielToBahtResult(rielToBahtButton, amount, resultField, historyField);
        moneyExchangeCalculation.dollarToRielResult(dollarToRielButton, amount, resultField, historyField);
        moneyExchangeCalculation.euroToRielResult(euroToRielButton, amount, resultField, historyField);
        moneyExchangeCalculation.francToRielResult(franceToRielButton, amount, resultField, historyField);
        moneyExchangeCalculation.poundToRielResult(poundToRielButton, amount, resultField, historyField);
        moneyExchangeCalculation.bahtToRielResult(bahtToRielButton, amount, resultField, historyField);

        return historyPanel;
    }

    public JButton moneyExchangeReset(){
        moneyExchangeCalculation.performReset(resetButton, amount, resultField, historyField);
        return resetButton;
    }

}
