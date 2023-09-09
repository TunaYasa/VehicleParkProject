package hw2;

public class Main {

	public static void main(String[] args) {
		CarPark carPark = new CarPark("Star Park", 5);
	Car car1 = new Car("34 EYY 62","Medium","Automatic","Honda","Civic",2020,5);
	Car car2 = new Car("34 H 6287","Small","Manuel","Honda","Jazz",2019,5);
	Car car3 = new Car("06 AB 87","Medium","Automatic","Toyota","Corolla",2021,5);
	Car car4 = new Car("16 CK 28","Large","Automatic","Peugeot","301",2022,5);
	Motorcycle motor1 = new Motorcycle("34 KK 71","Standard","Manual","Honda","CBF 150",2018,"Scooter");
	Motorcycle motor2 = new Motorcycle("34 ABC 51","Adventure","Manual","BMW"," R120GS ADV",2022,"Motorcycle");
	
	System.out.println("park status:"+carPark.parkVehicle(car1));
	System.out.println("park status:"+carPark.parkVehicle(car2));
	System.out.println("park status:"+carPark.parkVehicle(car3));
	System.out.println("park status:"+carPark.parkVehicle(motor1));
	System.out.println("park status:"+carPark.parkVehicle(motor2));
	System.out.println("park status:"+carPark.parkVehicle(car4));
	
	Person person1 = new Person("Esme Meral","123");
	Person person2 = new Person("Sema Demir","123");
	Person person3 = new Person("Ahmet Karaca","123");
	
	carPark.makeReservation(car1, person1, 5);
	carPark.makeReservation(car2, person2, 10);
	carPark.makeReservation(motor1, person3, 4);

	System.out.println("Total Amount="+carPark.computeTotalAmount());
	System.out.println("--------- RENTED VEHICLES ---------");
	carPark.printRentedVehicles();
	}

}
