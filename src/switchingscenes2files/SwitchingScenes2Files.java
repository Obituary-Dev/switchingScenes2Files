/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchingscenes2files;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 *
 * @author Obituary
 */


public class SwitchingScenes2Files extends Application {

    static Stage window;

    public static Stage getWindow() {
        return window;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    public void start(Stage primaryStage) throws Exception {
        //--------------------------- First scene ------------------------------------
        window = primaryStage;
        
        // default appearance 
        window.setScene(Scene1.createScene());
        window.setTitle("Title here");
        window.show(); // displays it
    }
    
    
}
