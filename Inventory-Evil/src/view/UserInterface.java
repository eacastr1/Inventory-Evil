package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public abstract class UserInterface {
    protected int titleSize = 90;
    protected int normalSize = 30;
    protected JFrame frame;
    protected ActionListener handler;

    public UserInterface(JFrame frame, ActionListener handler) {
        this.frame = frame;
        this.handler = handler;
    }

    public abstract void setup();

    public abstract void show();

    public abstract void close();

    public Font getFont(int size) {
        return new Font("Times New Roman", Font.PLAIN, size);
    }
}