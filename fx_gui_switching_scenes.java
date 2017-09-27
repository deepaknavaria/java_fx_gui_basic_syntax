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
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author issei
 */
public class fx_gui_switching_scenes extends Application {

    Scene s1, s2;
    Stage window;

    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;

        Label lb1 = new Label("Welcome - First scene");
        Button btn = new Button("Go to scene 2");
        Button btn2 = new Button("Go to the first scene");
        
        //setting layout using the vbox
        VBox layout = new VBox(20);
        layout.getChildren().addAll(lb1, btn);
        s1 = new Scene(layout, 500, 500);
        
         StackPane sp = new StackPane();
        sp.getChildren().add(btn2);
        s2 = new Scene(sp, 300, 300);
        
        //switching from scene 1 to scene 2
        btn.setOnAction(e -> window.setScene(s2));

        //button 2 
        btn2.setOnAction(e -> window.setScene(s1));

       

        window.setTitle("Switching Scene");
        window.setScene(s1);
        window.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
