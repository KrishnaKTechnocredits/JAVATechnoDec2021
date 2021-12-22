/*Assignment - 3 : 15th Dec2021

Create two parameterized methods in same class. 

Write a method to compute simple interest   
	Simple Interest = (P x T x R)/100 
	Where, 
		P is the principle amount 
		T is the time [year] and 
		R is the rate

 Write a method to convert temperature from Fahrenheit to Celsius degree. 
	 Celsius = (fahrenheit - 32) * 5 / 9

Call both methods from main method. write sop statement in each method to print output.
*/

package priyankaZende;
class A3_CalculateInterestTemperatureDemo {
	
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
		A3_CalculateInterestTemperatureDemo calculateFormula = new A3_CalculateInterestTemperatureDemo();
		calculateFormula.simpleInterestCal(10000, 12.5, 11.75);
		calculateFormula.fahrenheitToCelsiusConvert(28.56);
	}
}	