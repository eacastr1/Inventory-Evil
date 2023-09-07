package controller;

import view.InventoryMenu;
import view.MainMenu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenuHandler implements ActionListener {
    private static final MainMenuHandler handler = new MainMenuHandler();

    public static MainMenuHandler getInstance() {
        return handler;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        switch(command) {
            case "inventory":
                MainMenu.getInstance().show(false);
                InventoryMenu.getInstance().show(true);
                break;
            case "storage" : break;
            case "shop": break;
        }
    }
}
