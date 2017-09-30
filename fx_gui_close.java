/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fx_example;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author issei
 */
public class fx_gui_close extends Application {

    Stage window;

    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        Button btn = new Button("Click me!!");
        btn.setOnAction(e -> closeprogram());

        //window close request
        window.setOnCloseRequest(e -> {
            //consume holds the conditon for no in this method
            e.consume();
            closeprogram();
        });

        StackPane root = new StackPane();
        root.getChildren().add(btn);

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("Close");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    private void closeprogram() {
        // alert.display("Title","Are you sure you want to exit");
        Boolean answer = confirmbox.display("Confirmation", "Sure you want to exit");
        if (answer) {
            window.close();
        }
    }

}
