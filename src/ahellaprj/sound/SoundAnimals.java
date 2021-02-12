package ahellaprj.sound;

import javax.sound.sampled.*;
import java.io.File;

public class SoundAnimals {
    Clip clip;
    AudioInputStream inAudio;
    public void soundConstructor(){
        try{
            inAudio = AudioSystem.getAudioInputStream(
                    new File("C:/Users/Averyxoxo/IdeaProjects/KursovaiaFX/src/ahellaprj/soundtracks/Animals.wav"));
            clip = AudioSystem.getClip();
            clip.open(inAudio);
            clip.stop();
            FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
            gainControl.setValue((float) -10);
        }catch (Exception ignored){}
    }
    public void soundStart(){
        try{
            clip.setFramePosition(0);
            clip.start();
        }catch (Exception ignored){}
    }
}
