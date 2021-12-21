package raksha;

class A4_Calculator
{
	
	void add(int num1,int num2)
	{
		int ans = num1 + num2 ;
		System.out.println("Addition of num1 & num2 is : " +ans);
	}
	
	void sub(int num1,int num2)
	{
		int ans = num1 - num2 ;
		System.out.println("Substraction of num1 & num2 is : " +ans);
	}
	
	void mul(int num1 ,int num2)
	{
		int ans = num1 * num2 ;
		System.out.println("Multiplication of num1 & num2 is : " +ans);
	}
	
	void div(int num1 ,int num2)
	{
		int ans = num1 / num2 ;
		System.out.println("Division of num1 & num2 is : " +ans);
	}
	
	public static void main(String[]args){
		A4_Calculator calculator = new A4_Calculator();
		calculator.add(100,100);
		calculator.sub(200,100);
		calculator.mul(10,10);
		calculator.div(100,10);
	}
}


