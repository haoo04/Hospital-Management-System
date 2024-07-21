package application;
	

import java.awt.GraphicsEnvironment;
import java.awt.Insets;
import java.awt.Toolkit;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.Screen;
import javafx.scene.layout.AnchorPane;

import javafx.geometry.Rectangle2D;


public class Main extends Application {
	static Stage display;
	
	//Welcome Page
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
		WelcomePage.getIcons().add(new Image("file:image/Logo.png"));
		WelcomePage.setScene(scene);

		welcomePage.setPrefWidth(bounds.getMaxX() - insets.left - insets.right);
		welcomePage.setPrefHeight(bounds.getMaxY() - insets.bottom - insets.top);
		WelcomePage.show();
		
	}
	
	//Main Menu
	public static void mainMenu() throws Exception {
	    AnchorPane mainMenu = (AnchorPane)FXMLLoader.load(Main.class.getResource("/fxml/MainMenu.fxml"));
	    Scene menu = new Scene(mainMenu,1000,650);
	    display.setScene(menu);
	}
	
	//Doctor Menu
	public static void newDoctorPage() throws Exception {
	    AnchorPane newDoc = (AnchorPane)FXMLLoader.load(Main.class.getResource("/fxml/NewDoctor.fxml"));
	    Scene newDoctor = new Scene(newDoc,1000,650);
	    display.setScene(newDoctor);
	}
	
	public static void ShowDoctorPage() throws Exception {
	    AnchorPane showDoc = (AnchorPane)FXMLLoader.load(Main.class.getResource("/fxml/ShowDoctor.fxml"));
	    Scene showDoctor = new Scene(showDoc,1000,650);
	    display.setScene(showDoctor);
	}
	
	//Staff Menu
	public static void newStaffPage() throws Exception {
	    AnchorPane newStf = (AnchorPane)FXMLLoader.load(Main.class.getResource("/fxml/NewStaff.fxml"));
	    Scene newStaff = new Scene(newStf,1000,650);
	    display.setScene(newStaff);
	}
	
	public static void ShowStaffPage() throws Exception {
	    AnchorPane showStf = (AnchorPane)FXMLLoader.load(Main.class.getResource("/fxml/ShowStaff.fxml"));
	    Scene showStaff = new Scene(showStf,1000,650);
	    display.setScene(showStaff);
	}
	
	//Patient Menu
	public static void newPatientPage() throws Exception {
	    AnchorPane newPtn = (AnchorPane)FXMLLoader.load(Main.class.getResource("/fxml/NewPatient.fxml"));
	    Scene newPatient = new Scene(newPtn,1000,650);
	    display.setScene(newPatient);
	}
	
	public static void ShowPatientPage() throws Exception {
	    AnchorPane showPtn = (AnchorPane)FXMLLoader.load(Main.class.getResource("/fxml/ShowPatient.fxml"));
	    Scene showPatient = new Scene(showPtn,1000,650);
	    display.setScene(showPatient);
	}
	
	//Facility Menu
	public static void newFacilityPage() throws Exception {
	    AnchorPane newFaci = (AnchorPane)FXMLLoader.load(Main.class.getResource("/fxml/NewFacility.fxml"));
	    Scene newFacility = new Scene(newFaci,1000,650);
	    display.setScene(newFacility);
	}
	
	public static void ShowFacilityPage() throws Exception {
	    AnchorPane showFaci = (AnchorPane)FXMLLoader.load(Main.class.getResource("/fxml/ShowFacility.fxml"));
	    Scene showFacility = new Scene(showFaci,1000,650);
	    display.setScene(showFacility);
	}
	
	//Lab Menu
	public static void newLabPage() throws Exception {
	    AnchorPane newLb = (AnchorPane)FXMLLoader.load(Main.class.getResource("/fxml/NewLab.fxml"));
	    Scene newLab = new Scene(newLb,1000,650);
	    display.setScene(newLab);
	}
	
	public static void labListPage() throws Exception {
	    AnchorPane labLst = (AnchorPane)FXMLLoader.load(Main.class.getResource("/fxml/LabList.fxml"));
	    Scene labList = new Scene(labLst,1000,650);
	    display.setScene(labList);
	}
	
	//Medicine Menu
	public static void newMedicinePage() throws Exception {
	    AnchorPane newMdc = (AnchorPane)FXMLLoader.load(Main.class.getResource("/fxml/NewMedicine.fxml"));
	    Scene newMedicine = new Scene(newMdc,1000,650);
	    display.setScene(newMedicine);
	}
	
	public static void findMedicinePage() throws Exception {
	    AnchorPane findMdc = (AnchorPane)FXMLLoader.load(Main.class.getResource("/fxml/FindMedicine.fxml"));
	    Scene findMedicine = new Scene(findMdc,1000,650);
	    display.setScene(findMedicine);
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
