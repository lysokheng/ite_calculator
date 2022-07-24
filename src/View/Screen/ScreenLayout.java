package View.Screen;

import View.Utils.*;

import javax.swing.*;
import java.awt.*;

public class ScreenLayout {
    //... create object
    AppTexts appTexts = new AppTexts();
    AppRoutes routs = new AppRoutes();

    //create grid custom object
    GridBagConstraints c = new GridBagConstraints();

    public void header(JPanel mainPanel){

        mainPanel.setBackground(AppColors.BACKGROUND_COLOR.getColor());

        //Big Text
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(30, 30, 0, 30);
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.weightx = 1;
        c.weighty = 1;
        c.ipady = 30;
        mainPanel.add(appTexts.brandName(), c);

        //Exit Button
        c.insets = new Insets(30, 0, 0, -240);
        c.gridx = 2;
        c.gridy = 0;
        c.gridwidth = 1;
        c.gridheight = 2;
        c.weightx = 1;
        c.weighty = 2;
        mainPanel.add(routs.exitListener(), c);

        //Small Text
        c.insets = new Insets(0, 30, 0, 0);
        c.gridx = 0;
        c.gridy = 1;
        c.gridwidth = 3;
        c.gridheight = 1;
        c.weightx = 3;
        c.weighty = 1;
        mainPanel.add(appTexts.descriptionText(), c);

    }
    public void headerMenu(JPanel mainPanel){

        mainPanel.setBackground(AppColors.BACKGROUND_COLOR.getColor());

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
        c.insets = new Insets(10, 30, 0, 0);
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

    }
    public void headerWith3NumberSystem(JPanel mainPanel){

        mainPanel.setBackground(AppColors.BACKGROUND_COLOR.getColor());

        //Big Text
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(30, 30, 0, 30);
        c.gridwidth = 3;
        c.gridx = 0;
        c.gridy = 0;
        c.weightx = 1;
        c.weighty = 1;
        c.ipady = 30;
        mainPanel.add(appTexts.brandName(), c);

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

    }
    public void body(JPanel mainPanel, String title,
                     JPanel input,
                     JPanel operator,
                     JPanel output,
                     JPanel history
    ){
        mainPanel.setBackground(AppColors.BACKGROUND_COLOR.getColor());

        //title Text
        c.insets = new Insets(15, 30, 15, 0);
        c.gridx = 0;
        c.gridy = 2;
        c.ipadx = 0;
        c.ipady = 15;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.weightx = 1;
        c.weighty = 1;
        mainPanel.add(appTexts.bigTextTitle(title), c);

        //Input Text
        c.insets = new Insets(15, 0, 0, 0);
        c.gridx = 1;
        c.gridy = 2;
        mainPanel.add(appTexts.guidedText(AppTitle.INPUT.toString()), c);

        //History Text
        c.insets = new Insets(15, 0, 15, 0);
        c.gridx = 2;
        c.gridy = 2;
        mainPanel.add(appTexts.guidedText(AppTitle.HISTORY.toString()), c);

        //Operator panel
        c.insets = new Insets(0, 15, 0, 15);
        c.gridx = 0;
        c.gridy = 3;
        c.gridwidth = 1;
        c.gridheight = 2;
        c.weightx = 1;
        c.weighty = 2;
        mainPanel.add(operator, c);

        //input panel
        c.insets = new Insets(0, 0, 0, 15);
        c.gridx = 1;
        c.gridy = 3;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.weightx = 1;
        c.weighty = 1;
        mainPanel.add(input, c);

        //Output
        c.insets = new Insets(15, 0, 0, 30);
        c.ipadx = 40;
        c.ipady = 20;
        c.gridx = 1;
        c.gridy = 4;
        mainPanel.add(output, c);

        //history panel
        c.insets = new Insets(0, 0, 0, 30);
        c.gridx = 2;
        c.gridy = 3;
        c.gridwidth = 1;
        c.gridheight = 2;
        c.weightx = 1;
        c.weighty = 2;
        c.ipadx = 0;
        c.ipady = 0;
        mainPanel.add(history, c);

    }
    public void bodyMenu(JFrame frame, JPanel mainPanel){
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

        frame.setContentPane(mainPanel);
    }
    public void bodyWithScrollOperator(JPanel mainPanel, String title,
                                       JPanel input,
                                       JPanel operator,
                                       JPanel output,
                                       JPanel history
                       ){
        mainPanel.setBackground(AppColors.BACKGROUND_COLOR.getColor());

        //title Text
        c.insets = new Insets(15, 30, 15, 0);
        c.gridx = 0;
        c.gridy = 2;
        c.ipadx = 0;
        c.ipady = 15;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.weightx = 1;
        c.weighty = 1;
        mainPanel.add(appTexts.bigTextTitle(title), c);

        //Input Text
        c.insets = new Insets(15, 0, 0, 0);
        c.gridx = 1;
        c.gridy = 2;
        mainPanel.add(appTexts.guidedText(AppTitle.INPUT.toString()), c);

        //History Text
        c.insets = new Insets(15, 0, 15, 0);
        c.gridx = 2;
        c.gridy = 2;
        mainPanel.add(appTexts.guidedText(AppTitle.HISTORY.toString()), c);

        //Operator panel
        c.insets = new Insets(0, 15, 0, 15);
        c.gridx = 0;
        c.gridy = 3;
        c.gridwidth = 1;
        c.gridheight = 2;
        c.weightx = 1;
        c.weighty = 2;
        c.ipady = 300;
        c.ipadx = 400;
        mainPanel.add(operator, c);

        //input panel
        c.insets = new Insets(0, 0, 0, 15);
        c.gridx = 1;
        c.gridy = 3;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.weightx = 1;
        c.weighty = 1;
        c.ipady = 20;
        c.ipadx = 40;
        mainPanel.add(input, c);

        //Output
        c.insets = new Insets(15, 0, 0, 30);
        c.gridx = 1;
        c.gridy = 4;
        mainPanel.add(output, c);

        //history panel
        c.insets = new Insets(0, 0, 0, 30);
        c.gridx = 2;
        c.gridy = 3;
        c.gridwidth = 1;
        c.gridheight = 2;
        c.weightx = 1;
        c.weighty = 2;
        c.ipadx = 0;
        c.ipady = 0;
        mainPanel.add(history, c);

    }
    public void bodyWith3NumberSystem(JPanel mainPanel, String title,
                                      JPanel input,
                                      JPanel operator,
                                      JPanel output,
                                      JPanel history
    ){
        mainPanel.setBackground(AppColors.BACKGROUND_COLOR.getColor());

        //title Text
        c.insets = new Insets(15, 30, 15, 0);
        c.gridwidth = 3;
        c.gridx = 0;
        c.gridy = 2;
        mainPanel.add(appTexts.bigTextTitle(title), c);

        //Input Text
        c.insets = new Insets(15, 0, 0, 0);
        c.gridwidth = 1;
        c.gridx = 3;
        c.gridy = 2;
        mainPanel.add(appTexts.guidedText(AppTitle.INPUT.toString()), c);

        //History Text
        c.insets = new Insets(15, 0, 15, 0);
        c.gridwidth = 1;
        c.gridx = 4;
        c.gridy = 2;
        mainPanel.add(appTexts.guidedText(AppTitle.HISTORY.toString()), c);

        //Operator panel
        c.insets = new Insets(0, 15, 0, 15);
        c.gridwidth = 3;
        c.gridheight = 2;
        c.gridx = 0;
        c.gridy = 3;
        mainPanel.add(operator, c);

        //input panel
        c.insets = new Insets(0, 0, 0, 15);
        c.gridwidth = 1;
        c.gridheight = 1;
        c.gridx = 3;
        c.gridy = 3;
        mainPanel.add(input, c);

        //Output
        c.insets = new Insets(15, 0, 0, 30);
        c.gridwidth = 1;
        c.gridheight = 1;
        c.gridx = 3;
        c.gridy = 4;
        mainPanel.add(output, c);

        //history panel
        c.insets = new Insets(0, 0, 0, 30);
        c.gridwidth = 1;
        c.gridheight = 2;
        c.gridx = 4;
        c.gridy = 3;
        c.ipadx = 0;
        c.ipady = 0;
        mainPanel.add(history, c);

    }
    public void footer(JFrame frame, JPanel mainPanel, JButton reset){
        mainPanel.setBackground(AppColors.BACKGROUND_COLOR.getColor());

        //Back Button
        c.insets = new Insets(15, 0, 30, -240);
        c.gridx = 2;
        c.gridy = 5;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.weightx = 1;
        c.weighty = 1;
        mainPanel.add(routs.menuWindowsListener(frame, mainPanel), c);

        //reset Button
        c.insets = new Insets(15, 0, 30, 0);
        c.gridx = 1;
        c.gridy = 5;
        mainPanel.add(reset, c);

    }
    public void footer(JFrame frame, JPanel mainPanel, JButton reset, String note){

        footer(frame, mainPanel, reset);

        //Note
        c.insets = new Insets(0, 30, 30, 0);
        c.gridx = 0;
        c.gridy = 5;
        mainPanel.add(appTexts.noteText(note), c);

    }
    public void footer(JFrame frame, JPanel mainPanel, JButton reset, JButton button1){

        footer(frame, mainPanel, reset);

        c.insets = new Insets(0, 30, 30, 0);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 5;
        mainPanel.add(button1, c);

    }
    public void footer(JFrame frame, JPanel mainPanel, JButton reset, JButton button1,
                       JButton button2,
                       JButton button3){
        mainPanel.setBackground(AppColors.BACKGROUND_COLOR.getColor());

        //Back Button
        c.insets = new Insets(15, 0, 30, -240);
        c.gridwidth = 1;
        c.gridx = 4;
        c.gridy = 5;
        mainPanel.add(routs.menuWindowsListener(frame, mainPanel), c);

        //reset Button
        c.insets = new Insets(15, 0, 30, 0);
        c.gridx = 3;
        c.gridy = 5;
        mainPanel.add(reset, c);

        //change number system
        c.insets = new Insets(0, 30, 30, 0);
        c.gridx = 0;
        c.gridy = 5;
        mainPanel.add(button1, c);

        c.insets = new Insets(0, 15, 30, 0);
        c.gridx = 1;
        c.gridy = 5;
        mainPanel.add(button2, c);

        c.insets = new Insets(0, 15, 30, 0);
        c.gridx = 2;
        c.gridy = 5;
        mainPanel.add(button3, c);

    }
    public void footerMenu(JPanel mainPanel){
        mainPanel.setBackground(AppColors.BACKGROUND_COLOR.getColor());

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
    }
}
