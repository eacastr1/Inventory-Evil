package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenuHandler implements ActionListener {
    private static final MainMenuHandler handler = new MainMenuHandler();

    public static MainMenuHandler getInstance() {
        return handler;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
