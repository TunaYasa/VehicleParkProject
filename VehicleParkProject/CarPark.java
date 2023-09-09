package project;

import java.util.ArrayList;

public class CarPark {
	private String name;
	private int capacity;
	private ArrayList<Vehicle> parkedVehicles = new ArrayList<Vehicle>();
	private ArrayList<Reservation> reservations = new ArrayList<Reservation>();
	
	
	public CarPark(String name,int capacity) {
		this.name=name;
		this.capacity=capacity;
	}

	public boolean parkVehicle(Vehicle vehicle) {
		boolean add = false;
		if(parkedVehicles.size()<capacity) {
			parkedVehicles.add(vehicle);
			add = true;
		}
		return add;
	}
	public void makeReservation(Rentable rentable,Person person,int dayCount) {
		int random = (int)(Math.random()*100000000);
		String reservationNumber = Integer.toString(random);
		Reservation reservation = new Reservation(reservationNumber,person,rentable,dayCount);
		reservations.add(reservation);
	}
	public double computeTotalAmount() {
		double totalAmount = 0;
		for(int i = 0;i<reservations.size();i++) {
			totalAmount = totalAmount + reservations.get(i).getRentedVehicle().getDailyPrice()*reservations.get(i).getDayCount();
		}
		return totalAmount;
	}
	public void printRentedVehicles() {
		for(int i=0;i<reservations.size();i++) {
			System.out.println("Res:[" + reservations.get(i).getReservationNumber()+", "+ reservations.get(i).getDayCount()+" days], "+"Driver: ["+reservations.get(i).getPerson().getName()+"], "+"Vehicle:["+((Vehicle)reservations.get(i).getRentedVehicle()).getVehicleInformation()+"]");
		}
	}
	public String getName() {
		return name;
	}
	
}
