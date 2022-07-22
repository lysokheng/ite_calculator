package Views.Screen;

import Controller.ArithmeticController;
import Model.ArithmeticModel;
import Views.Detail.Utils.Routes;
import Views.Detail.ArithmeticView;
import Views.Detail.Utils.AppColors;
import Views.Detail.Utils.AppTexts;
import Views.ScreenLayout;

import javax.swing.*;

import java.awt.GridBagLayout;

public class ArithmeticPanel extends ScreenLayout {
    //... create object
    AppColors appColors = new AppColors();
    AppTexts appTexts = new AppTexts();
    Routes routs = new Routes();
    ArithmeticView arithmeticView = new ArithmeticView();
    ArithmeticModel arithmeticModel = new ArithmeticModel();
    ArithmeticController arithmeticController = new ArithmeticController(arithmeticModel, arithmeticView);

    //======================================================= Panel
    public JPanel arithmeticPanel(JFrame frame) {
        //create object
        JPanel mainPanel = new JPanel(new GridBagLayout());
        ArithmeticPanel arithmeticPanel = new ArithmeticPanel();

        arithmeticPanel.header(mainPanel);
        arithmeticPanel.body(mainPanel, "Arithmetic",
                arithmeticView.input(),
                arithmeticView.operator(),
                arithmeticView.output(),
                arithmeticView.history()
                );
        arithmeticPanel.footer(frame, mainPanel, arithmeticView.getResetButton());

        return mainPanel;
    }
}

