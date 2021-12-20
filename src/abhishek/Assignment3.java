package abhishek;

class Assignment3 {
	void simpleInterest (double Principle, double Rate, double Time){
		double simpleInterest = (Principle*Rate*Time)/100;
		System.out.println("Simple interest is " + simpleInterest );
	}
	
	void temperatureConversion(double fahrenheit) {
		double celsius = (fahrenheit-32)*5/9;
		System.out.println("Temperature in celsius is " + celsius);
	}
	
	public static void main (String[] args) {
		Assignment3 assignment3 = new Assignment3();
		assignment3.simpleInterest(1200, 20.5, 8);
		assignment3.temperatureConversion(105);
	}
}

		