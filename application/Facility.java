package application;

public class Facility {
	private String facility;
	
    public Facility(String facility) {
        this.facility = facility;
    }
	
    public static Facility newFacility(String facility) {
        return new Facility(facility);
    }
	
    public String[] showFacility() {
        return new String[]{facility};
    }
    
    public String getfacility() {
    	return facility;
    }

}
