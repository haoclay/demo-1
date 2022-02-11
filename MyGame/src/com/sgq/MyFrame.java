package com.sgq;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.util.Random;

public class MyFrame extends JFrame{

    public MyFrame(){
            setTitle("贪玩蓝月全新版本");
            setSize(960 , 534);
            setLocation(getNum(800),getNum(1080));
            setResizable(false);
        try{
            setIconImage(ImageIO.read(this.getClass().getResource("/img/twly.jpg")));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void showFrame(){
       new Thread(()->{
           while (true){
               int seconds = getNum(20000)+10000;
               System.out.println(seconds/1000+"秒后出现弹窗...");
               try {
                   Thread.sleep(seconds);
                   MyFrame myFrame = new MyFrame();
                   MyPanel myPanel = new MyPanel();
                   myPanel.start();
                   myFrame.add(myPanel);
                   myFrame.setVisible(true);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
           }
       }).start();

    }

    public static int getNum(int num){
        Random random = new Random();
        return random.nextInt(num);
    }
}
