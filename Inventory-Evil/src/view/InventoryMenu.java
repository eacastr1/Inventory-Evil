package view;

import javax.swing.*;
import java.awt.event.ActionListener;

public class InventoryMenu extends Menu{

    /**
     * Creates a Menu instance, set into a JFrame and handled by an ActionListener.
     * Menu is not shown by default.
     *
     * @param frame   Frame that the Menu will be set in.
     * @param handler Handler that controls certain actions in the Menu.
     */
    public InventoryMenu(JFrame frame, ActionListener handler) {
        super(frame, handler);
    }

    @Override
    public void setup() {

    }

    @Override
    public void show(boolean b) {

    }
}
