package View.Utils;

import javax.swing.*;
import java.awt.*;


public class AppTexts {

    public JLabel brandName() {
        JLabel bigTextLabel = new JLabel("Ledge Solver");
        bigTextLabel.setForeground(AppColors.PRIMARY_COLOR.getColor());
        bigTextLabel.setFont(new Font("Helvetica", Font.BOLD, 56));
        return bigTextLabel;
    }

    public JLabel bigTextTitle(String text) {
        JLabel newText = new JLabel(text);
        newText.setForeground(AppColors.GREEN_COLOR.getColor());
        newText.setFont(new Font("Helvetica", Font.BOLD, 24));
        return newText;
    }

    public JLabel descriptionText() {
        JLabel smallTextLabel = new JLabel("Arithmetic, Trigonometry, Bitwise, Money Exchange, Storage Converter, Number System Conversion, Binary Arithmetic");
        smallTextLabel.setForeground(AppColors.SECONDARY_COLOR.getColor());
        smallTextLabel.setFont(new Font("Helvetica", Font.BOLD, 14));
        return smallTextLabel;
    }

    public JLabel copyright() {
        JLabel copyRightTextLabel = new JLabel("\u00a9 2022 Huot Lysokheng. All right reserved", JLabel.CENTER);
        copyRightTextLabel.setVerticalAlignment(JLabel.CENTER);
        copyRightTextLabel.setFont(new Font("Helvetica", Font.PLAIN, 14));
        return copyRightTextLabel;
    }

    public JLabel mediumText(String text) {
        JLabel newText = new JLabel(text);
        newText.setForeground(AppColors.PRIMARY_COLOR.getColor());
        newText.setFont(new Font("Helvetica", Font.BOLD, 22));
        return newText;
    }

    public JLabel guidedText(String text) {
        JLabel newText = new JLabel(text);
        newText.setForeground(AppColors.SECONDARY_COLOR.getColor());
        newText.setFont(new Font("Helvetica", Font.BOLD, 20));
        return newText;
    }

    public JTextArea noteText(String text) {
        JTextArea newText = new JTextArea(text);
        newText.setBackground(AppColors.BACKGROUND_COLOR.getColor());
        newText.setForeground(AppColors.SECONDARY_COLOR.getColor());
        newText.setFont(new Font("Helvetica", Font.BOLD, 14));
        return newText;
    }
}
