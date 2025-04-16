package org.example;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // MainWindow mw = new MainWindow();
        // mw.show();
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrameOne frameOne = new JFrameOne();
                frameOne.setVisible(true);
            }
        });
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

class JFrameOne extends JFrame {
    public JFrameOne() {
        initialize();
    }

    public void initialize() {
        setTitle("JFrameOne");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(540, 300);

        setLayout(null);
        JButton button = new JButton("Button");
        button.setBounds(10, 10, 100, 30);
        add(button);
    }
}
