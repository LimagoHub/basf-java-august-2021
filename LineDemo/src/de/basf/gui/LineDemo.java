package de.basf.gui;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class LineDemo extends Frame {

    private static final int SIZE = 1000;
    private int x1,x2,y1,y2;
    public LineDemo() {
        x1 = x2 = y1= y2 =-1;
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
        addMouseListener(new MyMouseListener());
        setSize(SIZE, SIZE);
        setResizable(false);
    }
    public static void main(String[] args) {
	    new LineDemo().setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        g.drawLine(x1,y1,x2,y2);
    }

    class MyMouseListener extends MouseAdapter {
        @Override
        public void mousePressed(MouseEvent e) {
            x1 = e.getX();
            y1 = e.getY();
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            x2 = e.getX();
            y2 = e.getY();
            repaint();
        }
    }
}
