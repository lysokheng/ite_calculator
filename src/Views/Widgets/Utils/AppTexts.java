package Views.Widgets.Utils;

import javax.swing.*;

import java.awt.*;


public class AppTexts {

    AppColors appColors = new AppColors();

    public JLabel bigText() {
        JLabel bigTextLabel = new JLabel("Ledge Solver");
        bigTextLabel.setForeground(appColors.getPRIMARY_COLOR());
        bigTextLabel.setFont(new Font("Helvetica", Font.BOLD, 56));
        return bigTextLabel;
    }

    public JLabel bigTextTitle(String text) {
        JLabel newText = new JLabel(text);
        newText.setForeground(appColors.getGREEN_COLOR());
        newText.setFont(new Font("Helvetica", Font.BOLD, 28));
        return newText;
    }

    public JLabel descriptionText() {
        JLabel smallTextLabel = new JLabel("Arithmetic, Trigonometry, Bitwise, Money Exchange, Storage Converter, Number System Conversion, Binary Arithmetic");
        smallTextLabel.setForeground(appColors.getSECONDARY_COLOR());
        smallTextLabel.setFont(new Font("Helvetica", Font.BOLD, 14));
        return smallTextLabel;
    }

    public JLabel footerText() {
        JLabel copyRightTextLabel = new JLabel("\u00a9 2022 Huot Lysokheng. All right reserved", JLabel.CENTER);
        copyRightTextLabel.setVerticalAlignment(JLabel.CENTER);
        copyRightTextLabel.setFont(new Font("Helvetica", Font.PLAIN, 14));
        return copyRightTextLabel;
    }

    public JLabel mediumText(String text) {
        JLabel newText = new JLabel(text);
        newText.setForeground(appColors.getPRIMARY_COLOR());
        newText.setFont(new Font("Helvetica", Font.BOLD, 24));
        return newText;
    }

    public JLabel guidedText(String text) {
        JLabel newText = new JLabel(text);
        newText.setForeground(appColors.getSECONDARY_COLOR());
        newText.setFont(new Font("Helvetica", Font.BOLD, 24));
        return newText;
    }

    public JTextArea noteText(String text) {
        JTextArea newText = new JTextArea(text);
        newText.setBackground(appColors.getBACKGROUND_COLOR());
        newText.setForeground(appColors.getSECONDARY_COLOR());
        newText.setFont(new Font("Helvetica", Font.BOLD, 14));
        return newText;
    }
}
