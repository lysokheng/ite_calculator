package Model;

import javax.swing.*;
import java.math.BigInteger;

public class ArithmeticModel {
    private JTextField a;
    private JTextField b;
    private JTextArea result;
    private JTextArea history;

    public JTextField getA() {
        return a;
    }

    public void setA(JTextField a) {
        this.a = a;
    }

    public JTextField getB() {
        return b;
    }

    public void setB(JTextField b) {
        this.b = b;
    }

    public JTextArea getResult() {
        return result;
    }

    public void setResult(JTextArea result) {
        this.result = result;
    }

    public JTextArea getHistory() {
        return history;
    }

    public void setHistory(JTextArea history) {
        this.history = history;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    private int count;
}
