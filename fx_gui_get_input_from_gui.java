/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fx_example;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.Window;

/**
 *
 * @author issei
 */
public class fx_gui_get_input_from_gui extends Application {

    Stage window;
    Button btn;
    Scene scene;

    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        window.setTitle("Extract Data");

        //form
        TextField txt = new TextField();

        btn = new Button("Submit");
        btn.setOnAction(e -> isInt(txt, txt.getText()));

        //layout
        VBox ly = new VBox(10);
        ly.setPadding(new Insets(20, 20, 20, 20));
        ly.getChildren().addAll(txt, btn);

        scene = new Scene(ly, 500, 500);
        window.setScene(scene);
        window.show();

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    private boolean isInt(TextField text, String text1) {

        try {
            int age = Integer.parseInt(text1);
            System.out.println("user age : " + age);
            return true;
        } catch (NumberFormatException e) {
            System.out.println("Enter valid text!!");
            return false;
        }

    }

}
