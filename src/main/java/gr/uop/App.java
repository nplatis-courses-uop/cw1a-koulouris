package gr.uop;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
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
        ok.setMaxWidth(Double.MAX_VALUE);
        cancel.setMaxWidth(Double.MAX_VALUE);
        help.setMaxWidth(Double.MAX_VALUE);
        VBox buttons = new VBox();
        buttons.getChildren().add(ok);
        buttons.getChildren().add(cancel);
        buttons.getChildren().add(help);
        VBox.setVgrow(ok, Priority.ALWAYS);
        VBox.setVgrow(help, Priority.ALWAYS);
        VBox.setVgrow(cancel, Priority.ALWAYS);
        buttons.setPadding(new Insets(10));
        buttons.setSpacing(5);

        
        GridPane gridSettings = new GridPane();
        CheckBox ch1 = new CheckBox();
        CheckBox ch2 = new CheckBox();
        Label l1 = new Label("Snap to Grid");
        Label l2 = new Label("Show Grid");
        gridSettings.add(ch1, 0, 0);
        gridSettings.add(l1, 1, 0);
        gridSettings.add(ch2, 0, 1);
        gridSettings.add(l2, 1, 1);
        gridSettings.setPadding(new Insets(10));
        gridSettings.setHgap(5);
        gridSettings.setVgap(2);
        TitledPane gridSettingsT = new TitledPane("Grid Settings", gridSettings);
        gridSettingsT.setPadding(new Insets(10));
        gridSettingsT.setCollapsible(false);



        HBox center = new HBox();
        center.getChildren().add(gridSettingsT);
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