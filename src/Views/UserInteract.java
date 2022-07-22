package Views;

import javax.swing.*;

public interface UserInteract {
    JPanel input();
    JPanel operator();
    JPanel output();
    JPanel history();
    void reset();
}
