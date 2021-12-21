package anamika;

public class Assignment2 {
	void addition(int num1 , int num2) {
		int sum = num1+num2;
		System.out.println("sum of two numbers is:"+sum);
	}
	
	void subtraction(int num1 , int num2) {
		int subtraction = num1-num2;
		System.out.println("subtraction of two numbers is:"+subtraction);
	}
	
	void multiplication(int num1 , int num2) {
		int multiplication = num1*num2;
		System.out.println("multiply of two numbers is:"+multiplication);
	}
	
	void division(int num1 , int num2) {
		int division = num1/num2;
		System.out.println("division of two numbers is:"+division);
	}
	
	public static void main(String[] args)
	{
		Assignment2 assignment2 = new Assignment2();
		assignment2.addition(15,20);
		assignment2.subtraction(50,20);
		assignment2.multiplication(10,70);
		assignment2.division(16,2);
	}
			
}
