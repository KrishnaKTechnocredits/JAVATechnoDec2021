package gauravk.Assignment03;
/*
 * Assignment - 3 : 15th Dec2021

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
public class SimpleInterest {
	
	void simpleInterest(int p, int r, int t) throws NegativeValueException{
		double si = p*r*t/100;
		if(si<0)
			throw new NegativeValueException ("values cannot be negative.");
		else
			System.out.println("Simple Interest is: "+si);
	}
	
	public static void main(String[] args) throws NegativeValueException{
		SimpleInterest s = new SimpleInterest();
		s.simpleInterest(1000, 15, 3);
		s.simpleInterest(5000, -1, 3);
	}
}
