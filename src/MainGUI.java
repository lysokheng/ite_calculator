import Views.Screen.ScreenPanel;
import Views.Utils.AppIcons;

import javax.swing.*;

public class MainGUI extends ScreenPanel {

    AppIcons appIcons = new AppIcons();
    ScreenPanel.MenuPanel menuPanel = new MenuPanel();

    public void createWindow() {
        JFrame frame = new JFrame("Ledge Solver");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        menuPanel.menuPanel(frame);
        frame.setResizable(true);
        frame.setSize(1200, 700);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        appIcons.appIcon(frame);
    }
}
