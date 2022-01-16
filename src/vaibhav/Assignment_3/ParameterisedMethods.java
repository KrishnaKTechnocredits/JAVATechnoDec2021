/* Assignment - 3 : 15th Dec2021

Create two parameterized methods in the same class. 
Write a method to compute simple interest   
	Simple Interest = (P x T x R)/100 
	Where, 
		P is the principle amount 
		T is the time [year] and 
		R is the rate

 Write a method to convert temperature from Fahrenheit to Celsius degree.
	 Celsius = (fahrenheit - 32) * 5 / 9

Call both methods from the main method. write sop statements in each method to print output.
please use proper variable name instead of P, T , R
 
 */

package vaibhav.Assignment_3;

public class ParameterisedMethods{

	void simInterest (double P, double T , double R){
		double sInt = (P*T*R)/100;
		System.out.println("");
		System.out.println("Principle amount is : " + P);
		System.out.println("Time in year is : " + T);
		System.out.println("Rate is : " + R);
		System.out.println("Simple interest is : " + sInt);
		System.out.println("==========================");
	}
	
	
	void tempConversion(double fahrenheitTemp){
		System.out.println("");
		double celsiusTemp = (fahrenheitTemp - 32) * 5 / 9;
		System.out.println("Temperature converstion --> " + fahrenheitTemp + " fahrenheit = " + celsiusTemp + " degree Celsius");
	}

	public static void main (String [] args){
		ParameterisedMethods parameterisedMethods = new ParameterisedMethods();
		parameterisedMethods.simInterest(1020,2.5,10);
		parameterisedMethods.tempConversion(100);
	}
}