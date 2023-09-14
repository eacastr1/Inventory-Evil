/**
 * <h1>UserInterface.java</h1>
 * <p>The User Interface model class for the application.</p>
 *
 * @author Eddie Andres Castro
 */
package view;

import controller.InventoryMenuHandler;
import controller.LaunchMenuHandler;
import controller.MainMenuHandler;
import model.InventoryModel;

import javax.swing.*;
import java.awt.*;

public class UserInterface {
    public static enum MenuState {LAUNCH, MAIN, INVENTORY, STORAGE, SHOP}

    /**
     * The JFrame that will be shared throughout this User Interface.
     */
    public static final JFrame FRAME = new JFrame();
    private InventoryModel model;
    private LaunchMenu launchMenu = new LaunchMenu(FRAME);
    private MainMenu mainMenu = new MainMenu(FRAME);
    private InventoryMenu inventoryMenu = new InventoryMenu(FRAME);
    private LaunchMenuHandler launchMenuHandler = new LaunchMenuHandler(this);
    private MainMenuHandler mainMenuHandler = new MainMenuHandler(this);
    private InventoryMenuHandler inventoryMenuHandler = new InventoryMenuHandler(this, inventoryMenu, model);

    public UserInterface() {
        frameSetup();

        menuSetup();

        closeMenus();

        update(MenuState.LAUNCH);

        FRAME.setVisible(true);
    }

    private void frameSetup() {
        FRAME.setSize(800,600);
        FRAME.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FRAME.getContentPane().setBackground(Color.black);
        FRAME.setLayout(null);
    }

    private void menuSetup() {
        launchMenu.setup(launchMenuHandler);
        mainMenu.setup(mainMenuHandler);
        inventoryMenu.setup(inventoryMenuHandler);
    }

    public void update(MenuState state) {
        closeMenus();
        switch(state) {
            case LAUNCH: launchMenu.show(true);
            break;
            case MAIN: mainMenu.show(true);
            break;
            case INVENTORY: inventoryMenu.show(true);
            break;
        }
    }

    public void closeMenus() {
        launchMenu.show(false);
        mainMenu.show(false);
        inventoryMenu.show(false);
    }
}
