package Views.Widgets.Utils;

import javax.swing.*;

import java.awt.*;

public class AppButtons {

    //create object
    CustomImages customImages = new CustomImages();

    public JButton exitButton() {
        ImageIcon exitIcon = new ImageIcon("Assets/Images/Exit.png");
        Image exitImage = exitIcon.getImage(); // transform it
        Image newExitImg = exitImage.getScaledInstance(210, 97, java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
        exitIcon = new ImageIcon(newExitImg);  // transform it back
        JButton exitButton = new JButton(exitIcon);
        customImages.customImageButton(exitButton);

        return exitButton;
    }

    public JButton arithmeticButton() {
        ImageIcon arithmeticIcon = new ImageIcon("Assets/Images/Arithmetic.png");
        JButton arithmeticButton = new JButton(customImages.resizeImageMenu(arithmeticIcon));
        customImages.customImageButton(arithmeticButton);

        return arithmeticButton;
    }

    public JButton trigonometryButton() {
        ImageIcon trigonometryIcon = new ImageIcon("Assets/Images/Trigonometry.png");
        JButton trigonometryButton = new JButton(customImages.resizeImageMenu(trigonometryIcon));
        customImages.customImageButton(trigonometryButton);

        return trigonometryButton;
    }

    public JButton bitwiseButton() {
        ImageIcon bitwiseIcon = new ImageIcon("Assets/Images/Bitwise.png");
        JButton bitwiseButton = new JButton(customImages.resizeImageMenu(bitwiseIcon));
        customImages.customImageButton(bitwiseButton);

        return bitwiseButton;
    }

    public JButton moneyExchangeButton() {
        ImageIcon moneyExchangeIcon = new ImageIcon("Assets/Images/Money Exchange.png");
        JButton MoneyExchangeButton = new JButton(customImages.resizeImageMenu(moneyExchangeIcon));
        customImages.customImageButton(MoneyExchangeButton);

        return MoneyExchangeButton;
    }

    public JButton storageConverterButton() {
        ImageIcon storageConverterIcon = new ImageIcon("Assets/Images/Storage Converter.png");
        JButton storageConverterButton = new JButton(customImages.resizeImageMenu(storageConverterIcon));
        customImages.customImageButton(storageConverterButton);

        return storageConverterButton;
    }

    public JButton numberSystemConversionButton() {
        ImageIcon numberSystemConversionIcon = new ImageIcon("Assets/Images/Number System  Conversion.png");
        JButton numberSystemConversionButton = new JButton(customImages.resizeImageMenu(numberSystemConversionIcon));
        customImages.customImageButton(numberSystemConversionButton);

        return numberSystemConversionButton;
    }

    public JButton binaryArithmeticButton() {
        ImageIcon binaryArithmeticIcon = new ImageIcon("Assets/Images/Binary Arithmetic.png");
        JButton binaryArithmeticButton = new JButton(customImages.resizeImageMenu(binaryArithmeticIcon));
        customImages.customImageButton(binaryArithmeticButton);

        return binaryArithmeticButton;
    }

    public JButton setTheoryButton() {
        ImageIcon setTheoryIcon = new ImageIcon("Assets/Images/Set Theory.png");
        JButton setTheoryButton = new JButton(customImages.resizeImageMenu(setTheoryIcon));
        customImages.customImageButton(setTheoryButton);

        return setTheoryButton;
    }

    public JButton backButton() {
        ImageIcon generateIcon = new ImageIcon("Assets/Images/Back.png");
        JButton generateButton = new JButton(customImages.resizeImageCalculate(generateIcon));
        customImages.customImageButton(generateButton);

        return generateButton;
    }

    public JButton additionButton() {
        ImageIcon generateIcon = new ImageIcon("Assets/Images/Addition.png");
        JButton generateButton = new JButton(customImages.resizeImageOperator(generateIcon));
        customImages.customImageButton(generateButton);

        return generateButton;
    }

    public JButton subtractionButton() {
        ImageIcon generateIcon = new ImageIcon("Assets/Images/Subtraction.png");
        JButton generateButton = new JButton(customImages.resizeImageOperator(generateIcon));
        customImages.customImageButton(generateButton);

        return generateButton;
    }

    public JButton multiplicationButton() {
        ImageIcon generateIcon = new ImageIcon("Assets/Images/Multiplication.png");
        JButton generateButton = new JButton(customImages.resizeImageOperator(generateIcon));
        customImages.customImageButton(generateButton);

        return generateButton;
    }

    public JButton divisionButton() {
        ImageIcon generateIcon = new ImageIcon("Assets/Images/Division.png");
        JButton generateButton = new JButton(customImages.resizeImageOperator(generateIcon));
        customImages.customImageButton(generateButton);

        return generateButton;
    }

    public JButton moduloButton() {
        ImageIcon generateIcon = new ImageIcon("Assets/Images/Modulo.png");
        JButton generateButton = new JButton(customImages.resizeImageOperator(generateIcon));
        customImages.customImageButton(generateButton);

        return generateButton;
    }

    public JButton sinToRadianButton() {
        ImageIcon generateIcon = new ImageIcon("Assets/Images/Sin To Radian.png");
        JButton generateButton = new JButton(customImages.resizeImageOperator(generateIcon));
        customImages.customImageButton(generateButton);

        return generateButton;
    }

    public JButton sinToDegreeButton() {
        ImageIcon generateIcon = new ImageIcon("Assets/Images/Sin To Degree.png");
        JButton generateButton = new JButton(customImages.resizeImageOperator(generateIcon));
        customImages.customImageButton(generateButton);

        return generateButton;
    }

    public JButton cosToRadianButton() {
        ImageIcon generateIcon = new ImageIcon("Assets/Images/Cos To Radian.png");
        JButton generateButton = new JButton(customImages.resizeImageOperator(generateIcon));
        customImages.customImageButton(generateButton);

        return generateButton;
    }

    public JButton cosToDegreeButton() {
        ImageIcon generateIcon = new ImageIcon("Assets/Images/Cos To Degree.png");
        JButton generateButton = new JButton(customImages.resizeImageOperator(generateIcon));
        customImages.customImageButton(generateButton);

        return generateButton;
    }

    public JButton tanToRadianButton() {
        ImageIcon generateIcon = new ImageIcon("Assets/Images/Tan To Radian.png");
        JButton generateButton = new JButton(customImages.resizeImageOperator(generateIcon));
        customImages.customImageButton(generateButton);

        return generateButton;
    }

    public JButton tanToDegreeButton() {
        ImageIcon generateIcon = new ImageIcon("Assets/Images/Cos To Degree.png");
        JButton generateButton = new JButton(customImages.resizeImageOperator(generateIcon));
        customImages.customImageButton(generateButton);

        return generateButton;
    }

    public JButton square2InIntegerButton() {
        ImageIcon generateIcon = new ImageIcon("Assets/Images/Square2 In Integer.png");
        JButton generateButton = new JButton(customImages.resizeImageOperator(generateIcon));
        customImages.customImageButton(generateButton);

        return generateButton;
    }

    public JButton square2InFloatingPointButton() {
        ImageIcon generateIcon = new ImageIcon("Assets/Images/Square2  InFloating_point.png");
        JButton generateButton = new JButton(customImages.resizeImageOperator(generateIcon));
        customImages.customImageButton(generateButton);

        return generateButton;
    }

    public JButton square3InIntegerButton() {
        ImageIcon generateIcon = new ImageIcon("Assets/Images/Square3 In Integer.png");
        JButton generateButton = new JButton(customImages.resizeImageOperator(generateIcon));
        customImages.customImageButton(generateButton);

        return generateButton;
    }

    public JButton square3InFloatingPointButton() {
        ImageIcon generateIcon = new ImageIcon("Assets/Images/Square3  InFloating_point.png");
        JButton generateButton = new JButton(customImages.resizeImageOperator(generateIcon));
        customImages.customImageButton(generateButton);

        return generateButton;
    }

    public JButton degreeToRadianButton() {
        ImageIcon generateIcon = new ImageIcon("Assets/Images/Degree To Radian.png");
        JButton generateButton = new JButton(customImages.resizeImageOperator(generateIcon));
        customImages.customImageButton(generateButton);

        return generateButton;
    }

    public JButton bitwiseANDButton() {
        ImageIcon generateIcon = new ImageIcon("Assets/Images/Bitwise AND.png");
        JButton generateButton = new JButton(customImages.resizeImageOperator(generateIcon));
        customImages.customImageButton(generateButton);

        return generateButton;
    }

    public JButton bitwiseORButton() {
        ImageIcon generateIcon = new ImageIcon("Assets/Images/Bitwise OR.png");
        JButton generateButton = new JButton(customImages.resizeImageOperator(generateIcon));
        customImages.customImageButton(generateButton);

        return generateButton;
    }

    public JButton bitwiseXORButton() {
        ImageIcon generateIcon = new ImageIcon("Assets/Images/Bitwise XOR.png");
        JButton generateButton = new JButton(customImages.resizeImageOperator(generateIcon));
        customImages.customImageButton(generateButton);

        return generateButton;
    }

    public JButton bitwiseLeftShiftButton() {
        ImageIcon generateIcon = new ImageIcon("Assets/Images/Bitwise LeftShift.png");
        JButton generateButton = new JButton(customImages.resizeImageOperator(generateIcon));
        customImages.customImageButton(generateButton);

        return generateButton;
    }

    public JButton bitwiseRightShiftButton() {
        ImageIcon generateIcon = new ImageIcon("Assets/Images/Bitwise RightShift.png");
        JButton generateButton = new JButton(customImages.resizeImageOperator(generateIcon));
        customImages.customImageButton(generateButton);

        return generateButton;
    }

    public JButton bitwiseInversionButton() {
        ImageIcon generateIcon = new ImageIcon("Assets/Images/BitwiseInversion.png");
        JButton generateButton = new JButton(customImages.resizeImageOperator(generateIcon));
        customImages.customImageButton(generateButton);

        return generateButton;
    }

    public JButton byteButton() {
        ImageIcon generateIcon = new ImageIcon("Assets/Images/Byte.png");
        JButton generateButton = new JButton(customImages.resizeImageOperator(generateIcon));
        customImages.customImageButton(generateButton);

        return generateButton;
    }

    public JButton kilobyteButton() {
        ImageIcon generateIcon = new ImageIcon("Assets/Images/Kilobyte.png");
        JButton generateButton = new JButton(customImages.resizeImageOperator(generateIcon));
        customImages.customImageButton(generateButton);

        return generateButton;
    }

    public JButton megabyteButton() {
        ImageIcon generateIcon = new ImageIcon("Assets/Images/Megabyte.png");
        JButton generateButton = new JButton(customImages.resizeImageOperator(generateIcon));
        customImages.customImageButton(generateButton);

        return generateButton;
    }

    public JButton gigabyteButton() {
        ImageIcon generateIcon = new ImageIcon("Assets/Images/Gigabyte.png");
        JButton generateButton = new JButton(customImages.resizeImageOperator(generateIcon));
        customImages.customImageButton(generateButton);

        return generateButton;
    }

    public JButton terabyteButton() {
        ImageIcon generateIcon = new ImageIcon("Assets/Images/Terabyte.png");
        JButton generateButton = new JButton(customImages.resizeImageOperator(generateIcon));
        customImages.customImageButton(generateButton);

        return generateButton;
    }

    public JButton petabyteButton() {
        ImageIcon generateIcon = new ImageIcon("Assets/Images/Petabyte.png");
        JButton generateButton = new JButton(customImages.resizeImageOperator(generateIcon));
        customImages.customImageButton(generateButton);

        return generateButton;
    }

    public JButton binaryButton() {
        ImageIcon generateIcon = new ImageIcon("Assets/Images/Binary.png");
        JButton generateButton = new JButton(customImages.resizeImageButtonNumberSystemButtons(generateIcon));
        customImages.customImageButton(generateButton);

        return generateButton;
    }

    public JButton octalButton() {
        ImageIcon generateIcon = new ImageIcon("Assets/Images/Octal.png");
        JButton generateButton = new JButton(customImages.resizeImageButtonNumberSystemButtons(generateIcon));
        customImages.customImageButton(generateButton);

        return generateButton;
    }

    public JButton decimalButton() {
        ImageIcon generateIcon = new ImageIcon("Assets/Images/Decimal.png");
        JButton generateButton = new JButton(customImages.resizeImageButtonNumberSystemButtons(generateIcon));
        customImages.customImageButton(generateButton);

        return generateButton;
    }

    public JButton hexaDecimalButton() {
        ImageIcon generateIcon = new ImageIcon("Assets/Images/Hexadecimal.png");
        JButton generateButton = new JButton(customImages.resizeImageButtonNumberSystemButtons(generateIcon));
        customImages.customImageButton(generateButton);

        return generateButton;
    }

    public JButton additionWith2NdComplementButton() {
        ImageIcon generateIcon = new ImageIcon("Assets/Images/Addition with 2nd Complement.png");
        JButton generateButton = new JButton(customImages.resizeImageOperator(generateIcon));
        customImages.customImageButton(generateButton);

        return generateButton;
    }

    public JButton subtractionWith2NdComplementButton() {
        ImageIcon generateIcon = new ImageIcon("Assets/Images/Subtraction with 2nd Complement.png");
        JButton generateButton = new JButton(customImages.resizeImageOperator(generateIcon));
        customImages.customImageButton(generateButton);

        return generateButton;
    }

    public JButton multiplyButton() {
        ImageIcon generateIcon = new ImageIcon("Assets/Images/Multiply.png");
        JButton generateButton = new JButton(customImages.resizeImageOperator(generateIcon));
        customImages.customImageButton(generateButton);

        return generateButton;
    }

    public JButton divideButton() {
        ImageIcon generateIcon = new ImageIcon("Assets/Images/Divide.png");
        JButton generateButton = new JButton(customImages.resizeImageOperator(generateIcon));
        customImages.customImageButton(generateButton);

        return generateButton;
    }

    public JButton unionButton() {
        ImageIcon generateIcon = new ImageIcon("Assets/Images/Union.png");
        JButton generateButton = new JButton(customImages.resizeImageOperator(generateIcon));
        customImages.customImageButton(generateButton);

        return generateButton;
    }

    public JButton intersectionButton() {
        ImageIcon generateIcon = new ImageIcon("Assets/Images/Intersection.png");
        JButton generateButton = new JButton(customImages.resizeImageOperator(generateIcon));
        customImages.customImageButton(generateButton);

        return generateButton;
    }

    public JButton differenceButton() {
        ImageIcon generateIcon = new ImageIcon("Assets/Images/Difference.png");
        JButton generateButton = new JButton(customImages.resizeImageOperator(generateIcon));
        customImages.customImageButton(generateButton);

        return generateButton;
    }

    public JButton rielToDollarButton() {
        ImageIcon generateIcon = new ImageIcon("Assets/Images/Riel To Dollar.png");
        JButton generateButton = new JButton(customImages.resizeImageOperator(generateIcon));
        customImages.customImageButton(generateButton);

        return generateButton;
    }

    public JButton rielToEuroButton() {
        ImageIcon generateIcon = new ImageIcon("Assets/Images/Riel To Euro.png");
        JButton generateButton = new JButton(customImages.resizeImageOperator(generateIcon));
        customImages.customImageButton(generateButton);

        return generateButton;
    }

    public JButton rielToFranceButton() {
        ImageIcon generateIcon = new ImageIcon("Assets/Images/Riel To France.png");
        JButton generateButton = new JButton(customImages.resizeImageOperator(generateIcon));
        customImages.customImageButton(generateButton);

        return generateButton;
    }

    public JButton rielToPoundButton() {
        ImageIcon generateIcon = new ImageIcon("Assets/Images/Riel To Pound.png");
        JButton generateButton = new JButton(customImages.resizeImageOperator(generateIcon));
        customImages.customImageButton(generateButton);

        return generateButton;
    }

    public JButton rielToBahtButton() {
        ImageIcon generateIcon = new ImageIcon("Assets/Images/Riel To Baht.png");
        JButton generateButton = new JButton(customImages.resizeImageOperator(generateIcon));
        customImages.customImageButton(generateButton);

        return generateButton;
    }

    public JButton dollarToRielButton() {
        ImageIcon generateIcon = new ImageIcon("Assets/Images/Dollar To Riel.png");
        JButton generateButton = new JButton(customImages.resizeImageOperator(generateIcon));
        customImages.customImageButton(generateButton);

        return generateButton;
    }

    public JButton euroToRielButton() {
        ImageIcon generateIcon = new ImageIcon("Assets/Images/Euro To Riel.png");
        JButton generateButton = new JButton(customImages.resizeImageOperator(generateIcon));
        customImages.customImageButton(generateButton);

        return generateButton;
    }

    public JButton franceToRielButton() {
        ImageIcon generateIcon = new ImageIcon("Assets/Images/Franc To Riel.png");
        JButton generateButton = new JButton(customImages.resizeImageOperator(generateIcon));
        customImages.customImageButton(generateButton);

        return generateButton;
    }

    public JButton poundToRielButton() {
        ImageIcon generateIcon = new ImageIcon("Assets/Images/Pound To Riel.png");
        JButton generateButton = new JButton(customImages.resizeImageOperator(generateIcon));
        customImages.customImageButton(generateButton);

        return generateButton;
    }

    public JButton bahtToRielButton() {
        ImageIcon generateIcon = new ImageIcon("Assets/Images/Baht To Riel.png");
        JButton generateButton = new JButton(customImages.resizeImageOperator(generateIcon));
        customImages.customImageButton(generateButton);

        return generateButton;
    }

    public JButton clearButton() {
        ImageIcon generateIcon = new ImageIcon("Assets/Images/Clear.png");
        JButton generateButton = new JButton(customImages.resizeImageOperator(generateIcon));
        customImages.customImageButton(generateButton);

        return generateButton;
    }

    public JButton decimalToBinaryButton() {
        ImageIcon generateIcon = new ImageIcon("Assets/Images/Decimal To Binary.png");
        JButton generateButton = new JButton(customImages.resizeImageOperator(generateIcon));
        customImages.customImageButton(generateButton);

        return generateButton;
    }

    public JButton changeToBinaryButton() {
        ImageIcon generateIcon = new ImageIcon("Assets/Images/Change to Binary.png");
        JButton generateButton = new JButton(customImages.resizeImageOperator(generateIcon));
        customImages.customImageButton(generateButton);

        return generateButton;
    }

    public JButton changeToDecimalButton() {
        ImageIcon generateIcon = new ImageIcon("Assets/Images/Change to Decimal.png");
        JButton generateButton = new JButton(customImages.resizeImageOperator(generateIcon));
        customImages.customImageButton(generateButton);

        return generateButton;
    }

    public JButton decimalToHexadecimalButton() {
        ImageIcon generateIcon = new ImageIcon("Assets/Images/Decimal To Hexadecimal.png");
        JButton generateButton = new JButton(customImages.resizeImageOperator(generateIcon));
        customImages.customImageButton(generateButton);

        return generateButton;
    }

    public JButton decimalToOctalButton() {
        ImageIcon generateIcon = new ImageIcon("Assets/Images/Decimal To Octal.png");
        JButton generateButton = new JButton(customImages.resizeImageOperator(generateIcon));
        customImages.customImageButton(generateButton);

        return generateButton;
    }

    public JButton binaryToDecimalButton() {
        ImageIcon generateIcon = new ImageIcon("Assets/Images/Binary To Decimal.png");
        JButton generateButton = new JButton(customImages.resizeImageOperator(generateIcon));
        customImages.customImageButton(generateButton);

        return generateButton;
    }

    public JButton binaryToHexadecimalButton() {
        ImageIcon generateIcon = new ImageIcon("Assets/Images/Binary To Hexadecimal.png");
        JButton generateButton = new JButton(customImages.resizeImageOperator(generateIcon));
        customImages.customImageButton(generateButton);

        return generateButton;
    }

    public JButton binaryToOctalButton() {
        ImageIcon generateIcon = new ImageIcon("Assets/Images/Binary To Octal.png");
        JButton generateButton = new JButton(customImages.resizeImageOperator(generateIcon));
        customImages.customImageButton(generateButton);

        return generateButton;
    }

    public JButton octalToDecimalButton() {
        ImageIcon generateIcon = new ImageIcon("Assets/Images/Octal To Decimal.png");
        JButton generateButton = new JButton(customImages.resizeImageOperator(generateIcon));
        customImages.customImageButton(generateButton);

        return generateButton;
    }

    public JButton octalToBinaryButton() {
        ImageIcon generateIcon = new ImageIcon("Assets/Images/Octal To Binary.png");
        JButton generateButton = new JButton(customImages.resizeImageOperator(generateIcon));
        customImages.customImageButton(generateButton);

        return generateButton;
    }

    public JButton octalToHexadecimalButton() {
        ImageIcon generateIcon = new ImageIcon("Assets/Images/Octal To Hexadecimal.png");
        JButton generateButton = new JButton(customImages.resizeImageOperator(generateIcon));
        customImages.customImageButton(generateButton);

        return generateButton;
    }

    public JButton hexadecimalToDecimalButton() {
        ImageIcon generateIcon = new ImageIcon("Assets/Images/Hexadecimal To Decimal.png");
        JButton generateButton = new JButton(customImages.resizeImageOperator(generateIcon));
        customImages.customImageButton(generateButton);

        return generateButton;
    }

    public JButton hexadecimalToBinaryButton() {
        ImageIcon generateIcon = new ImageIcon("Assets/Images/Hexadecimal To Binary.png");
        JButton generateButton = new JButton(customImages.resizeImageOperator(generateIcon));
        customImages.customImageButton(generateButton);

        return generateButton;
    }

    public JButton hexadecimalToOctalButton() {
        ImageIcon generateIcon = new ImageIcon("Assets/Images/Hexadecimal To Octal.png");
        JButton generateButton = new JButton(customImages.resizeImageOperator(generateIcon));
        customImages.customImageButton(generateButton);

        return generateButton;
    }

    public JButton byteToKilobyteButton() {
        ImageIcon generateIcon = new ImageIcon("Assets/Images/Byte to Kilobyte.png");
        JButton generateButton = new JButton(customImages.resizeImageOperator(generateIcon));
        customImages.customImageButton(generateButton);

        return generateButton;
    }

    public JButton byteToMegabyteButton() {
        ImageIcon generateIcon = new ImageIcon("Assets/Images/Byte to Megabyte.png");
        JButton generateButton = new JButton(customImages.resizeImageOperator(generateIcon));
        customImages.customImageButton(generateButton);

        return generateButton;
    }

    public JButton byteToGigabyteButton() {
        ImageIcon generateIcon = new ImageIcon("Assets/Images/Byte to Gigabyte.png");
        JButton generateButton = new JButton(customImages.resizeImageOperator(generateIcon));
        customImages.customImageButton(generateButton);

        return generateButton;
    }

    public JButton byteToTerabyteButton() {
        ImageIcon generateIcon = new ImageIcon("Assets/Images/Byte to Terabyte.png");
        JButton generateButton = new JButton(customImages.resizeImageOperator(generateIcon));
        customImages.customImageButton(generateButton);

        return generateButton;
    }

    public JButton byteToPetabyteButton() {
        ImageIcon generateIcon = new ImageIcon("Assets/Images/Byte to Petabyte.png");
        JButton generateButton = new JButton(customImages.resizeImageOperator(generateIcon));
        customImages.customImageButton(generateButton);

        return generateButton;
    }

    public JButton kilobyteToByteButton() {
        ImageIcon generateIcon = new ImageIcon("Assets/Images/Kilobyte to Byte.png");
        JButton generateButton = new JButton(customImages.resizeImageOperator(generateIcon));
        customImages.customImageButton(generateButton);

        return generateButton;
    }

    public JButton kilobyteToMegabyteButton() {
        ImageIcon generateIcon = new ImageIcon("Assets/Images/Kilobyte to Megabyte.png");
        JButton generateButton = new JButton(customImages.resizeImageOperator(generateIcon));
        customImages.customImageButton(generateButton);

        return generateButton;
    }

    public JButton kilobyteToGigabyteButton() {
        ImageIcon generateIcon = new ImageIcon("Assets/Images/Kilobyte to Gigabyte.png");
        JButton generateButton = new JButton(customImages.resizeImageOperator(generateIcon));
        customImages.customImageButton(generateButton);

        return generateButton;
    }

    public JButton kilobyteToTerabyteButton() {
        ImageIcon generateIcon = new ImageIcon("Assets/Images/Kilobyte to Terabyte.png");
        JButton generateButton = new JButton(customImages.resizeImageOperator(generateIcon));
        customImages.customImageButton(generateButton);

        return generateButton;
    }

    public JButton kilobyteToPetabyteButton() {
        ImageIcon generateIcon = new ImageIcon("Assets/Images/Kilobyte to Petabyte.png");
        JButton generateButton = new JButton(customImages.resizeImageOperator(generateIcon));
        customImages.customImageButton(generateButton);

        return generateButton;
    }

    public JButton megabyteToByteButton() {
        ImageIcon generateIcon = new ImageIcon("Assets/Images/Megabyte to Byte.png");
        JButton generateButton = new JButton(customImages.resizeImageOperator(generateIcon));
        customImages.customImageButton(generateButton);

        return generateButton;
    }

    public JButton megabyteToKilobyteButton() {
        ImageIcon generateIcon = new ImageIcon("Assets/Images/Megabyte to Kilobyte.png");
        JButton generateButton = new JButton(customImages.resizeImageOperator(generateIcon));
        customImages.customImageButton(generateButton);

        return generateButton;
    }

    public JButton megabyteToGigabyteButton() {
        ImageIcon generateIcon = new ImageIcon("Assets/Images/Megabyte to Gigabyte.png");
        JButton generateButton = new JButton(customImages.resizeImageOperator(generateIcon));
        customImages.customImageButton(generateButton);

        return generateButton;
    }

    public JButton megabyteToTerabyteButton() {
        ImageIcon generateIcon = new ImageIcon("Assets/Images/Megabyte to Terabyte.png");
        JButton generateButton = new JButton(customImages.resizeImageOperator(generateIcon));
        customImages.customImageButton(generateButton);

        return generateButton;
    }

    public JButton megabyteToPetabyteButton() {
        ImageIcon generateIcon = new ImageIcon("Assets/Images/Megabyte to Petabyte.png");
        JButton generateButton = new JButton(customImages.resizeImageOperator(generateIcon));
        customImages.customImageButton(generateButton);

        return generateButton;
    }

    public JButton gigabyteToByteButton() {
        ImageIcon generateIcon = new ImageIcon("Assets/Images/Gigabyte to Byte.png");
        JButton generateButton = new JButton(customImages.resizeImageOperator(generateIcon));
        customImages.customImageButton(generateButton);

        return generateButton;
    }

    public JButton gigabyteToKilobyteButton() {
        ImageIcon generateIcon = new ImageIcon("Assets/Images/Gigabyte to Kilobyte.png");
        JButton generateButton = new JButton(customImages.resizeImageOperator(generateIcon));
        customImages.customImageButton(generateButton);

        return generateButton;
    }

    public JButton gigabyteToMegabyteButton() {
        ImageIcon generateIcon = new ImageIcon("Assets/Images/Gigabyte to Megabyte.png");
        JButton generateButton = new JButton(customImages.resizeImageOperator(generateIcon));
        customImages.customImageButton(generateButton);

        return generateButton;
    }

    public JButton gigabyteToTerabyteButton() {
        ImageIcon generateIcon = new ImageIcon("Assets/Images/Gigabyte to Terabyte.png");
        JButton generateButton = new JButton(customImages.resizeImageOperator(generateIcon));
        customImages.customImageButton(generateButton);

        return generateButton;
    }

    public JButton gigabyteToPetabyteButton() {
        ImageIcon generateIcon = new ImageIcon("Assets/Images/Gigabyte to Petabyte.png");
        JButton generateButton = new JButton(customImages.resizeImageOperator(generateIcon));
        customImages.customImageButton(generateButton);

        return generateButton;
    }

    public JButton terabyteToByteButton() {
        ImageIcon generateIcon = new ImageIcon("Assets/Images/Terabyte to Byte.png");
        JButton generateButton = new JButton(customImages.resizeImageOperator(generateIcon));
        customImages.customImageButton(generateButton);

        return generateButton;
    }

    public JButton terabyteToKilobyteButton() {
        ImageIcon generateIcon = new ImageIcon("Assets/Images/Terabyte to Kilobyte.png");
        JButton generateButton = new JButton(customImages.resizeImageOperator(generateIcon));
        customImages.customImageButton(generateButton);

        return generateButton;
    }

    public JButton terabyteToMegabyteButton() {
        ImageIcon generateIcon = new ImageIcon("Assets/Images/Terabyte to Megabyte.png");
        JButton generateButton = new JButton(customImages.resizeImageOperator(generateIcon));
        customImages.customImageButton(generateButton);

        return generateButton;
    }

    public JButton terabyteToGigabyteButton() {
        ImageIcon generateIcon = new ImageIcon("Assets/Images/Terabyte to Gigabyte.png");
        JButton generateButton = new JButton(customImages.resizeImageOperator(generateIcon));
        customImages.customImageButton(generateButton);

        return generateButton;
    }

    public JButton terabyteToPetabyteButton() {
        ImageIcon generateIcon = new ImageIcon("Assets/Images/Terabyte to Petabyte.png");
        JButton generateButton = new JButton(customImages.resizeImageOperator(generateIcon));
        customImages.customImageButton(generateButton);

        return generateButton;
    }

    public JButton petabyteToByteButton() {
        ImageIcon generateIcon = new ImageIcon("Assets/Images/Petabyte to Byte.png");
        JButton generateButton = new JButton(customImages.resizeImageOperator(generateIcon));
        customImages.customImageButton(generateButton);

        return generateButton;
    }

    public JButton petabyteToKilobyteButton() {
        ImageIcon generateIcon = new ImageIcon("Assets/Images/Petabyte to Kilobyte.png");
        JButton generateButton = new JButton(customImages.resizeImageOperator(generateIcon));
        customImages.customImageButton(generateButton);

        return generateButton;
    }

    public JButton petabyteToMegabyteButton() {
        ImageIcon generateIcon = new ImageIcon("Assets/Images/Petabyte to Megabyte.png");
        JButton generateButton = new JButton(customImages.resizeImageOperator(generateIcon));
        customImages.customImageButton(generateButton);

        return generateButton;
    }

    public JButton petabyteToGigabyteButton() {
        ImageIcon generateIcon = new ImageIcon("Assets/Images/Petabyte to Gigabyte.png");
        JButton generateButton = new JButton(customImages.resizeImageOperator(generateIcon));
        customImages.customImageButton(generateButton);

        return generateButton;
    }

    public JButton petabyteToTerabyteButton() {
        ImageIcon generateIcon = new ImageIcon("Assets/Images/Petabyte to Terabyte.png");
        JButton generateButton = new JButton(customImages.resizeImageOperator(generateIcon));
        customImages.customImageButton(generateButton);

        return generateButton;
    }
}
