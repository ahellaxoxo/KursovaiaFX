package ahellaprj.buttons.listeners;

import ahellaprj.buttons.PlayButtons;
import ahellaprj.slides.ShowTableware;
import ahellaprj.sound.SoundTableware;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BtTablewareListener implements ActionListener
{
    SoundTableware sound;
    ShowTableware showTableware;
    PlayButtons playButtons;
    public BtTablewareListener(ShowTableware showTableware, SoundTableware sound, PlayButtons playButtons) {
        this.showTableware = showTableware;
        this.sound = sound;
        this.playButtons = playButtons;
    }

    public void actionPerformed(ActionEvent e)
    {
        sound.soundStart();
        showTableware.cartoonStart();
        playButtons.btHide();
    }
}
