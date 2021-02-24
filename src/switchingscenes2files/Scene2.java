/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchingscenes2files;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TabPane;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

/**
 *
 * @author Obituary
 */
public class Scene2 extends Scene {

    static Scene scene2;

    public Scene2(Parent arg0) {
        super(arg0);
    }

    public static Scene createScene2() {
        Button button2 = new Button("This scene sucks, go back to scene 1 TEST");
        button2.setOnAction(e -> {
            SwitchingScenes2Files.getWindow().setScene(Scene1.createScene());
            //System.out.println("bouton cliqué");
        });

        TreeItem<String> root, branch1, branch2;

        //Root 
        root = new TreeItem<>();
        root.setExpanded(true);

        //Branch1
        branch1 = makeBranch("branche 1", root);
        makeBranch("feuille 1", branch1);
        makeBranch("feuille 2", branch1);
        makeBranch("feuille 3", branch1);
        //Branch2
        branch2 = makeBranch("branche 2", root);
        makeBranch("feuille 1", branch2);
        makeBranch("feuille 2", branch2);
        makeBranch("feuille 3", branch2);

        //Create tree 
        TreeView tree = new TreeView<>(root);
        tree.setShowRoot(false);

        StackPane leftmenu = new StackPane();
        leftmenu.getChildren().add(tree);

        
        // tabpane 
        TabPane tabPane = new TabPane();
        tabPane.getTabs().add(Tab1.createTab());
        tabPane.getTabs().add(Tab2.createTab());
        
        VBox vBox = new VBox(tabPane);

        
        // Layout
        BorderPane layout1 = new BorderPane();
        layout1.setLeft(leftmenu);
        layout1.setCenter(vBox);
        
        //layout2.setCenter(button2);
        //StackPane layout2 = new StackPane();
        //layout2.getChildren().add(button2);
        scene2 = new Scene(layout1, 600, 300);
        return scene2;
    }

    // makes the branch
    private static TreeItem<String> makeBranch(String title, TreeItem<String> parent) {
        TreeItem<String> item = new TreeItem<>(title);
        item.setExpanded(true);
        parent.getChildren().add(item);
        return item;
    }
}
