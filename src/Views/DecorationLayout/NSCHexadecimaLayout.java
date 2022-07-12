package Views.DecorationLayout;

import Controller.NSCHexadecimalController;
import Model.NSCHexadecimalModel;
import Controller.Routes;
import Views.Widgets.Utils.AppButtons;
import Views.Widgets.Utils.AppColors;
import Views.Widgets.Utils.AppTexts;
import Views.Widgets.NSCHexadecimalView;

import javax.swing.*;
import java.awt.*;

public class NSCHexadecimaLayout {

    AppColors appColors = new AppColors();
    AppTexts appTexts = new AppTexts();
    Routes routs = new Routes();

    NSCHexadecimalView nscHexadecimalView = new NSCHexadecimalView();
    NSCHexadecimalModel nscHexadecimalModel = new NSCHexadecimalModel();
    NSCHexadecimalController nscHexadecimalController = new NSCHexadecimalController(nscHexadecimalModel, nscHexadecimalView);
    public JPanel numberSystemConversionHexadecimalPanel(JFrame frame) {
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
        mainPanel.add(appTexts.bigText(), c);

        //Exit Button
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(30, 0, 0, -240);
        c.gridwidth = 1;
        c.gridx = 4;
        c.gridy = 0;
        mainPanel.add(routs.exitListener(), c);

        //Small Text
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(0, 30, 0, 0);
        c.gridwidth = 4;
        c.gridx = 0;
        c.gridy = 1;
        mainPanel.add(appTexts.descriptionText(), c);

        //Middle Section

        //Number System Conversion Text
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(65, 30, 15, 0);
        c.gridwidth = 3;
        c.gridx = 0;
        c.gridy = 2;
        mainPanel.add(appTexts.bigTextTitle("Number System Conversion"), c);

        //Input Text
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(65, 0, 15, 0);
        c.gridwidth = 1;
        c.gridx = 3;
        c.gridy = 2;
        mainPanel.add(appTexts.guidedText("Input"), c);

        //History Text
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(65, 0, 15, 0);
        c.gridwidth = 1;
        c.gridx = 4;
        c.gridy = 2;
        mainPanel.add(appTexts.guidedText("History"), c);

        //Operator panel
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(0, 30, 0, 30);
        c.gridwidth = 3;
        c.gridheight = 2;
        c.gridx = 0;
        c.gridy = 3;
        mainPanel.add(nscHexadecimalView.operator(), c);

        //input panel
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(0, 0, 0, 30);
        c.ipadx = 0;
        c.ipady = 0;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.gridx = 3;
        c.gridy = 3;
        mainPanel.add(nscHexadecimalView.input(), c);

        //arithmeticOutput
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(30, 0, 0, 30);
        c.ipadx = 0;
        c.ipady = 0;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.gridx = 3;
        c.gridy = 4;
        mainPanel.add(nscHexadecimalView.output(), c);

        //history panel
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(0, 0, 0, 30);
        c.gridwidth = 1;
        c.gridheight = 2;
        c.gridx = 4;
        c.gridy = 3;
        mainPanel.add(nscHexadecimalView.history(), c);

        //Back Button
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(30, 30, 30, -240);
        c.gridwidth = 1;
        c.gridx = 4;
        c.gridy = 5;
        mainPanel.add(routs.menuWindowsListener(frame, mainPanel), c);

        //arithmeticReset Button
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(30, 0, 30, 0);
        c.gridx = 3;
        c.gridy = 5;
        mainPanel.add(nscHexadecimalView.getResetButton(), c);

        AppButtons appButtons = new AppButtons();

        //change number system
        c.insets = new Insets(0, 30, 30, 0);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 5;
        mainPanel.add(routs.changeToDecimalListener(frame, mainPanel), c);

        c.insets = new Insets(0, 15, 30, 0);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 5;
        mainPanel.add(routs.changeToBinaryListener(frame, mainPanel), c);

        c.insets = new Insets(0, 15, 30, 0);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 2;
        c.gridy = 5;
        mainPanel.add(routs.changeToOctalListener(frame, mainPanel), c);

        return mainPanel;
    }
}

