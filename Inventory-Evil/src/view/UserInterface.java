/**
 * <h1>UserInterface.java</h1>
 * <p>The User Interface model class for the application.</p>
 *
 * @author Eddie Andres Castro
 */
package view;

import javax.swing.*;
import java.awt.*;

public class UserInterface {
    /**
     * The JFrame that will be shared throughout the User Interface.
     */
    public static final JFrame FRAME = new JFrame();
    private LaunchMenu launchMenu;
    private MainMenu mainMenu;
    private InventoryMenu inventoryMenu;

    public UserInterface() {
        frameSetup();

        menuSetup();

        FRAME.setVisible(true);
    }

    private void frameSetup() {
        FRAME.setSize(800,600);
        FRAME.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FRAME.getContentPane().setBackground(Color.black);
        FRAME.setLayout(null);
    }
    private void menuSetup() {
        launchMenu = LaunchMenu.getInstance();
        mainMenu = MainMenu.getInstance();
        inventoryMenu = InventoryMenu.getInstance();
        launchMenu.show(true);
    }
}
