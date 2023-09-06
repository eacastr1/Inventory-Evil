package view;

import javax.swing.*;
import java.awt.event.ActionListener;

public class MainMenu extends Menu {
    private JPanel titlePanel, menuPanel;
    private JLabel titleLabel;
    private JButton[] menuButtons = new JButton[2];

    public MainMenu(JFrame frame, ActionListener handler) {
        super(frame, handler);
    }

    @Override
    public void setup() {
        // Title Screen
        titlePanel = new JPanel();

        // Menu Select Buttons
        menuButtons[0] = createButton("NEW", "new");
        menuButtons[1] = createButton("LOAD", "load");
    }

    @Override
    public void show() {

    }

    @Override
    public void close() {

    }
}
