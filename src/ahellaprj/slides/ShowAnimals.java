package ahellaprj.slides;

import ahellaprj.sound.SoundAnimals;
import ahellaprj.window.Window;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShowAnimals {

    Window window;
    public void setMyWindow(Window window){this.window = window;}
    String[] arrCartoon = new String[]{
            "C:/Users/Averyxoxo/IdeaProjects/KursovaiaFX/src/ahellaprj/slides/Animals/Test.jpg",
            "C:/Users/Averyxoxo/IdeaProjects/KursovaiaFX/src/ahellaprj/slides/Animals/0Animals.jpg",
            "C:/Users/Averyxoxo/IdeaProjects/KursovaiaFX/src/ahellaprj/slides/Animals/1Bear.jpg",
            "C:/Users/Averyxoxo/IdeaProjects/KursovaiaFX/src/ahellaprj/slides/Animals/2Bull.jpg",
            "C:/Users/Averyxoxo/IdeaProjects/KursovaiaFX/src/ahellaprj/slides/Animals/3Butterfly.jpg",
            "C:/Users/Averyxoxo/IdeaProjects/KursovaiaFX/src/ahellaprj/slides/Animals/4Camel.jpg",
            "C:/Users/Averyxoxo/IdeaProjects/KursovaiaFX/src/ahellaprj/slides/Animals/5Cat.jpg",
            "C:/Users/Averyxoxo/IdeaProjects/KursovaiaFX/src/ahellaprj/slides/Animals/6Hen.jpg",
            "C:/Users/Averyxoxo/IdeaProjects/KursovaiaFX/src/ahellaprj/slides/Animals/7Cock.jpg",
            "C:/Users/Averyxoxo/IdeaProjects/KursovaiaFX/src/ahellaprj/slides/Animals/8Cow.jpg",
            "C:/Users/Averyxoxo/IdeaProjects/KursovaiaFX/src/ahellaprj/slides/Animals/9Crocodile.jpg",
            "C:/Users/Averyxoxo/IdeaProjects/KursovaiaFX/src/ahellaprj/slides/Animals/10Deer.jpg",};
    JPanel myCartoon = new JPanel();
    JLabel[] cartoonItem = new JLabel[12];
    public void cartoonConstructor()
    {
        myCartoon.setBounds(0, 0, 1400, 700);
        myCartoon.setLayout(null);
        myCartoon.setOpaque(false);

        for (int i = 0; i < arrCartoon.length; i++)
        {
            cartoonItem[i] = new JLabel();
            cartoonItem[i].setBounds(0, 0, 1400, 700);
            ImageIcon enemyPic = new ImageIcon(arrCartoon[i]);
            cartoonItem[i].setIcon(enemyPic);
            cartoonItem[i].setHorizontalAlignment(SwingConstants.CENTER);
            cartoonItem[i].setLayout(null);
            cartoonItem[i].setVisible(false);
            cartoonItem[i].setOpaque(false);
            myCartoon.add(cartoonItem[i]);
        }
        window.myWindow.add(myCartoon);
        window.myWindow.repaint();
    }

    public void cartoonStart()
    {
        int fps = 5000;
        Timer fpsTimer = new Timer(fps, new FpsListener());
        fpsTimer.start();
    }


    public class FpsListener implements ActionListener {
        private int timeLine = 0;

        public void actionPerformed(ActionEvent e)
        {
            timeLine++;

            if (timeLine > 0 && timeLine < arrCartoon.length)
            {
                cartoonItem[timeLine - 1].setVisible(false);
                cartoonItem[timeLine].setVisible(true);
            }

            if (timeLine == arrCartoon.length)
            {
                cartoonItem[arrCartoon.length - 1].setVisible(false);
                window.myWindow.dispose();
            }

            window.myWindow.repaint();
        }
    }
}