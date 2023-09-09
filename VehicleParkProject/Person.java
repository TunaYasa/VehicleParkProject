package project;

public class Person {
	private String name;
	private String driverLicenceNumber;
	
	public Person(String name,String driverLicenceNumber) {
		this.name=name;
		this.driverLicenceNumber=driverLicenceNumber;
	}
	public String getName() {
		return name;
	}
	public String getDriverLicenceNumber() {
		return driverLicenceNumber;
	}
}
