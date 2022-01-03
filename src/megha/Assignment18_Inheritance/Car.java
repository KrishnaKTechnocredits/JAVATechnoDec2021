package megha.Assignment18_Inheritance;

public class Car extends Vehicle {

	String carColour = "Blue";
	int carRegNo = 0;

	void carDetails(int cRegno) {
		carRegNo = cRegno;
	}

	void display() {
		System.out.println("Speed of Car is : " + speed);
		System.out.println("Colour of Car is : " + carColour);
		System.out.println("Reg. No. of Car is : " + carRegNo);
	}

}
