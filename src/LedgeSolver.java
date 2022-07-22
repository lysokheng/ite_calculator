import java.awt.*;

/**
 * AUTHOR: HUOT LYSOKHENG
 * DATE: 17/06/2022
 * University: Royal University of Phnom Penh
 * Department: Information Technology Engineering
 * Year: 2  Semester: 2
 * Generation: 7th
 * Course: Advanced Programming Language II
 * Lecturer: Kor Sokchea
 * Project: ITECalculatorGUI
 */

public class LedgeSolver {

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MainGUI mainGUI = new MainGUI();
                    mainGUI.createWindow();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
