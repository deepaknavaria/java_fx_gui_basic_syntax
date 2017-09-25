/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fx_example;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author issei
 */
public class fx_gui_text_stroke_fill_stroke_size_color extends Application {

    @Override
    public void start(Stage st) {

        Text tx = new Text("Sample - App");

        tx.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 50));

        tx.setX(50);
        tx.setY(130);

        //color to the text
        tx.setFill(Color.BROWN);

        //stroke width
        tx.setStrokeWidth(2);

        //stroke color
        tx.setStroke(Color.BLUE);

        //set underline
        tx.setUnderline(true);

        Group root = new Group(tx);

        Scene sc = new Scene(root, 600, 300);

        st.setTitle("Set color-pos-stroke-stroke_width");

        st.setScene(sc);

        st.show();

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
