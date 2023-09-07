package view;

import controller.InventoryMenuHandler;
import model.Player;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class InventoryMenu extends Menu{
    private static final InventoryMenu MENU = new InventoryMenu(UserInterface.FRAME, InventoryMenuHandler.getInstance());

    public static InventoryMenu getInstance() {
        return MENU;
    }

    private JPanel playerPanel, infoPanel, inventoryPanel, itemPanel;
    private JLabel infoLabel;
    private JLabel[] playerLabels;
    private JButton[] inventoryButtons, itemButtons;

    /**
     * Creates a Menu instance, set into a JFrame and handled by an ActionListener.
     * Menu is not shown by default.
     *
     * @param frame   Frame that the Menu will be set in.
     * @param handler Handler that controls certain actions in the Menu.
     */
    private InventoryMenu(JFrame frame, ActionListener handler) {
        super(frame, handler);
    }

    @Override
    public void setup() {
        playerPanel = new JPanel();
        playerPanel.setBounds(100, 15, 600, 50);
        playerPanel.setBackground(Color.black);
        playerPanel.setLayout(new GridLayout(1, 4));

        playerLabels = new JLabel[4];
        playerLabels[0] = createLabel("HP: ", false);
        playerLabels[1] = createLabel(Integer.toString(Player.getInstance().getHealth()), false);
        playerLabels[2] = createLabel("Weapon: ", false);
        playerLabels[3] = createLabel("", false);
        for(JLabel label : playerLabels) {
            playerPanel.add(label);
        }

        inventoryPanel = new JPanel();
        inventoryPanel.setBounds(100, 100, 600, 200);
        inventoryPanel.setBackground(Color.black);
        inventoryPanel.setLayout(new GridLayout(2, 4));
        inventoryButtons = new JButton[8];
        for(int i = 0; i < inventoryButtons.length; i++) {
            inventoryButtons[i] = createButton("EMPTY", Integer.toString(i));
            inventoryPanel.add(inventoryButtons[i]);
        }

        frame.add(playerPanel);
        frame.add(inventoryPanel);
    }

    @Override
    public void show(boolean b) {
        playerPanel.setVisible(b);
        inventoryPanel.setVisible(b);
    }
}
