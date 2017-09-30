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
public class confirmbox {

    static boolean answer;

    public static boolean display(String title, String message) {
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(300);
        Label lb = new Label(message);

        //create buttons
        Button b1 = new Button("Yes");
        Button b2 = new Button("No");

        b1.setOnAction(e -> {
            answer = true;
            window.close();
        });

        b2.setOnAction(e -> {
            answer = false;
            window.close();
        });

        VBox ly = new VBox(10);
        ly.getChildren().addAll(lb, b1, b2);
        ly.setAlignment(Pos.CENTER);

        Scene scene = new Scene(ly);
        window.setScene(scene);
        window.showAndWait();

        return answer;

    }
}
