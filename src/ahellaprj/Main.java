package ahellaprj;

import ahellaprj.window.Window;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Маленький проверяющий");
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.setX(1700);
        primaryStage.setY(400);
        primaryStage.show();
        primaryStage.setOnCloseRequest(e -> System.exit(0));
    }

    public static void main(String[] args) {
        Window run = new Window();
        run.workSpace();
        launch(args);
    }
}