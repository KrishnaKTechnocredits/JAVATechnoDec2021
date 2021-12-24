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
package shwetaBhosale;

class Interest{
	void simpleInterest(double principle, double time, double rate){
		double simpleInterest = (principle * time * rate)/100;
		System.out.println("SimpleInterest is: " + simpleInterest);
	}
	
	void conTemp(double fahrenheit){
		double celsius = (fahrenheit - 32) * 5 / 9;
		System.out.println("Fahrenheit to Celsius degree: " + celsius);
	}
	
	public static void main(String[] a){
		Interest interest = new Interest();
		interest.simpleInterest(174,30,481);
		interest.conTemp(56);
	}
}