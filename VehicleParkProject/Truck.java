package project;

public class Truck extends Vehicle {
	private double mass;
	
	public Truck(String licensePlateNumber, String category, String transmission, String brand, String model,int year,double mass) {
		super(licensePlateNumber,category,transmission,brand,model,year);
		this.mass=mass;
	}
	public String getVehicleInformation() {
		String str = null;
		return str;
	}
	public double getMass() {
		return mass;
	}
}
