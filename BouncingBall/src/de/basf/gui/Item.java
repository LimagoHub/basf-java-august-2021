package de.basf.gui;

import java.awt.*;

public abstract class Item {

    private Rectangle rectangle = new Rectangle();

    public Rectangle getRectangle() {
        return rectangle;
    }

    public void setRectangle(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    public abstract void draw(Graphics g) ;
}
