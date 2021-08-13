package de.basf.gui;

import java.awt.*;
import java.awt.image.BufferStrategy;

public class BouncingBall extends Frame {

    private final BufferStrategy strategy;
    private static final int SIZE = 2000;
    private boolean gameover = false;
    private Rectangle ball;
    private int xDirection;
    private int yDirection;

    public BouncingBall() {
        ball = new Rectangle(SIZE/2,SIZE/2, 50, 50);
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
        ball.x += xDirection;
        ball.y += yDirection;
        if(ball.x <= 0 ||ball.x>= getWidth()) {
            xDirection *= -1;
        }
        if(ball.y <= 0 ) {
            yDirection *= -1;
        }

        if(ball.y >= getHeight()) {
            gameover = true;
            dispose();
        }
    }
    private void renderScene() {
        Graphics g = strategy.getDrawGraphics();
        g.clearRect(0,0,SIZE,SIZE);
        g.fillOval(ball.x,ball.y,ball.width,ball.height);

        g.dispose();
        strategy.show();
    }
}
