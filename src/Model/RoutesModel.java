package Model;

import Views.Detail.Utils.AppButtons;
import Views.Screen.*;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RoutesModel extends ScreenPanel implements ActionListener {

    AppButtons appButtons = new AppButtons();


    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public JButton exitListener() {
        //exit program
        JButton exitListener;
        exitListener = appButtons.exitButton();
        exitListener.addActionListener(eExit -> System.exit(1));

        return exitListener;
    }

    public JButton arithmeticListener(JFrame frame, JPanel mainPanel) {
        ArithmeticPanel arithmeticPanel = new ArithmeticPanel();

        //route to arithmetic windows
        JButton arithmeticListener;
        arithmeticListener = appButtons.arithmeticButton();
        arithmeticListener.addActionListener(e -> {
            frame.remove(mainPanel);
            frame.setContentPane(arithmeticPanel.arithmeticPanel(frame));
            frame.validate();
            frame.repaint();
        });

        return arithmeticListener;
    }

    public JButton trigonometryListener(JFrame frame, JPanel mainPanel) {
        TrigonometryPanel trigonometryPanel = new TrigonometryPanel();

        //route to trigonometryListener
        JButton trigonometryListener;
        trigonometryListener = appButtons.trigonometryButton();
        trigonometryListener.addActionListener(e -> {
            frame.remove(mainPanel);
            frame.setContentPane(trigonometryPanel.trigonometryPanel(frame));
            frame.validate();
            frame.repaint();
        });

        return trigonometryListener;
    }

    public JButton bitwiseDecimalWindowsListener(JFrame frame, JPanel mainPanel) {
        BitwiseDecimalPanel bitwiseDecimalPanel = new BitwiseDecimalPanel();

        //route to bitwiseListener
        JButton bitwiseListener;
        bitwiseListener = appButtons.bitwiseButton();
        bitwiseListener.addActionListener(e -> {
            frame.remove(mainPanel);
            frame.setContentPane(bitwiseDecimalPanel.bitwisePanel(frame));
            frame.validate();
            frame.repaint();
        });

        return bitwiseListener;
    }

    public JButton bitwiseDecimalListener(JFrame frame, JPanel mainPanel) {
        BitwiseDecimalPanel bitwiseDecimalPanel = new BitwiseDecimalPanel();

        //route to bitwiseListener
        JButton bitwiseListener;
        bitwiseListener = appButtons.changeToDecimalButton();
        bitwiseListener.addActionListener(e -> {
            frame.remove(mainPanel);
            frame.setContentPane(bitwiseDecimalPanel.bitwisePanel(frame));
            frame.validate();
            frame.repaint();
        });

        return bitwiseListener;
    }


    public JButton bitwiseBinaryListener(JFrame frame, JPanel mainPanel) {
        BitwiseBinaryPanel bitwiseBinaryPanel = new BitwiseBinaryPanel();

        //route to bitwiseListener
        JButton bitwiseListener;
        bitwiseListener = appButtons.changeToBinaryButton();
        bitwiseListener.addActionListener(e -> {
            frame.remove(mainPanel);
            frame.setContentPane(bitwiseBinaryPanel.bitwisePanel(frame));
            frame.validate();
            frame.repaint();
        });

        return bitwiseListener;
    }


    public JButton moneyExchangeListener(JFrame frame, JPanel mainPanel) {
        MoneyExchangePanel moneyExchangePanel = new MoneyExchangePanel();

        //route moneyExchangeListener
        JButton moneyExchangeListener;
        moneyExchangeListener = appButtons.moneyExchangeButton();
        moneyExchangeListener.addActionListener(e -> {
            frame.remove(mainPanel);
            frame.setContentPane(moneyExchangePanel.moneyExchangePanel(frame));
            frame.validate();
            frame.repaint();
        });

        return moneyExchangeListener;
    }

    public JButton storageConverterListener(JFrame frame, JPanel mainPanel) {
        StorageConverterPanel storageConverterPanel = new StorageConverterPanel();

        //route storageConverterListener
        JButton storageConverterListener;
        storageConverterListener = appButtons.storageConverterButton();
        storageConverterListener.addActionListener(e -> {
            frame.remove(mainPanel);
            frame.setContentPane(storageConverterPanel.storageConverterPanel(frame));
            frame.validate();
            frame.repaint();
        });

        return storageConverterListener;
    }

    public JButton numberSystemConversionListener(JFrame frame, JPanel mainPanel) {
        NSCDecimalPanel numberSystemConversionDecimalWindows = new NSCDecimalPanel();

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
        BinaryArithmeticPanel binaryArithmeticPanel = new BinaryArithmeticPanel();

        //route to binaryArithmeticListener
        JButton binaryArithmeticListener;
        binaryArithmeticListener = appButtons.binaryArithmeticButton();
        binaryArithmeticListener.addActionListener(e -> {
            frame.remove(mainPanel);
            frame.setContentPane(binaryArithmeticPanel.binaryArithmeticPanel(frame));
            frame.validate();
            frame.repaint();
        });

        return binaryArithmeticListener;
    }

    public JButton setTheoryListener(JFrame frame, JPanel mainPanel) {
        SetTheoryPanel setTheoryPanel = new SetTheoryPanel();

        //route to setTheoryListener
        JButton setTheoryListener;
        setTheoryListener = appButtons.setTheoryButton();
        setTheoryListener.addActionListener(e -> {
            frame.remove(mainPanel);
            frame.setContentPane(setTheoryPanel.setTheoryPanel(frame));
            frame.validate();
            frame.repaint();
        });

        return setTheoryListener;
    }

    public JButton menuWindowsListener(JFrame frame, JPanel mainPanel) {
        MenuLayout menuLayout = new MenuLayout();
        //route to menuWindowsListener
        JButton mainWindowsListener;
        mainWindowsListener = appButtons.backButton();
        mainWindowsListener.addActionListener(e -> {
            frame.remove(mainPanel);
            frame.setContentPane(menuLayout.menuPanel(frame));
            frame.validate();
            frame.repaint();
        });

        return mainWindowsListener;
    }

    public JButton changeToBinaryListener(JFrame frame, JPanel mainPanel) {
        NSCBinaryPanel numberSystemConversionBinaryWidgets = new NSCBinaryPanel();
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
        NSCDecimalPanel numberSystemConversionDecimalWindows = new NSCDecimalPanel();
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
        NSCHexadecimalPanel NSCHexadecimalPanel = new NSCHexadecimalPanel();
        //route to menuWindowsListener
        JButton numberSystemConversionHexadecimalListener;
        numberSystemConversionHexadecimalListener = appButtons.hexaDecimalButton();
        numberSystemConversionHexadecimalListener.addActionListener(e -> {
            frame.remove(mainPanel);
            frame.setContentPane(NSCHexadecimalPanel.numberSystemConversionHexadecimalPanel(frame));
            frame.validate();
            frame.repaint();
        });

        return numberSystemConversionHexadecimalListener;
    }

    public JButton changeToOctalListener(JFrame frame, JPanel mainPanel) {
        NSCOctalPanel NSCOctalPanel = new NSCOctalPanel();
        //route to menuWindowsListener
        JButton numberSystemConversionOctalListener;
        numberSystemConversionOctalListener = appButtons.octalButton();
        numberSystemConversionOctalListener.addActionListener(e -> {
            frame.remove(mainPanel);
            frame.setContentPane(NSCOctalPanel.numberSystemConversionOctalPanel(frame));
            frame.validate();
            frame.repaint();
        });

        return numberSystemConversionOctalListener;
    }
}
