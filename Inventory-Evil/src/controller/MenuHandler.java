package controller;

import view.UserInterface;

import java.awt.event.ActionListener;

public abstract class MenuHandler implements ActionListener {
    protected UserInterface view;

    public MenuHandler(UserInterface view) {
        this.view = view;
    }
}
