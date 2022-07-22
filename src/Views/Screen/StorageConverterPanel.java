package Views.Screen;

import Controller.StorageConverterController;
import Model.StorageConverterModel;
import Views.Detail.Utils.Routes;
import Views.Detail.StorageConverterView;
import Views.Detail.Utils.AppColors;
import Views.Detail.Utils.AppTexts;
import Views.ScreenLayout;

import javax.swing.*;

import java.awt.GridBagLayout;

public class StorageConverterPanel extends ScreenLayout {

    AppColors appColors = new AppColors();
    AppTexts appTexts = new AppTexts();
    Routes routs = new Routes();
    StorageConverterView storageConverterView = new StorageConverterView();
    StorageConverterModel storageConverterModel = new StorageConverterModel();
    StorageConverterController storageConverterController = new StorageConverterController(
            storageConverterModel, storageConverterView
    );

    public JPanel storageConverterPanel(JFrame frame) {
        //create object
        JPanel mainPanel = new JPanel(new GridBagLayout());
        StorageConverterPanel storageConverterPanel = new StorageConverterPanel();

        storageConverterPanel.header(mainPanel);
        storageConverterPanel.bodyWithScrollOperator(
                mainPanel,
                "Storage Converter",
                storageConverterView.input(),
                storageConverterView.operator(),
                storageConverterView.output(),
                storageConverterView.history()
        );
        storageConverterPanel.footer(
                frame,
                mainPanel,
                storageConverterView.getResetButton()
        );

        return mainPanel;
    }
}

