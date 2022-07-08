package Views.Widgets;

import Controller.StorageConverterCalculation;
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

public class StorageConverterWidgets{
    //create object
    AppTexts appTexts = new AppTexts();
    AppButtons appButtons = new AppButtons();
    InputFieldDecimal inputFieldDecimal = new InputFieldDecimal();
    OutputArea outputArea = new OutputArea();
    HistoryArea historyArea = new HistoryArea();
    AppColors appColors = new AppColors();
    StorageConverterCalculation storageConverterCalculation = new StorageConverterCalculation();

    //name of new object
    JTextField amount = inputFieldDecimal.inputField();
    JTextArea resultField = outputArea.outputArea();
    JTextArea historyField = historyArea.historyArea();
    JButton byteToGigabyteButton = appButtons.byteToGigabyteButton();
    JButton byteToKilobyteButton = appButtons.byteToKilobyteButton();
    JButton byteToMegabyteButton = appButtons.byteToMegabyteButton();
    JButton byteToPetabyteButton = appButtons.byteToPetabyteButton();
    JButton byteToTerabyteButton = appButtons.byteToTerabyteButton();
    JButton kilobyteToByteButton = appButtons.kilobyteToByteButton();
    JButton kilobyteToMegabyteButton = appButtons.kilobyteToMegabyteButton();
    JButton kilobyteToGigabyteButton = appButtons.kilobyteToGigabyteButton();
    JButton kilobyteToPetabyteButton = appButtons.kilobyteToPetabyteButton();
    JButton kilobyteToTerabyteButton = appButtons.kilobyteToTerabyteButton();
    JButton megabyteToPetabyteButton = appButtons.megabyteToPetabyteButton();
    JButton megabyteToKilobyteButton = appButtons.megabyteToKilobyteButton();
    JButton megabyteToGigabyteButton = appButtons.megabyteToGigabyteButton();
    JButton megabyteToTerabyteButton = appButtons.megabyteToTerabyteButton();
    JButton megabyteToByteButton = appButtons.megabyteToByteButton();
    JButton gigabyteToByteButton = appButtons.gigabyteToByteButton();
    JButton gigabyteToKilobyteButton = appButtons.gigabyteToKilobyteButton();
    JButton gigabyteToMegabyteButton = appButtons.gigabyteToMegabyteButton();
    JButton gigabyteToPetabyteButton = appButtons.gigabyteToPetabyteButton();
    JButton gigabyteToTerabyteButton = appButtons.gigabyteToTerabyteButton();
    JButton petabyteToByteButton = appButtons.petabyteToByteButton();
    JButton petabyteToKilobyteButton = appButtons.petabyteToKilobyteButton();
    JButton petabyteToMegabyteButton = appButtons.petabyteToMegabyteButton();
    JButton petabyteToGigabyteButton = appButtons.petabyteToGigabyteButton();
    JButton petabyteToTerabyteButton = appButtons.petabyteToTerabyteButton();
    JButton terabyteToByteButton = appButtons.terabyteToByteButton();
    JButton terabyteToKilobyteButton = appButtons.terabyteToKilobyteButton();
    JButton terabyteToMegabyteButton = appButtons.terabyteToMegabyteButton();
    JButton terabyteToGigabyteButton = appButtons.terabyteToGigabyteButton();
    JButton terabyteToPetabyteButton = appButtons.terabyteToPetabyteButton();
    JButton resetButton = appButtons.clearButton();

