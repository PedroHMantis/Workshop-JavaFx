package org.mantisph.workshopjavafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    private static Scene Mainscene;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("MainView.fxml"));
        ScrollPane scrollPane = fxmlLoader.load();

        scrollPane.setFitToHeight(true);
        scrollPane.setFitToWidth(true);

        Mainscene = new Scene(scrollPane);
        stage.setTitle("Sample JavaFX application");
        stage.setScene(Mainscene);
        stage.show();
    }

    public static Scene getScene(){
        return Mainscene;
    }
}
