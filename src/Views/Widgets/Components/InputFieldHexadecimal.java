package Views.Widgets.Components;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class InputFieldHexadecimal extends JPanel {

    JTextField textField;

    public JTextField inputField() {

        textField = new JTextField();
        textField.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                int keyChar = e.getKeyChar();
                if(keyChar >= KeyEvent.VK_0 && keyChar <= KeyEvent.VK_9){
                }else if (keyChar >= KeyEvent.VK_A && keyChar <= KeyEvent.VK_F){
                }else if(keyChar >= 0x61 && keyChar <= 0x66){//af
                }else if( keyChar == KeyEvent.VK_BACK_SPACE
                        || keyChar == KeyEvent.VK_LEFT
                        || keyChar == KeyEvent.VK_RIGHT){
                }else{
                    e.consume() ;//Key, shield illegal input
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