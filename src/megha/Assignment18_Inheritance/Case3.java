package megha.Assignment18_Inheritance;

public class Case3 {

	public static void main(String[] args) {
		Vehicle vehicle = new Car();
		System.out.println(vehicle.name);
		// System.out.println(vehicle.carColour); CE as vehicle is taking guarantee from
		// Class Vehicle during compilation, therefore carColour from Class Car is not
		// visible to vehicle during compilation.

		// vehicle.carDetails(7890); CE as vehicle is taking guarantee from Class
		// Vehicle during compilation, therefore carDetails() from Class Car is not
		// visible to vehicle during compilation.
		vehicle.vehicleDetails(500);
		vehicle.display();

	}

}
