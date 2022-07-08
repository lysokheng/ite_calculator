package Views.Widgets.Components;

import javax.swing.*;
import javax.swing.border.AbstractBorder;
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
                if(keyChar >= java.awt.event.KeyEvent.VK_0 && keyChar <= java.awt.event.KeyEvent.VK_9){
                }else if (keyChar >= java.awt.event.KeyEvent.VK_A && keyChar <= java.awt.event.KeyEvent.VK_F){
                }else if(keyChar >= 0x61 && keyChar <= 0x66){//af
                }else if( keyChar == java.awt.event.KeyEvent.VK_BACK_SPACE
                        || keyChar == java.awt.event.KeyEvent.VK_LEFT
                        || keyChar == java.awt.event.KeyEvent.VK_RIGHT){
                }else{
                    e.consume() ;//Key, shield illegal input
                }
            }
        });
        Font fieldFont = new Font("Helvetica", Font.BOLD, 20);
        textField.setFont(fieldFont);
        textField.setBackground(Color.lightGray);
        textField.setForeground(Color.DARK_GRAY);
        textField.setColumns(10);
        textField.setBorder(BorderFactory.createCompoundBorder(
                new CustomBorder(),
                new EmptyBorder(new Insets(25, 25, 25, 25))));

        add(textField, BorderLayout.CENTER);
        setBackground(Color.WHITE);
        setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        return textField;
    }

    static class CustomBorder extends AbstractBorder {
        @Override
        public void paintBorder(Component c, Graphics g, int x, int y,
                                int width, int height) {
            // TODO Auto-generated method stubs
            super.paintBorder(c, g, x, y, width, height);
            Graphics2D g2d = (Graphics2D) g;
            g2d.setStroke(new BasicStroke(12));
            g2d.setColor(Color.WHITE);
            g2d.drawRoundRect(x, y, width - 1, height - 1, 25, 25);
        }
    }
}