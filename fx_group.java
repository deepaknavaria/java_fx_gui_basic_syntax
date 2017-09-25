/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fx_example;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author issei
 */
public class fx_group {

    Group root;
    Stage st;

    public void groot(Group obj, int height, int width, Stage st) {
        this.st = st;
        
        this.root = obj;

        Scene sc = new Scene(root, 600, 300);

        st.setTitle("Animation");

        st.setScene(sc);

        st.show();

    }

}
