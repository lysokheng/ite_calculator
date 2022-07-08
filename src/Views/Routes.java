package Views;

import Views.DecorationLayout.*;
import Views.DecorationLayout.BitwiseBinaryLayout;
import Views.DecorationLayout.BitwiseDecimalLayout;
import Views.DecorationLayout.NumberSystemConversionBinaryLayout;
import Views.DecorationLayout.NumberSystemConversionDecimalLayout;
import Views.DecorationLayout.NumberSystemConversionHexadecimaLayout;
import Views.DecorationLayout.NumberSystemConversionOctalLayout;
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
        ArithmeticLayout arithmeticLayout = new ArithmeticLayout();

        //route to arithmetic windows
        JButton arithmeticListener;
        arithmeticListener = appButtons.arithmeticButton();
        arithmeticListener.addActionListener(e -> {
            frame.remove(mainPanel);
            frame.setContentPane(arithmeticLayout.arithmeticPanel(frame));
            frame.validate();
            frame.repaint();

        });

        return arithmeticListener;
    }

    public JButton trigonometryListener(JFrame frame, JPanel mainPanel) {
        TrigonometryLayout trigonometryLayout = new TrigonometryLayout();

        //route to trigonometryListener
        JButton trigonometryListener;
        trigonometryListener = appButtons.trigonometryButton();
        trigonometryListener.addActionListener(e -> {
            frame.remove(mainPanel);
            frame.setContentPane(trigonometryLayout.trigonometryPanel(frame));
            frame.validate();
            frame.repaint();
        });

        return trigonometryListener;
    }

    public JButton bitwiseDecimalWindowsListener(JFrame frame, JPanel mainPanel) {
        BitwiseDecimalLayout bitwiseDecimalLayout = new BitwiseDecimalLayout();

        //route to bitwiseListener
        JButton bitwiseListener;
        bitwiseListener = appButtons.bitwiseButton();
        bitwiseListener.addActionListener(e -> {
            frame.remove(mainPanel);
            frame.setContentPane(bitwiseDecimalLayout.bitwisePanel(frame));
            frame.validate();
            frame.repaint();
        });

        return bitwiseListener;
    }

    public JButton bitwiseDecimalListener(JFrame frame, JPanel mainPanel) {
        BitwiseDecimalLayout bitwiseDecimalLayout = new BitwiseDecimalLayout();

        //route to bitwiseListener
        JButton bitwiseListener;
        bitwiseListener = appButtons.changeToDecimalButton();
        bitwiseListener.addActionListener(e -> {
            frame.remove(mainPanel);
            frame.setContentPane(bitwiseDecimalLayout.bitwisePanel(frame));
            frame.validate();
            frame.repaint();
        });

        return bitwiseListener;
    }


    public JButton bitwiseBinaryListener(JFrame frame, JPanel mainPanel) {
        BitwiseBinaryLayout bitwiseBinaryLayout = new BitwiseBinaryLayout();

        //route to bitwiseListener
        JButton bitwiseListener;
        bitwiseListener = appButtons.changeToBinaryButton();
        bitwiseListener.addActionListener(e -> {
            frame.remove(mainPanel);
            frame.setContentPane(bitwiseBinaryLayout.bitwisePanel(frame));
            frame.validate();
            frame.repaint();
        });

        return bitwiseListener;
    }


    public JButton moneyExchangeListener(JFrame frame, JPanel mainPanel) {
        MoneyExchangeLayout moneyExchangeLayout = new MoneyExchangeLayout();

        //route moneyExchangeListener
        JButton moneyExchangeListener;
        moneyExchangeListener = appButtons.moneyExchangeButton();
        moneyExchangeListener.addActionListener(e -> {
            frame.remove(mainPanel);
            frame.setContentPane(moneyExchangeLayout.moneyExchangePanel(frame));
            frame.validate();
            frame.repaint();
        });

        return moneyExchangeListener;
    }

    public JButton storageConverterListener(JFrame frame, JPanel mainPanel) {
        StorageConverterLayout storageConverterLayout = new StorageConverterLayout();

        //route storageConverterListener
        JButton storageConverterListener;
        storageConverterListener = appButtons.storageConverterButton();
        storageConverterListener.addActionListener(e -> {
            frame.remove(mainPanel);
            frame.setContentPane(storageConverterLayout.storageConverterPanel(frame));
            frame.validate();
            frame.repaint();
        });

        return storageConverterListener;
    }

    public JButton numberSystemConversionListener(JFrame frame, JPanel mainPanel) {
        NumberSystemConversionDecimalLayout numberSystemConversionDecimalWindows = new NumberSystemConversionDecimalLayout();

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
        BinaryArithmeticLayout binaryArithmeticLayout = new BinaryArithmeticLayout();

        //route to binaryArithmeticListener
        JButton binaryArithmeticListener;
        binaryArithmeticListener = appButtons.binaryArithmeticButton();
        binaryArithmeticListener.addActionListener(e -> {
            frame.remove(mainPanel);
            frame.setContentPane(binaryArithmeticLayout.binaryArithmeticPanel(frame));
            frame.validate();
            frame.repaint();
        });

        return binaryArithmeticListener;
    }

    public JButton setTheoryListener(JFrame frame, JPanel mainPanel) {
        SetTheoryLayout setTheoryLayout = new SetTheoryLayout();

        //route to setTheoryListener
        JButton setTheoryListener;
        setTheoryListener = appButtons.setTheoryButton();
        setTheoryListener.addActionListener(e -> {
            frame.remove(mainPanel);
            frame.setContentPane(setTheoryLayout.setTheoryPanel(frame));
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
        NumberSystemConversionBinaryLayout numberSystemConversionBinaryWidgets = new NumberSystemConversionBinaryLayout();
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
        NumberSystemConversionDecimalLayout numberSystemConversionDecimalWindows = new NumberSystemConversionDecimalLayout();
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
        NumberSystemConversionHexadecimaLayout numberSystemConversionHexadecimaLayout = new NumberSystemConversionHexadecimaLayout();
        //route to menuWindowsListener
        JButton numberSystemConversionHexadecimalListener;
        numberSystemConversionHexadecimalListener = appButtons.hexaDecimalButton();
        numberSystemConversionHexadecimalListener.addActionListener(e -> {
            frame.remove(mainPanel);
            frame.setContentPane(numberSystemConversionHexadecimaLayout.numberSystemConversionHexadecimalPanel(frame));
            frame.validate();
            frame.repaint();
        });

        return numberSystemConversionHexadecimalListener;
    }

    public JButton changeToOctalListener(JFrame frame, JPanel mainPanel) {
        NumberSystemConversionOctalLayout numberSystemConversionOctalLayout = new NumberSystemConversionOctalLayout();
        //route to menuWindowsListener
        JButton numberSystemConversionOctalListener;
        numberSystemConversionOctalListener = appButtons.octalButton();
        numberSystemConversionOctalListener.addActionListener(e -> {
            frame.remove(mainPanel);
            frame.setContentPane(numberSystemConversionOctalLayout.numberSystemConversionOctalPanel(frame));
            frame.validate();
            frame.repaint();
        });

        return numberSystemConversionOctalListener;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
