package Views.Components;

import Views.Utils.AppTexts;

import javax.swing.*;
import javax.swing.border.AbstractBorder;
import java.awt.*;

public class DetailLayout {
    private final AppTexts appTexts = new AppTexts();
    //set border to radius
    AbstractBorder border = new TextBubbleBorder(Color.WHITE, 0, 15, 0);
    public void inputAB(JPanel inputPanel, JTextField a, JTextField b){

        //custom rectangle
        inputPanel.setBackground(Color.WHITE);
        inputPanel.setBorder(border);

        //create grid custom object
        GridBagConstraints c = new GridBagConstraints();

        //view

        //A part
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 1;
        c.weighty = 1;
        c.gridx = 0;
        c.gridy = 0;
        inputPanel.add(appTexts.mediumText("A:"), c);

        JScrollPane areaScrollPaneA = new JScrollPane(a);
        areaScrollPaneA.setBorder(BorderFactory.createEmptyBorder());

        //TextField part
        c.gridx = 1;
        c.gridy = 0;
        c.ipadx = 120;
        c.ipady = 60;
        inputPanel.add(areaScrollPaneA, c);

        //B part
        c.insets = new Insets(15,0,0,0);
        c.gridx = 0;
        c.gridy = 1;
        c.ipadx = 0;
        c.ipady = 0;
        inputPanel.add(appTexts.mediumText("B:"), c);

        JScrollPane areaScrollPaneB = new JScrollPane(b);
        areaScrollPaneB.setBorder(BorderFactory.createEmptyBorder());

        //TextField part
        c.gridx = 1;
        c.gridy = 1;
        c.ipadx = 120;
        c.ipady = 60;
        inputPanel.add(areaScrollPaneB, c);
    }
    public void inputAmount(JPanel inputPanel, JTextField amount){

        //custom rectangle
        inputPanel.setBackground(Color.WHITE);
        inputPanel.setBorder(border);

        //create grid custom object
        GridBagConstraints c = new GridBagConstraints();

        //view

        JScrollPane areaScrollPaneAmount = new JScrollPane(amount);
        areaScrollPaneAmount.setBorder(BorderFactory.createEmptyBorder());

        //Amount part
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 1;
        c.weighty = 1;
        c.gridx = 0;
        c.gridy = 0;
        inputPanel.add(appTexts.mediumText("Amount:"), c);

        //TextField part
        c.gridx = 0;
        c.gridy = 1;
        c.ipadx = 120;
        c.ipady = 60;
        inputPanel.add(areaScrollPaneAmount, c);
    }

    public void output(JPanel outputPanel, JTextArea resultField) {

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
    }

    public void history(JPanel historyPanel, JTextArea historyField) {

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
    }

}
