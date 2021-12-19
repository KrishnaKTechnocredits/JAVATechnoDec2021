package sagarShrikhande;
class Assignment3{

	void simpleInterest(int p, int t, int r){
		System.out.println("Simple interest is: "+ (double)p*t*r/100);
	}
	
	void tempConversion(int fahrenheit){
		System.out.println("Temp in Celcius is; "+(float)(fahrenheit - 32) * 5 / 9);
	}
	
	public static void main(String[] a){
		Assignment3 assignment3 = new Assignment3();
		assignment3.simpleInterest(6737, 7, 13);
		assignment3.tempConversion(130);
	}
}













/* Create two parameterized methods in same class. 

Write a method to compute simple interest   
	Simple Interest = (P x T x R)/100 
	Where, 
		P is the principle amount 
		T is the time [year] and 
		R is the rate

 Write a method to convert temperature from Fahrenheit to Celsius degree. 
	 Celsius = (fahrenheit - 32) * 5 / 9

Call both methods from main method. write sop statement in each method to print output. */
