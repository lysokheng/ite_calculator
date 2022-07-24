package View.Screen;

import Controller.*;
import Model.*;
import View.*;
import View.Utils.AppRoutes;
import View.Utils.AppTitle;

import javax.swing.*;
import java.awt.*;

public class ScreenPanel {
    public static class MenuPanel extends ScreenLayout{

        public JPanel menuPanel(JFrame frame){
            //create object
            JPanel mainPanel = new JPanel(new GridBagLayout());
            MenuPanel menuPanel = new MenuPanel();

            menuPanel.headerMenu(mainPanel);
            menuPanel.bodyMenu(frame, mainPanel);
            menuPanel.footerMenu(mainPanel);

            return mainPanel;
        }
    }
    public static class ArithmeticPanel extends ScreenLayout {
        //... create object
        ArithmeticView arithmeticView = new ArithmeticView();
        ArithmeticModel arithmeticModel = new ArithmeticModel();
        ArithmeticController arithmeticController = new ArithmeticController(arithmeticModel, arithmeticView);

        //======================================================= Panel
        public JPanel arithmeticPanel(JFrame frame) {
            //create object
            JPanel mainPanel = new JPanel(new GridBagLayout());
            ArithmeticPanel arithmeticPanel = new ArithmeticPanel();

            arithmeticPanel.header(mainPanel);
            arithmeticPanel.body(mainPanel, AppTitle.ARITHMETIC.toString(),
                    arithmeticView.input(),
                    arithmeticView.operator(),
                    arithmeticView.output(),
                    arithmeticView.history()
            );
            arithmeticPanel.footer(frame, mainPanel, arithmeticView.getResetButton());

            return mainPanel;
        }
    }
    public static class BinaryArithmeticPanel extends ScreenLayout {
        BinaryArithmeticView binaryArithmeticView = new BinaryArithmeticView();
        BinaryArithmeticModel binaryArithmeticModel = new BinaryArithmeticModel();
        BinaryArithmeticController binaryArithmeticController = new BinaryArithmeticController(
                binaryArithmeticModel, binaryArithmeticView
        );

        public JPanel binaryArithmeticPanel(JFrame frame) {
            //create object
            JPanel mainPanel = new JPanel(new GridBagLayout());
            BinaryArithmeticPanel binaryArithmeticPanel = new BinaryArithmeticPanel();

            binaryArithmeticPanel.header(mainPanel);
            binaryArithmeticPanel.body(mainPanel,
                    AppTitle.BINARY_ARITHMETIC.toString(),
                    binaryArithmeticView.input(),
                    binaryArithmeticView.operator(),
                    binaryArithmeticView.output(),
                    binaryArithmeticView.history()
            );
            binaryArithmeticPanel.footer(frame,
                    mainPanel,
                    binaryArithmeticView.getResetButton(),
                    """
                    Note:\s
                    
                    For Divide operator, remember A field is dividend\s
                    and B field is divisor.""");

            return mainPanel;
        }
    }
    public static class BitwiseBinaryPanel extends ScreenLayout {
        AppRoutes routs = new AppRoutes();
        BitwiseBinaryView bitwiseBinaryView = new BitwiseBinaryView();
        BitwiseBinaryModel bitwiseBinaryModel = new BitwiseBinaryModel();
        BitwiseBinaryController bitwiseBinaryController = new BitwiseBinaryController(
                bitwiseBinaryModel, bitwiseBinaryView
        );

        public JPanel bitwiseBinaryPanel(JFrame frame) {
            //create object
            JPanel mainPanel = new JPanel(new GridBagLayout());

            BitwiseBinaryPanel bitwiseBinaryPanel = new BitwiseBinaryPanel();

            bitwiseBinaryPanel.header(mainPanel);
            bitwiseBinaryPanel.body(mainPanel,
                    AppTitle.BITWISE_BINARY.toString(),
                    bitwiseBinaryView.input(),
                    bitwiseBinaryView.operator(),
                    bitwiseBinaryView.output(),
                    bitwiseBinaryView.history()
            );
            bitwiseBinaryPanel.footer(
                    frame,
                    mainPanel,
                    bitwiseBinaryView.getResetButton(),
                    routs.bitwiseDecimalListener(frame, mainPanel)
            );

            return mainPanel;
        }
    }
    public static class BitwiseDecimalPanel extends ScreenLayout {
        AppRoutes routs = new AppRoutes();
        BitwiseDecimalView bitwiseDecimalView = new BitwiseDecimalView();
        BitwiseDecimalModel bitwiseDecimalModel = new BitwiseDecimalModel();
        BitwiseDecimalController bitwiseDecimalController = new BitwiseDecimalController(
                bitwiseDecimalModel, bitwiseDecimalView
        );

