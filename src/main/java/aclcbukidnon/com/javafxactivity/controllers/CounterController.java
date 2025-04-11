//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package aclcbukidnon.com.javafxactivity.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class CounterController {
    @FXML
    private Button decrementButton;
    @FXML
    private Button incrementButton;
    @FXML
    private Label counterLabel;
    private int counter = 0;

    public CounterController() {
    }

    @FXML
    private void initialize() {
        this.updateCounterLabel();
        this.decrementButton.setOnAction((var1) -> this.decrement());
        this.incrementButton.setOnAction((var1) -> this.increment());
    }

    private void increment() {
        ++this.counter;
        this.updateCounterLabel();
    }

    private void decrement() {
        --this.counter;
        this.updateCounterLabel();
    }

    private void updateCounterLabel() {
        this.counterLabel.setText(String.valueOf(this.counter));
    }
}
