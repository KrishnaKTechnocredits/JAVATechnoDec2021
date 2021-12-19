package ranjeet;
class CalculatorWithParam{
	
	void add(int num1, int num2){
		int ans = num1 + num2;
		System.out.println("Addition of "+num1+" + "+num2+" is = "+ans);	
	}
	
	void minus(int num1, int num2){
		int ans = num1 - num2;
		System.out.println("Substraction of "+num1+" - "+num2+" is = "+ans);
	}
	
	void multiply(int num1, int num2){
		int ans = num1 * num2;
		System.out.println("Multiplication of "+num1+" * "+num2+ " is = "+ans);
	}
	
	void devide(int num1, int num2){
		int ans = num1 / num2;
		System.out.println("Division of "+num1+" / "+num2+" is = "+ans);
	}
	
	public static void main(String[] args){
		CalculatorWithParam calculatorWithParam = new CalculatorWithParam();
		calculatorWithParam.add(20, 30);
		calculatorWithParam.minus(50, 10);
		calculatorWithParam.multiply(100, 15);
		calculatorWithParam.devide(100,25);
	}

}