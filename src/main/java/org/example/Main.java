package org.example;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        MainWindow mw = new MainWindow();
        mw.show();
    }
}

class MainWindow {
    private JFrame window;

    public MainWindow() {
        window = new JFrame();
        window.setTitle("Test Window");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(1280, 720);
        window.setLocationRelativeTo(null);
    }

    public void show() {
        window.setVisible(true);
    }
}
