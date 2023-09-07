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

    /**
     * Creates a Menu instance, set into a JFrame and handled by an ActionListener.
     * Menu is not shown by default.
     *
     * @param frame   Frame that the Menu will be set in.
     * @param handler Handler that controls certain actions in the Menu.
     */
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
