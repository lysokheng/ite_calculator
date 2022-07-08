package Views;

import Views.DecorationLayout.*;
import Views.DecorationLayout.BitwiseWindows.BitwiseBinaryWindows;
import Views.DecorationLayout.BitwiseWindows.BitwiseDecimalWindows;
import Views.DecorationLayout.NumberSystemConversionWindows.NumberSystemConversionBinaryWindows;
import Views.DecorationLayout.NumberSystemConversionWindows.NumberSystemConversionDecimalWindows;
import Views.DecorationLayout.NumberSystemConversionWindows.NumberSystemConversionHexadecimalWindows;
import Views.DecorationLayout.NumberSystemConversionWindows.NumberSystemConversionOctalWindows;
import Views.Widgets.Utils.AppButtons;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Routes implements ActionListener {

    AppButtons appButtons = new AppButtons();

    public JButton exitListener() {
        //exit program
        JButton exitListener;
        exitListener = appButtons.exitButton();
        exitListener.addActionListener(e -> System.exit(1));

        return exitListener;
    }

    public JButton arithmeticListener(JFrame frame, JPanel mainPanel) {
        ArithmeticWindows arithmeticWindows = new ArithmeticWindows();

        //route to arithmetic windows
        JButton arithmeticListener;
        arithmeticListener = appButtons.arithmeticButton();
        arithmeticListener.addActionListener(e -> {
            frame.remove(mainPanel);
            frame.setContentPane(arithmeticWindows.arithmeticPanel(frame));
            frame.validate();
            frame.repaint();

        });

        return arithmeticListener;
    }

    public JButton trigonometryListener(JFrame frame, JPanel mainPanel) {
        TrigonometryWindows trigonometryWindows = new TrigonometryWindows();

        //route to trigonometryListener
        JButton trigonometryListener;
        trigonometryListener = appButtons.trigonometryButton();
        trigonometryListener.addActionListener(e -> {
            frame.remove(mainPanel);
            frame.setContentPane(trigonometryWindows.trigonometryPanel(frame));
            frame.validate();
            frame.repaint();
        });

        return trigonometryListener;
    }

    public JButton bitwiseDecimalWindowsListener(JFrame frame, JPanel mainPanel) {
        BitwiseDecimalWindows bitwiseDecimalWindows = new BitwiseDecimalWindows();

        //route to bitwiseListener
        JButton bitwiseListener;
        bitwiseListener = appButtons.bitwiseButton();
        bitwiseListener.addActionListener(e -> {
            frame.remove(mainPanel);
            frame.setContentPane(bitwiseDecimalWindows.bitwisePanel(frame));
            frame.validate();
            frame.repaint();
        });

        return bitwiseListener;
    }

    public JButton bitwiseDecimalListener(JFrame frame, JPanel mainPanel) {
        BitwiseDecimalWindows bitwiseDecimalWindows = new BitwiseDecimalWindows();

        //route to bitwiseListener
        JButton bitwiseListener;
        bitwiseListener = appButtons.changeToDecimalButton();
        bitwiseListener.addActionListener(e -> {
            frame.remove(mainPanel);
            frame.setContentPane(bitwiseDecimalWindows.bitwisePanel(frame));
            frame.validate();
            frame.repaint();
        });

        return bitwiseListener;
    }


    public JButton bitwiseBinaryListener(JFrame frame, JPanel mainPanel) {
        BitwiseBinaryWindows bitwiseBinaryWindows = new BitwiseBinaryWindows();

        //route to bitwiseListener
        JButton bitwiseListener;
        bitwiseListener = appButtons.changeToBinaryButton();
        bitwiseListener.addActionListener(e -> {
            frame.remove(mainPanel);
            frame.setContentPane(bitwiseBinaryWindows.bitwisePanel(frame));
            frame.validate();
            frame.repaint();
        });

        return bitwiseListener;
    }


    public JButton moneyExchangeListener(JFrame frame, JPanel mainPanel) {
        MoneyExchangeWindows moneyExchangeWindows = new MoneyExchangeWindows();

        //route moneyExchangeListener
        JButton moneyExchangeListener;
        moneyExchangeListener = appButtons.moneyExchangeButton();
        moneyExchangeListener.addActionListener(e -> {
            frame.remove(mainPanel);
            frame.setContentPane(moneyExchangeWindows.moneyExchangePanel(frame));
            frame.validate();
            frame.repaint();
        });

        return moneyExchangeListener;
    }

    public JButton storageConverterListener(JFrame frame, JPanel mainPanel) {
        StorageConverterWindows storageConverterWindows = new StorageConverterWindows();

        //route storageConverterListener
        JButton storageConverterListener;
        storageConverterListener = appButtons.storageConverterButton();
        storageConverterListener.addActionListener(e -> {
            frame.remove(mainPanel);
            frame.setContentPane(storageConverterWindows.storageConverterPanel(frame));
            frame.validate();
            frame.repaint();
        });

        return storageConverterListener;
    }

    public JButton numberSystemConversionListener(JFrame frame, JPanel mainPanel) {
        NumberSystemConversionDecimalWindows numberSystemConversionDecimalWindows = new NumberSystemConversionDecimalWindows();

        //route numberSystemConversionListener
        JButton numberSystemConversionListener;
        numberSystemConversionListener = appButtons.numberSystemConversionButton();
        numberSystemConversionListener.addActionListener(e -> {
            frame.remove(mainPanel);
            frame.setContentPane(numberSystemConversionDecimalWindows.numberSystemConversionDecimalPanel(frame));
            frame.validate();
            frame.repaint();
        });

        return numberSystemConversionListener;
    }

    public JButton binaryArithmeticListener(JFrame frame, JPanel mainPanel) {
        BinaryArithmeticWindows binaryArithmeticWindows = new BinaryArithmeticWindows();

        //route to binaryArithmeticListener
        JButton binaryArithmeticListener;
        binaryArithmeticListener = appButtons.binaryArithmeticButton();
        binaryArithmeticListener.addActionListener(e -> {
            frame.remove(mainPanel);
            frame.setContentPane(binaryArithmeticWindows.binaryArithmeticPanel(frame));
            frame.validate();
            frame.repaint();
        });

        return binaryArithmeticListener;
    }

    public JButton setTheoryListener(JFrame frame, JPanel mainPanel) {
        SetTheoryWindows setTheoryWindows = new SetTheoryWindows();

        //route to setTheoryListener
        JButton setTheoryListener;
        setTheoryListener = appButtons.setTheoryButton();
        setTheoryListener.addActionListener(e -> {
            frame.remove(mainPanel);
            frame.setContentPane(setTheoryWindows.setTheoryPanel(frame));
            frame.validate();
            frame.repaint();
        });

        return setTheoryListener;
    }

    public JButton menuWindowsListener(JFrame frame, JPanel mainPanel) {
        MenuWindows menuWindows = new MenuWindows();
        //route to menuWindowsListener
        JButton mainWindowsListener;
        mainWindowsListener = appButtons.backButton();
        mainWindowsListener.addActionListener(e -> {
            frame.remove(mainPanel);
            frame.setContentPane(menuWindows.menuPanel(frame));
            frame.validate();
            frame.repaint();
        });

        return mainWindowsListener;
    }

    public JButton changeToBinaryListener(JFrame frame, JPanel mainPanel) {
        NumberSystemConversionBinaryWindows numberSystemConversionBinaryWidgets = new NumberSystemConversionBinaryWindows();
        //route to menuWindowsListener
        JButton numberSystemConversionBinaryListener;
        numberSystemConversionBinaryListener = appButtons.binaryButton();
        numberSystemConversionBinaryListener.addActionListener(e -> {
            frame.remove(mainPanel);
            frame.setContentPane(numberSystemConversionBinaryWidgets.numberSystemConversionBinaryPanel(frame));
            frame.validate();
            frame.repaint();
        });

        return numberSystemConversionBinaryListener;
    }

    public JButton changeToDecimalListener(JFrame frame, JPanel mainPanel) {
        NumberSystemConversionDecimalWindows numberSystemConversionDecimalWindows = new NumberSystemConversionDecimalWindows();
        //route to menuWindowsListener
        JButton numberSystemConversionDecimalListener;
        numberSystemConversionDecimalListener = appButtons.decimalButton();
        numberSystemConversionDecimalListener.addActionListener(e -> {
            frame.remove(mainPanel);
            frame.setContentPane(numberSystemConversionDecimalWindows.numberSystemConversionDecimalPanel(frame));
            frame.validate();
            frame.repaint();
        });

        return numberSystemConversionDecimalListener;
    }

    public JButton changeToHexadecimalListener(JFrame frame, JPanel mainPanel) {
        NumberSystemConversionHexadecimalWindows numberSystemConversionHexadecimalWindows = new NumberSystemConversionHexadecimalWindows();
        //route to menuWindowsListener
        JButton numberSystemConversionHexadecimalListener;
        numberSystemConversionHexadecimalListener = appButtons.hexaDecimalButton();
        numberSystemConversionHexadecimalListener.addActionListener(e -> {
            frame.remove(mainPanel);
            frame.setContentPane(numberSystemConversionHexadecimalWindows.numberSystemConversionHexadecimalPanel(frame));
            frame.validate();
            frame.repaint();
        });

        return numberSystemConversionHexadecimalListener;
    }

    public JButton changeToOctalListener(JFrame frame, JPanel mainPanel) {
        NumberSystemConversionOctalWindows numberSystemConversionOctalWindows = new NumberSystemConversionOctalWindows();
        //route to menuWindowsListener
        JButton numberSystemConversionOctalListener;
        numberSystemConversionOctalListener = appButtons.octalButton();
        numberSystemConversionOctalListener.addActionListener(e -> {
            frame.remove(mainPanel);
            frame.setContentPane(numberSystemConversionOctalWindows.numberSystemConversionOctalPanel(frame));
            frame.validate();
            frame.repaint();
        });

        return numberSystemConversionOctalListener;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
