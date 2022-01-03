package megha.Assignment18_Inheritance;

public class Vehicle {

	String name = "TATA";
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
