package application;

public class Doctor {
	private String id, name, specialist, workTime, qualification;
	private int room;
	
    public Doctor(String id, String name, String specialist, String workTime, String qualification, int room) {
        this.id = id;
        this.name = name;
        this.specialist = specialist;
        this.workTime = workTime;
        this.qualification = qualification;
        this.room = room;
    }
	
    public static Doctor newDoctor(String id, String name, String specialist, String workTime, String qualification, int room) {
        return new Doctor(id, name, specialist, workTime, qualification, room);
    }
	
    public String[] showDoctorInfo() {
        return new String[]{id, name, specialist, workTime, qualification, String.valueOf(room)};
    }
    
    public String getID() {
    	return id;
    }

}
