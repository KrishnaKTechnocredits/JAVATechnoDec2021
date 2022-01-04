/*Assignment - 3 : 15th Dec2021
 * Create two parameterized methods in the same class. 
Write a method to compute simple interest   
	Simple Interest = (P x T x R)/100 
	Where, 
		P is the principle amount 
		T is the time [year] and 
		R is the rate

 Write a method to convert temperature from Fahrenheit to Celsius degree.
	 Celsius = (fahrenheit - 32) * 5 / 9
 */
package shwetaDharmadhikari;
class Assign3_Calculator{
	
	void addition(int num1, int num2){
		int sum = num1+num2;
		System.out.println("\nSum of two number is: "+sum);
	}
	
	void subtraction(int num1, int num2){
		int subtraction = num1-num2;
		System.out.println("Subtraction of two number is: "+subtraction);
	}
	
	void multiplication(int num1, int num2){
		int multiplication = num1*num2;
		System.out.println("Multiplication of two number is: "+multiplication);
	}
	
	void division(int num1, int num2){
		int division = num1/num2;
		System.out.println("Division of two number is: "+division);
	}
	
	public static void main(String args[])
	{
		Assign3_Calculator calculator = new Assign3_Calculator();
		calculator.addition(70,10);
		calculator.subtraction(50,10);
		calculator.multiplication(20,20);
		calculator.division(27,3);
	}
}
