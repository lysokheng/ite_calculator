package Views.Detail.Components;

import Views.Detail.Utils.AppColors;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class OutputArea extends JPanel {

    JTextArea textArea;
    AppColors appColors = new AppColors();

    public JTextArea outputArea() {

        textArea = new JTextArea();
        textArea.setEditable(false);
        Font fieldFont = new Font("Helvetica", Font.BOLD, 17);
        textArea.setFont(fieldFont);
        textArea.setBackground(Color.LIGHT_GRAY);
        textArea.setForeground(Color.DARK_GRAY);
        textArea.setBorder(BorderFactory.createCompoundBorder(
                new CustomBorderIO(),
                new EmptyBorder(new Insets(25, 25, 25, 25))));


        add(textArea, BorderLayout.CENTER);
        setBackground(Color.WHITE);
        setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        textArea.addMouseListener(new MouseHover());


        return textArea;
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