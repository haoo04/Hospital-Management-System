package application;
	

import java.awt.GraphicsEnvironment;
import java.awt.Insets;
import java.awt.Toolkit;
import java.util.ArrayList;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.Screen;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.geometry.Rectangle2D;


public class HospitalManagement extends Application {
	static Stage display;
	private static ArrayList<Doctor> doctors = new ArrayList<Doctor>();
	private static ArrayList<Patient> patients = new ArrayList<Patient>();
	//Welcome Page
	@Override
	public void start(Stage WelcomePage) throws Exception {
		
		initData();
		display = WelcomePage;
		AnchorPane welcomePage = (AnchorPane)FXMLLoader.load(getClass().getResource("/fxml/WelcomePage.fxml"));
		Screen screen = Screen.getPrimary();
		Rectangle2D bounds = screen.getVisualBounds();
	
		
		Insets insets = Toolkit.getDefaultToolkit().getScreenInsets(GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDefaultConfiguration());
		Scene scene = new Scene(welcomePage,1000,650);
		
		WelcomePage.setMaximized(false);
		WelcomePage.setTitle("Welcome!");
		WelcomePage.getIcons().add(new Image("file:image/Logo.png"));
		WelcomePage.setScene(scene);

		welcomePage.setPrefWidth(bounds.getMaxX() - insets.left - insets.right);
		welcomePage.setPrefHeight(bounds.getMaxY() - insets.bottom - insets.top);
		WelcomePage.show();
		
	}
	
	//Main Menu
	public static void mainMenu() throws Exception {
	    BorderPane mainMenu = (BorderPane)FXMLLoader.load(HospitalManagement.class.getResource("/fxml/MainMenu.fxml"));
	    Scene menu = new Scene(mainMenu,1000,650);
	    display.setScene(menu);
	}
	//initialized data
	public static void initData() throws Exception {
		addNewDoctor("213","Chin Yi Hao","General surgery","10.00 a.m.~4.00 p.m.","Master of Medicine (Surgery)",001);
		addNewPatient("243","Niubi","pregnant","Male","To Be Verified",16);
	}
	
	
	//Doctor Menu
	public static void newDoctorPage() throws Exception {
	    BorderPane newDoc = (BorderPane)FXMLLoader.load(HospitalManagement.class.getResource("/fxml/NewDoctor.fxml"));
	    Scene newDoctor = new Scene(newDoc,1000,650);
	    display.setScene(newDoctor);
	}

	public static void ShowDoctorPage() throws Exception {
	    BorderPane showDoc = (BorderPane)FXMLLoader.load(HospitalManagement.class.getResource("/fxml/ShowDoctor.fxml"));
	    Scene showDoctor = new Scene(showDoc,1000,650);
	    display.setScene(showDoctor);
	}
	
	public static void addNewDoctor(String docId,String docName,String docSpecialist,String docWorkTime,String docQualification,int docRoomNo) throws Exception{
		Doctor newDoctor = Doctor.newDoctor(docId, docName, docSpecialist, docWorkTime, docQualification, docRoomNo);
		doctors.add(newDoctor);
	}
	
	public static ArrayList<Doctor> getDoctors() {
	    return doctors;
	}
	
    public static boolean isDoctorIdExists(String id) {
        for (Doctor doctor : doctors) {
            if (doctor.getID().equals(id)) {
                return true;
            }
        }
        return false;
    }
	
	public static int getDoctorCount() {
	    return doctors.size();
	}
	
	
	
	//Staff Menu
	public static void newStaffPage() throws Exception {
	    AnchorPane newStf = (AnchorPane)FXMLLoader.load(HospitalManagement.class.getResource("/fxml/NewStaff.fxml"));
	    Scene newStaff = new Scene(newStf,1000,650);
	    display.setScene(newStaff);
	}
	
