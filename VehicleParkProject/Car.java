package hw2;

public class Car extends Vehicle implements Rentable{
	private int seatCount;
	
	public Car(String licensePlateNumber, String category, String transmission, String brand, String model,int year,int seatCount) {
		super(licensePlateNumber,category,transmission,brand,model,year);
		this.seatCount=seatCount;
	}
	public String getVehicleInformation() {
		return brand+", "+model+", "+String.valueOf(seatCount)+" seats";
	}
	public double getDailyPrice() {
		return 200;
	}
}
