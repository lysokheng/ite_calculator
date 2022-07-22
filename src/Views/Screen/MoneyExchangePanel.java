package Views.Screen;

import Controller.MoneyExchangeController;
import Model.MoneyExchangeModel;
import Views.Detail.Utils.Routes;
import Views.Detail.MoneyExchangeView;
import Views.Detail.Utils.AppColors;
import Views.Detail.Utils.AppTexts;
import Views.ScreenLayout;

import javax.swing.*;

import java.awt.GridBagLayout;

public class MoneyExchangePanel extends ScreenLayout {

    AppColors appColors = new AppColors();
    AppTexts appTexts = new AppTexts();
    Routes routs = new Routes();
    MoneyExchangeView moneyExchangeView = new MoneyExchangeView();
    MoneyExchangeModel moneyExchangeModel = new MoneyExchangeModel();
    MoneyExchangeController moneyExchangeController = new MoneyExchangeController(
            moneyExchangeModel, moneyExchangeView
    );

    public JPanel moneyExchangePanel(JFrame frame) {
        //create object
        JPanel mainPanel = new JPanel(new GridBagLayout());
        MoneyExchangePanel moneyExchangePanel = new MoneyExchangePanel();

        moneyExchangePanel.header(mainPanel);
        moneyExchangePanel.bodyWithScrollOperator(
                mainPanel,
                "Money Exchange",
                moneyExchangeView.input(),
                moneyExchangeView.operator(),
                moneyExchangeView.output(),
                moneyExchangeView.history()
        );
        moneyExchangePanel.footer(
                frame,
                mainPanel,
                moneyExchangeView.getResetButton()
        );

        return mainPanel;
    }
}

