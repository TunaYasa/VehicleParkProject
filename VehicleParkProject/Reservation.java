package project;

public class Reservation {
	private String reservationNumber;
	private Person person;
	private Rentable rentedVehicle;
	private int dayCount;
	
	public Reservation(String reservationNumber, Person person, Rentable rentedVehicle, int dayCount) {
		this.reservationNumber = reservationNumber;
		this.person = person;
		this.rentedVehicle = rentedVehicle;
		this.dayCount = dayCount;
	}
	public int getDayCount() {
		return dayCount;
	}
	public Rentable getRentedVehicle() {
		return rentedVehicle;
	}
	public String getReservationNumber() {
		return reservationNumber;
	}
	public Person getPerson() {
		return person;
	}
}
