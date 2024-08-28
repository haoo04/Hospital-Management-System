package application;

public class Lab {
	private String lab;
	private int cost;
	
    public Lab(String lab, int cost) {
        this.lab = lab;
        this.cost = cost;
    }
	
    public static Lab newLab(String lab, int cost) {
        return new Lab(lab,cost);
    }
	
    public String[] labList() {
        return new String[]{lab, String.valueOf(cost)};
    }
    
    public String getLab() {
    	return lab;
    }

}
