package ahellaprj.buttons;

import ahellaprj.buttons.listeners.BtAnimalsListener;
import ahellaprj.buttons.listeners.BtRepositionsListener;
import ahellaprj.buttons.listeners.BtTablewareListener;
import ahellaprj.slides.*;
import ahellaprj.sound.*;
import ahellaprj.window.Window;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class PlayButtons {
    JButton bt1 = new JButton("Animals");
    JButton bt2 = new JButton("Tableware");
    JButton bt3 = new JButton("Prepositions");
    public void makeButton1(Window window, ShowAnimals show, SoundAnimals sound){
        bt1.setFont(new Font("COMODO", Font.PLAIN | Font.BOLD, 60));
        bt1.setMargin(new Insets(0,0,0,0));
        bt1.setBounds(0, 0, 480, 100);
        bt1.setLayout(null);
        bt1.setFocusable(false);
        bt1.setBackground(Color.cyan);
        window.myWindow.add(bt1);
        ActionListener buttonListener = new BtAnimalsListener(show, sound, window.PlayButtons);
        bt1.addActionListener(buttonListener);
    }
    public void makeButton2(Window window, ShowTableware show, SoundTableware sound){
        bt2.setFont(new Font("COMODO", Font.PLAIN | Font.BOLD, 50));
        bt2.setMargin(new Insets(0,0,0,0));
        bt2.setBounds(457, 300, 480, 100);
        bt2.setLayout(null);
        bt2.setFocusable(false);
        bt2.setBackground(Color.RED);
        window.myWindow.add(bt2);
        ActionListener buttonListener = new BtTablewareListener(show, sound, window.PlayButtons);
        bt2.addActionListener(buttonListener);
    }
    public void makeButton3(Window window, ShowRepositions showRepositions, SoundRepositions sound) {
        bt3.setFont(new Font("COMODO", Font.PLAIN | Font.BOLD, 40));
        bt3.setMargin(new Insets(0, 0, 0, 0));
        bt3.setBounds(910, 570, 480, 100);
        bt3.setLayout(null);
        bt3.setFocusable(false);
        bt3.setBackground(Color.WHITE);
        window.myWindow.add(bt3);
        ActionListener buttonListener = new BtRepositionsListener(showRepositions, sound, window.PlayButtons);
        bt3.addActionListener(buttonListener);
    }

    public void btHide(){
        bt1.setVisible(false);
        bt2.setVisible(false);
        bt3.setVisible(false);
    }

}