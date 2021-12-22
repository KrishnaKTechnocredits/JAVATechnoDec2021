package shamli;

public class Assignment3 
{
	void calculateSimpleInterest(int principle,int rate,int time)
	{
		int interest = (principle*rate*time)/100;
		System.out.println("Simple Interest is : "+ interest);
	}
	
	void convertTemp(int fahrenheit)
	{
		int tempCelcius= (fahrenheit - 32) * 5 / 9;
		System.out.println("Temprature in Celcius is : "+ tempCelcius);
	}

	public static void main(String[] args) 
	{
		Assignment3 assignment3 = new Assignment3();
		assignment3.calculateSimpleInterest(1000, 10, 5);
		assignment3.convertTemp(40);
	}

}
