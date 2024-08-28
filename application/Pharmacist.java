package application;

public class Pharmacist extends Staff {
    private String licenseNumber;
    
    public Pharmacist(String id, String name, String sex, int salary, String licenseNumber) {
        super(id, name, "Pharmacist", sex, salary);
        this.licenseNumber = licenseNumber;
    }
    
    @Override
    public String[] showStaffInfo() {
        String[] baseInfo = {getId(), getName(), getDesignation(), getSex(), String.valueOf(getSalary())};
        String[] pharmacistInfo = new String[baseInfo.length + 1];
        System.arraycopy(baseInfo, 0, pharmacistInfo, 0, baseInfo.length);
        pharmacistInfo[pharmacistInfo.length - 1] = licenseNumber;
        return pharmacistInfo;
    }
    
    public String getLicenseNumber() {
        return licenseNumber;
    }
}
