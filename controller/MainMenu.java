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
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.util.Duration;

public class MainMenu {

    @FXML
    private Label date;

    @FXML
    private VBox medicineInfo;

    @FXML
    private MenuItem newPatient;

    @FXML
    private Label showDoctorLabel;

    @FXML
    private Menu doctorMenu;

    @FXML
    private MenuItem showStaff;

    @FXML
    private MenuBar labBar;

    @FXML
    private Label staffLabel;

    @FXML
    private Menu staffMenu;

    @FXML
    private Label medicineLabel;

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
    private VBox patientInfo;

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
    private VBox facilityInfo;

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
    private VBox sideBar;

    @FXML
    private VBox labInfo;

    @FXML
    private Label findMedicineLabel;

    @FXML
    private Label labListLabel;

    @FXML
    private MenuItem labList;

    @FXML
    private Label time;

    @FXML
    private VBox doctorInfo;

    @FXML
    private VBox staffInfo;
    
    @FXML
    private Button exitButton;
    
    @FXML
    private Label totalDoctor;
    
    @FXML
    private HBox doctorNum;
    
    @FXML 
    private Label numOfDoctor;
    
    @FXML
    private Label totalStaff;
    
    @FXML
    private HBox staffNum;
    
    @FXML 
    private Label numOfStaff;
    
    @FXML
    private Label totalPatient;
    
    @FXML
    private HBox patientNum;
    
    @FXML 
    private Label numOfPatient;
    
    @FXML
    private Label totalFacility;
    
    @FXML
    private HBox facilityNum;
    
    @FXML 
    private Label numOfFacility;
    
    @FXML
    private Label totalLab;
    
    @FXML
    private HBox labNum;
    
    @FXML 
    private Label numOfLab;
    
    @FXML
    private Label totalMedicine;
    
    @FXML
    private HBox medicineNum;
    
    @FXML 
    private Label numOfMedicine;
    
    private Timeline timeline;

    @FXML
    public void initialize() {
    	startClock();
    	updateDoctorCount();
    	updateStaffCount();
    	updatePatientCount();
    	updateFacilityCount();
    	updateLabCount();
    	updateMedicineCount();
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
    
    public void updateDoctorCount() {
        int count = HospitalManagement.getDoctorCount();
        numOfDoctor.setText(String.valueOf(count));
    }
    
    public void updateStaffCount() {
        int count = HospitalManagement.getStaffCount();
        numOfStaff.setText(String.valueOf(count));
    }
    
    public void updatePatientCount() {
        int count = HospitalManagement.getPatientCount();
        numOfPatient.setText(String.valueOf(count));
    }
    
    public void updateFacilityCount() {
        int count = HospitalManagement.getFacilityCount();
        numOfFacility.setText(String.valueOf(count));
    }
    
    public void updateLabCount() {
        int count = HospitalManagement.getLabCount();
        numOfLab.setText(String.valueOf(count));
    }
    
    public void updateMedicineCount() {
        int count = HospitalManagement.getMedicineCount();
        numOfMedicine.setText(String.valueOf(count));
    }
    
    private void startClock() {
        timeline = new Timeline(new KeyFrame(Duration.seconds(0.1), e -> updateClock()));
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