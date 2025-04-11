//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package aclcbukidnon.com.javafxactivity.controllers;

import aclcbukidnon.com.javafxactivity.Main;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.layout.BorderPane;

public class DashboardController {
    @FXML
    private BorderPane rootPane;

    public DashboardController() {
    }

    @FXML
    public void initialize() {
        this.loadPage("counter-view.fxml");
    }

    @FXML
    protected void onTrafficLightClick() {
        this.loadPage("traffic-light-view.fxml");
    }

    @FXML
    protected void onCounterClick() {
        this.loadPage("counter-view.fxml");
    }

    @FXML
    protected void onCalculatorClick() {
        this.loadPage("calculator-view.fxml");
    }

    @FXML
    protected void onTodoClick() {
        this.loadPage("todo-view.fxml");
    }

    private void loadPage(String fxml) {
        try {
            Object root = FXMLLoader.load(Main.class.getResource(fxml));

            assert this.rootPane != null;

            this.rootPane.setCenter((Node)root);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
