package Views;

import Views.DecorationLayout.MenuLayout;
import Views.Widgets.Utils.AppIcons;

import javax.swing.*;

public class MainGUI {

    AppIcons appIcons = new AppIcons();

    public void createWindow() {
        JFrame frame = new JFrame("ITECalculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MenuLayout menuLayout = new MenuLayout();
        menuLayout.menuPanel(frame);
        frame.setResizable(false);
        frame.setSize(1440, 900);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        appIcons.appIcon(frame);
    }
}
