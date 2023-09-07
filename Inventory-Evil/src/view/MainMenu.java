/**
 * <h1>MainMenu.java</h1>
 * <p>A Main Menu class used for the main menu in the User Interface.</p>
 *
 * @author Eddie Andres Castro
 */
package view;

import controller.MainMenuHandler;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class MainMenu extends Menu {
    /**
     * The only instance of MainMenu that will be used, implementation of a singleton.
     */
    private static final MainMenu MENU = new MainMenu(UserInterface.FRAME, MainMenuHandler.getInstance());

    /**
     * A function used to get the MainMenu singleton.
     * @return MENU instance.
     */
    public static MainMenu getInstance() {
        return MENU;
    }

    private JPanel selectPanel;
    private JButton[] selectButtons;

    /**
     * Creates a Menu instance, set into a JFrame and handled by an ActionListener.
     * Menu is not shown by default.
     *
     * @param frame   Frame that the Menu will be set in.
     * @param handler Handler that controls certain actions in the Menu.
     */
    private MainMenu(JFrame frame, ActionListener handler) {
        super(frame, handler);
    }

    @Override
    public void setup() {
        selectPanel = new JPanel();
        selectPanel.setBounds(300, 400, 200, 100);
        selectPanel.setBackground(Color.black);
        selectPanel.setLayout(new GridLayout(3, 1));

        selectButtons = new JButton[3];
        selectButtons[0] = createButton("INVENTORY", "inventory");
        selectButtons[1] = createButton("STORAGE", "storage");
        selectButtons[2] = createButton("SHOP", "shop");
        for (JButton selectButton : selectButtons) {
            selectPanel.add(selectButton);
        }
        frame.add(selectPanel);
    }

    @Override
    public void show(boolean b) {
        selectPanel.setVisible(b);
    }
}
