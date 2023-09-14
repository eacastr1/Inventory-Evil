package view;

import controller.LaunchMenuHandler;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class LaunchMenu extends Menu {
    private JPanel titlePanel, menuPanel;
    private JLabel titleLabel;
    private JButton[] menuButtons;

    /**
     * Creates a Menu instance, set into a JFrame.
     *
     * @param frame   Frame that the Menu will be set in.
     */
    public LaunchMenu(JFrame frame) {
        super(frame);
    }

    @Override
    public void setup(ActionListener handler) {
        // Title Screen
        titlePanel = new JPanel();
        titlePanel.setBounds(100, 100, 600, 500);
        titlePanel.setBackground(Color.black);
        titleLabel = createLabel("INVENTORY EVIL", true);
        titlePanel.add(titleLabel);
        // Menu Select
        menuPanel = new JPanel();
        menuPanel.setBounds(300, 400, 200, 100);
        menuPanel.setBackground(Color.black);
        menuPanel.setLayout(new GridLayout(2, 1));
        // Menu Select Buttons
        menuButtons = new JButton[2];
        menuButtons[0] = createButton("NEW", "new", handler);
        menuButtons[1] = createButton("LOAD", "load", handler);
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
