package gr.uop;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        
        
        Button ok = new Button("OK");
        Button cancel = new Button("Cancel");
        Button help = new Button("Help");
        VBox buttons = new VBox();
        buttons.getChildren().add(help);
        buttons.getChildren().add(cancel);
        buttons.getChildren().add(ok);
        VBox.setVgrow(ok, Priority.ALWAYS);
        VBox.setVgrow(help, Priority.ALWAYS);
        VBox.setVgrow(cancel, Priority.ALWAYS);
        buttons.setPadding(new Insets(20));

        HBox center = new HBox();
        center.getChildren().add(buttons);
        BorderPane main = new BorderPane();
        Label status = new Label("Status");
        main.setBottom(status);
        main.setCenter(center);


        var scene = new Scene(main, 500, 180);
        stage.setScene(scene);
        stage.setTitle("Settings");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}