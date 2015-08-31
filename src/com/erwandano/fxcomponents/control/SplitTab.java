package com.erwandano.fxcomponents.control;

import javafx.geometry.Insets;
import javafx.geometry.Side;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;

/**
 * A Tab inside a SplitTabPane
 */
public class SplitTab extends Tab{

    public SplitTab(){
        label = new Label();
        tab = new HBox(label);
        tab.setFillHeight(true);
        tab.setPadding(new Insets(5));
        HBox.setHgrow(tab, Priority.ALWAYS);
        StackPane stackPane = new StackPane(tab);
        setGraphic(stackPane);
        setClosable(false);
        setStyle("-fx-padding: 0px");
    }

    /**
     * HBox containing the label so that the user can click anywhere on the tab to show it
     */
    private HBox tab;

    public HBox getTab(){
        return tab;
    }

    /**
     * The Label used to display the tab and its graphics
     */
    private Label label;

    public Label getLabel() {
        return label;
    }

    /**
     * The developers of JavaFX decided to make the setText method final
     * so now I have to create a new method for that
     */
    public void setTabText(String text){
        this.setText("");
        label.setText(text);
    }

    public String getTabText(){
        return label.getText();
    }

    /**
     * Choose the graphics
     */
    public void setTabGraphic(Node graphics){
        label.setGraphic(graphics);
    }

    public Node getTabGraphic(){
        return label.getGraphic();
    }

    /**
     * Set the side of the tab
     * @param side  Either left, right, top or bottom
     */
    public void setSide(Side side){
        switch (side){
            case LEFT:
                label.setRotate(-90);
                break;
            case RIGHT:
                label.setRotate(90);
                break;
        }
    }


}
