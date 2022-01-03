package yogiraj;

public class Assignment3 
{
	public void calculateSimpleInterest(double principle , double interest , int year)
	{
		double si = principle * interest * year /100;
		
		System.out.println("Simple interest in "+si);
	}
	
	public void fahrenheitToCelcius(double fahrenheit)
	{
		double 	 Celsius = (fahrenheit - 32) * 5 / 9;
		
		System.out.println("Temperature in celcius is " + Celsius);
	}
		public static void main(String[] args) 
		{
			Assignment3 a = new Assignment3();
			
			a.calculateSimpleInterest(10000, 7.5, 1);
			
			a.fahrenheitToCelcius(50);
		}

}
