package view;

import controller.InventoryMenuHandler;
import model.Player;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class InventoryMenu extends Menu {
    private JPanel playerPanel, infoPanel, inventoryPanel, itemPanel, backPanel;
    private JLabel infoLabel;
    private JButton backButton;
    private JLabel[] playerLabels;
    private JButton[] inventoryButtons, itemButtons;

    /**
     * Creates a Menu instance, set into a JFrame.
     *
     * @param frame   Frame that the Menu will be set in.
     */
    public InventoryMenu(JFrame frame) {
        super(frame);
    }

    @Override
    public void setup(ActionListener handler) {
        playerPanel = new JPanel();
        playerPanel.setBounds(100, 15, 600, 50);
        playerPanel.setBackground(Color.black);
        playerPanel.setLayout(new GridLayout(1, 6));

        playerLabels = new JLabel[6];
        playerLabels[0] = createLabel("Name: ", false);
        playerLabels[1] = createLabel(Player.getInstance().getName(), false);
        playerLabels[2] = createLabel("HP: ", false);
        playerLabels[3] = createLabel(Integer.toString(Player.getInstance().getHealth()), false);
        playerLabels[4] = createLabel("Weapon: ", false);
        playerLabels[5] = createLabel("", false);
        for(JLabel label : playerLabels) {
            playerPanel.add(label);
        }

        inventoryPanel = new JPanel();
        inventoryPanel.setBounds(100, 100, 600, 200);
        inventoryPanel.setBackground(Color.black);
        inventoryPanel.setLayout(new GridLayout(2, 4));
        inventoryButtons = new JButton[8];
        for(int i = 0; i < inventoryButtons.length; i++) {
            inventoryButtons[i] = createButton("EMPTY", Integer.toString(i), handler);
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
