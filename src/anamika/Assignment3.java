package anamika;

public class Assignment3 {
	void simpleInterest(double principalAmnt , double t, double r) {
		double simpInt = (principalAmnt * t * r)/100;
		System.out.println("simple interest is:"+simpInt);
		
	}
	
	void fahrenheitToCelsious(double fahrenheit) {
		double celsious = (fahrenheit - 32) * 5/9;
		System.out.println("celsious degree temperature is :"+ celsious);
	}
	
	public static void main(String args[]) {
		Assignment3 assignment3 = new Assignment3();
		assignment3.simpleInterest(100 , 12.5 , 11.75);
		assignment3.fahrenheitToCelsious(28.56);
		
	}

}
