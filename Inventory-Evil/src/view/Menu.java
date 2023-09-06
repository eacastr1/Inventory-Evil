/**
 * <h1>Menu.java</h1>
 * <p>An abstract class Menu, used for various types of Menu classes in the game, Inventory Evil.</p>
 *
 * @author Eddie Andres Castro
 */
package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public abstract class Menu {
    protected JFrame frame;
    protected ActionListener handler;

    public Menu(JFrame frame, ActionListener handler) {
        this.frame = frame;
        this.handler = handler;
    }

    /**
     * Sets up the menu of this instance.
     */
    public abstract void setup();

    /**
     * Shows the menu of the instance in the JFrame.
     */
    public abstract void show();

    /**
     * Closes the menu of the instance in the JFrame.
     */
    public abstract void close();

    /**
     * Gets font used in the application.
     * @param b A boolean value, if true, font is of title size, otherwise the font is of normal size.
     * @return A font of either title or normal size.
     */
    public Font getFont(boolean b) {
        if(b) {
            return new Font("Times New Roman", Font.PLAIN, 90);
        }
        return new Font("Times New Roman", Font.PLAIN, 30);
    }

    /**
     * Creates a button, setting its name or purpose, and setting its handler.
     * @param name The name of the button, usually it's purpose.
     * @param command The String command of the button, used by the handler.
     * @return A new JButton instance.
     */
    public JButton createButton(String name, String command) {
        JButton button = new JButton(name);
        button.addActionListener(this.handler);
        button.setActionCommand(command);
        return button;
    }
}