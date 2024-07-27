package application;

public class Patient {
	private String id, name, disease, sex, admitStatus;
	private int age;
	
    public Patient(String id,String name,String disease,String sex,String admitStatus,int age) {
		this.id = id;
		this.name  = name;
		this.disease = disease;
		this.sex = sex;
		this.admitStatus = admitStatus;
		this.age = age;
    }
	
    public static Patient newPatient(String id,String name,String disease,String sex,String admitStatus,int age) {
        return new Patient(id, name, disease, sex, admitStatus, age);
    }
	
    public String[] showPatientInfo() {
        return new String[]{id, name, disease, sex, admitStatus, String.valueOf(age)};
    }
    
    public String getID() {
    	return id;
    }

}
