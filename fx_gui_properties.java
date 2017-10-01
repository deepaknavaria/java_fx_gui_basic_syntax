/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fx_example;

import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author issei
 */
public class fx_gui_properties extends Application {

    Stage window;
    Scene scene;
    Button btn;

    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        window.setTitle("String properties");

        Person sam = new Person();
        sam.fnameProperty().addListener((v, oldValue, newValue) -> {
            System.out.println("Name changed to : " + newValue);
            System.out.println("Firstnameproperty : " + sam.fnameProperty());
            System.out.println("get first name : " + sam.getFirstName());

        });
        btn = new Button("Submit");
        btn.setOnAction(e -> sam.setFirstName("Aalu"));
        StackPane ly = new StackPane(btn);
        scene = new Scene(ly, 300, 250);

        window.setScene(scene);
        window.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    private static class Person {

        private StringProperty firstName = new SimpleStringProperty(this, "firstName", "");

        public String getFirstName() {

            return firstName.get();
        }

        public void setFirstName(String firstName) {
            this.firstName.set(firstName);
        }

        public StringProperty fnameProperty() {
            return firstName;

        }

    }

}
