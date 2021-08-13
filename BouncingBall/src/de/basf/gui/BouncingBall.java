package de.basf.gui;

import java.awt.*;
import java.awt.image.BufferStrategy;

public class BouncingBall extends Frame {

    private final BufferStrategy strategy;
    private static final int SIZE = 2000;
    private boolean gameover = false;
    private int x, y;
    private int xDirection;
    private int yDirection;

    public BouncingBall() {
        x = y = SIZE / 2;
        xDirection = 1;
        yDirection = 2;
        setSize(SIZE,SIZE);
        setVisible(true);
        createBufferStrategy(2);
        strategy = getBufferStrategy();
    }

    public static void main(String[] args) {
        new BouncingBall().run();
    }

    private void run() {
        while (! gameover) {
            calculateScene();
            renderScene();
        }
    }
    private void calculateScene() {
        x += xDirection;
        y += yDirection;
        if(x <= 0 || x>= getWidth()) {
            xDirection *= -1;
        }
        if(y <= 0 || y>= getHeight()) {
            yDirection *= -1;
        }
    }
    private void renderScene() {
        Graphics g = strategy.getDrawGraphics();
        g.clearRect(0,0,SIZE,SIZE);
        g.fillOval(x,y,50,50);
        g.dispose();
        strategy.show();
    }
}
