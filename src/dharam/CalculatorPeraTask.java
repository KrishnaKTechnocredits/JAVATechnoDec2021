class CalculatorPeraTask{
	
	void add(int number1, int number2){
		int ans = number1 + number2;
		System.out.println(ans);
	}
	
	void sub(int number1, int number2){
		int ans = number1 - number2;
		System.out.println(ans);
	}
	
	void mul(int number1, int number2){
		int ans = number1 * number2;
		System.out.println(ans);
	}
	
	void div(int number1, int number2){
		int ans = number1 / number2;
		System.out.println(ans);
	}
	
	public static void main (String[] args){
		CalculatorPeraTask calculatorPeraTask = new CalculatorPeraTask();
		calculatorPeraTask.add(10,10);
		calculatorPeraTask.sub(10,10);
		calculatorPeraTask.mul(10,10);
		calculatorPeraTask.div(10,10);
	}
}