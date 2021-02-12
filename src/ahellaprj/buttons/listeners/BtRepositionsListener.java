package ahellaprj.buttons.listeners;

import ahellaprj.buttons.PlayButtons;
import ahellaprj.slides.ShowRepositions;
import ahellaprj.sound.SoundRepositions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BtRepositionsListener implements ActionListener
{
    SoundRepositions sound;
    ShowRepositions showRepositions;
    PlayButtons playButtons;
    public BtRepositionsListener(ShowRepositions showRepositions, SoundRepositions sound, PlayButtons playButtons) {
        this.showRepositions = showRepositions;
        this.sound = sound;
        this.playButtons = playButtons;
    }

    public void actionPerformed(ActionEvent e)
    {
        sound.soundStart();
        showRepositions.cartoonStart();
        playButtons.btHide();
    }
}