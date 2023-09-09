package project;

public abstract class Vehicle {
	protected String licensePlateNumber;
	protected String category;
	protected String transmission;
	protected String brand;
	protected String model;
	protected int year;
	
	public Vehicle(String licensePlateNumber, String category, String transmission, String brand, String model,int year) {
		this.licensePlateNumber = licensePlateNumber;
		this.category = category;
		this.transmission = transmission;
		this.brand = brand;
		this.model = model;
		this.year = year;
	}
	
	public Vehicle() {
		
	}
	public abstract String getVehicleInformation();
	
	public String getLicensePlateNumber() {
		return licensePlateNumber;
	}
	public String getCategory() {
		return category;
	}
	public String getTransmission() {
		return transmission;
	}
	public String getModel() {
		return model;
	}
	public int getYear() {
		return year;
	}
	
	public String getBrand() {
		return brand;
	}
	
}
