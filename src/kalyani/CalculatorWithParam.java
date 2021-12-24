package kalyani;

class CalculatorWithParam {
	
	void add(int num1, int num2) {
	int ans = num1 + num2;
	System.out.println(ans);
	}
	
	void sub(int num1, int num2) {
	int ans = num1 - num2;
	System.out.println(ans);
	}
	
	void mul(int num1, int num2) {
	int ans = num1 * num2;
	System.out.println(ans);
	}
	
	void div(int num1, int num2) {
	int ans = num1 / num2;
	System.out.println(ans);
	}
	
	public static void main(String args[]){
		CalculatorWithParam calculatorWithParam = new CalculatorWithParam();
		calculatorWithParam.add(10,20);
		calculatorWithParam.sub(50,2);
		calculatorWithParam.mul(10,30);
		calculatorWithParam.div(10,5);
	}
}