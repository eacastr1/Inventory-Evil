/**
 * <h1>MainMenu.java</h1>
 * <p>A Main Menu class used for the main menu in the User Interface.</p>
 *
 * @author Eddie Andres Castro
 */
package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class MainMenu extends Menu {
    private JPanel selectPanel;
    private JButton[] selectButtons;

    /**
     * Creates a Menu instance, set into a JFrame.
     *
     * @param frame Frame that the Menu will be set in.
     */
    public MainMenu(JFrame frame) {
        super(frame);
    }

    @Override
    public void setup(ActionListener handler) {
        selectPanel = new JPanel();
        selectPanel.setBounds(300, 400, 200, 100);
        selectPanel.setBackground(Color.black);
        selectPanel.setLayout(new GridLayout(3, 1));

        selectButtons = new JButton[3];
        selectButtons[0] = createButton("INVENTORY", "inventory", handler);
        selectButtons[1] = createButton("STORAGE", "storage", handler);
        selectButtons[2] = createButton("SHOP", "shop", handler);
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
