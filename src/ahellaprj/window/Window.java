package ahellaprj.window;

import ahellaprj.buttons.*;
import ahellaprj.slides.*;
import ahellaprj.sound.*;

import javax.swing.*;

public class Window {
    public ahellaprj.buttons.PlayButtons PlayButtons = new PlayButtons();
    ShowAnimals showAnimals = new ShowAnimals();
    SoundAnimals soundAnimals = new SoundAnimals();
    ShowTableware showTableware = new ShowTableware();
    SoundTableware soundTableware = new SoundTableware();
    ShowRepositions showRepositions = new ShowRepositions();
    SoundRepositions soundRepositions = new SoundRepositions();
    public JFrame myWindow = new JFrame("Маленький проигрыватель");
    public void workSpace()
    {
        showAnimals.setMyWindow(this);
        showTableware.setMyWindow(this);
        showRepositions.setMyWindow(this);
        myWindow.setSize(1400, 700);
        myWindow.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        myWindow.setContentPane(new JLabel(new ImageIcon("C:/Users/Averyxoxo/IdeaProjects/KursovaiaFX/src/ahellaprj/images/uk.jpg")));
        myWindow.setResizable(false);
        myWindow.setLocation(250, 370);
        PlayButtons.makeButton1( this, showAnimals, soundAnimals);
        PlayButtons.makeButton2( this, showTableware, soundTableware);
        PlayButtons.makeButton3( this, showRepositions, soundRepositions);
        showAnimals.cartoonConstructor();
        soundAnimals.soundConstructor();
        showTableware.cartoonConstructor();
        soundTableware.soundConstructor();
        showRepositions.cartoonConstructor();
        soundRepositions.soundConstructor();
        myWindow.setVisible(true);
        myWindow.setAlwaysOnTop(true);
    }

}