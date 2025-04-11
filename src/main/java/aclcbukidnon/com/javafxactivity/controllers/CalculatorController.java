//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package aclcbukidnon.com.javafxactivity.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class CalculatorController {
    @FXML
    private Label displayLabel;
    private String currentInput = "";
    private double firstOperand = (double)0.0F;
    private String operator = "";

    public CalculatorController() {
    }

    public void initialize() {
        this.displayLabel.setText("0");
    }

    @FXML
    private void onNumberClick(ActionEvent event) {
        String buttonText = ((Button)event.getSource()).getText();
        if (this.currentInput.equals("0")) {
            this.currentInput = buttonText;
        } else {
            this.currentInput = this.currentInput + buttonText;
        }

        this.displayLabel.setText(this.currentInput);
    }

    @FXML
    private void onOperatorClick(ActionEvent event) {
        String buttonText = ((Button)event.getSource()).getText();
        if (!this.currentInput.isEmpty()) {
            this.firstOperand = Double.parseDouble(this.currentInput);
            this.currentInput = "";
            this.operator = buttonText;
        }

    }

    @FXML
    private void onEqualClick() {
        if (!this.currentInput.isEmpty()) {
            double secondOperand = Double.parseDouble(this.currentInput);
            double result = (double)0.0F;
            switch (this.operator) {
                case "+":
                    result = this.firstOperand + secondOperand;
                    break;
                case "-":
                    result = this.firstOperand - secondOperand;
                    break;
                case "*":
                    result = this.firstOperand * secondOperand;
                    break;
                case "/":
                    if (secondOperand == (double)0.0F) {
                        this.displayLabel.setText("Error");
                        return;
                    }

                    result = this.firstOperand / secondOperand;
            }

            this.displayLabel.setText(String.valueOf(result));
            this.currentInput = String.valueOf(result);
            this.operator = "";
        }

    }

    @FXML
    private void onClearClick() {
        this.currentInput = "";
        this.operator = "";
        this.displayLabel.setText("0");
    }

    @FXML
    private void onBackspaceClick() {
        if (this.currentInput.length() > 0) {
            this.currentInput = this.currentInput.substring(0, this.currentInput.length() - 1);
            if (this.currentInput.isEmpty()) {
                this.currentInput = "0";
            }

            this.displayLabel.setText(this.currentInput);
        }

    }
}
