package application;
	

import java.awt.GraphicsEnvironment;
import java.awt.Insets;
import java.awt.Toolkit;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.Screen;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.geometry.Rectangle2D;

public class HospitalManagement extends Application{
	static Stage display;
	private static ArrayList<Doctor> doctors = new ArrayList<Doctor>();
	private static ArrayList<Staff> staffs = new ArrayList<Staff>();
	private static ArrayList<Patient> patients = new ArrayList<Patient>();
	private static ArrayList<Facility> facilities = new ArrayList<Facility>();
	private static ArrayList<Lab> labs = new ArrayList<Lab>();
	private static ArrayList<Medicine> medicines = new ArrayList<Medicine>();
	
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
		addNewDoctor("001","Bryan","General surgery","10.00 a.m.~4.00 p.m.","Master of Medicine (Surgery)",1);
		addNewDoctor("002","Chai Xu Kun","Cardiologist","10.00 a.m.~2.00 p.m.","ScD in Epidemiology (Cardiovascular)",3);
		addNewDoctor("003","Krishnamurthi","Endocrinology","1.00 p.m.~4.00 p.m.","PhD in Endocrinology and Metabolism",7);
		addNewDoctor("004","Hakim Gharib","Otorhinolaryngology","1.00 p.m.~5.00 p.m.","Master of Otorhinolaryngology",12);
		
		addNewStaff("103", "Michelle Chong", "Female", "Nurse", 4000, "Neurology Division");
		addNewStaff("628", "Nancy Wong", "Female", "Pharmacist", 9500, "20594");
		addNewStaff("629", "Loo Voon Shan", "Female", "Pharmacist", 8000, "135289");
		
		addNewPatient("122","Meredith Ling","Bone fracture","Female","Under treatment",19);
		addNewPatient("159","Tan Boon Teik","Gastroenteritis","Male","Recovered",33);
		addNewPatient("185","Ang Ee Ling","Sinusitis","Female","Recovered",21);
		
		addNewFacility("Emergency Room");
		addNewFacility("Operating Room");
		addNewFacility("Intensive Care Unit (ICU)");
		addNewFacility("Wards");
		addNewFacility("Pharmacy");
		addNewFacility("Outpatient Department");
		
		addNewLab("Clinical Chemistry Laboratory",19000);
		addNewLab("Hematology Laboratory",14800);
		addNewLab("Microbiology Laboratory",25000);
		addNewLab("Toxicology Laboratory",16900);
		addNewLab("Blood Bank",7000);
		
