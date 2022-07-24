package View.Components;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;


public class OutputArea extends JPanel {

    JTextArea textArea;

    public JTextArea outputArea() {

        textArea = new JTextArea();
        textArea.setEditable(false);
        Font fieldFont = new Font("Helvetica", Font.BOLD, 17);
        textArea.setFont(fieldFont);
        textArea.setBackground(Color.LIGHT_GRAY);
        textArea.setForeground(Color.DARK_GRAY);
        textArea.setBorder(BorderFactory.createCompoundBorder(
                new CustomBorder(),
                new EmptyBorder(new Insets(25, 25, 25, 25))));


        add(textArea, BorderLayout.CENTER);
        setBackground(Color.WHITE);
        setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        return textArea;
    }
}