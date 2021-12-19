package ashish;

class A3_Assignment3{
	
	void computeSimpleInterest(int principalAmount, double timeInYears, double rateOfInterest){
		double simpleInterest = (principalAmount * timeInYears * rateOfInterest) / 100;
		System.out.println("Simple Interest is : " + simpleInterest);
	}
	
	void convertTemperatureToCelsius(double temperatureInFahrenheit){
		double temperatureInCelsius = (temperatureInFahrenheit - 32) * 5 / 9;
		System.out.println("Temperature in Celsius is : " + temperatureInCelsius);
	}
	
	public static void main(String[] args){
		A3_Assignment3 assignment3 = new A3_Assignment3();
		assignment3.computeSimpleInterest(50000, 5, 8);
		assignment3.convertTemperatureToCelsius(32);
	}
}