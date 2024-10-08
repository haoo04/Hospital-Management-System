package controller;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import application.HospitalManagement;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.util.Duration;

public class NewPatient {

	  	@FXML
	    private Label date;

	    @FXML
	    private ComboBox<String> patientSex;

	    @FXML
	    private MenuItem newPatient;

	    @FXML
	    private TextField patientId;

	    @FXML
	    private Label showDoctorLabel;

	    @FXML
	    private Menu doctorMenu;

	    @FXML
	    private MenuItem showStaff;

	    @FXML
	    private Button mainButton;

	    @FXML
	    private MenuBar labBar;

	    @FXML
	    private TextField patientDisease;

	    @FXML
	    private Label staffLabel;

	    @FXML
	    private Menu staffMenu;

	    @FXML
	    private Label medicineLabel;

	    @FXML
	    private TextField patientAge;

	    @FXML
	    private ImageView logo;

	    @FXML
	    private VBox clockBox;

	    @FXML
	    private MenuBar medicineBar;

	    @FXML
	    private MenuItem findMedicine;

	    @FXML
	    private Label newLabLabel;

	    @FXML
	    private Label patientLabel;

	    @FXML
	    private MenuItem newFacility;

	    @FXML
	    private Label showStaffLabel;

	    @FXML
	    private Menu medicineMenu;

	    @FXML
	    private Label newDoctorLabel;

	    @FXML
	    private Label labLabel;

	    @FXML
	    private Menu facilityMenu;

	    @FXML
	    private MenuItem newLab;

	    @FXML
	    private ComboBox<String> patientAdmitStatus;

	    @FXML
	    private MenuItem showDoctor;

	    @FXML
	    private Menu labMenu;

	    @FXML
	    private MenuItem showPatient;

	    @FXML
	    private Label newFacilityLabel;

	    @FXML
	    private MenuItem newMedicine;

	    @FXML
	    private MenuItem newDoctor;

	    @FXML
	    private Label newStaffLabel;

	    @FXML
	    private MenuItem newStaff;

	    @FXML
	    private Menu patientMenu;

	    @FXML
	    private MenuItem showFacility;

	    @FXML
	    private Label newMedicineLabel;

	    @FXML
	    private Button saveButton;

	    @FXML
	    private MenuBar doctorBar;

	    @FXML
	    private MenuBar facilityBar;

	    @FXML
	    private MenuBar staffBar;

	    @FXML
	    private Label showPatientLabel;

	    @FXML
	    private HBox topMenu;

	    @FXML
	    private TextField patientName;

	    @FXML
	    private Label newPatientLabel;

	    @FXML
	    private Label facilityLabel;

	    @FXML
	    private MenuBar patientBar;

	    @FXML
	    private Label doctorLabel;

	    @FXML
	    private Label showFacilityLabel;

	    @FXML
	    private Button exitButton;

	    @FXML
	    private VBox sideBar;

	    @FXML
	    private Label findMedicineLabel;

	    @FXML
	    private Label labListLabel;

	    @FXML
	    private MenuItem labList;

	    @FXML
	    private Label time;


    private Timeline timeline;
    
    private String[] sex = {"Male","Female"};
    
    private String[] admitStatus = {"To be verified","Under treatment","Recovered","Deceased"};

    @FXML
    public void initialize() {
    	startClock();
    	patientSex.getItems().addAll(sex);
    	patientAdmitStatus.getItems().addAll(admitStatus);
    }
    
    //Doctor menu
    @FXML
    void newDoctor(ActionEvent event) throws Exception {
    	HospitalManagement.newDoctorPage();
    }
    
    @FXML
    void showDoctor(ActionEvent event) throws Exception {
    	HospitalManagement.ShowDoctorPage();
    }
    
    //Staff Menu
    @FXML
    void newStaff(ActionEvent event) throws Exception {
    	HospitalManagement.newStaffPage();
    }

    @FXML
    void showStaff(ActionEvent event) throws Exception {
    	HospitalManagement.ShowStaffPage();
    }
    
    //Patient Menu
    @FXML
    void newPatient(ActionEvent event) throws Exception {
    	HospitalManagement.newPatientPage();
    }

    @FXML
    void showPatient(ActionEvent event) throws Exception {
    	HospitalManagement.ShowPatientPage();
    }
    
    //Facility Menu
    @FXML
    void newFacility(ActionEvent event) throws Exception {
    	HospitalManagement.newFacilityPage();
    }

    @FXML
    void showFacility(ActionEvent event) throws Exception {
    	HospitalManagement.ShowFacilityPage();
    }
    
    //Lab Menu
    @FXML
    void newLab(ActionEvent event) throws Exception {
    	HospitalManagement.newLabPage();
    }

    @FXML
    void labList(ActionEvent event) throws Exception {
    	HospitalManagement.labListPage();
    }
    
    //Medicine Menu
    @FXML
    void newMedicine(ActionEvent event) throws Exception {
    	HospitalManagement.newMedicinePage();
    }

    @FXML
    void findMedicine(ActionEvent event) throws Exception {
    	HospitalManagement.findMedicinePage();
    }
    
    @FXML
    void exit(ActionEvent event) {
    	HospitalManagement.exitMessage();
    }
    
    @FXML
    void backMenu(ActionEvent event) throws Exception {
    	HospitalManagement.mainMenu();
    }
    
    @FXML
    void savePatient(ActionEvent event) throws Exception{
    	try {
    		String id = patientId.getText();
    		String name = patientName.getText();
    		String disease = patientDisease.getText();
    		String sex = patientSex.getValue();
    		String admitStatus = patientAdmitStatus.getValue();
    		String stringAge = patientAge.getText();
    		int age  = Integer.parseInt(stringAge);
    		
    		if(id.isEmpty() || name.isEmpty() || disease.isEmpty() ||sex.isEmpty() || admitStatus.isEmpty() ||stringAge.isEmpty()) {
    			HospitalManagement.showErrorMessage("Please enter all the data !");
    			return;
    		}
    	    if (HospitalManagement.isPatientIdExists(id)) {
    	        HospitalManagement.showErrorMessage("Patient ID already exist! please change!");
    	        return;
    	    }
    		HospitalManagement.addNewPatient(id,name,disease,sex,admitStatus,age);
    		clearFields();
    		HospitalManagement.showSuccessMessage();
    		
    	}catch(NumberFormatException e) {
    		HospitalManagement.showErrorMessage("Please enter the correct age!");
    		
    	}catch(Exception e) {
    		HospitalManagement.showErrorMessage("Please check again the data filled!");
    	}
    }
    
    private void clearFields() {
        patientId.clear();
        patientName.clear();
        patientDisease.clear();
        patientSex.getSelectionModel().clearSelection();
        patientAdmitStatus.getSelectionModel().clearSelection();
        patientAge.clear();
    }
    
    
    private void startClock() {
        timeline = new Timeline(new KeyFrame(Duration.seconds(1), e -> updateClock()));
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
    }

    private void updateClock() {
        LocalDate currentDate = LocalDate.now();
        date.setText(currentDate.format(DateTimeFormatter.ofPattern("E, dd/MM/yyyy")));

        LocalTime currentTime = LocalTime.now();
        time.setText(currentTime.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
    }
}