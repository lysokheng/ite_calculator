package Views.Screen;

import Controller.SetTheoryController;
import Model.SetTheoryModel;
import Views.Detail.SetTheoryView;
import Views.ScreenLayout;

import javax.swing.*;

import java.awt.GridBagLayout;

public class SetTheoryPanel extends ScreenLayout {

    SetTheoryView setTheoryView = new SetTheoryView();
    SetTheoryModel setTheoryModel = new SetTheoryModel();
    SetTheoryController setTheoryController = new SetTheoryController(setTheoryModel, setTheoryView);


    public JPanel setTheoryPanel(JFrame frame) {
        //create object
        JPanel mainPanel = new JPanel(new GridBagLayout());
        SetTheoryPanel setTheoryPanel = new SetTheoryPanel();

        setTheoryPanel.header(mainPanel);
        setTheoryPanel.body(
                mainPanel,
                "Set Theory",
                setTheoryView.input(),
                setTheoryView.operator(),
                setTheoryView.output(),
                setTheoryView.history()
        );
        setTheoryPanel.footer(
                frame,
                mainPanel,
                setTheoryView.getResetButton(),
                """
                Note:\s
                
                To separate the numbers, you can use space\s
                to separate between each numbers."""
        );

        return mainPanel;
    }
}

