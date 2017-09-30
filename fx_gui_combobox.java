/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fx_example;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author issei
 */
public class fx_gui_combobox extends Application {
    
  
    Stage window;
    Scene scene;
    Button btn;
    ComboBox<String> cbox;

    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        window.setTitle("ChoiceBox");

        btn = new Button("Order");

        cbox = new ComboBox<>();
        /*
        btn.setOnAction(e -> orders(cbox));
         */
        //adding items
        
        cbox.getItems().addAll("Flash","Batman","Superman");
        
        
        
        VBox vb = new VBox(10);
        vb.setPadding(new Insets(20, 20, 20, 20));

        cbox.setPromptText("Choose your hero ");
        cbox.setOnAction(e->System.out.println(cbox.getValue()));
        //to add button pass btn as parameter below 
        vb.getChildren().addAll(cbox);

        scene = new Scene(vb, 500, 500);
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
