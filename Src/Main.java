package Src;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        //create GUI
        JFrame frame = new JFrame("Pet Simulator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 700);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);

        //One time non-animated panel
        JPanel backgroundPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon backgroundImage = new ImageIcon(Images.GRASS_TEXTURE);
                g.drawImage(backgroundImage.getImage(), 0, 0, getWidth(), getHeight(), this);

                FoodBar.draw(g);
                AnimalBar.draw(g);
                Entity.Display(Images.WINDOW_ICON, g, this, 100, 100);
            }
        };
        backgroundPanel.setBounds(0, 0, 1000, 700);

        //Animated Panel
        JPanel gamePanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

            }
        };
        gamePanel.setOpaque(false); // Ensure transparency
        gamePanel.setBounds(0, 0, 1000, 700);

        // Use JLayeredPane to stack panels
        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(0, 0, 1000, 700);
        layeredPane.add(backgroundPanel, Integer.valueOf(0)); // Background at layer 0
        layeredPane.add(gamePanel, Integer.valueOf(1)); // Rectangle at layer 1

        frame.setContentPane(layeredPane);
        frame.setVisible(true);

        //create thread and loop animation
        new Thread(() -> {
            while (true) {
                gamePanel.repaint();
                try {
                    Thread.sleep(10); // 100 FPS
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
