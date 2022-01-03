package megha.Assignment18_Inheritance;

public class Case2 {

	public static void main(String[] args) {

		Car car = new Car();
		System.out.println(car.name);
		System.out.println(car.carColour);

		car.carDetails(7890);
		car.vehicleDetails(500);
		car.display();

	}

}
