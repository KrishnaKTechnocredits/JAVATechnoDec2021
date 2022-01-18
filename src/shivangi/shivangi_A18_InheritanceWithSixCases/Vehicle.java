package shivangi.shivangi_A18_InheritanceWithSixCases;

public class Vehicle {

		String name = "Fortuner";
		int speed = 0;

		void vehicleDetails(int vSpeed) {
			if (vSpeed > 0 && vSpeed < 1000)
				speed = vSpeed;
		}

		void display() {

			System.out.println("Vehicle Name is : " + name);
			System.out.println("Vehicle Speed is : " + speed);
		}
}
