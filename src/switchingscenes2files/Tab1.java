/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchingscenes2files;

import javafx.scene.Group;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.VBox;

/**
 *
 * @author Obituary
 */
public class Tab1 extends Tab {


    public static Tab createTab() {

        TableView table = new TableView();

        table.setEditable(true);

        TableColumn column1 = new TableColumn("id");
        TableColumn column2 = new TableColumn("x");
        TableColumn column3 = new TableColumn("y");
        TableColumn column4 = new TableColumn("successeur");

        table.getColumns().addAll(column1, column2, column3, column4);

        Tab tab1 = new Tab("Tab 1", table);


        return tab1;
    }
    // shapes to draw in the canvas

    public static void drawShapes(GraphicsContext graphicsContext) {
        //...
    }
}