		addNewMedicine("Atropine", "Pfizer", "12/11/2024", 29400, 10000);
		addNewMedicine("Penicillin", "Pfizer", "01/02/2025", 79240, 60000);
		addNewMedicine("Amoxicillin", "Antimicrobe", "03/05/2025", 56700, 25000);
		addNewMedicine("Aspirin", "Actiza", "09/10/2024", 128, 300);
		addNewMedicine("Paracetamol", "Haleon", "11/11/2026", 37000, 50000);
		addNewMedicine("Insulin", "Eli Lilly", "08/09/2025", 278480, 8000);
		addNewMedicine("Morphine", "Pfizer", "12/11/2025", 11400, 3000);
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
	    BorderPane newStf = (BorderPane)FXMLLoader.load(HospitalManagement.class.getResource("/fxml/NewStaff.fxml"));
	    Scene newStaff = new Scene(newStf,1000,650);
	    display.setScene(newStaff);
	}
	
	public static void ShowStaffPage() throws Exception {
	    BorderPane showStf = (BorderPane)FXMLLoader.load(HospitalManagement.class.getResource("/fxml/ShowStaff.fxml"));
	    Scene showStaff = new Scene(showStf,1000,650);
	    display.setScene(showStaff);
	}
	
	public static void addNewStaff(String stfId,String stfName,String stfSex,String stfDesignation,int stfSalary,String specificInfo) throws Exception{
		if("Nurse".equals(stfDesignation)) {
			Nurse newNurse = new Nurse(stfId, stfName,stfSex,stfSalary,specificInfo);
			staffs.add(newNurse);
		}
		else if("Pharmacist".equals(stfDesignation)) {
			Pharmacist newPharmacist = new Pharmacist(stfId, stfName,stfSex,stfSalary,specificInfo);
			staffs.add(newPharmacist);
		}
	}
	
	public static ArrayList<Staff> getStaffs() {
	    return staffs;
	}
	
	public static boolean isStaffIdExists(String id) {
        for (Staff staff : staffs) {
            if (staff.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }
	
	public static int getStaffCount() {
	    return staffs.size();
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
	    BorderPane newFaci = (BorderPane)FXMLLoader.load(HospitalManagement.class.getResource("/fxml/NewFacility.fxml"));
	    Scene newFacility = new Scene(newFaci,1000,650);
	    display.setScene(newFacility);
	}
	
	public static void ShowFacilityPage() throws Exception {
	    BorderPane showFaci = (BorderPane)FXMLLoader.load(HospitalManagement.class.getResource("/fxml/ShowFacility.fxml"));
	    Scene showFacility = new Scene(showFaci,1000,650);
	    display.setScene(showFacility);
	}
	
	public static void addNewFacility(String facFacility) throws Exception{
		Facility newFacility = Facility.newFacility(facFacility);
		facilities.add(newFacility);
	}
	
	public static ArrayList<Facility> getFacilities() {
	    return facilities;
	}
	
	public static int getFacilityCount() {
	    return facilities.size();
	}
	
	
	//Lab Menu
	public static void newLabPage() throws Exception {
	    BorderPane newLb = (BorderPane)FXMLLoader.load(HospitalManagement.class.getResource("/fxml/NewLab.fxml"));
	    Scene newLab = new Scene(newLb,1000,650);
	    display.setScene(newLab);
	}
	
	public static void labListPage() throws Exception {
	    BorderPane labLst = (BorderPane)FXMLLoader.load(HospitalManagement.class.getResource("/fxml/LabList.fxml"));
	    Scene labList = new Scene(labLst,1000,650);
	    display.setScene(labList);
	}
	
	public static void addNewLab(String laLab,int labCost) throws Exception{
		Lab newLab = Lab.newLab(laLab,labCost);
		labs.add(newLab);
	}
	
	public static ArrayList<Lab> getLabs() {
	    return labs;
	}
	
	public static int getLabCount() {
	    return labs.size();
	}
	
	//Medicine Menu
	public static void newMedicinePage() throws Exception {
	    BorderPane newMdc = (BorderPane)FXMLLoader.load(HospitalManagement.class.getResource("/fxml/NewMedicine.fxml"));
	    Scene newMedicine = new Scene(newMdc,1000,650);
	    display.setScene(newMedicine);
	}
	
	public static void findMedicinePage() throws Exception {
		BorderPane findMdc = (BorderPane)FXMLLoader.load(HospitalManagement.class.getResource("/fxml/FindMedicine.fxml"));
	    Scene findMedicine = new Scene(findMdc,1000,650);
	    display.setScene(findMedicine);
	}
	
	public static void addNewMedicine(String medName, String medManufacturer, String medExpiryDate, int medCost, int medCount) throws Exception{
		Medicine newMedicine = Medicine.newMedicine(medName, medManufacturer, medExpiryDate, medCost, medCount);
		medicines.add(newMedicine);
	}
	
	public static ArrayList<Medicine> getMedicines() {
	    return medicines;
	}
	
	public static int getMedicineCount() {
	    return medicines.size();
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
	
	public static void exitMessage() {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Exit Application");
        alert.setHeaderText("Are you sure you want to exit the application?");
        alert.setContentText("Click OK to exit the app");

        alert.showAndWait().ifPresent(response -> {
            if (response == ButtonType.OK) {
                System.exit(0);
            }
        });
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
