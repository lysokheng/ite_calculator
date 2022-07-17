package Views.Widgets;

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
import java.awt.event.ActionListener;

public class StorageConverterView extends Component {
    //... Constants
    private static final String INITIAL_VALUE = "";

    //... create object
    private final AppTexts appTexts = new AppTexts();
    private final AppButtons appButtons = new AppButtons();
    private final InputFieldDecimal inputFieldDecimal = new InputFieldDecimal();
    private final OutputArea outputArea = new OutputArea();
    private final HistoryArea historyArea = new HistoryArea();
    private final AppColors appColors = new AppColors();

    //... name of new object
    private JTextField amount = inputFieldDecimal.inputField();
    private final JTextArea resultField = outputArea.outputArea();
    private JTextArea historyField = historyArea.historyArea();
    private final JButton byteToGigabyteButton = appButtons.byteToGigabyteButton();
    private final JButton byteToKilobyteButton = appButtons.byteToKilobyteButton();
    private final JButton byteToMegabyteButton = appButtons.byteToMegabyteButton();
    private final JButton byteToPetabyteButton = appButtons.byteToPetabyteButton();
    private final JButton byteToTerabyteButton = appButtons.byteToTerabyteButton();
    private final JButton kilobyteToByteButton = appButtons.kilobyteToByteButton();
    private final JButton kilobyteToMegabyteButton = appButtons.kilobyteToMegabyteButton();
    private final JButton kilobyteToGigabyteButton = appButtons.kilobyteToGigabyteButton();
    private final JButton kilobyteToPetabyteButton = appButtons.kilobyteToPetabyteButton();
    private final JButton kilobyteToTerabyteButton = appButtons.kilobyteToTerabyteButton();
    private final JButton megabyteToPetabyteButton = appButtons.megabyteToPetabyteButton();
    private final JButton megabyteToKilobyteButton = appButtons.megabyteToKilobyteButton();
    private final JButton megabyteToGigabyteButton = appButtons.megabyteToGigabyteButton();
    private final JButton megabyteToTerabyteButton = appButtons.megabyteToTerabyteButton();
    private final JButton megabyteToByteButton = appButtons.megabyteToByteButton();
    private final JButton gigabyteToByteButton = appButtons.gigabyteToByteButton();
    private final JButton gigabyteToKilobyteButton = appButtons.gigabyteToKilobyteButton();
    private final JButton gigabyteToMegabyteButton = appButtons.gigabyteToMegabyteButton();
    private final JButton gigabyteToPetabyteButton = appButtons.gigabyteToPetabyteButton();
    private final JButton gigabyteToTerabyteButton = appButtons.gigabyteToTerabyteButton();
    private final JButton petabyteToByteButton = appButtons.petabyteToByteButton();
    private final JButton petabyteToKilobyteButton = appButtons.petabyteToKilobyteButton();
    private final JButton petabyteToMegabyteButton = appButtons.petabyteToMegabyteButton();
    private final JButton petabyteToGigabyteButton = appButtons.petabyteToGigabyteButton();
    private final JButton petabyteToTerabyteButton = appButtons.petabyteToTerabyteButton();
    private final JButton terabyteToByteButton = appButtons.terabyteToByteButton();
    private final JButton terabyteToKilobyteButton = appButtons.terabyteToKilobyteButton();
    private final JButton terabyteToMegabyteButton = appButtons.terabyteToMegabyteButton();
    private final JButton terabyteToGigabyteButton = appButtons.terabyteToGigabyteButton();
    private final JButton terabyteToPetabyteButton = appButtons.terabyteToPetabyteButton();
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

        JScrollPane areaScrollPaneAmount = new JScrollPane(amount);
        areaScrollPaneAmount.setBorder(BorderFactory.createEmptyBorder());

        //A part
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 1;
        c.weighty = 1;
        c.gridx = 0;
        c.gridy = 0;
        generatorPanel.add(appTexts.mediumText("Amount:"), c);

        //TextField part
        c.gridx = 0;
        c.gridy = 1;
        c.ipadx = 120;
        c.ipady = 60;
        generatorPanel.add(areaScrollPaneAmount, c);

