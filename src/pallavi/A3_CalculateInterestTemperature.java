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
package pallavi;

class A3_CalculateInterestTemperature{
	
	void simpleIntertest(double principle, float time, float rate){
		double interest= (principle*time*rate)/100;
		System.out.println("Principle= "+ principle +", Rate= "+ rate +", Time= "+ time +" then Simple Interest= "+ interest);
	}
	
	void convertTemperature(float fahrenheit){
		double celsius= (fahrenheit - 32) * 5 / 9;
		System.out.println(fahrenheit + " Fahrenheit = " + celsius +" Celsius");		
	}
	
	public static void main(String[] arr){
		A3_CalculateInterestTemperature calculatrInterestTemperature=new A3_CalculateInterestTemperature();
		calculatrInterestTemperature.simpleIntertest(5000, 3, 5.25f);
		calculatrInterestTemperature.convertTemperature(97); 
	}
}

