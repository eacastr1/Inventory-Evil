package controller;

import view.LaunchMenu;
import view.UserInterface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LaunchMenuHandler extends MenuHandler implements ActionListener {
    public LaunchMenuHandler(UserInterface view) {
        super(view);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        switch(command) {
            case "new":
                view.update(UserInterface.MenuState.MAIN);
                break;
            case "load":
                break;
        }
    }
}
