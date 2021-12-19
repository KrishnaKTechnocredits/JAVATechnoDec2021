package ashish;

class A4_CalculatorWithParams{
	
	void add(int num1, int num2){
		int ans = num1 + num2;
		System.out.println("Addition is : " + ans);
	}
	
	void subtract(int num1, int num2){
		int ans = num1 - num2;
		System.out.println("Subtraction is : " + ans);
	}
	
	void multiply(int num1, int num2){
		int ans = num1 * num2;
		System.out.println("Multiplication is : " + ans);
	}
	
	void divide(int num1, int num2){
		int ans = num1 / num2;
		System.out.println("Division is : " + ans);
	}
	
	public static void main(String[] args){
		A4_CalculatorWithParams calculator = new A4_CalculatorWithParams();
		calculator.add(5,10);
		calculator.subtract(20,10);
		calculator.multiply(10,20);
		calculator.divide(20,10);
	}	
}