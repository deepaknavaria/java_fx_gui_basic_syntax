package fx_example;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import fx_example.fx_group;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author issei
 */
public class fx_gui_image_view extends Application {

    @Override
    public void start(Stage st) {
        //creating obj of image and giving url/path
        //for image from pc use - Image img = new Image(new FileInputStream("path of the image"));
        Image img = new Image("https://www.w3schools.com/w3images/fjords.jpg");

        //setting the image view
        ImageView iv = new ImageView(img);

        //setting position of the image
        iv.setX(50);
        iv.setY(25);

        //setting the fit height and width of the image view
        iv.setFitHeight(455);
        iv.setFitWidth(500);

        //setting the preserve ratio of the image view
        iv.setPreserveRatio(true);

        Group root = new Group(iv);

        fx_group screen = new fx_group();

        screen.groot(root, 800, 800, st);

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
