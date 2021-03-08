package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import java.awt.*;
import java.applet.*;

import static java.lang.Math.random;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");

        Button button =new Button(); // создание кнопки
        button.setText("Click"); // текст кнопки
        button.setTranslateX(140);
        button.setTranslateY(140); // размеры и место положения
        button.setPrefSize(70,20);

        Rectangle rect = new Rectangle(50,50); // закрашенный квадрат

        int a=0, b=255;
        button.setOnAction(event -> { // действие на кнопку
            int red = a + (int) (Math.random() * b); // рандомный цвет
            int green = a + (int) (Math.random() * b);
            int blue = a + (int) (Math.random() * b);
            rect.setFill(Color.rgb(red,green,blue)); // закрасить квадрат
        });

        // добавление на сцены на форму, а так же кнопки и квадрата
        Pane root = new Pane();
        root.getChildren().addAll(button,rect); // добавить кнопку и квадрат
        primaryStage.setScene(new Scene(root, 300, 275));  // размер формы и сцена
        primaryStage.show(); // отобразить
    }


    public static void main(String[] args) {
        launch(args);
    }
}
