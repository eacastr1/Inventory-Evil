package controller;

import model.InventoryModel;
import model.ItemModel;
import view.InventoryMenu;
import view.UserInterface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InventoryMenuHandler extends MenuHandler implements ActionListener {
    public InventoryMenuHandler(UserInterface view, InventoryMenu menu, InventoryModel model, ItemModel itemModel) {
        super(view);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
    }

    // MOVE IN INVENTORY

    // REMOVE IN INVENTORY

    // ADD TO STORAGE
}