        public JPanel bitwisePanel(JFrame frame) {
            //create object
            JPanel mainPanel = new JPanel(new GridBagLayout());
            BitwiseBinaryPanel bitwiseBinaryPanel = new BitwiseBinaryPanel();

            bitwiseBinaryPanel.header(mainPanel);
            bitwiseBinaryPanel.body(
                    mainPanel,
                    AppTitle.BITWISE_DECIMAL.toString(),
                    bitwiseDecimalView.input(),
                    bitwiseDecimalView.operator(),
                    bitwiseDecimalView.output(),
                    bitwiseDecimalView.history()
            );
            bitwiseBinaryPanel.footer(
                    frame,
                    mainPanel,
                    bitwiseDecimalView.getResetButton(),
                    routs.bitwiseBinaryListener(frame, mainPanel)
            );

            return mainPanel;
        }
    }
    public static class MoneyExchangePanel extends ScreenLayout {
        MoneyExchangeView moneyExchangeView = new MoneyExchangeView();
        MoneyExchangeModel moneyExchangeModel = new MoneyExchangeModel();
        MoneyExchangeController moneyExchangeController = new MoneyExchangeController(
                moneyExchangeModel, moneyExchangeView
        );

        public JPanel moneyExchangePanel(JFrame frame) {
            //create object
            JPanel mainPanel = new JPanel(new GridBagLayout());
            MoneyExchangePanel moneyExchangePanel = new MoneyExchangePanel();

            moneyExchangePanel.header(mainPanel);
            moneyExchangePanel.bodyWithScrollOperator(
                    mainPanel,
                    AppTitle.MONEY_EXCHANGE.toString(),
                    moneyExchangeView.input(),
                    moneyExchangeView.operator(),
                    moneyExchangeView.output(),
                    moneyExchangeView.history()
            );
            moneyExchangePanel.footer(
                    frame,
                    mainPanel,
                    moneyExchangeView.getResetButton()
            );

            return mainPanel;
        }
    }
    public static class NSCBinaryPanel extends ScreenLayout {
        AppRoutes routs = new AppRoutes();
        NSCBinaryView nscBinaryView = new NSCBinaryView();
        NSCBinaryModel nscBinaryModel = new NSCBinaryModel();
        NSCBinaryController nscBinaryController = new NSCBinaryController(nscBinaryModel, nscBinaryView);

        public JPanel numberSystemConversionBinaryPanel(JFrame frame) {
            //create object
            JPanel mainPanel = new JPanel(new GridBagLayout());
            NSCBinaryPanel nscBinaryPanel = new NSCBinaryPanel();

            nscBinaryPanel.headerWith3NumberSystem(mainPanel);
            nscBinaryPanel.bodyWith3NumberSystem(
                    mainPanel,
                    AppTitle.NUMBER_SYSTEM_CONVERSION_BINARY.toString(),
                    nscBinaryView.input(),
                    nscBinaryView.operator(),
                    nscBinaryView.output(),
                    nscBinaryView.history()
            );
            nscBinaryPanel.footer(
                    frame,
                    mainPanel,
                    nscBinaryView.getResetButton(),
                    routs.changeToDecimalListener(frame, mainPanel),
                    routs.changeToHexadecimalListener(frame, mainPanel),
                    routs.changeToOctalListener(frame, mainPanel)
            );

            return mainPanel;
        }
    }
    public static class NSCDecimalPanel extends ScreenLayout {
        AppRoutes routs = new AppRoutes();
        NSCDecimalView nscDecimalView = new NSCDecimalView();
        NSCDecimalModel nscDecimalModel = new NSCDecimalModel();
        NSCDecimalController nscDecimalController = new NSCDecimalController(nscDecimalModel, nscDecimalView);

        public JPanel numberSystemConversionDecimalPanel(JFrame frame) {
            //create object
            JPanel mainPanel = new JPanel(new GridBagLayout());
            NSCDecimalPanel nscDecimalPanel = new NSCDecimalPanel();

            nscDecimalPanel.headerWith3NumberSystem(mainPanel);
            nscDecimalPanel.bodyWith3NumberSystem(
                    mainPanel,
                    AppTitle.NUMBER_SYSTEM_CONVERSION_DECIMAL.toString(),
                    nscDecimalView.input(),
                    nscDecimalView.operator(),
                    nscDecimalView.output(),
                    nscDecimalView.history()
            );
            nscDecimalPanel.footer(
                    frame,
                    mainPanel,
                    nscDecimalView.getResetButton(),
                    routs.changeToBinaryListener(frame, mainPanel),
                    routs.changeToHexadecimalListener(frame, mainPanel),
                    routs.changeToOctalListener(frame, mainPanel)
            );

            return mainPanel;
        }
    }
    public static class NSCHexadecimalPanel extends ScreenLayout {
        AppRoutes routs = new AppRoutes();

