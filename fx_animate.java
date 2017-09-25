package fx_example;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.MotionBlur;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author issei
 */
public class fx_animate extends Application {

    @Override
    public void start(Stage st) {
        //creating a hexagon
        Polygon hex = new Polygon();

        //adding coordinates to the hexagon
        hex.getPoints().addAll(new Double[]{
            200.0, 50.0,
            400.0, 50.0,
            450.0, 150.0,
            400.0, 250.0,
            200.0, 250.0,
            150.0, 150.0,});

        //setting the fill color
        hex.setFill(Color.BLUE);

        //creating a rotation transition
        RotateTransition rt = new RotateTransition();

        //setting the duration for the transition
        rt.setDuration(Duration.millis(100));

        //setting the node for the reansition
        rt.setNode(hex);

        //setting the angle of the transition
        rt.setByAngle(360);

        //setting the cycle count for the transition
        rt.setCycleCount(100);

        //setting auto reverse to false
        rt.setAutoReverse(false);

        //play the anime
        rt.play();

        //obj of motion blur class
        MotionBlur mb = new MotionBlur();

        //setting radius to the effect
        mb.setRadius(20.5);

        //setting angle to the effect
        mb.setAngle(45);

        //applying the effect to the hexagon
        hex.setEffect(mb);

        Group root = new Group(hex);

        //user defined class
        fx_group screen = new fx_group();

        //user defined method
        screen.groot(root, 600, 300, st);

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
