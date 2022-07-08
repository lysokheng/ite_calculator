package Views.Widgets.Components;

import javax.swing.*;
import javax.swing.border.AbstractBorder;
import javax.swing.border.EmptyBorder;
import java.awt.*;


public class HistoryArea extends JPanel {

    JTextArea textField;

    public JTextArea historyArea() {

        textField = new JTextArea();
        textField.setEditable(false);
        Font fieldFont = new Font("Helvetica", Font.BOLD, 20);
        textField.setFont(fieldFont);
        textField.setBackground(Color.lightGray);
        textField.setForeground(Color.DARK_GRAY);
        textField.setColumns(40);
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