/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fx_example;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author issei
 */
public class fx_gui_text_position_font extends Application {

    @Override
    public void start(Stage st) {
        //creating a text object
        Text tx = new Text();

        //setting font to the text
        tx.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 50));

        //setting the position ofthe text
        tx.setX(150);
        tx.setY(150);

        //setting the text to be added
        tx.setText("Hello World!!");

        //creating the group obj
        Group root = new Group();

        //retrivieng the observable list object
        ObservableList list = root.getChildren();

        //setting the text object as a node to he group object
        list.add(tx);

        //creating a scene object
        Scene sc = new Scene(root, 600, 300);

        //setting the title to the stage
        st.setTitle("Draw-Text");

        //adding scene to the stage
        st.setScene(sc);

        //display the contents of the stage
        st.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
