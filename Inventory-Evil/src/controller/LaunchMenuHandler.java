package controller;

import view.LaunchMenu;
import view.MainMenu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LaunchMenuHandler implements ActionListener {
    private static LaunchMenuHandler handler = new LaunchMenuHandler();

    public static LaunchMenuHandler getInstance() {
        return handler;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        switch(command) {
            case "new":
                LaunchMenu.getInstance().show(false);
                MainMenu.getInstance().show(true);
                break;
            case "load":
                break;
        }
    }
}
