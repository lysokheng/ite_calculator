package Views.Widgets;

import Controller.BinaryArithmeticCalculation;
import Views.Widgets.Components.*;
import Views.Widgets.Utils.AppButtons;
import Views.Widgets.Utils.AppTexts;

import javax.swing.*;
import javax.swing.border.AbstractBorder;

import java.awt.*;

public class BinaryArithmeticWidgets{
    //create object
    AppTexts appTexts = new AppTexts();
    AppButtons appButtons = new AppButtons();
    InputFieldBinary inputFieldBinary = new InputFieldBinary();
    OutputArea outputArea = new OutputArea();
    HistoryArea historyArea = new HistoryArea();
    BinaryArithmeticCalculation binaryArithmeticCalculation = new BinaryArithmeticCalculation();

    //name of new object
    JTextField a = inputFieldBinary.inputField();
    JTextField b = inputFieldBinary.inputField();
    JTextArea resultField = outputArea.outputArea();
    JTextArea historyField = historyArea.historyArea();
    JButton additionButton = appButtons.additionButton();
    JButton subtractionButton = appButtons.subtractionButton();
    JButton additionWith2NdComplementButton = appButtons.additionWith2NdComplementButton();
    JButton subtractionWith2NdComplementButton = appButtons.subtractionWith2NdComplementButton();
    JButton multiplyButton = appButtons.multiplyButton();
    JButton divideButton = appButtons.divideButton();
    JButton resetButton = appButtons.clearButton();


    public JPanel BinaryArithmeticInput() {
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

    public JPanel BinaryArithmeticOperator() {
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

    public JPanel BinaryArithmeticOutput() {
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

    public JPanel BinaryArithmeticHistory() {

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
        binaryArithmeticCalculation.additionResult(additionButton, a, b, resultField, historyField);
        binaryArithmeticCalculation.subtractionResult(subtractionButton, a, b, resultField, historyField);
        binaryArithmeticCalculation.additionWith2ndComplementResult(additionWith2NdComplementButton, a, b, resultField, historyField);
        binaryArithmeticCalculation.subtractionWith2ndComplementResult(subtractionWith2NdComplementButton, a, b, resultField, historyField);
        binaryArithmeticCalculation.multiplyResult(multiplyButton, a, b, resultField, historyField);
        binaryArithmeticCalculation.divideResult(divideButton, a, b, resultField, historyField);

        return historyPanel;
    }

    public JButton BinaryArithmeticReset(){
        binaryArithmeticCalculation.performReset(resetButton, a, b, resultField, historyField);
        return resetButton;
    }

}
