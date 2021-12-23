/*Assignment - 3 : 15th Dec2021

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

package amruta.Assignment1to6;

public class Assign3 {
	
	void simple_interest(int Principle, int Time, double Rate){
		double si = (Principle*Time*Rate)/100;
		System.out.println("Simple Interest is : "+si);
	}
	
	void convert(float fahrenheit){
		float celsius = (fahrenheit - 32) * 5 / 9;
		System.out.println("Temprature in Celsius is : "+celsius);
	}
	public static void main(String[] a){
		Assign3 assign3 = new Assign3();
		assign3.simple_interest(5000,5,3.81);
		
		Assign3 assign3_1 = new Assign3();
		assign3_1.convert(80);
	}

}