    public JPanel storageConverterInput() {
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

    public JPanel storageConverterOperator() {
        //Create JPanel
        JPanel operatorPanel = new JPanel(new GridBagLayout());
        operatorPanel.setBackground(Color.WHITE);

        //main
        JPanel mainPanel = new JPanel();
        mainPanel.setBackground(appColors.getBACKGROUND_COLOR());

        //create grid custom object
        GridBagConstraints c = new GridBagConstraints();

        //view

        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(0, 0, 0, 0);
        c.gridx = 0;
        c.gridy = 0;
        operatorPanel.add(byteToKilobyteButton, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 0;
        operatorPanel.add(byteToMegabyteButton, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 1;
        operatorPanel.add(byteToGigabyteButton, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 1;
        operatorPanel.add(byteToTerabyteButton, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 2;
        operatorPanel.add(byteToPetabyteButton, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 2;
        operatorPanel.add(kilobyteToByteButton, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 3;
        operatorPanel.add(kilobyteToMegabyteButton, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 3;
        operatorPanel.add(kilobyteToGigabyteButton, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 4;
        operatorPanel.add(kilobyteToTerabyteButton, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 4;
        operatorPanel.add(kilobyteToPetabyteButton, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 5;
        operatorPanel.add(megabyteToByteButton, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 5;
        operatorPanel.add(megabyteToKilobyteButton, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 6;
        operatorPanel.add(megabyteToGigabyteButton, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 6;
        operatorPanel.add(megabyteToTerabyteButton, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 7;
        operatorPanel.add(megabyteToPetabyteButton, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 7;
        operatorPanel.add(gigabyteToByteButton, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 8;
        operatorPanel.add(gigabyteToKilobyteButton, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 8;
        operatorPanel.add(gigabyteToMegabyteButton, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 9;
        operatorPanel.add(gigabyteToTerabyteButton, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 9;
        operatorPanel.add(gigabyteToPetabyteButton, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 10;
        operatorPanel.add(terabyteToByteButton, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 10;
        operatorPanel.add(terabyteToKilobyteButton, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 11;
        operatorPanel.add(terabyteToMegabyteButton, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 11;
        operatorPanel.add(terabyteToGigabyteButton, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 12;
        operatorPanel.add(terabyteToPetabyteButton, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 12;
        operatorPanel.add(petabyteToByteButton, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 13;
        operatorPanel.add(petabyteToKilobyteButton, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 13;
        operatorPanel.add(petabyteToMegabyteButton, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 14;
        operatorPanel.add(petabyteToGigabyteButton, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 14;
        operatorPanel.add(petabyteToTerabyteButton, c);

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

    public JPanel storageConverterOutput() {
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

    public JPanel storageConverterHistory() {

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
        storageConverterCalculation.byte2KBResult(byteToKilobyteButton, amount, resultField, historyField);
        storageConverterCalculation.byte2MBResult(byteToMegabyteButton, amount, resultField, historyField);
        storageConverterCalculation.byte2GBResult(byteToGigabyteButton, amount, resultField, historyField);
        storageConverterCalculation.byte2TBResult(byteToTerabyteButton, amount, resultField, historyField);
        storageConverterCalculation.byte2PBResult(byteToPetabyteButton, amount, resultField, historyField);

        storageConverterCalculation.kb2ByteResult(kilobyteToByteButton, amount, resultField, historyField);
        storageConverterCalculation.kb2MBResult(kilobyteToMegabyteButton, amount, resultField, historyField);
        storageConverterCalculation.kb2GBResult(kilobyteToGigabyteButton, amount, resultField, historyField);
        storageConverterCalculation.kb2TBResult(kilobyteToTerabyteButton, amount, resultField, historyField);
        storageConverterCalculation.kb2PBResult(kilobyteToPetabyteButton, amount, resultField, historyField);

        storageConverterCalculation.mb2ByteResult(megabyteToByteButton, amount, resultField, historyField);
        storageConverterCalculation.mb2KilobyteResult(megabyteToKilobyteButton, amount, resultField, historyField);
        storageConverterCalculation.mb2GBResult(megabyteToGigabyteButton, amount, resultField, historyField);
        storageConverterCalculation.mb2TBResult(megabyteToTerabyteButton, amount, resultField, historyField);
        storageConverterCalculation.mb2PBResult(megabyteToPetabyteButton, amount, resultField, historyField);

        storageConverterCalculation.gb2ByteResult(gigabyteToByteButton, amount, resultField, historyField);
        storageConverterCalculation.gb2KBResult(gigabyteToKilobyteButton, amount, resultField, historyField);
        storageConverterCalculation.gb2MBResult(gigabyteToMegabyteButton, amount, resultField, historyField);
        storageConverterCalculation.gb2TBResult(gigabyteToTerabyteButton, amount, resultField, historyField);
        storageConverterCalculation.gb2PBResult(gigabyteToPetabyteButton, amount, resultField, historyField);

        storageConverterCalculation.tb2ByteResult(terabyteToByteButton, amount, resultField, historyField);
        storageConverterCalculation.tb2KBResult(terabyteToKilobyteButton, amount, resultField, historyField);
        storageConverterCalculation.tb2MBResult(terabyteToMegabyteButton, amount, resultField, historyField);
        storageConverterCalculation.tb2GBResult(terabyteToGigabyteButton, amount, resultField, historyField);
        storageConverterCalculation.tb2PBResult(terabyteToPetabyteButton, amount, resultField, historyField);

        storageConverterCalculation.pb2ByteResult(petabyteToByteButton, amount, resultField, historyField);
        storageConverterCalculation.pb2KBResult(petabyteToKilobyteButton, amount, resultField, historyField);
        storageConverterCalculation.pb2MBResult(petabyteToMegabyteButton, amount, resultField, historyField);
        storageConverterCalculation.pb2GBResult(petabyteToGigabyteButton, amount, resultField, historyField);
        storageConverterCalculation.pb2TBResult(petabyteToTerabyteButton, amount, resultField, historyField);


        return historyPanel;
    }

    public JButton storageConverterReset(){
        storageConverterCalculation.performReset(resetButton, amount, resultField, historyField);
        return resetButton;
    }

}
