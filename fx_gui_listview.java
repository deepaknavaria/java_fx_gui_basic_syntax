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
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author issei
 */
public class fx_gui_listview extends Application {

    Stage window;
    Scene scene;
    Button btn;

    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        window.setTitle("List view");
        btn = new Button("Submit");

        ListView<String> listView = new ListView<>();
        listView.getItems().addAll("Iron man", "Captain America", "Thor");
        listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

        btn.setOnAction(e -> itemSelected(listView));
        //layout
        VBox vb = new VBox(10);
        vb.setPadding(new Insets(20, 20, 20, 20));
        vb.getChildren().addAll(listView,btn);

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

    private void itemSelected(ListView<String> listView) {
        String message = "";
        ObservableList<String> movies;
        movies = listView.getSelectionModel().getSelectedItems();

        for (String m : movies) {
            message+= m+"\n";
        }
        System.out.println(message);
    }

}
