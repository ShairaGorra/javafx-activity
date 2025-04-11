//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package aclcbukidnon.com.javafxactivity;

import aclcbukidnon.com.javafxactivity.controllers.CalculatorController;
import aclcbukidnon.com.javafxactivity.controllers.SplashScreenController;
import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public Main() {
    }

    public void start(Stage stage) throws IOException {
        FXMLLoader splashScreenFxml = new FXMLLoader(Main.class.getResource("splash-screen-view.fxml"));
        Scene splashScreenScene = new Scene((Parent)splashScreenFxml.load(), (double)800.0F, (double)600.0F);
        SplashScreenController splashScreenCtrl = (SplashScreenController)splashScreenFxml.getController();
        splashScreenCtrl.setStage(stage);
        stage.setMinWidth((double)800.0F);
        stage.setMinHeight((double)600.0F);
        stage.setTitle("Activity");
        stage.setScene(splashScreenScene);
        stage.show();
        stage.setOnHidden((event) -> this.showCalculator(stage));
    }

    private void showCalculator(Stage stage) {
        try {
            FXMLLoader calculatorFxml = new FXMLLoader(Main.class.getResource("calculator-view.fxml"));
            Scene calculatorScene = new Scene((Parent)calculatorFxml.load(), (double)600.0F, (double)400.0F);
            CalculatorController calculatorCtrl = (CalculatorController)calculatorFxml.getController();
            stage.setMinWidth((double)600.0F);
            stage.setMinHeight((double)400.0F);
            stage.setTitle("Calculator");
            stage.setScene(calculatorScene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        launch(new String[0]);
    }
}
