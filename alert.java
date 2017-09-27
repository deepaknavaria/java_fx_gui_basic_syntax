/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fx_example;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author issei
 */
public class alert {

    public static void display(String message, String title) {
        Stage win = new Stage();
        
        win.initModality(Modality.APPLICATION_MODAL);
        win.setTitle(title);
        win.setMinWidth(300);
        
        Label lb = new Label(message);
        Button close = new Button("close the window");
        close.setOnAction(e->win.close());
        
        VBox ly = new VBox(10);
        ly.getChildren().addAll(lb,close);
        ly.setAlignment(Pos.CENTER);
        
        Scene scene = new Scene(ly);
        win.setScene(scene);
        win.show();
        
    }
}
