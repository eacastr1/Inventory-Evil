package view;

import controller.LaunchMenuHandler;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class LaunchMenu extends Menu {
    /**
     * The only instance of LaunchMenu that will be used, implementation of a singleton.
     */
    private static final LaunchMenu MENU = new LaunchMenu(UserInterface.FRAME, LaunchMenuHandler.getInstance());

    /**
     * A function used to get LaunchMenu class singleton.
     * @return MENU instance.
     */
    public static LaunchMenu getInstance() {
        return MENU;
    }

    private JPanel titlePanel, menuPanel;
    private JLabel titleLabel;
    private JButton[] menuButtons;

    private LaunchMenu(JFrame frame, ActionListener handler) {
        super(frame, handler);
    }

    @Override
    public void setup() {
        // Title Screen
        titlePanel = new JPanel();
        titlePanel.setBounds(100, 100, 600, 500);
        titlePanel.setBackground(Color.black);
        titleLabel = new JLabel("INVENTORY EVIL");
        titleLabel.setForeground(Color.white);
        titleLabel.setFont(getFont(true));
        titlePanel.add(titleLabel);
        // Menu Select
        menuPanel = new JPanel();
        menuPanel.setBounds(300, 400, 200, 100);
        menuPanel.setBackground(Color.black);
        menuPanel.setLayout(new GridLayout(2, 1));
        // Menu Select Buttons
        menuButtons = new JButton[2];
        menuButtons[0] = createButton("NEW", "new");
        menuButtons[1] = createButton("LOAD", "load");
        for (JButton menuButton : menuButtons) {
            menuButton.setBackground(Color.black);
            menuButton.setForeground(Color.white);
            menuButton.setFont(getFont(false));
            menuButton.setFocusPainted(false);
            menuPanel.add(menuButton);
        }

        frame.add(menuPanel);
        frame.add(titlePanel);
    }

    @Override
    public void show(boolean b) {
        titlePanel.setVisible(b);
        menuPanel.setVisible(b);
    }
}
