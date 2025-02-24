package Src;

import javax.swing.*;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.*;
import java.awt.*;

public class AnimalBar {
    public static void draw(Graphics g){
        g.setColor(Color.BLUE); // Set rectangle color
        g.fillRect(450, 10, 500, 100); // Draw filled rectangle (x, y, width, height)
    }
}
