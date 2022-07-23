package Views.Screen;

import Model.RoutesModel;
import Views.Detail.Utils.AppColors;
import Views.Detail.Utils.AppTexts;

import javax.swing.*;
import java.awt.*;

public class ScreenLayout {
    //... create object
    AppColors appColors = new AppColors();
    AppTexts appTexts = new AppTexts();
    RoutesModel routs = new RoutesModel();

    //create grid custom object
    GridBagConstraints c = new GridBagConstraints();

    public JPanel header(JPanel mainPanel){

        mainPanel.setBackground(appColors.getBACKGROUND_COLOR());

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

        return mainPanel;
    }

    public JPanel headerWith3NumberSystem(JPanel mainPanel){

        mainPanel.setBackground(appColors.getBACKGROUND_COLOR());

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

        return mainPanel;
    }


    public JPanel body(JPanel mainPanel, String title,
                       JPanel input,
                       JPanel operator,
                       JPanel output,
                       JPanel history
    ){
        mainPanel.setBackground(appColors.getBACKGROUND_COLOR());

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
        mainPanel.add(appTexts.guidedText("Input"), c);

        //History Text
        c.insets = new Insets(15, 0, 15, 0);
        c.gridx = 2;
        c.gridy = 2;
        mainPanel.add(appTexts.guidedText("History"), c);

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

        return mainPanel;
    }

    public JPanel bodyWithScrollOperator(JPanel mainPanel, String title,
                       JPanel input,
                       JPanel operator,
                       JPanel output,
                       JPanel history
                       ){
        mainPanel.setBackground(appColors.getBACKGROUND_COLOR());

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
        mainPanel.add(appTexts.guidedText("Input"), c);

        //History Text
        c.insets = new Insets(15, 0, 15, 0);
        c.gridx = 2;
        c.gridy = 2;
        mainPanel.add(appTexts.guidedText("History"), c);

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

        return mainPanel;
    }

    public JPanel bodyWith3NumberSystem(JPanel mainPanel, String title,
                       JPanel input,
                       JPanel operator,
                       JPanel output,
                       JPanel history
    ){
        mainPanel.setBackground(appColors.getBACKGROUND_COLOR());

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

        return mainPanel;
    }

    public JPanel footer(JFrame frame, JPanel mainPanel, JButton reset){
        mainPanel.setBackground(appColors.getBACKGROUND_COLOR());

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

        return mainPanel;
    }

    public JPanel footer(JFrame frame, JPanel mainPanel, JButton reset, String note){

        footer(frame, mainPanel, reset);

        //Note
        c.insets = new Insets(0, 30, 30, 0);
        c.gridx = 0;
        c.gridy = 5;
        mainPanel.add(appTexts.noteText(note), c);

        return mainPanel;
    }

    public JPanel footer(JFrame frame, JPanel mainPanel, JButton reset, JButton button1){

        footer(frame, mainPanel, reset);

        c.insets = new Insets(0, 30, 30, 0);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 5;
        mainPanel.add(button1, c);

        return mainPanel;
    }

    public JPanel footer(JFrame frame, JPanel mainPanel, JButton reset, JButton button1,
                         JButton button2,
                         JButton button3){
        mainPanel.setBackground(appColors.getBACKGROUND_COLOR());

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

        return mainPanel;
    }
}
