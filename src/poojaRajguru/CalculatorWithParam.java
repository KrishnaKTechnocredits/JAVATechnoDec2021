package poojaRajguru;

class CalculatorWithParam{
	
	void add(int num1 , int num2){
		int ans = num1 + num2;
		System.out.println("Addition is " + ans);
	}
	
	void sub(int num1 , int num2){
		int ans = num1 - num2;
		System.out.println("Subtraction is " + ans);
	}
	
	void mul(int num1 , int num2){
		int ans = num1 * num2;
		System.out.println("Multiplicaton is " + ans);
	}
	
	void div(int num1 , int num2){
		int ans = num1 / num2;
		System.out.println("Division is " + ans);
	}
	
	public static void main(String[] args){
		
		CalculatorWithParam calculator = new CalculatorWithParam();
		calculator.add(10,20);
		calculator.sub(20,10);
		calculator.mul(20,30);
		calculator.div(10,5);
	}	
}