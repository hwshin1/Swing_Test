package org.example;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MainWindow window = new MainWindow();
                window.initialize();
            }
        });
    }
}

class MainWindow {
    private JFrame window;
    private JButton button;

    public MainWindow() {
        window = new JFrame();
        window.setTitle("파일 선택기");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(800, 500);
        window.setLocationRelativeTo(null);
    }

    public void initialize() {
        window.setLayout(new BorderLayout(10,10));

        button = new JButton();
        button.setBounds(10, 10, 100, 30);
        button.setText("파일 선택");
        button.addActionListener(e -> {
            JFileChooser chooser = new JFileChooser();
            chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
            int result = chooser.showOpenDialog(window);
            if (result == JFileChooser.APPROVE_OPTION) {
                String path = chooser.getSelectedFile().getAbsolutePath();
                System.out.println(path);
            }
        });

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 10,10));

        // 배경 색상 설정
        panel.setBackground(Color.gray);

        // panel에 버튼 추가
        panel.add(button);
        window.add(panel, BorderLayout.CENTER);
        window.setVisible(true);
    }
}
