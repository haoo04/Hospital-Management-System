package application;
	

import java.awt.GraphicsEnvironment;
import java.awt.Insets;
import java.awt.Toolkit;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.Screen;
import javafx.scene.layout.AnchorPane;

import javafx.geometry.Rectangle2D;


public class Main extends Application {
	static Stage display;
	
	@Override
	public void start(Stage WelcomePage) throws Exception {
		
		display = WelcomePage;
		AnchorPane welcomePage = (AnchorPane)FXMLLoader.load(getClass().getResource("/fxml/WelcomePage.fxml"));
		Screen screen = Screen.getPrimary();
		Rectangle2D bounds = screen.getVisualBounds();
	
		
		Insets insets = Toolkit.getDefaultToolkit().getScreenInsets(GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDefaultConfiguration());
		Scene scene = new Scene(welcomePage,1000,650);
		
		WelcomePage.setMaximized(false);
		WelcomePage.setTitle("Hello World");
		WelcomePage.setScene(scene);

		welcomePage.setPrefWidth(bounds.getMaxX() - insets.left - insets.right);
		welcomePage.setPrefHeight(bounds.getMaxY() - insets.bottom - insets.top);
		WelcomePage.show();
		
	}
	
	public static void mainMenu() throws Exception {
	    AnchorPane mainMenu = (AnchorPane)FXMLLoader.load(Main.class.getResource("/fxml/MainMenu.fxml"));
	    Scene menu = new Scene(mainMenu,1000,650);
	    display.setScene(menu);
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
