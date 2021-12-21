package sham;
class A2_CalculatorWithPara
{
	void add(int num1 ,int num2)
	{
		int ans=num1+num2;
		System.out.println("number1 is: "+num1  +" ,number2 is: "+num2);
		System.out.println("Addition of  number " +ans);
	}
	
	void sub(int num1 ,int num2)
	{
		int ans=num1-num2;
		System.out.println("number1 is: "+num1  +" ,number2 is: "+num2);
		System.out.println("Substraction of  number " +ans);
	}
	
	void mul(int num1 ,int num2)
	{
		int ans=num1*num2;
		System.out.println("number1 is: "+num1  +" ,number2 is: "+num2);
		System.out.println("Multiplication  of  number " +ans);
	}
	void div(int num1 ,int num2)
	{
		int ans=num1/num2;
		System.out.println("number1 is: "+num1  +" ,number2 is: "+num2);
		System.out.println("Division of  number " +ans);
	}

public static void main(String[] args)
{
	int num1, num2;
	A2_CalculatorWithPara cwp= new A2_CalculatorWithPara();
	cwp.add(12,8);
	cwp.sub(13,5);
	cwp.mul(5,4);
	cwp.div(12,4);
	
}
}
