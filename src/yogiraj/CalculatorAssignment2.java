package yogiraj;

public class CalculatorAssignment2 
{
	//int num1 , num2;
	
	public void add(int num1, int num2)
	{
		int addition = num1+num2;
		
		System.out.println("The addition is  " + addition );
	}
	
	public void subtract(int num1, int num2)
	{
		int subtraction = num1-num2;
		
		System.out.println("The Subtraction is  "+ subtraction);
	}
	
	public void multiplicatio(int num1, int num2)
	{
		int multiplication = num1*num2;
				
		System.out.println("The multiplication is  "+multiplication);
	}
	
	public void division(int num1, int num2)
	{
		int division = num1/num2;
		
		System.out.println("The Division is  "+num1/num2);
	}
	
	
		public static void main(String[] args)
		{
			CalculatorAssignment2 c  = new CalculatorAssignment2();
			
			c.add(10, 20);
			
			c.subtract(20, 10);
			
			c.multiplicatio(10, 20);
			
			c.division(20, 10);
		}

}
