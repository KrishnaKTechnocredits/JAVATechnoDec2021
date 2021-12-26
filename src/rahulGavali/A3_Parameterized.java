/*Assignment - 3: 15th Dec2021
Create two parameterized methods in same class. 
Write a method to compute simple interest   
	Simple Interest = (P x T x R)/100 
	Where, 
		P is the principle amount 
		T is the time [year] and 
		R is the rate
 Write a method to convert temperature from Fahrenheit to Celsius degree. 
	 Celsius = (fahrenheit - 32) * 5 / 9
Call both methods from main method. write sop statement in each method to print output.*/

package rahulGavali;

public class A3_Parameterized {
	
	void simpleInterest(double principle, double time, double rate){
		double ans = (principle*time*rate)/100;
		System.out.println("Simple interest is : " + ans);
	}
	
	void temperature(double fahrenheit){
		double celcius = (fahrenheit - 32)*5/9;
		System.out.println("temperature in °C : " + celcius);
	}
	
	public static void main(String[] arg){
		A3_Parameterized parameterized = new A3_Parameterized();
		parameterized.simpleInterest(1500, 1987, 10.2);
		parameterized.temperature(98.2);
	}
	
	
	
}
	

