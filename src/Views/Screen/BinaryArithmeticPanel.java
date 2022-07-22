package Views.Screen;

import Controller.BinaryArithmeticController;
import Model.BinaryArithmeticModel;
import Views.Detail.Utils.Routes;
import Views.Detail.BinaryArithmeticView;
import Views.Detail.Utils.AppColors;
import Views.Detail.Utils.AppTexts;
import Views.ScreenLayout;

import javax.swing.*;

import java.awt.GridBagLayout;

public class BinaryArithmeticPanel extends ScreenLayout {

    AppColors appColors = new AppColors();
    AppTexts appTexts = new AppTexts();
    Routes routs = new Routes();
    BinaryArithmeticView binaryArithmeticView = new BinaryArithmeticView();
    BinaryArithmeticModel binaryArithmeticModel = new BinaryArithmeticModel();
    BinaryArithmeticController binaryArithmeticController = new BinaryArithmeticController(
            binaryArithmeticModel, binaryArithmeticView
    );

    public JPanel binaryArithmeticPanel(JFrame frame) {
        //create object
        JPanel mainPanel = new JPanel(new GridBagLayout());
        BinaryArithmeticPanel binaryArithmeticPanel = new BinaryArithmeticPanel();

        binaryArithmeticPanel.header(mainPanel);
        binaryArithmeticPanel.body(mainPanel,
                "Binary Arithmetic",
                binaryArithmeticView.input(),
                binaryArithmeticView.operator(),
                binaryArithmeticView.output(),
                binaryArithmeticView.history()
                );
        binaryArithmeticPanel.footer(frame,
                mainPanel,
                binaryArithmeticView.getResetButton(),
                """
                Note:\s
                
                For Divide operator, remember A field is dividend\s
                and B field is divisor.""");

        return mainPanel;
    }
}

