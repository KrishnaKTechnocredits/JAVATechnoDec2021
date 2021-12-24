package krishna;

class A4_CalculatorWithParam{
	
	void add(int num1, int num2){
		int ans = num1 + num2;
		System.out.println("The Addition result is  " +ans);
	}
	
	void subs(int num1, int num2){
		int ans = num1 - num2;
		System.out.println("The Substraction result is  " +ans);
	}
	
	void Multiply(int num1, int num2){
		int ans = num1 * num2;
		System.out.println("The Multiplication result is  " +ans);
	}
	
	void Divide(int num1, int num2){
		int ans = num1 / num2;
		System.out.println("The Division result is  " +ans);
	}
	
	public static void main(String[] args){
		A4_CalculatorWithParam calculatorWithParam = new A4_CalculatorWithParam();
		calculatorWithParam.add(50, 10);
		calculatorWithParam.subs(30, 15);
		calculatorWithParam.Multiply(20, 10);
		calculatorWithParam.Divide(80, 5);
	}
}