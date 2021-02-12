package ahellaprj.buttons.listeners;
import ahellaprj.buttons.PlayButtons;
import ahellaprj.slides.ShowAnimals;
import ahellaprj.sound.SoundAnimals;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BtAnimalsListener implements ActionListener
{
    SoundAnimals sound;
    ShowAnimals showAnimals;
    PlayButtons playButtons;
    public BtAnimalsListener(ShowAnimals showAnimals, SoundAnimals sound, PlayButtons playButtons) {
        this.showAnimals = showAnimals;
        this.sound = sound;
        this.playButtons = playButtons;
    }

    public void actionPerformed(ActionEvent e)
    {
        sound.soundStart();
        showAnimals.cartoonStart();
        playButtons.btHide();
    }
}