	public static void ShowStaffPage() throws Exception {
	    AnchorPane showStf = (AnchorPane)FXMLLoader.load(HospitalManagement.class.getResource("/fxml/ShowStaff.fxml"));
	    Scene showStaff = new Scene(showStf,1000,650);
	    display.setScene(showStaff);
	}

	
	//Patient Menu
	public static void newPatientPage() throws Exception {
	    BorderPane newPtn = (BorderPane)FXMLLoader.load(HospitalManagement.class.getResource("/fxml/NewPatient.fxml"));
	    Scene newPatient = new Scene(newPtn,1000,650);
	    display.setScene(newPatient);
	}
	
	public static void ShowPatientPage() throws Exception {
	    BorderPane showPtn = (BorderPane)FXMLLoader.load(HospitalManagement.class.getResource("/fxml/ShowPatient.fxml"));
	    Scene showPatient = new Scene(showPtn,1000,650);
	    display.setScene(showPatient);
	}
	
	
	public static void addNewPatient(String patId,String patName,String patDisease,String patSex,String patAdmitStatus,int patAge) throws Exception{
		Patient newPatient = Patient.newPatient(patId,patName,patDisease,patSex,patAdmitStatus,patAge);
		patients.add(newPatient);
	}
	
	public static ArrayList<Patient> getPatients() {
	    return patients;
	}
	
	public static boolean isPatientIdExists(String id) {
        for (Patient patient : patients) {
            if (patient.getID().equals(id)) {
                return true;
            }
        }
        return false;
    }
	
	public static int getPatientCount() {
	    return patients.size();
	}
	
	
	//Facility Menu
	public static void newFacilityPage() throws Exception {
	    AnchorPane newFaci = (AnchorPane)FXMLLoader.load(HospitalManagement.class.getResource("/fxml/NewFacility.fxml"));
	    Scene newFacility = new Scene(newFaci,1000,650);
	    display.setScene(newFacility);
	}
	
	public static void ShowFacilityPage() throws Exception {
	    AnchorPane showFaci = (AnchorPane)FXMLLoader.load(HospitalManagement.class.getResource("/fxml/ShowFacility.fxml"));
	    Scene showFacility = new Scene(showFaci,1000,650);
	    display.setScene(showFacility);
	}
	
	//Lab Menu
	public static void newLabPage() throws Exception {
	    AnchorPane newLb = (AnchorPane)FXMLLoader.load(HospitalManagement.class.getResource("/fxml/NewLab.fxml"));
	    Scene newLab = new Scene(newLb,1000,650);
	    display.setScene(newLab);
	}
	
	public static void labListPage() throws Exception {
	    AnchorPane labLst = (AnchorPane)FXMLLoader.load(HospitalManagement.class.getResource("/fxml/LabList.fxml"));
	    Scene labList = new Scene(labLst,1000,650);
	    display.setScene(labList);
	}
	
	//Medicine Menu
	public static void newMedicinePage() throws Exception {
	    AnchorPane newMdc = (AnchorPane)FXMLLoader.load(HospitalManagement.class.getResource("/fxml/NewMedicine.fxml"));
	    Scene newMedicine = new Scene(newMdc,1000,650);
	    display.setScene(newMedicine);
	}
	
	public static void findMedicinePage() throws Exception {
	    AnchorPane findMdc = (AnchorPane)FXMLLoader.load(HospitalManagement.class.getResource("/fxml/FindMedicine.fxml"));
	    Scene findMedicine = new Scene(findMdc,1000,650);
	    display.setScene(findMedicine);
	}
	
	public static void showSuccessMessage() throws Exception {
		Stage success = new Stage();
		Pane showSuccessPage = (Pane)FXMLLoader.load(HospitalManagement.class.getResource("/fxml/ShowSuccessMessage.fxml"));
	
		Scene showSuccess = new Scene(showSuccessPage,300,250);
		
		success.setTitle("Successful !!!");
		success.getIcons().add(new Image("file:image/Logo.png"));
		success.setScene(showSuccess);

		success.show();
	}
	
	public static void showErrorMessage(String message) throws Exception{
	    Alert alert = new Alert(Alert.AlertType.ERROR);
	    alert.setTitle("opps...Somethings Wrong");
	    alert.setHeaderText(null);
	    alert.setContentText(message);
	    alert.showAndWait();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
