/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fx_example;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

/**
 *
 * @author issei
 */
public class fx_gui_sample_1 extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        //Createing line
        Line line = new Line();

        //settting properties to a line
        line.setStartX(100.0);
        line.setStartY(400.0);
        line.setEndX(700.0);
        line.setEndY(400.0);

        //create a group
        Group root = new Group(line);
        //create a scene and pass root and dimension as parameter -- 
        //Create a Scene by instantiating the class named Scene which belongs to the package javafx.scene.
        //To this class, pass the Group object (root), created in the previous step.
        Scene sc = new Scene(root, 800, 800);
        //setting color to the scene 
        sc.setFill(Color.WHITE);
        //Using the primaryStage object, 
        //set the title of the scene as Sample Application as shown below.
        primaryStage.setTitle("Example - HW");
        //Add the Scene object prepared in the previous steps using this method as shown below.
        primaryStage.setScene(sc);
        //Display the contents of the scene using the method named show() of the Stage class as follows.
        primaryStage.show();

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
