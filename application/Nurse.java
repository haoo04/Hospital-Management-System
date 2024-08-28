package application;

public class Nurse extends Staff{
	private String department;
    
    public Nurse(String id, String name, String sex, int salary, String department) {
        super(id, name, "Nurse", sex, salary);
        this.department = department;
    }
    
    @Override
    public String[] showStaffInfo() {
        String[] baseInfo = {getId(), getName(), getDesignation(), getSex(), String.valueOf(getSalary())};
        String[] nurseInfo = new String[baseInfo.length + 1];
        System.arraycopy(baseInfo, 0, nurseInfo, 0, baseInfo.length);
        nurseInfo[nurseInfo.length - 1] = department;
        return nurseInfo;
    }
    
    public String getDepartment() {
        return department;
    }
}