        NSCHexadecimalView nscHexadecimalView = new NSCHexadecimalView();
        NSCHexadecimalModel nscHexadecimalModel = new NSCHexadecimalModel();
        NSCHexadecimalController nscHexadecimalController = new NSCHexadecimalController(nscHexadecimalModel, nscHexadecimalView);
        public JPanel numberSystemConversionHexadecimalPanel(JFrame frame) {
            //create object
            JPanel mainPanel = new JPanel(new GridBagLayout());
            NSCHexadecimalPanel nscHexadecimalPanel = new NSCHexadecimalPanel();

            nscHexadecimalPanel.headerWith3NumberSystem(mainPanel);
            nscHexadecimalPanel.bodyWith3NumberSystem(
                    mainPanel,
                    AppTitle.NUMBER_SYSTEM_CONVERSION_HEXADECIMAL.toString(),
                    nscHexadecimalView.input(),
                    nscHexadecimalView.operator(),
                    nscHexadecimalView.output(),
                    nscHexadecimalView.history()
            );
            nscHexadecimalPanel.footer(
                    frame,
                    mainPanel,
                    nscHexadecimalView.getResetButton(),
                    routs.changeToDecimalListener(frame, mainPanel),
                    routs.changeToBinaryListener(frame, mainPanel),
                    routs.changeToOctalListener(frame, mainPanel)
            );

            return mainPanel;
        }
    }
    public static class NSCOctalPanel extends ScreenLayout {
        AppRoutes routs = new AppRoutes();
        NSCOctalView nscOctalView = new NSCOctalView();
        NSCOctalModel nscOctalModel = new NSCOctalModel();
        NSCOctalController nscOctalController = new NSCOctalController(nscOctalModel, nscOctalView);

        public JPanel numberSystemConversionOctalPanel(JFrame frame) {
            //create object
            JPanel mainPanel = new JPanel(new GridBagLayout());

            NSCOctalPanel nscOctalPanel = new NSCOctalPanel();

            nscOctalPanel.headerWith3NumberSystem(mainPanel);
            nscOctalPanel.bodyWith3NumberSystem(
                    mainPanel,
                    AppTitle.NUMBER_SYSTEM_CONVERSION_OCTAL.toString(),
                    nscOctalView.input(),
                    nscOctalView.operator(),
                    nscOctalView.output(),
                    nscOctalView.history()
            );
            nscOctalPanel.footer(
                    frame,
                    mainPanel,
                    nscOctalView.getResetButton(),
                    routs.changeToDecimalListener(frame, mainPanel),
                    routs.changeToBinaryListener(frame, mainPanel),
                    routs.changeToHexadecimalListener(frame, mainPanel)
            );

            return mainPanel;
        }
    }
    public static class SetTheoryPanel extends ScreenLayout {

        SetTheoryView setTheoryView = new SetTheoryView();
        SetTheoryModel setTheoryModel = new SetTheoryModel();
        SetTheoryController setTheoryController = new SetTheoryController(setTheoryModel, setTheoryView);

        public JPanel setTheoryPanel(JFrame frame) {
            //create object
            JPanel mainPanel = new JPanel(new GridBagLayout());
            SetTheoryPanel setTheoryPanel = new SetTheoryPanel();

            setTheoryPanel.header(mainPanel);
            setTheoryPanel.body(
                    mainPanel,
                    AppTitle.SET_THEORY.toString(),
                    setTheoryView.input(),
                    setTheoryView.operator(),
                    setTheoryView.output(),
                    setTheoryView.history()
            );
            setTheoryPanel.footer(
                    frame,
                    mainPanel,
                    setTheoryView.getResetButton(),
                    """
                    Note:\s
                    
                    To separate the numbers, you can use space\s
                    to separate between each numbers."""
            );

            return mainPanel;
        }
    }
    public static class StorageConverterPanel extends ScreenLayout {
        StorageConverterView storageConverterView = new StorageConverterView();
        StorageConverterModel storageConverterModel = new StorageConverterModel();
        StorageConverterController storageConverterController = new StorageConverterController(
                storageConverterModel, storageConverterView
        );

        public JPanel storageConverterPanel(JFrame frame) {
            //create object
            JPanel mainPanel = new JPanel(new GridBagLayout());
            StorageConverterPanel storageConverterPanel = new StorageConverterPanel();

            storageConverterPanel.header(mainPanel);
            storageConverterPanel.bodyWithScrollOperator(
                    mainPanel,
                    AppTitle.STORAGE_CONVERTER.toString(),
                    storageConverterView.input(),
                    storageConverterView.operator(),
                    storageConverterView.output(),
                    storageConverterView.history()
            );
            storageConverterPanel.footer(
                    frame,
                    mainPanel,
                    storageConverterView.getResetButton()
            );

            return mainPanel;
        }
    }
    public static class TrigonometryPanel extends ScreenLayout {
        TrigonometryView trigonometryView = new TrigonometryView();
        TrigonometryModel trigonometryModel = new TrigonometryModel();
        TrigonometryController trigonometryController = new TrigonometryController(trigonometryModel, trigonometryView);


        public JPanel trigonometryPanel(JFrame frame) {
            //create object
            JPanel mainPanel = new JPanel(new GridBagLayout());
            TrigonometryPanel trigonometryPanel = new TrigonometryPanel();

            trigonometryPanel.header(mainPanel);
            trigonometryPanel.bodyWithScrollOperator(mainPanel,
                    AppTitle.TRIGONOMETRY.toString(),
                    trigonometryView.input(),
                    trigonometryView.operator(),
                    trigonometryView.output(),
                    trigonometryView.history());
            trigonometryPanel.footer(frame,
                    mainPanel,
                    trigonometryView.getResetButton());

            return mainPanel;
        }
    }
}
