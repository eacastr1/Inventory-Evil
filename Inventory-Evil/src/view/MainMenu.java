package view;

import controller.MainMenuHandler;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class MainMenu extends Menu {
    private static final MainMenu MENU = new MainMenu(UserInterface.FRAME, MainMenuHandler.getInstance());

    public static MainMenu getInstance() {
        return MENU;
    }

    private MainMenu(JFrame frame, ActionListener handler) {
        super(frame, handler);
    }

    @Override
    public void setup() {

    }

    @Override
    public void show(boolean b) {

    }
}
