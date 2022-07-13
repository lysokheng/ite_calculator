package Views.DecorationLayout;

import Controller.NSCBinaryController;
import Model.NSCBinaryModel;
import Controller.Routes;
import Views.Widgets.NSCBinaryView;
import Views.Widgets.Utils.AppButtons;
import Views.Widgets.Utils.AppColors;
import Views.Widgets.Utils.AppTexts;

import javax.swing.*;
import java.awt.*;

public class NSCBinaryLayout {

    AppColors appColors = new AppColors();
    AppTexts appTexts = new AppTexts();
    Routes routs = new Routes();
    NSCBinaryView nscBinaryView = new NSCBinaryView();
    NSCBinaryModel nscBinaryModel = new NSCBinaryModel();
    NSCBinaryController nscBinaryController = new NSCBinaryController(nscBinaryModel, nscBinaryView);

    public JPanel numberSystemConversionBinaryPanel(JFrame frame) {
        //create main panel object
        JPanel mainPanel = new JPanel(new GridBagLayout());

        //create grid custom object
        GridBagConstraints c = new GridBagConstraints();
        mainPanel.setBackground(appColors.getBACKGROUND_COLOR());

        //Header Section
        //Big Text
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(30, 30, 0, 30);
        c.gridwidth = 3;
        c.gridx = 0;
        c.gridy = 0;
        c.weightx = 1;
        c.weighty = 1;
        c.ipady = 30;
        mainPanel.add(appTexts.bigText(), c);

        //Exit Button
        c.insets = new Insets(30, 0, 0, -240);
        c.gridwidth = 1;
        c.gridx = 4;
        c.gridy = 0;
        mainPanel.add(routs.exitListener(), c);

        //Small Text
        c.insets = new Insets(0, 30, 0, 0);
        c.gridwidth = 5;
        c.gridx = 0;
        c.gridy = 1;
        mainPanel.add(appTexts.descriptionText(), c);

        //Middle Section

        //Number System Conversion Text
        c.insets = new Insets(15, 30, 15, 0);
        c.gridwidth = 3;
        c.gridx = 0;
        c.gridy = 2;
        mainPanel.add(appTexts.bigTextTitle("Number System Conversion"), c);

        //Input Text
        c.insets = new Insets(15, 0, 0, 0);
        c.gridwidth = 1;
        c.gridx = 3;
        c.gridy = 2;
        mainPanel.add(appTexts.guidedText("Input"), c);

        //History Text
        c.insets = new Insets(15, 0, 15, 0);
        c.gridwidth = 1;
        c.gridx = 4;
        c.gridy = 2;
        mainPanel.add(appTexts.guidedText("History"), c);

        //Operator panel
        c.insets = new Insets(0, 15, 0, 15);
        c.gridwidth = 3;
        c.gridheight = 2;
        c.gridx = 0;
        c.gridy = 3;
        mainPanel.add(nscBinaryView.operator(), c);

        //input panel
        c.insets = new Insets(0, 0, 0, 15);
        c.ipadx = 0;
        c.ipady = 0;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.gridx = 3;
        c.gridy = 3;
        mainPanel.add(nscBinaryView.input(), c);

        //Output
        c.insets = new Insets(15, 0, 0, 30);
        c.ipadx = 0;
        c.ipady = 0;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.gridx = 3;
        c.gridy = 4;
        mainPanel.add(nscBinaryView.output(), c);

        //history panel
        c.insets = new Insets(0, 0, 0, 30);
        c.gridwidth = 1;
        c.gridheight = 2;
        c.gridx = 4;
        c.gridy = 3;
        mainPanel.add(nscBinaryView.history(), c);

        //Back Button
        c.insets = new Insets(15, 0, 30, -240);
        c.gridwidth = 1;
        c.gridx = 4;
        c.gridy = 5;
        mainPanel.add(routs.menuWindowsListener(frame, mainPanel), c);

        //arithmeticReset Button
        c.insets = new Insets(15, 0, 30, 0);
        c.gridx = 3;
        c.gridy = 5;
        mainPanel.add(nscBinaryView.getResetButton(), c);

        //change number system
        c.insets = new Insets(0, 30, 30, 0);
        c.gridx = 0;
        c.gridy = 5;
        mainPanel.add(routs.changeToDecimalListener(frame, mainPanel), c);

        c.insets = new Insets(0, 15, 30, 0);
        c.gridx = 1;
        c.gridy = 5;
        mainPanel.add(routs.changeToHexadecimalListener(frame, mainPanel), c);

        c.insets = new Insets(0, 15, 30, 0);
        c.gridx = 2;
        c.gridy = 5;
        mainPanel.add(routs.changeToOctalListener(frame, mainPanel), c);

        return mainPanel;
    }
}

