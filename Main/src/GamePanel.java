// package src;

// import java.awt.Color;
// import java.awt.Dimension;
// import java.awt.Graphics;
// import java.awt.Graphics2D;

import java.awt.event.KeyListener;
import java.awt.*;
import javax.swing.*;
// import entity.Player;

// import javax.swing.JPanel;

public class GamePanel extends JPanel implements Runnable {
    
    // SCREEN SETTINGS
    final int originalTileSize = 16; // 16x16 tile
    final int scale = 3;

    public final int tileSize = originalTileSize * scale; // 48x48 tile 
    final int maxScreenCol = 16;
    final int maxScreenRow = 12;
    // final int screenWidth = tileSize * maxScreenCol; // 768 pixels
    // final int screenHeight = tileSize * maxScreenRow; // 576 pixels
    final int screenWidth = 1920; // 768 pixels
    final int screenHeight = 1080; // 576 pixels

    int FPS = 144;

    KeyHandler keyH = new KeyHandler();
    Thread gameThread;
    Player player = new Player(this,keyH);

    // SET PLAYER'S DEAFAULT POSITION AND SPEED
    int playerX = 100;
    int playerY = 100;
    int playerSpeed = 4;

    public GamePanel() {
        
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);
        // this.addKeyListener(keyH); **THIS ONE IS THE PRIMARY ONE**
        this.addKeyListener((KeyListener) keyH);
        this.setFocusable(true);

    }

    public void startGameThread() {

        gameThread = new Thread(this);
        gameThread.start();

    }

    // SLEEP METHOD
    @Override
    public void run() {

        double drawInterval = 1000000000/FPS; // 0.0166667 seconds
        double nextDrawTime = System.nanoTime() + drawInterval;

        while(gameThread != null) {

            // long currentTime = System.nanoTime();
            // System.out.println("current Time: " + currentTime);
            // long currentTime2 = System.currentTimeMillis();


            // 1 UPDATE: update information such as character positions
            update();

            // 2 DRAW: draw the screen with the update information
            repaint();

            // double remainingTime = nextDrawTime - System.nanoTime();

            try {

                double remainingTime = nextDrawTime - System.nanoTime();
                remainingTime /= 1000000;

                if(remainingTime < 0) remainingTime = 0; // SET REMAINING_TIME TO 0

                Thread.sleep((long) remainingTime);

                nextDrawTime += drawInterval;

            } catch (InterruptedException e) {

                e.printStackTrace();

            }

        }

    }
    
    public void update() {
        player.update();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        player.draw(g2);
        g2.dispose();
    }

}
