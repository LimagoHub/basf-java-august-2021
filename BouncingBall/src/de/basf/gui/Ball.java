package de.basf.gui;

import java.awt.*;

public class Ball extends Item{
    @Override
    public void draw(Graphics g) {
        g.setColor(Color.GREEN);
        g.drawOval(getRectangle().x, getRectangle().y, getRectangle().width, getRectangle().height);
    }
}
