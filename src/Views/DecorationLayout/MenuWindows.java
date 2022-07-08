package Views.DecorationLayout;

import Views.Routes;
import Views.Widgets.Utils.AppColors;
import Views.Widgets.Utils.AppTexts;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.GridBagLayout;


public class MenuWindows {
    //create object in Views.Widgets.Utils file
    AppColors appColors = new AppColors();
    Routes routs = new Routes();

    public JPanel menuPanel(JFrame frame) {

        //create object
        AppTexts appTexts = new AppTexts();

        //create main panel object
        JPanel mainPanel = new JPanel(new GridBagLayout());
        mainPanel.setBackground(appColors.getBACKGROUND_COLOR());

        //create grid custom object
        GridBagConstraints c = new GridBagConstraints();

        //Header Section
        //Big Text
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(30, 0, 0, 0);  //top padding
        c.gridwidth = 3;
        c.gridx = 0;
        c.gridy = 0;
        mainPanel.add(appTexts.bigText(), c);

        //Exit Button
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(30, 0, 0, -120);
        c.gridx = 3;
        c.gridy = 0;
        mainPanel.add(routs.exitListener(), c);

        //Small Text
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(0, 0, 0, 0);  //top padding
        c.gridx = 0;
        c.gridy = 1;
        mainPanel.add(appTexts.descriptionText(), c);

        //Menu Section
        //Arithmetic Button
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(90, 0, 0, 0);  //top padding
        c.gridwidth = 1;
        c.weightx = 0;
        c.gridx = 0;
        c.gridy = 2;
        mainPanel.add(routs.arithmeticListener(frame, mainPanel), c);

        //Trigonometry Button
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridwidth = 1;
        c.gridx = 1;
        c.gridy = 2;
        mainPanel.add(routs.trigonometryListener(frame, mainPanel), c);

        //Bitwise Button
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridwidth = 1;
        c.gridx = 2;
        c.gridy = 2;
        mainPanel.add(routs.bitwiseDecimalWindowsListener(frame, mainPanel), c);

        //Money Exchange Button
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridwidth = 1;
        c.gridx = 3;
        c.gridy = 2;
        mainPanel.add(routs.moneyExchangeListener(frame, mainPanel), c);

        //Storage Converter Button
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(0, 0, 0, 0);  //top padding
        c.gridwidth = 1;
        c.weightx = 0;
        c.gridx = 0;
        c.gridy = 3;
        mainPanel.add(routs.storageConverterListener(frame, mainPanel), c);

        //Number System Conversion Button
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridwidth = 1;
        c.gridx = 1;
        c.gridy = 3;
        mainPanel.add(routs.numberSystemConversionListener(frame, mainPanel), c);

        //Binary Arithmetic Button
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridwidth = 1;
        c.gridx = 2;
        c.gridy = 3;
        mainPanel.add(routs.binaryArithmeticListener(frame, mainPanel), c);

        //Set Theory Button
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridwidth = 1;
        c.gridx = 3;
        c.gridy = 3;
        mainPanel.add(routs.setTheoryListener(frame, mainPanel), c);

        //Footer Section
        //Copyright Text
        JPanel footerPanel = new JPanel();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(110, -50, 0, -50);  //top padding
        c.ipady = 80;
        c.gridwidth = 4;
        c.gridx = 0;
        c.gridy = 5;
        footerPanel.setLayout(new GridBagLayout());
        footerPanel.add(appTexts.footerText());
        footerPanel.setBackground(new Color(229, 231, 235));
        mainPanel.add(footerPanel, c);

        frame.setContentPane(mainPanel);

        return mainPanel;
    }


}

