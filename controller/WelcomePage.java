package controller;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.util.Duration;
import javafx.scene.control.Button;

import javafx.event.ActionEvent;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import application.HospitalManagement;

public class WelcomePage{
	
	private Timeline timeline;
	
    @FXML
    private Label clockLabel;
    
    @FXML
    private Label dateLabel;

    @FXML
    private Button startButton;
    
    @FXML
    private Button exitButton;
    
    @FXML
    private HBox hBoxButton;
    
    @FXML
    private VBox vBoxImage;
   
    
    @FXML
    public void initialize() {
        startClock();
    }

    @FXML
    public void clickStart(ActionEvent event) throws Exception{
    	HospitalManagement.mainMenu();
    }
    
    @FXML
    public void exit(ActionEvent event) throws Exception{
    	System.exit(0);
    }
    
    private void startClock() {
        timeline = new Timeline(
                new KeyFrame(Duration.seconds(1), e -> updateClock())
        );
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
    }

    private void updateClock() {
    	Platform.runLater(() -> {
            LocalDate currentDate = LocalDate.now();
            dateLabel.setText(currentDate.format(DateTimeFormatter.ofPattern("E, dd/MM/yyyy")));

            LocalTime currentTime = LocalTime.now();
            clockLabel.setText(currentTime.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
        });
    }
}
