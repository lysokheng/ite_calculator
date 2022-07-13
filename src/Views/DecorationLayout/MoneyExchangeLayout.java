package Views.DecorationLayout;

import Controller.MoneyExchangeController;
import Model.MoneyExchangeModel;
import Controller.Routes;
import Views.Widgets.MoneyExchangeView;
import Views.Widgets.Utils.AppColors;
import Views.Widgets.Utils.AppTexts;

import javax.swing.*;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.GridBagLayout;

public class MoneyExchangeLayout {

    AppColors appColors = new AppColors();
    AppTexts appTexts = new AppTexts();
    Routes routs = new Routes();
    MoneyExchangeView moneyExchangeView = new MoneyExchangeView();
    MoneyExchangeModel moneyExchangeModel = new MoneyExchangeModel();
    MoneyExchangeController moneyExchangeController = new MoneyExchangeController(
            moneyExchangeModel, moneyExchangeView
    );

    public JPanel moneyExchangePanel(JFrame frame) {
        //create main panel object
        JPanel mainPanel = new JPanel(new GridBagLayout());

        //create grid custom object
        GridBagConstraints c = new GridBagConstraints();
        mainPanel.setBackground(appColors.getBACKGROUND_COLOR());

        //Header Section
        //Big Text
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(30, 30, 0, 30);
        c.gridwidth = 1;
        c.gridx = 0;
        c.gridy = 0;
        c.weightx = 1;
        c.weighty = 1;
        c.ipady = 30;
        mainPanel.add(appTexts.bigText(), c);

        //Exit Button
        c.insets = new Insets(30, 0, 0, -240);
        c.gridx = 2;
        c.gridy = 0;
        c.gridheight = 2;
        mainPanel.add(routs.exitListener(), c);

        //Small Text
        c.insets = new Insets(0, 30, 0, 0);
        c.gridwidth = 3;
        c.gridheight = 1;
        c.gridx = 0;
        c.gridy = 1;
        mainPanel.add(appTexts.descriptionText(), c);

        //Middle Section

        //Arithmetic Text
        c.insets = new Insets(15, 30, 15, 0);
        c.gridwidth = 1;
        c.gridx = 0;
        c.gridy = 2;
        c.ipadx = 0;
        mainPanel.add(appTexts.bigTextTitle("Money Exchange"), c);

        //Input Text
        c.insets = new Insets(15, 0, 0, 0);
        c.gridx = 1;
        c.gridy = 2;
        mainPanel.add(appTexts.guidedText("Input"), c);

        //History Text
        c.insets = new Insets(15, 0, 15, 0);
        c.gridx = 2;
        c.gridy = 2;
        mainPanel.add(appTexts.guidedText("History"), c);

        //Operator panel
        c.insets = new Insets(0, 15, 0, 15);
        c.gridwidth = 1;
        c.gridheight = 2;
        c.weightx = 1;
        c.weighty = 2;
        c.ipady = 260;
        c.gridx = 0;
        c.gridy = 3;
        mainPanel.add(moneyExchangeView.operator(), c);

        //input panel
        c.insets = new Insets(0, 0, 0, 15);
        c.ipadx = 0;
        c.ipady = 0;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.weightx = 1;
        c.weighty = 1;
        c.gridx = 1;
        c.gridy = 3;
        mainPanel.add(moneyExchangeView.input(), c);

        //arithmeticOutput
        c.insets = new Insets(15, 0, 0, 30);
        c.ipadx = 0;
        c.ipady = 0;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.gridx = 1;
        c.gridy = 4;
        mainPanel.add(moneyExchangeView.output(), c);

        //history panel
        c.insets = new Insets(0, 0, 0, 30);
        c.gridwidth = 1;
        c.gridheight = 2;
        c.gridx = 2;
        c.gridy = 3;
        mainPanel.add(moneyExchangeView.history(), c);

        //Back Button
        c.insets = new Insets(15, 0, 30, -240);
        c.gridx = 2;
        c.gridy = 5;
        mainPanel.add(routs.menuWindowsListener(frame, mainPanel), c);

        //arithmeticReset Button
        c.insets = new Insets(15, 0, 30, 0);
        c.gridx = 1;
        c.gridy = 5;
        mainPanel.add(moneyExchangeView.getResetButton(), c);

        return mainPanel;
    }
}

