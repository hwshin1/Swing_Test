package org.example;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                MainWindow window = new MainWindow();
                window.initialize();
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
        window.setSize(800, 500);
        window.setLocationRelativeTo(null);
    }

    public void initialize() {
        window.setLayout(new BorderLayout(10,10));
        JButton button = new JButton("Button");
        button.setBounds(10, 10, 100, 30);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 10,10));

        // 배경 색상 설정
        panel.setBackground(Color.green);

        // panel에 버튼 추가
        panel.add(button);
        window.add(panel, BorderLayout.CENTER);
        window.setVisible(true);
    }
}
