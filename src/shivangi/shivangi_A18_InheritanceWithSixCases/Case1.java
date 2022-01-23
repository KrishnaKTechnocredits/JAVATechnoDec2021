package shivangi.shivangi_A18_InheritanceWithSixCases;

public class Case1 {
	
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		System.out.println(vehicle.name);
		
		/*System.out.println(vehicle.carColour); CE as carColour is not a member of
		  class Vehicle and during compilation the same is not accessible.*/

		/*vehicle.carDetails(7890); CE as carDetails() is not a member of class Vehicle
		  and during compilation the same is not accessible.*/
		
		vehicle.vehicleDetails(400);
		vehicle.display();

	}
	
}
