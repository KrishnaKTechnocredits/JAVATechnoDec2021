package priyankaZende;
class A01_CalculateFormula {
	
	// Write a method to compute simple interest   
	void simpleInterestCal(double principalAmt, double time, double rate){
		double simpleInt = (principalAmt * time * rate) / 100;
		System.out.println("Simple Interest is: " + simpleInt);
	}
	
	// Write a method to convert temperature from Fahrenheit to Celsius degree
	void fahrenheitToCelsiusConvert(double fahrenheit){
		double celsius = (fahrenheit - 32) * 5 / 9;
		System.out.println("Celsius degree temperature is: " + celsius );
	}
	
	public static void main(String[] args){
		A01_CalculateFormula calculateFormula = new A01_CalculateFormula();
		calculateFormula.simpleInterestCal(10000, 12.5, 11.75);
		calculateFormula.fahrenheitToCelsiusConvert(28.56);
	}
}	