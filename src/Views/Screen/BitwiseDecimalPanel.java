package Views.Screen;

import Controller.BitwiseDecimalController;
import Model.BitwiseDecimalModel;
import Views.Detail.Utils.Routes;
import Views.Detail.BitwiseDecimalView;
import Views.Detail.Utils.AppColors;
import Views.Detail.Utils.AppTexts;
import Views.ScreenLayout;

import javax.swing.*;

import java.awt.GridBagLayout;

public class BitwiseDecimalPanel extends ScreenLayout {

    AppColors appColors = new AppColors();
    AppTexts appTexts = new AppTexts();
    Routes routs = new Routes();
    BitwiseDecimalView bitwiseDecimalView = new BitwiseDecimalView();
    BitwiseDecimalModel bitwiseDecimalModel = new BitwiseDecimalModel();
    BitwiseDecimalController bitwiseDecimalController = new BitwiseDecimalController(
            bitwiseDecimalModel, bitwiseDecimalView
    );

    public JPanel bitwisePanel(JFrame frame) {
        //create object
        JPanel mainPanel = new JPanel(new GridBagLayout());
        BitwiseBinaryPanel bitwiseBinaryPanel = new BitwiseBinaryPanel();

        bitwiseBinaryPanel.header(mainPanel);
        bitwiseBinaryPanel.body(
                mainPanel,
                "Bitwise Decimal",
                bitwiseDecimalView.input(),
                bitwiseDecimalView.operator(),
                bitwiseDecimalView.output(),
                bitwiseDecimalView.history()
        );
        bitwiseBinaryPanel.footer(
                frame,
                mainPanel,
                bitwiseDecimalView.getResetButton(),
                routs.bitwiseBinaryListener(frame, mainPanel)
        );

        return mainPanel;
    }
}

