package Views.Utils;

import javax.swing.*;

public class CalculatorButtons {
    CustomImages customImages = new CustomImages();

    public JButton buttonPercent() {
        ImageIcon generateIcon = new ImageIcon("Assets/Images/percent.png");
        JButton generateButton = new JButton(customImages.resizeImageButtonCalculator(generateIcon));
        customImages.customImageButton(generateButton);

        return generateButton;
    }

    public JButton buttonAC() {
        ImageIcon generateIcon = new ImageIcon("Assets/Images/AC.png");
        JButton generateButton = new JButton(customImages.resizeImageButtonCalculator(generateIcon));
        customImages.customImageButton(generateButton);

        return generateButton;
    }

    public JButton button0() {
        ImageIcon generateIcon = new ImageIcon("Assets/Images/0.png");
        JButton generateButton = new JButton(customImages.resizeImageButtonCalculator2Buttons(generateIcon));
        customImages.customImageButton(generateButton);

        return generateButton;
    }

    public JButton button1() {
        ImageIcon generateIcon = new ImageIcon("Assets/Images/1.png");
        JButton generateButton = new JButton(customImages.resizeImageButtonCalculator(generateIcon));
        customImages.customImageButton(generateButton);

        return generateButton;
    }

    public JButton button2() {
        ImageIcon generateIcon = new ImageIcon("Assets/Images/2.png");
        JButton generateButton = new JButton(customImages.resizeImageButtonCalculator(generateIcon));
        customImages.customImageButton(generateButton);

        return generateButton;
    }

    public JButton button3() {
        ImageIcon generateIcon = new ImageIcon("Assets/Images/3.png");
        JButton generateButton = new JButton(customImages.resizeImageButtonCalculator(generateIcon));
        customImages.customImageButton(generateButton);

        return generateButton;
    }

    public JButton button4() {
        ImageIcon generateIcon = new ImageIcon("Assets/Images/4.png");
        JButton generateButton = new JButton(customImages.resizeImageButtonCalculator(generateIcon));
        customImages.customImageButton(generateButton);

        return generateButton;
    }

    public JButton button5() {
        ImageIcon generateIcon = new ImageIcon("Assets/Images/5.png");
        JButton generateButton = new JButton(customImages.resizeImageButtonCalculator(generateIcon));
        customImages.customImageButton(generateButton);

        return generateButton;
    }

    public JButton button6() {
        ImageIcon generateIcon = new ImageIcon("Assets/Images/6.png");
        JButton generateButton = new JButton(customImages.resizeImageButtonCalculator(generateIcon));
        customImages.customImageButton(generateButton);

        return generateButton;
    }

    public JButton button7() {
        ImageIcon generateIcon = new ImageIcon("Assets/Images/7.png");
        JButton generateButton = new JButton(customImages.resizeImageButtonCalculator(generateIcon));
        customImages.customImageButton(generateButton);

        return generateButton;
    }

    public JButton button8() {
        ImageIcon generateIcon = new ImageIcon("Assets/Images/8.png");
        JButton generateButton = new JButton(customImages.resizeImageButtonCalculator(generateIcon));
        customImages.customImageButton(generateButton);

        return generateButton;
    }

    public JButton button9() {
        ImageIcon generateIcon = new ImageIcon("Assets/Images/9.png");
        JButton generateButton = new JButton(customImages.resizeImageButtonCalculator(generateIcon));
        customImages.customImageButton(generateButton);

        return generateButton;
    }

    public JButton buttonPlusAndMinus() {
        ImageIcon generateIcon = new ImageIcon("Assets/Images/PlusAndMinus.png");
        JButton generateButton = new JButton(customImages.resizeImageButtonCalculator(generateIcon));
        customImages.customImageButton(generateButton);

        return generateButton;
    }

    public JButton buttonEnter() {
        ImageIcon generateIcon = new ImageIcon("Assets/Images/Enter.png");
        JButton generateButton = new JButton(customImages.resizeImageButtonCalculator2Buttons(generateIcon));
        customImages.customImageButton(generateButton);

        return generateButton;
    }

    public JButton buttonDot() {
        ImageIcon generateIcon = new ImageIcon("Assets/Images/Dot.png");
        JButton generateButton = new JButton(customImages.resizeImageButtonCalculator(generateIcon));
        customImages.customImageButton(generateButton);

        return generateButton;
    }
}
