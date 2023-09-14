package controller;

import view.InventoryMenu;
import view.MainMenu;
import view.UserInterface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenuHandler extends MenuHandler implements ActionListener {

    public MainMenuHandler(UserInterface view) {
        super(view);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        switch(command) {
            case "inventory":
                view.update(UserInterface.MenuState.INVENTORY);
                break;
            case "storage" :
                view.update(UserInterface.MenuState.STORAGE);
                break;
            case "shop":
                view.update(UserInterface.MenuState.SHOP);
                break;
        }
    }
}
