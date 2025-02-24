package Src;

import javax.swing.*;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.*;
import java.awt.*;

public class FoodBar {
    public static void draw(Graphics g){
        g.setColor(Color.GRAY); // Set rectangle color
        g.fillRect(10, 200, 100, 400); // Draw filled rectangle (x, y, width, height)
    }
}
