package view;

import javax.swing.*;
import java.awt.*;

public class UserInterface {
    public static final JFrame FRAME = new JFrame();
    private LaunchMenu launchMenu;
    private MainMenu mainMenu;

    public UserInterface() {
        FRAME.setSize(800,600);
        FRAME.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FRAME.getContentPane().setBackground(Color.black);
        FRAME.setLayout(null);

        launchMenu = LaunchMenu.getInstance();
        launchMenu.show(true);

        FRAME.setVisible(true);
    }

}
