//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package aclcbukidnon.com.javafxactivity.controllers;

import aclcbukidnon.com.javafxactivity.Main;
import java.io.IOException;
import java.util.Timer;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ProgressBar;
import javafx.stage.Stage;
import javafx.util.Duration;

public class SplashScreenController {
    private Timer timer;
    private Stage stage;
    @FXML
    public ProgressBar progressInitial;

    public SplashScreenController() {
    }

    @FXML
    public void initialize() {
        Timeline timeline = new Timeline(new KeyFrame[]{new KeyFrame(Duration.ZERO, (e) -> this.progressInitial.setProgress((double)0.0F), new KeyValue[0]), new KeyFrame(Duration.millis((double)200.0F), (e) -> this.progressInitial.setProgress(0.1), new KeyValue[0]), new KeyFrame(Duration.millis((double)350.0F), (e) -> this.progressInitial.setProgress(0.3), new KeyValue[0]), new KeyFrame(Duration.millis((double)400.0F), (e) -> this.progressInitial.setProgress((double)0.5F), new KeyValue[0]), new KeyFrame(Duration.millis((double)550.0F), (e) -> this.progressInitial.setProgress(0.7), new KeyValue[0]), new KeyFrame(Duration.millis((double)600.0F), (e) -> this.progressInitial.setProgress(0.9), new KeyValue[0]), new KeyFrame(Duration.millis((double)1050.0F), (e) -> this.progressInitial.setProgress((double)1.0F), new KeyValue[0])});
        timeline.play();
        timeline.setOnFinished((var1) -> this.onCompleted());
    }

    public void onCompleted() {
        FXMLLoader dashboardFxml = new FXMLLoader(Main.class.getResource("dashboard-view.fxml"));

        try {
            Scene scene = new Scene((Parent)dashboardFxml.load(), (double)800.0F, (double)600.0F);
            System.out.println(this.stage.toString());
            this.stage.setScene(scene);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void setStage(Stage stage) {
        System.out.println("Set Stage");
        this.stage = stage;
        System.out.println(stage.toString());
    }
}
