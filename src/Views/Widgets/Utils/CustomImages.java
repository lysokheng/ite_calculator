package Views.Widgets.Utils;

import javax.swing.JButton;
import javax.swing.ImageIcon;

import java.awt.Image;

public class CustomImages {
    public void customImageButton(JButton button) {
        button.setOpaque(false);
        button.setContentAreaFilled(false);
        button.setBorderPainted(false);
        button.setFocusPainted(false);

    }

    public ImageIcon resizeImageMenu(ImageIcon imageIcon) {
        Image image = imageIcon.getImage(); // transform it
        Image newImg = image.getScaledInstance(280, 180, java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
        imageIcon = new ImageIcon(newImg);  // transform it back

        return imageIcon;
    }

    public ImageIcon resizeImageCalculate(ImageIcon imageIcon) {
        Image image = imageIcon.getImage(); // transform it
        Image newImg = image.getScaledInstance(180, 60, java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
        imageIcon = new ImageIcon(newImg);  // transform it back

        return imageIcon;
    }

    public ImageIcon resizeImageOperator(ImageIcon imageIcon) {
        Image image = imageIcon.getImage(); // transform it
        Image newImg = image.getScaledInstance(200, 75, java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
        imageIcon = new ImageIcon(newImg);  // transform it back

        return imageIcon;
    }

    public ImageIcon resizeImageButtonCalculator(ImageIcon imageIcon) {
        Image image = imageIcon.getImage(); // transform it
        Image newImg = image.getScaledInstance(90, 75, java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
        imageIcon = new ImageIcon(newImg);  // transform it back

        return imageIcon;
    }

    public ImageIcon resizeImageButtonCalculator2Buttons(ImageIcon imageIcon) {
        Image image = imageIcon.getImage(); // transform it
        Image newImg = image.getScaledInstance(180, 75, java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
        imageIcon = new ImageIcon(newImg);  // transform it back

        return imageIcon;
    }

    public ImageIcon resizeImageButtonNumberSystemButtons(ImageIcon imageIcon) {
        Image image = imageIcon.getImage(); // transform it
        Image newImg = image.getScaledInstance(160, 50, java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
        imageIcon = new ImageIcon(newImg);  // transform it back

        return imageIcon;
    }
}
