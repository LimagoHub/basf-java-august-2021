package de.basf.gui;

import java.awt.*;

public class PaintClone extends Frame {

    private final static int SIZE = 1500;


    public PaintClone() {
        setSize(SIZE,SIZE);
        setMenuBar(new MyMenuBar());
    }

    public static void main(String[] args) {
	    new PaintClone().setVisible(true);
    }
}
