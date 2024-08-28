package application;

public abstract class Staff {
	private String id, name, designation, sex;
	private int salary;
	
    public Staff(String id, String name, String designation, String sex, int salary) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.sex = sex;
        this.salary = salary;
    }
	
    public abstract String[] showStaffInfo();
    
    public String getId() {
    	return id;
    }

	public String getName() {
		return name;
	}

	public String getDesignation() {
		return designation;
	}

	public String getSex() {
		return sex;
	}

	public int getSalary() {
		return salary;
	}

}
