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
public class fx_gui_annonymous_inner_class_and_lamda_expression extends Application {

    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        primaryStage.setTitle("Lamda Expression");
        btn.setText("Click me!!");

        //this class will handle the button events using annonymous inner class
     /*   btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("This an annonymous inner class");
            }
        });*/
     
     //lambda expression to implement button 
     btn.setOnAction(e -> System.out.println("Lamda expression!!"));
        

        StackPane root = new StackPane();
        root.getChildren().add(btn);

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
