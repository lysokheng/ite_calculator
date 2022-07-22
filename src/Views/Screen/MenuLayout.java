package Views.Screen;

import Views.Detail.Utils.Routes;
import Views.Detail.Utils.AppColors;
import Views.Detail.Utils.AppTexts;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.GridBagLayout;


public class MenuLayout {
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
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(30, 30, 0, 0);  //top padding
        c.gridwidth = 3;
        c.weightx = 1;
        c.weighty = 1;
        c.gridx = 0;
        c.gridy = 0;
        mainPanel.add(appTexts.brandName(), c);

        //Exit Button
        c.insets = new Insets(30, 0, 0, 0);
        c.gridwidth = 1;
        c.gridheight = 2;
        c.weightx = 1;
        c.weighty = 1;
        c.gridx = 3;
        c.gridy = 0;
        c.anchor = GridBagConstraints.CENTER;
        mainPanel.add(routs.exitListener(), c);

        //Small Text
        c.insets = new Insets(0, 30, 0, 0);  //top padding
        c.gridwidth = 3;
        c.gridheight = 1;
        c.gridx = 0;
        c.gridy = 1;
        mainPanel.add(appTexts.descriptionText(), c);

        //Menu Section
        //Arithmetic Button
        c.insets = new Insets(30, 0, 0, 0);  //top padding
        c.gridwidth = 1;
        c.gridx = 0;
        c.gridy = 2;
        mainPanel.add(routs.arithmeticListener(frame, mainPanel), c);

        //Trigonometry Button
        c.gridwidth = 1;
        c.gridx = 1;
        c.gridy = 2;
        mainPanel.add(routs.trigonometryListener(frame, mainPanel), c);

        //Bitwise Button
        c.gridwidth = 1;
        c.gridx = 2;
        c.gridy = 2;
        mainPanel.add(routs.bitwiseDecimalWindowsListener(frame, mainPanel), c);

        //Money Exchange Button
        c.gridwidth = 1;
        c.gridx = 3;
        c.gridy = 2;
        mainPanel.add(routs.moneyExchangeListener(frame, mainPanel), c);

        //Storage Converter Button
        c.insets = new Insets(0, 0, 0, 0);  //top padding
        c.gridwidth = 1;
        c.gridx = 0;
        c.gridy = 3;
        mainPanel.add(routs.storageConverterListener(frame, mainPanel), c);

        //Number System Conversion Button
        c.gridwidth = 1;
        c.gridx = 1;
        c.gridy = 3;
        mainPanel.add(routs.numberSystemConversionListener(frame, mainPanel), c);

        //Binary Arithmetic Button
        c.gridwidth = 1;
        c.gridx = 2;
        c.gridy = 3;
        mainPanel.add(routs.binaryArithmeticListener(frame, mainPanel), c);

        //Set Theory Button
        c.gridwidth = 1;
        c.gridx = 3;
        c.gridy = 3;
        mainPanel.add(routs.setTheoryListener(frame, mainPanel), c);

        //Footer Section
        //Copyright Text
        JPanel footerPanel = new JPanel();
        c.insets = new Insets(30, 0, 0, 0);  //top padding
        c.ipady = 60;
        c.gridwidth = 4;
        c.gridx = 0;
        c.gridy = 5;
        c.anchor = GridBagConstraints.PAGE_END;
        footerPanel.setLayout(new GridBagLayout());
        footerPanel.add(appTexts.copyright());
        footerPanel.setBackground(new Color(229, 231, 235));
        mainPanel.add(footerPanel, c);

        frame.setContentPane(mainPanel);

        return mainPanel;
    }


}

