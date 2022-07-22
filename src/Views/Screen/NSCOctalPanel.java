package Views.Screen;

import Controller.NSCOctalController;
import Model.NSCOctalModel;
import Views.Detail.Utils.Routes;
import Views.Detail.Utils.AppColors;
import Views.Detail.Utils.AppTexts;
import Views.Detail.NSCOctalView;
import Views.ScreenLayout;

import javax.swing.*;
import java.awt.*;

public class NSCOctalPanel extends ScreenLayout {

    AppColors appColors = new AppColors();
    AppTexts appTexts = new AppTexts();
    Routes routs = new Routes();
    NSCOctalView nscOctalView = new NSCOctalView();
    NSCOctalModel nscOctalModel = new NSCOctalModel();
    NSCOctalController nscOctalController = new NSCOctalController(nscOctalModel, nscOctalView);

    public JPanel numberSystemConversionOctalPanel(JFrame frame) {
        //create object
        JPanel mainPanel = new JPanel(new GridBagLayout());

        NSCOctalPanel nscOctalPanel = new NSCOctalPanel();

        nscOctalPanel.headerWith3NumberSystem(mainPanel);
        nscOctalPanel.bodyWith3NumberSystem(
                mainPanel,
                "Number System Conversion Octal",
                nscOctalView.input(),
                nscOctalView.operator(),
                nscOctalView.output(),
                nscOctalView.history()
        );
        nscOctalPanel.footer(
                frame,
                mainPanel,
                nscOctalView.getResetButton(),
                routs.changeToDecimalListener(frame, mainPanel),
                routs.changeToBinaryListener(frame, mainPanel),
                routs.changeToHexadecimalListener(frame, mainPanel)
        );

        return mainPanel;
    }
}

