package Views.Widgets.Components;

import Views.Widgets.Utils.AppColors;

import javax.swing.*;
import javax.swing.border.AbstractBorder;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class HistoryArea extends JPanel {

    JTextArea textArea;
    AppColors appColors = new AppColors();

    public JTextArea historyArea() {

        textArea = new JTextArea();
        textArea.setEditable(false);
        Font fieldFont = new Font("Helvetica", Font.BOLD, 20);
        textArea.setFont(fieldFont);
        textArea.setBackground(Color.lightGray);
        textArea.setForeground(Color.DARK_GRAY);
        textArea.setColumns(40);
        textArea.setBorder(BorderFactory.createCompoundBorder(
                new CustomBorder(),
                new EmptyBorder(new Insets(25, 25, 25, 25))));

        add(textArea, BorderLayout.CENTER);
        setBackground(Color.WHITE);
        setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        textArea.addMouseListener(new MouseHover());

        return textArea;
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

    class MouseHover implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {

        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {
            textArea.setBackground(Color.WHITE);
            textArea.setForeground(appColors.getGREEN_COLOR());
        }

        @Override
        public void mouseExited(MouseEvent e) {
            textArea.setBackground(Color.LIGHT_GRAY);
            textArea.setForeground(Color.DARK_GRAY);
        }
    }
}