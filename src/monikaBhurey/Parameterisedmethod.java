package monikaBhurey;
class Parameterisedmethod
{
	void simpleInterest(int p, int t, double r)
	{
		double ans  = (p * t * r)/100;
		System.out.println("SimpleInterest is "+ ans );
	}
	
	void convertTemperature(double fahrenheit)
	{
		double Celsius = (fahrenheit-32)*5/9;
		System.out.println("Temperature in Celsis is "+ Celsius);
	}
	
	public static void main(String[] args)
	{
		Parameterisedmethod parameterisedmethod =  new Parameterisedmethod();
		parameterisedmethod.simpleInterest(100,15,1.5);
		parameterisedmethod.convertTemperature(50);
	}
}	