package com.sgq;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

public class MyPanel extends JPanel {
    String [] path = {"/img/zzh.jpg","/img/gfc.jpg","/img/gtl.jpg"};
    int num = 30 ;
    Money [] monies = new Money[num];
    private BufferedImage bg;

    {
        try {
            bg = ImageIO.read(this.getClass().getResource(path[new Random().nextInt(3)]));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public MyPanel() {
        for (int i = 0; i < monies.length; i++) {
            monies[i] = new Money();
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(bg,0,0,960,534,this);
        for (int i = 0; i < monies.length; i++) {
            Money money =  monies[i];
             g.setColor(money.getColor());
             g.setFont(new Font("\\u4e2d\\u6587",Font.BOLD,money.getSize()));
             g.drawString("💴",money.getX(),money.getY());
        }

    }

    public void start(){

        new Thread(()->{

            while (true){
                for (int i = 0; i < monies.length; i++) {
                    Money money = monies[i];
                    money.move();
                }
                repaint();
                try {
                    Thread.sleep(20);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }).start();
    }
}

