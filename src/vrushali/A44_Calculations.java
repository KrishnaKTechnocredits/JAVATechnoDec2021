package vrushali;

class A44_Calculations{

	void calSimpleInterest(double P, double T, double R ){
		double simpleInterest = (P * T * R)/100;
		System.out.println("Simple interest is: " + simpleInterest);
	}
	
	void calTemperature(double fahrenheit){
		double celsius = (fahrenheit - 32) * 5 / 9;
		System.out.println("Temperature in Celsius is: " + celsius);
	}
	
	public static void main(String[] args){
		A44_Calculations calculations = new A44_Calculations();
		calculations.calSimpleInterest(10, 5, 20);
		calculations.calTemperature(40);
	}
}