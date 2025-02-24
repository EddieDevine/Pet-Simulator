package Src;

import javax.swing.*;
import java.awt.Graphics;

import javax.swing.*;
import java.awt.*;

public class Entity {
    private String image;

    public Entity(String inImage){
        this.image = inImage;
    }

    public String getImage(){
        return image;
    }

    public void setImage(String image){
        this.image = image;
    }

    public static void Display(String inImage, Graphics g, JPanel panel, int x, int y){
        ImageIcon entityImage = new ImageIcon(inImage);
        g.drawImage(entityImage.getImage(), x, y, 100, 100, panel);
    }
}
