package ahellaprj;

import ahellaprj.questions.Questions;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Controller {
    @FXML
    private ToggleGroup answers;
    @FXML
    private Text question_text;
    @FXML
    private RadioButton radio_btn_1;
    @FXML
    private RadioButton radio_btn_2;
    @FXML
    private RadioButton radio_btn_3;
    @FXML
    private RadioButton radio_btn_4;
    @FXML
    private RadioButton radio_btn_5;
    @FXML
    private Button answerBtn;
    @FXML
    private Button animalBtn;
    @FXML
    private Button repositionsBtn;
    @FXML
    private Button tableWareBtn;
    @FXML
    private Button exitBtn;
    @FXML
    private Text txtHeader;
    @FXML
    private Text toCont;
    @FXML
    private ImageView pngAnimals;
    @FXML
    private ImageView pngTableware;
    @FXML
    private ImageView pngPrepositions;
    @FXML
    private Text txtHeaderUseless;




    private Questions[] questions = new Questions[]{new Questions("", new String[]{""})};
    private int nowQuestion = 0, correctAnswers;
    private String nowCorrectAnswer;

    public void animals(){
        animalBtn.setOnAction(e ->{
            questions = new Questions[]{
                    new Questions("theme choosing", new String[] {"", "", "", "", ""}),
                    new Questions("Раньше всех встаёт, голосисто поёт:", new String[] {"Cat", "Cow", "Bull", "Crocodile", "Cock"}),
                    new Questions("Не птичка, а с крыльями:", new String[] {"Hen", "Bull", "Deer", "Cock", "Butterfly"}),
                    new Questions("Похож на корову, но нет молока:", new String[] {"Camel", "Crocodile", "Cock", "Cat", "Bull"}),
                    new Questions("Зёрнышки клюёт, яйца вкусные несёт:", new String[] {"Butterfly", "Crocodile", "Cock", "Deer", "Hen"}),
                    new Questions("Обитает в речке Нил - злой, зубастый:", new String[] {"Camel", "Bear", "Cock", "Butterfly", "Crocodile"}),
                    new Questions("Вынул спинку он дугой, замяукал, кто такой?", new String[] {"Deer", "Bear", "Cock", "Bull", "Cat"}),
                    new Questions("Носит по лесу весь день рога ветвистые:", new String[] {"Bear", "Bull", "Butterfly", "Cock", "Deer"})
            };
            txtHeader.setText("Тесты по теме \"Животные\"");
            txtHeaderUseless.setText("Не жульничай во время теста");
            radio_btn_1.setVisible(true);
            radio_btn_2.setVisible(true);
            radio_btn_3.setVisible(true);
            radio_btn_4.setVisible(true);
            radio_btn_5.setVisible(true);
            toCont.setVisible(true);
            pngAnimals.setVisible(true);
            pngTableware.setVisible(false);
            pngPrepositions.setVisible(false);
        });
    }

    public void repositions(){
        repositionsBtn.setOnAction(e ->{
            questions = new Questions[]{
                    new Questions("theme choosing", new String[] {"", "", "", "", ""}),
                    new Questions("Как переводится Above?", new String[] {"Между", "Нам", "Под", "Там", "Над"}),
                    new Questions("Как переводится За?", new String[] {"Alongside of", "Far", "Around", "At", "Behind"}),
                    new Questions("Как переводится Далеко?", new String[] {"Behind", "Platter", "By", "Saucer", "Far"}),
                    new Questions("Как переводится Down?", new String[] {"Под", "Близко", "Над", "Кастрюля", "Вниз"}),
                    new Questions("Как переводится Рядом с?", new String[] {"Close", "Beneath", "Cup", "Prepositions", "Alongside of"}),
                    new Questions("Как переводится Beneath?", new String[] {"Бегемот", "Там", "По", "На", "Под"}),
                    new Questions("Как переводится By?", new String[] {"Между", "Над", "Купить", "Пока", "По"})
            };
            txtHeader.setText("Тесты по теме \"Предлоги\"");
            txtHeaderUseless.setText("Не жульничай во время теста");
            radio_btn_1.setVisible(true);
            radio_btn_2.setVisible(true);
            radio_btn_3.setVisible(true);
            radio_btn_4.setVisible(true);
            radio_btn_5.setVisible(true);
            toCont.setVisible(true);
            pngAnimals.setVisible(false);
            pngTableware.setVisible(false);
            pngPrepositions.setVisible(true);
        });
    }

    public void tableware(){
        tableWareBtn.setOnAction(e -> {questions = new Questions[]{
                new Questions("theme choosing", new String[] {"", "", "", "", ""}),
                new Questions("Захочешь чай - любую выбирай:", new String[] {"Butter dish", "Coffee mug", "Platter", "Pepper shaker", "Cup"}),
                new Questions("Вся верхушка в дырках мелких, очень горько всем в тарелке:", new String[] {"Coffee mug","Platter", " Saucer", "Sugar bowl", "Pepper shaker"}),
                new Questions("Лист капусты, огурец покладу в:", new String[] {"Salt shaker", "Platter", "Coffee mug", "Soup bowl", "Salad plate"}),
                new Questions("Чашечка красавица ставится на:", new String[] {"Butter dish", "Coffee mug", "Cup", "Platter", "Saucer"}),
                new Questions("Посуда для супа:", new String[] {"Salt shaker", "Butter dish", "Salad plate", "Sugar bowl", "Soup bowl"}),
                new Questions("Кувшинчик с маслом:", new String[] {"Cup", "Platter", "Sugar bowl", "Salad plate", "Butter dish"}),
                new Questions("Кофе хочу, возьму с полки:", new String[] {"Cup", "Platter", "Pepper shaker", "Butter dish", "Coffee mug"})
        };
            txtHeader.setText("Тесты по теме \"Посуда\"");
            txtHeaderUseless.setText("Не жульничай во время теста");
            radio_btn_1.setVisible(true);
            radio_btn_2.setVisible(true);
            radio_btn_3.setVisible(true);
            radio_btn_4.setVisible(true);
            radio_btn_5.setVisible(true);
            toCont.setVisible(true);
            pngAnimals.setVisible(false);
            pngTableware.setVisible(true);
            pngPrepositions.setVisible(false);
        });
    }

    public void exit(){
        exitBtn.setOnAction(e -> System.exit(0));
    }

    public void initialize() {
        radio_btn_1.setVisible(false);
        radio_btn_2.setVisible(false);
        radio_btn_3.setVisible(false);
        radio_btn_4.setVisible(false);
        radio_btn_5.setVisible(false);
        toCont.setVisible(false);
        animals();
        repositions();
        tableware();
        exit();
        nowCorrectAnswer = questions[nowQuestion].correctAnswer();
        answerBtn.setOnAction(e -> {
            RadioButton selectedRadioButton = (RadioButton) answers.getSelectedToggle();
            if(selectedRadioButton != null) {
                toCont.setVisible(false);
                String toggleGroupValue = selectedRadioButton.getText();
                if (toggleGroupValue.equals(nowCorrectAnswer)) {
                    System.out.println("Верно!");
                    correctAnswers++;
                } else System.out.println("Неправильно.");
                if (nowQuestion + 1 == questions.length) {
                    radio_btn_1.setVisible(false);
                    radio_btn_2.setVisible(false);
                    radio_btn_3.setVisible(false);
                    radio_btn_4.setVisible(false);
                    radio_btn_5.setVisible(false);
                    answerBtn.setVisible(false);
                    int a = (int)(Math.random()*2);
                    if ((correctAnswers-1) <= 3+a){txtHeader.setText("Будь внимательнее!");} else {txtHeader.setText("Хорошая работа!");}
                    question_text.setText("Правильных ответов " + (correctAnswers-1) + " из " + (questions.length-1) + " вопросов!" + "\nПлюс "+ a + " за выбор кружочка в начале.");
                } else {
                    nowQuestion++;
                    nowCorrectAnswer = questions[nowQuestion].correctAnswer();
                    question_text.setText(questions[nowQuestion].getQuestion());
                    String[] answers = questions[nowQuestion].getAnswers();
                    List<String> intList = Arrays.asList(answers);
                    Collections.shuffle(intList);
                    radio_btn_1.setText(intList.get(0));
                    radio_btn_2.setText(intList.get(1));
                    radio_btn_3.setText(intList.get(2));
                    radio_btn_4.setText(intList.get(3));
                    radio_btn_5.setText(intList.get(4));
                    selectedRadioButton.setSelected(false);
                }
            }
        });

    }

}