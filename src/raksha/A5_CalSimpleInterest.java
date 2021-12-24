package raksha;

class A5_CalSimpleInterest
{
	
	void simpleInterest(double amount ,int time, float rate)
	{
		double interest = amount * time * rate / 100 ;
		System.out.println("Simple interest is :" + interest);	
	}
	
	void convertTemp(float fahrenheit)
	{
		double celsius = (fahrenheit - 32) * 5 / 9 ;
		System.out.println("Temperature from Fahrenheit to Celsius degree is :" + celsius);
	}
	
	public static void main (String[]args){
		A5_CalSimpleInterest calSimpleInterest = new A5_CalSimpleInterest();
		calSimpleInterest.simpleInterest(85000,5,7.2f);
		calSimpleInterest.convertTemp(50f);	
	}
} 
