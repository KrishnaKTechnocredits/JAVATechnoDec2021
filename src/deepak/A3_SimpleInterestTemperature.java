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
package deepak;

class A3_SimpleInterestTemperature{
	
	void simpleInterest(double p, double r, int t){
		double simpleInterest = (p*r*t)/100;
		System.out.println("Simple Interest is: "+simpleInterest);
	}
	
	void temperatureCoversion(double fahrenheit){
		double celsius = (fahrenheit - 32) * 5 / 9;
		System.out.println("Celsius value is: "+celsius);
	}
	
	public static void main(String[] args){
		A3_SimpleInterestTemperature simpleInterestTemp = new A3_SimpleInterestTemperature();
		simpleInterestTemp.simpleInterest(500000,6.5,12);
		simpleInterestTemp.temperatureCoversion(103.2);
	}
}