package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InventoryMenuHandler implements ActionListener {
    private static final InventoryMenuHandler HANDLER = new InventoryMenuHandler();

    public static InventoryMenuHandler getInstance() {
        return HANDLER;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
