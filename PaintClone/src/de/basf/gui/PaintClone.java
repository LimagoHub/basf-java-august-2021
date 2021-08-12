package de.basf.gui;

import java.awt.*;

public class PaintClone extends Frame {

    public enum Form {LINIE, RECHTECK, OVAL, LOESCHEN;};
    private final static int SIZE = 1500;

    private Form form = Form.LINIE;
    private Color color = Color.WHITE;

    public Form getForm() {
        return form;
    }

    public void setForm(Form form) {
        this.form = form;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public PaintClone() {
        setSize(SIZE,SIZE);
        setMenuBar(new MyMenuBar(this));
    }

    public void beenden() {
        dispose();
    }

    public static void main(String[] args) {
	    new PaintClone().setVisible(true);
    }
}
