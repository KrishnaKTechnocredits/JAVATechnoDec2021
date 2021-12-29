package shamli;

public class CalculatorWithParameter
{
	void add(int num1, int num2)
	{
		int ans= num1 + num2;
		System.out.println("Addition is : " + ans);
	}

	void sub(int num1, int num2)
	{
		int ans = num1 - num2;
		System.out.println("Substraction is : " + ans);
	}
	
	void mul(int num1, int num2)
	{
		int ans = num1 * num2;
		System.out.println("Multiplication is : " + ans);
	}
	
	void div(int num1, int num2)
	{
		int ans = num1/num2;
		System.out.println("Division is : " + ans);
	}
	
	
	public static void main(String[] args)
	{
		CalculatorWithParameter calculatorwithpm = new CalculatorWithParameter();
		calculatorwithpm.add(10,20);
		calculatorwithpm.sub(100,55);
		calculatorwithpm.mul(30,60);
		calculatorwithpm.div(600,2);
	}
}