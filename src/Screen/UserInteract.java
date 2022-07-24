package Screen;

import javax.swing.*;
import java.awt.event.ActionListener;

public interface UserInteract {
    JPanel input();
    JPanel operator();
    JPanel output();
    JPanel history();
    void reset();
    void showError(String errMessage);
    void addClearListener(ActionListener button);
    void addButtonListener(ActionListener button);
}
