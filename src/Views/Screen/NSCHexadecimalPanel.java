package Views.Screen;

import Controller.NSCHexadecimalController;
import Model.NSCHexadecimalModel;
import Views.Detail.Utils.Routes;
import Views.Detail.Utils.AppColors;
import Views.Detail.Utils.AppTexts;
import Views.Detail.NSCHexadecimalView;
import Views.ScreenLayout;

import javax.swing.*;
import java.awt.*;

public class NSCHexadecimalPanel extends ScreenLayout {

    AppColors appColors = new AppColors();
    AppTexts appTexts = new AppTexts();
    Routes routs = new Routes();

    NSCHexadecimalView nscHexadecimalView = new NSCHexadecimalView();
    NSCHexadecimalModel nscHexadecimalModel = new NSCHexadecimalModel();
    NSCHexadecimalController nscHexadecimalController = new NSCHexadecimalController(nscHexadecimalModel, nscHexadecimalView);
    public JPanel numberSystemConversionHexadecimalPanel(JFrame frame) {
        //create object
        JPanel mainPanel = new JPanel(new GridBagLayout());
        NSCHexadecimalPanel nscHexadecimalPanel = new NSCHexadecimalPanel();

        nscHexadecimalPanel.headerWith3NumberSystem(mainPanel);
        nscHexadecimalPanel.bodyWith3NumberSystem(
                mainPanel,
                "Number System Conversion Hexadecimal",
                nscHexadecimalView.input(),
                nscHexadecimalView.operator(),
                nscHexadecimalView.output(),
                nscHexadecimalView.history()
        );
        nscHexadecimalPanel.footer(
                frame,
                mainPanel,
                nscHexadecimalView.getResetButton(),
                routs.changeToDecimalListener(frame, mainPanel),
                routs.changeToBinaryListener(frame, mainPanel),
                routs.changeToOctalListener(frame, mainPanel)
        );

        return mainPanel;
    }
}

