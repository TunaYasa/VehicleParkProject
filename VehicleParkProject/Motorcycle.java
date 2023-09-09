package project;

public class Motorcycle extends Vehicle implements Rentable {
	private String type;
	
	public Motorcycle(String licensePlateNumber, String category, String transmission, String brand, String model,int year,String type) {
		super(licensePlateNumber,category,transmission,brand,model,year);
		this.type=type;
	}
	public String getVehicleInformation() {
		return brand+", "+model+", "+type;
	}
	public double getDailyPrice() {
		return 100;
	}
}
