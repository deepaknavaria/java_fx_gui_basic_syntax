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
import javafx.scene.control.CheckBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author issei
 */
public class fx_gui_checkbox extends Application {

    Stage window;
    Scene scene;
    CheckBox cb, cb2;

    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        window.setTitle("CheckBox");

        //checkbox
        cb = new CheckBox("Tuna");
        cb2 = new CheckBox("Salmon");
        cb.setSelected(true);
        //Button 
        Button btn = new Button("Order");
        btn.setOnAction(e -> order(cb, cb2));

        //layout
        VBox vb = new VBox(10);
        vb.setPadding(new Insets(20, 20, 20, 20));
        vb.getChildren().addAll(btn, cb, cb2);

        scene = new Scene(vb, 300, 300);
        window.setScene(scene);
        window.show();

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    private void order(CheckBox cb, CheckBox cb2) {
        String message = "\nOrder : \n";
        if (cb.isSelected()) {
            message += "Tuna\n";
        }
        if (cb2.isSelected()) {
            message+="Salmon";
        }
        System.out.println(message);
    }

}
