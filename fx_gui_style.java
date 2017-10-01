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
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author issei
 */
public class fx_gui_style extends Application {

    Stage window;

    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;

        //creating grid layout
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(12);
        grid.setHgap(12);

        //name label
        Label name = new Label("Username");
        name.setStyle("-fx-text-fill: lightcoral");
        //set constraint set the location of the item in the grid
        GridPane.setConstraints(name, 0, 0);

        //name input
        TextField nameinput = new TextField();
        nameinput.setPromptText("Username");
        GridPane.setConstraints(nameinput, 1, 0);

        //pasword label
        Label pass = new Label("Password");

        //set constraint set the location of the item in the grid
        GridPane.setConstraints(pass, 0, 1);

        //password input
        TextField passinput = new TextField();
        passinput.setPromptText("Password");
        GridPane.setConstraints(passinput, 1, 1);

        Button logbtn = new Button("Login");
        GridPane.setConstraints(logbtn, 1, 2);
        logbtn.setStyle("-fx-background-color: #7cafc2;-fx-background-radius: 4;-fx-text-fill: #FFFFFF");
     

        grid.getChildren().addAll(name, nameinput, pass, passinput, logbtn);

        Scene scene = new Scene(grid, 300, 250);

        window.setTitle("Login");
        window.setScene(scene);
        window.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
