package app;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.awt.*;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage)  {
        StackPane root = new StackPane();
        CheckBox node = new CheckBox("I'm ready for FX!");
        root.getChildren().add(node);
        Scene scene = new Scene(root, 150, 100);
        stage.setScene(scene);
        stage.setTitle("Hello FX!");
        stage.show();


    }
}
