package Views.Widgets.Components;

import Views.Widgets.Utils.AppColors;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class InputFieldDecimalWithSpace extends JPanel {

    AppColors appColors = new AppColors();

    JTextField textField;

    public JTextField inputField() {

        textField = new JTextField();
        textField.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE) && (c != KeyEvent.VK_SPACE)) {
                    e.consume();  // ignore event
                }
            }
        });
        Font fieldFont = new Font("Helvetica", Font.BOLD, 17);
        textField.setFont(fieldFont);
        textField.setBackground(Color.lightGray);
        textField.setForeground(Color.DARK_GRAY);
        textField.setColumns(10);
        textField.setBorder(BorderFactory.createCompoundBorder(
                new CustomBorderIO(),
                new EmptyBorder(new Insets(25, 25, 25, 25))));

        add(textField, BorderLayout.CENTER);
        setBackground(Color.WHITE);
        setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        return textField;
    }
}