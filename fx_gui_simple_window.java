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
public class fx_gui_simple_window extends Application {

    Button btn1;

    @Override
    public void start(Stage stage) {
        //set title
        stage.setTitle("Simple Window");
        //create a button
        btn1 = new Button();
        //set button text
        btn1.setText("Click Me!!");

        //setting layout
        StackPane sp = new StackPane();
        //adding button to layout
        sp.getChildren().add(btn1);

        //creating scene
        Scene scene = new Scene(sp, 500, 500);
        //setting scene
        stage.setScene(scene);
        //showing the stage on the screen
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
