package Views.Widgets;

import Controller.TrigonometryController;
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

public class TrigonometryView {
    //create object
    AppTexts appTexts = new AppTexts();
    AppButtons appButtons = new AppButtons();
    InputFieldDecimal inputFieldDecimal = new InputFieldDecimal();
    OutputArea outputArea = new OutputArea();
    HistoryArea historyArea = new HistoryArea();
    AppColors appColors = new AppColors();
    TrigonometryController trigonometryController = new TrigonometryController();

    //name of new object
    JTextField amount = inputFieldDecimal.inputField();
    JTextArea resultField = outputArea.outputArea();
    JTextArea historyField = historyArea.historyArea();
    JButton sinToRadianButton = appButtons.sinToRadianButton();
    JButton sinToDegreeButton = appButtons.sinToDegreeButton();
    JButton cosToRadianButton = appButtons.cosToRadianButton();
    JButton cosToDegreeButton = appButtons.cosToDegreeButton();
    JButton tanToRadianButton = appButtons.tanToRadianButton();
    JButton tanToDegreeButton = appButtons.tanToDegreeButton();
    JButton square2InIntegerButton = appButtons.square2InIntegerButton();
    JButton square2InFloatingPointButton = appButtons.square2InFloatingPointButton();
    JButton square3InIntegerButton = appButtons.square3InIntegerButton();
    JButton square3InFloatingPointButton = appButtons.square3InFloatingPointButton();
    JButton degreeToRadianButton = appButtons.degreeToRadianButton();

    JButton resetButton = appButtons.clearButton();


    public JPanel trigonometryInput() {
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

    public JPanel trigonometryOperator() {
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
        AbstractBorder border = new TextBubbleBorder(Color.WHITE, 15, 30, 0);

        areaScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        areaScrollPane.setPreferredSize(new Dimension(520, 440));
        areaScrollPane.setBorder(BorderFactory.createEmptyBorder());
        areaScrollPane.getVerticalScrollBar().setUnitIncrement(6);
        areaScrollPane.setBorder(border);

        mainPanel.add(areaScrollPane, BorderLayout.CENTER);

        return mainPanel;
    }

    public JPanel trigonometryOutput() {
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

    public JPanel trigonometryHistory() {

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
        trigonometryController.sinToRadianResult(sinToRadianButton, amount, resultField, historyField);
        trigonometryController.sinToDegreeResult(sinToDegreeButton, amount, resultField, historyField);
        trigonometryController.cosToDegreeResult(cosToDegreeButton, amount, resultField, historyField);
        trigonometryController.cosToRadianResult(cosToRadianButton, amount, resultField, historyField);
        trigonometryController.tanToDegreeResult(tanToDegreeButton, amount, resultField, historyField);
        trigonometryController.tanToRadianResult(tanToRadianButton, amount, resultField, historyField);
        trigonometryController.degreeToRadianResult(degreeToRadianButton, amount, resultField, historyField);
        trigonometryController.square2InIntResult(square2InIntegerButton, amount, resultField, historyField);
        trigonometryController.square2InFloating_pointResult(square2InFloatingPointButton, amount, resultField, historyField);
        trigonometryController.square3InIntResult(square3InIntegerButton, amount, resultField, historyField);
        trigonometryController.square3InFloating_pointResult(square3InFloatingPointButton, amount, resultField, historyField);

        return historyPanel;
    }

    public JButton trigonometryReset(){
        trigonometryController.performReset(resetButton, amount, resultField, historyField);
        return resetButton;
    }

}
