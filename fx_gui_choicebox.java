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
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author issei
 */
public class fx_gui_choicebox extends Application {

    Stage window;
    Scene scene;
    Button btn;
    ChoiceBox<String> cbox;

    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        window.setTitle("ChoiceBox");

        btn = new Button("Order");

        cbox = new ChoiceBox<>();
        /*
        btn.setOnAction(e -> orders(cbox));
         */
        //adding items
        cbox.getItems().add("Chicken");
        cbox.getItems().add("Mutton");
        cbox.getItems().add("Beer");
        cbox.getItems().add("Steak");
        cbox.getItems().addAll("Burger", "Pasta", "Pizza");
        cbox.setValue("Steak");
        VBox vb = new VBox(10);
        vb.setPadding(new Insets(20, 20, 20, 20));

        cbox.getSelectionModel().selectedItemProperty().addListener((v, oldVlaue, newValue) -> System.out.println("\n " + newValue));
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
    /*
    private void orders(ChoiceBox<String> cbox) {
        String food = cbox.getValue();
        System.out.println("\n\n"+food);
    }
     */
}
