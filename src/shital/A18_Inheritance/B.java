package shital.A18_Inheritance;

public class B extends A {
	
	int y=50;
	int z=10;
	
	void add() {
		int sum=y+z;
		System.out.println("Addition is :"+sum);
	}
	
	void multiply() {
		int multiplication=y*z;
		System.out.println("multiplication is :"+multiplication);
	}
}
