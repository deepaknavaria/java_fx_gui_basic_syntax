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
public class fx_gui_handle_user_events_with_button extends Application implements EventHandler<ActionEvent> {

    Button btn1, btn2;

    @Override
    public void start(Stage stage) {
        //set title

        stage.setTitle("Simple Window");
        //create a button
        btn1 = new Button();
        btn2 = new Button();

        //set button text
        btn1.setText("Click Me!!");
        btn2.setText("Don't Click Me!!");

        //btn location - user setTranslateX/Y() to set location of button
        btn2.setTranslateX(5);
        btn2.setTranslateY(100);

        //performing action with button '
        btn1.setOnAction(this);
        btn2.setOnAction(this);

        //setting layout
        StackPane sp = new StackPane();
        //adding button to layout
        //in case of multiple button or multiple parameter use addAll() method & in case of single parameter user add() method
        sp.getChildren().addAll(btn1, btn2);

        //creating scene
        Scene scene = new Scene(sp, 500, 500);
        //setting scene
        stage.setScene(scene);
        //showing the stage on the screen
        stage.show();
    }

    @Override
    public void handle(ActionEvent event) {
        if (event.getSource() == btn1) {
            System.out.println("Your clicked the button!!");
        }
        if (event.getSource() == btn2) {
            System.out.println("I told you not to click this button!! ");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
