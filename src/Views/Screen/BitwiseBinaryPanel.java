package Views.Screen;

import Controller.BitwiseBinaryController;
import Model.BitwiseBinaryModel;
import Views.Detail.Utils.Routes;
import Views.Detail.Utils.AppColors;
import Views.Detail.Utils.AppTexts;
import Views.Detail.BitwiseBinaryView;
import Views.ScreenLayout;

import javax.swing.*;
import java.awt.*;

public class BitwiseBinaryPanel extends ScreenLayout {

    AppColors appColors = new AppColors();
    AppTexts appTexts = new AppTexts();
    Routes routs = new Routes();
    BitwiseBinaryView bitwiseBinaryView = new BitwiseBinaryView();
    BitwiseBinaryModel bitwiseBinaryModel = new BitwiseBinaryModel();
    BitwiseBinaryController bitwiseBinaryController = new BitwiseBinaryController(
            bitwiseBinaryModel, bitwiseBinaryView
    );

    public JPanel bitwisePanel(JFrame frame) {
        //create object
        JPanel mainPanel = new JPanel(new GridBagLayout());

        BitwiseBinaryPanel bitwiseBinaryPanel = new BitwiseBinaryPanel();

        bitwiseBinaryPanel.header(mainPanel);
        bitwiseBinaryPanel.body(mainPanel,
                "Bitwise Binary",
                bitwiseBinaryView.input(),
                bitwiseBinaryView.operator(),
                bitwiseBinaryView.output(),
                bitwiseBinaryView.history()
                );
        bitwiseBinaryPanel.footer(
                frame,
                mainPanel,
                bitwiseBinaryView.getResetButton(),
                routs.bitwiseDecimalListener(frame, mainPanel)
        );

        return mainPanel;
    }
}

