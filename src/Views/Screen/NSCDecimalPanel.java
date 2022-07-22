package Views.Screen;

import Controller.NSCDecimalController;
import Model.NSCDecimalModel;
import Views.Detail.Utils.Routes;
import Views.Detail.NSCDecimalView;
import Views.Detail.Utils.AppColors;
import Views.Detail.Utils.AppTexts;
import Views.ScreenLayout;

import javax.swing.*;

import java.awt.GridBagLayout;

public class NSCDecimalPanel extends ScreenLayout {

    AppColors appColors = new AppColors();
    AppTexts appTexts = new AppTexts();
    Routes routs = new Routes();
    NSCDecimalView nscDecimalView = new NSCDecimalView();
    NSCDecimalModel nscDecimalModel = new NSCDecimalModel();
    NSCDecimalController nscDecimalController = new NSCDecimalController(nscDecimalModel, nscDecimalView);

    public JPanel numberSystemConversionDecimalPanel(JFrame frame) {
        //create object
        JPanel mainPanel = new JPanel(new GridBagLayout());
        NSCDecimalPanel nscDecimalPanel = new NSCDecimalPanel();

        nscDecimalPanel.headerWith3NumberSystem(mainPanel);
        nscDecimalPanel.bodyWith3NumberSystem(
                mainPanel,
                "Number System Conversion Decimal",
                nscDecimalView.input(),
                nscDecimalView.operator(),
                nscDecimalView.output(),
                nscDecimalView.history()
        );
        nscDecimalPanel.footer(
                frame,
                mainPanel,
                nscDecimalView.getResetButton(),
                routs.changeToBinaryListener(frame, mainPanel),
                routs.changeToHexadecimalListener(frame, mainPanel),
                routs.changeToOctalListener(frame, mainPanel)
        );

        return mainPanel;
    }
}

