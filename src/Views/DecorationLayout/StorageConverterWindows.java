package Views.DecorationLayout;

import Views.Routes;
import Views.Widgets.StorageConverterWidgets;
import Views.Widgets.Utils.AppButtons;
import Views.Widgets.Utils.AppColors;
import Views.Widgets.Utils.AppTexts;

import javax.swing.*;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.GridBagLayout;

public class StorageConverterWindows {

    AppColors appColors = new AppColors();
    AppTexts appTexts = new AppTexts();
    Routes routs = new Routes();
    StorageConverterWidgets storageConverterWidgets = new StorageConverterWidgets();
    AppButtons appButtons = new AppButtons();

    JButton resetButton = appButtons.clearButton();

    public JPanel storageConverterPanel(JFrame frame) {
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

        //Storage Converter Text
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(65, 30, 15, 0);
        c.gridx = 0;
        c.gridy = 2;
        mainPanel.add(appTexts.bigTextTitle("Storage Converter"), c);

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
        c.ipadx = 400;
        c.ipady = 340;
        c.gridx = 0;
        c.gridy = 3;
        mainPanel.add(storageConverterWidgets.storageConverterOperator(), c);

        //input panel
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(0, 0, 0, 30);
        c.ipadx = 0;
        c.ipady = 0;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.gridx = 1;
        c.gridy = 3;
        mainPanel.add(storageConverterWidgets.storageConverterInput(), c);

        //arithmeticOutput
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(30, 0, 0, 30);
        c.ipadx = 0;
        c.ipady = 0;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.gridx = 1;
        c.gridy = 4;
        mainPanel.add(storageConverterWidgets.storageConverterOutput(), c);

        //history panel
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(0, 0, 0, 30);
        c.gridwidth = 1;
        c.gridheight = 2;
        c.gridx = 2;
        c.gridy = 3;
        mainPanel.add(storageConverterWidgets.storageConverterHistory(), c);

        //Back Button
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(30, 30, 30, -240);
        c.gridx = 2;
        c.gridy = 5;
        mainPanel.add(routs.menuWindowsListener(frame, mainPanel), c);

        //arithmeticReset Button
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(30, 0, 30, 0);
        c.gridx = 1;
        c.gridy = 5;
        mainPanel.add(storageConverterWidgets.storageConverterReset(), c);

        return mainPanel;
    }
}

