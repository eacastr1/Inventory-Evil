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

    /**
     * Creates a Menu instance, set into a JFrame and handled by an ActionListener.
     * Menu is not shown by default.
     * @param frame Frame that the Menu will be set in.
     * @param handler Handler that controls certain actions in the Menu.
     */
    public Menu(JFrame frame, ActionListener handler) {
        this.frame = frame;
        this.handler = handler;
        setup();
        show(false);
    }

    /**
     * Sets up the menu of this instance.
     */
    public abstract void setup();

    /**
     * Shows the menu of the instance in the JFrame.
     * @param b A boolean value to determine if the components of the menu are shown.
     */
    public abstract void show(boolean b);


    /**
     * Gets font used in the application.
     * @param b A boolean value, if true, font is of title size, otherwise the font is of normal size.
     * @return A font of either title or normal size.
     */
    private Font getFont(boolean b) {
        if(b) {
            return new Font("Times New Roman", Font.PLAIN, 65);
        }
        return new Font("Times New Roman", Font.PLAIN, 20);
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
        button.setBackground(Color.black);
        button.setForeground(Color.white);
        button.setFont(getFont(false));
        button.setFocusPainted(false);
        return button;
    }

    public JLabel createLabel(String text, boolean b) {
        JLabel label = new JLabel(text);
        label.setFont(getFont(b));
        label.setForeground(Color.white);
        return label;
    }
}