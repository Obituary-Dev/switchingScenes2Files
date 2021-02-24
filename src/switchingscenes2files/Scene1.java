/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchingscenes2files;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

/**
 *
 * @author Obituary
 */
public class Scene1 extends Scene {

    static Scene scene1;
    
    public Scene1(Parent arg0) {
        super(arg0);
    }
    
    public static Scene createScene() {
        Label label1 = new Label("Welcome to the first scene");
        Button button1 = new Button("Go to scene 2");
        button1.setOnAction(e -> {
            SwitchingScenes2Files.getWindow().setScene(Scene2.createScene2());
        });
        
        VBox layout1 = new VBox(20); // space amount 20px
        layout1.getChildren().addAll(label1, button1);
        
        scene1 = new Scene(layout1, 500, 500);
        
        return scene1;
    }

}
