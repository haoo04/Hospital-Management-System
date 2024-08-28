package application;

public class Medicine {
	private String name,manufacturer,expiryDate;
	private int cost,count;
	
    public Medicine(String name, String manufacturer, String expiryDate, int cost, int count) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.expiryDate = expiryDate;
        this.cost = cost;
        this.count = count;
    }
	
    public static Medicine newMedicine(String name, String manufacturer, String expiryDate, int cost, int count) {
        return new Medicine(name,manufacturer,expiryDate,cost,count);
    }
	
    public String[] findMedicine() {
        return new String[]{name,manufacturer,expiryDate,String.valueOf(cost), String.valueOf(count)};
    }
    
    public String getName() {
    	return name;
    }

}
