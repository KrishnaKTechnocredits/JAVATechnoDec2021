package monikaArkade;

class CalculaorWithParam{
	
	void add(int num1,int num2){
		int ans = num1 + num2;
		System.out.println("Addition :"+ans);
	}
	
	void sub(int num1,int num2){
		int ans = num1 - num2;
		System.out.println("Substraction "+ans);
	}
	
	void mul(int num1,int num2){
		int ans = num1 * num2;
		System.out.println("Multiplication :"+ans);
	}
	
	void div(int num1,int num2){
		int ans = num1 / num2;
		System.out.println("Division :"+ans);
	}
	
	public static void main(String[] args){
		CalculaorWithParam calculatorWithParam = new CalculaorWithParam();
		calculatorWithParam.add(10,2);
		calculatorWithParam.sub(30,5);
		calculatorWithParam.mul(10,10);
		calculatorWithParam.div(27,3);
	}
}