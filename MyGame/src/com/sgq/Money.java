package com.sgq;

import java.awt.*;
import java.util.Random;

public class Money {
    int x;
    int y;
    int size;
    Color color;


    public Money(){
        Random random = new Random();
        x = random.nextInt(960);
        y = random.nextInt(534);
        color = new Color(random.nextInt(256),random.nextInt(256),random.nextInt(256));
        size = random.nextInt(40)+2;
    }
    public Money(Color color, int x, int y, int size) {
        this.color = color;
        this.x = x;
        this.y = y;
        this.size = size;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void move(){

        if(y >= 534){
           y = 0;
        }
        y++;
    }
}
