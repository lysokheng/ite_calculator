package Views.Screen;

import Controller.NSCBinaryController;
import Model.NSCBinaryModel;
import Views.Detail.Utils.Routes;
import Views.Detail.NSCBinaryView;
import Views.Detail.Utils.AppColors;
import Views.Detail.Utils.AppTexts;
import Views.ScreenLayout;

import javax.swing.*;
import java.awt.*;

public class NSCBinaryPanel extends ScreenLayout {

    AppColors appColors = new AppColors();
    AppTexts appTexts = new AppTexts();
    Routes routs = new Routes();
    NSCBinaryView nscBinaryView = new NSCBinaryView();
    NSCBinaryModel nscBinaryModel = new NSCBinaryModel();
    NSCBinaryController nscBinaryController = new NSCBinaryController(nscBinaryModel, nscBinaryView);

    public JPanel numberSystemConversionBinaryPanel(JFrame frame) {
        //create object
        JPanel mainPanel = new JPanel(new GridBagLayout());
        NSCBinaryPanel nscBinaryPanel = new NSCBinaryPanel();

        nscBinaryPanel.headerWith3NumberSystem(mainPanel);
        nscBinaryPanel.bodyWith3NumberSystem(
                mainPanel,
                "Number System Conversion Binary",
                nscBinaryView.input(),
                nscBinaryView.operator(),
                nscBinaryView.output(),
                nscBinaryView.history()
        );
        nscBinaryPanel.footer(
                frame,
                mainPanel,
                nscBinaryView.getResetButton(),
                routs.changeToDecimalListener(frame, mainPanel),
                routs.changeToHexadecimalListener(frame, mainPanel),
                routs.changeToOctalListener(frame, mainPanel)
        );

        return mainPanel;
    }
}

