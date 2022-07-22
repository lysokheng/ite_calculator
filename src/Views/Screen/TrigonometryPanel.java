package Views.Screen;

import Controller.TrigonometryController;
import Model.TrigonometryModel;
import Views.Detail.Utils.Routes;
import Views.Detail.TrigonometryView;
import Views.Detail.Utils.AppColors;
import Views.Detail.Utils.AppTexts;
import Views.ScreenLayout;

import javax.swing.*;

import java.awt.GridBagLayout;

public class TrigonometryPanel extends ScreenLayout {

    AppColors appColors = new AppColors();
    AppTexts appTexts = new AppTexts();
    Routes routs = new Routes();
    TrigonometryView trigonometryView = new TrigonometryView();
    TrigonometryModel trigonometryModel = new TrigonometryModel();
    TrigonometryController trigonometryController = new TrigonometryController(trigonometryModel, trigonometryView);


    public JPanel trigonometryPanel(JFrame frame) {
        //create object
        JPanel mainPanel = new JPanel(new GridBagLayout());
        TrigonometryPanel trigonometryPanel = new TrigonometryPanel();

        trigonometryPanel.header(mainPanel);
        trigonometryPanel.bodyWithScrollOperator(mainPanel, "Trigonometry",
                trigonometryView.input(),
                trigonometryView.operator(),
                trigonometryView.output(),
                trigonometryView.history());
        trigonometryPanel.footer(frame,
                mainPanel,
                trigonometryView.getResetButton());

        return mainPanel;
    }
}

