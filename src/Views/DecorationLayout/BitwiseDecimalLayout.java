package Views.DecorationLayout;

import Controller.BitwiseDecimalController;
import Model.BitwiseDecimalModel;
import Controller.Routes;
import Views.Widgets.BitwiseDecimalView;
import Views.Widgets.Utils.AppColors;
import Views.Widgets.Utils.AppTexts;

import javax.swing.*;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.GridBagLayout;

public class BitwiseDecimalLayout {

    AppColors appColors = new AppColors();
    AppTexts appTexts = new AppTexts();
    Routes routs = new Routes();
    BitwiseDecimalView bitwiseDecimalView = new BitwiseDecimalView();
    BitwiseDecimalModel bitwiseDecimalModel = new BitwiseDecimalModel();
    BitwiseDecimalController bitwiseDecimalController = new BitwiseDecimalController(
            bitwiseDecimalModel, bitwiseDecimalView
    );

    public JPanel bitwisePanel(JFrame frame) {
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
        mainPanel.add(appTexts.bigText(), c);

        //Exit Button
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(30, 0, 0, -240);
        c.gridx = 2;
        c.gridy = 0;
        mainPanel.add(routs.exitListener(), c);

        //Small Text
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(0, 30, 0, 0);
        c.gridwidth = 3;
        c.gridx = 0;
        c.gridy = 1;
        mainPanel.add(appTexts.descriptionText(), c);

        //Middle Section

        //Bitwise Text
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(65, 30, 15, 0);
        c.gridx = 0;
        c.gridy = 2;
        mainPanel.add(appTexts.bigTextTitle("Bitwise in Decimal"), c);

        //Input Text
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(65, 0, 15, 0);
        c.gridx = 1;
        c.gridy = 2;
        mainPanel.add(appTexts.guidedText("Input"), c);

        //History Text
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(65, 0, 15, 0);
        c.gridx = 2;
        c.gridy = 2;
        mainPanel.add(appTexts.guidedText("History"), c);

        //Operator panel
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(0, 30, 0, 30);
        c.gridwidth = 1;
        c.gridheight = 2;
        c.gridx = 0;
        c.gridy = 3;
        mainPanel.add(bitwiseDecimalView.operator(), c);

        //input panel
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(0, 0, 0, 30);
        c.ipadx = 0;
        c.ipady = 0;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.gridx = 1;
        c.gridy = 3;
        mainPanel.add(bitwiseDecimalView.input(), c);

        //BinaryArithmeticOutput
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(30, 0, 0, 30);
        c.ipadx = 0;
        c.ipady = 0;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.gridx = 1;
        c.gridy = 4;
        mainPanel.add(bitwiseDecimalView.output(), c);

        //history panel
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(0, 0, 0, 30);
        c.gridwidth = 1;
        c.gridheight = 2;
        c.gridx = 2;
        c.gridy = 3;
        mainPanel.add(bitwiseDecimalView.history(), c);

        //Back Button
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(30, 30, 30, -240);
        c.gridx = 2;
        c.gridy = 5;
        mainPanel.add(routs.menuWindowsListener(frame, mainPanel), c);

        //BinaryArithmeticReset Button
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(30, 0, 30, 0);
        c.gridx = 1;
        c.gridy = 5;
        mainPanel.add(bitwiseDecimalView.getResetButton(), c);

        //Change to binary mode
        c.insets = new Insets(0, 30, 30, 0);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 5;
        mainPanel.add(routs.bitwiseBinaryListener(frame, mainPanel), c);

        return mainPanel;
    }
}