        return generatorPanel;
    }
    public JPanel operator() {
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
        AbstractBorder border = new TextBubbleBorder(Color.WHITE, 0, 15, 0);

        areaScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        areaScrollPane.setPreferredSize(new Dimension(400, 300));
        areaScrollPane.setBorder(BorderFactory.createEmptyBorder());
        areaScrollPane.getVerticalScrollBar().setUnitIncrement(6);
        areaScrollPane.setBorder(border);

        mainPanel.add(areaScrollPane, BorderLayout.CENTER);

        return mainPanel;
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
    public void addStorageConverterListener(ActionListener button) {
        byteToKilobyteButton.addActionListener(button);
        byteToMegabyteButton.addActionListener(button);
        byteToGigabyteButton.addActionListener(button);
        byteToPetabyteButton.addActionListener(button);
        byteToTerabyteButton.addActionListener(button);

        kilobyteToByteButton.addActionListener(button);
        kilobyteToGigabyteButton.addActionListener(button);
        kilobyteToMegabyteButton.addActionListener(button);
        kilobyteToPetabyteButton.addActionListener(button);
        kilobyteToTerabyteButton.addActionListener(button);

        megabyteToByteButton.addActionListener(button);
        megabyteToGigabyteButton.addActionListener(button);
        megabyteToKilobyteButton.addActionListener(button);
        megabyteToPetabyteButton.addActionListener(button);
        megabyteToTerabyteButton.addActionListener(button);

        gigabyteToByteButton.addActionListener(button);
        gigabyteToKilobyteButton.addActionListener(button);
        gigabyteToMegabyteButton.addActionListener(button);
        gigabyteToPetabyteButton.addActionListener(button);
        gigabyteToTerabyteButton.addActionListener(button);

        petabyteToByteButton.addActionListener(button);
        petabyteToGigabyteButton.addActionListener(button);
        petabyteToKilobyteButton.addActionListener(button);
        petabyteToMegabyteButton.addActionListener(button);
        petabyteToTerabyteButton.addActionListener(button);

        terabyteToByteButton.addActionListener(button);
        terabyteToGigabyteButton.addActionListener(button);
        terabyteToKilobyteButton.addActionListener(button);
        terabyteToMegabyteButton.addActionListener(button);
        terabyteToPetabyteButton.addActionListener(button);
    }
    public void addClearListener(ActionListener button) {
        resetButton.addActionListener(button);
    }

    //======================================================= additional method
    public void reset(){
        resultField.setText(INITIAL_VALUE);
        amount.setText("");
        historyField.setText("");
    }
    public void showError(String errMessage) {
        JOptionPane.showMessageDialog(this, errMessage);
    }

    //======================================================= getter and setter methods
    public String getAmount() {
        return amount.getText();
    }

    public void setAmount(JTextField amount) {
        this.amount = amount;
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

    public JButton getByteToGigabyteButton() {
        return byteToGigabyteButton;
    }

    public JButton getByteToKilobyteButton() {
        return byteToKilobyteButton;
    }

    public JButton getByteToMegabyteButton() {
        return byteToMegabyteButton;
    }

    public JButton getByteToPetabyteButton() {
        return byteToPetabyteButton;
    }

    public JButton getByteToTerabyteButton() {
        return byteToTerabyteButton;
    }

    public JButton getKilobyteToByteButton() {
        return kilobyteToByteButton;
    }

    public JButton getKilobyteToMegabyteButton() {
        return kilobyteToMegabyteButton;
    }

    public JButton getKilobyteToGigabyteButton() {
        return kilobyteToGigabyteButton;
    }

    public JButton getKilobyteToPetabyteButton() {
        return kilobyteToPetabyteButton;
    }

    public JButton getKilobyteToTerabyteButton() {
        return kilobyteToTerabyteButton;
    }

    public JButton getMegabyteToPetabyteButton() {
        return megabyteToPetabyteButton;
    }

    public JButton getMegabyteToKilobyteButton() {
        return megabyteToKilobyteButton;
    }

    public JButton getMegabyteToGigabyteButton() {
        return megabyteToGigabyteButton;
    }

    public JButton getMegabyteToTerabyteButton() {
        return megabyteToTerabyteButton;
    }

    public JButton getMegabyteToByteButton() {
        return megabyteToByteButton;
    }

    public JButton getGigabyteToByteButton() {
        return gigabyteToByteButton;
    }

    public JButton getGigabyteToKilobyteButton() {
        return gigabyteToKilobyteButton;
    }

    public JButton getGigabyteToMegabyteButton() {
        return gigabyteToMegabyteButton;
    }

    public JButton getGigabyteToPetabyteButton() {
        return gigabyteToPetabyteButton;
    }

    public JButton getGigabyteToTerabyteButton() {
        return gigabyteToTerabyteButton;
    }

    public JButton getPetabyteToByteButton() {
        return petabyteToByteButton;
    }

    public JButton getPetabyteToKilobyteButton() {
        return petabyteToKilobyteButton;
    }

    public JButton getPetabyteToMegabyteButton() {
        return petabyteToMegabyteButton;
    }

    public JButton getPetabyteToGigabyteButton() {
        return petabyteToGigabyteButton;
    }

    public JButton getPetabyteToTerabyteButton() {
        return petabyteToTerabyteButton;
    }

    public JButton getTerabyteToByteButton() {
        return terabyteToByteButton;
    }

    public JButton getTerabyteToKilobyteButton() {
        return terabyteToKilobyteButton;
    }

    public JButton getTerabyteToMegabyteButton() {
        return terabyteToMegabyteButton;
    }

    public JButton getTerabyteToGigabyteButton() {
        return terabyteToGigabyteButton;
    }

    public JButton getTerabyteToPetabyteButton() {
        return terabyteToPetabyteButton;
    }

    public JButton getResetButton() {
        return resetButton;
    }

    public void setResetButton(JButton resetButton) {
        this.resetButton = resetButton;
    }
}
