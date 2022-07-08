package Views.Widgets.Utils;

import javax.swing.JFrame;
import javax.swing.ImageIcon;

public class AppIcons {

    public void appIcon(JFrame frame) {
        ImageIcon img = new ImageIcon("Assets/Images/ITECalculatorIcon.png");
        frame.setIconImage(img.getImage());
    }
}