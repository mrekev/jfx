package lt.rekevicius.tuts.jfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import lt.rekevicius.tuts.jfx.config.SpringFxmlLoader;

/**
 * Created by Mindaugas on 2016.11.03.
 */
public class Main extends Application {

    private static final SpringFxmlLoader loader = new SpringFxmlLoader();

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = (Parent) loader.load("sample.fxml");
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 600, 500));
        primaryStage.setResizable(false);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
