class CalculatorWithParam {
	
	void add (int num1, int num2) {
		int ans = num1+num2;
		System.out.println(ans);
	}
	
	public static void main (String[] args) {
		CalculatorWithParam calculatorWithParam = new CalculatorWithParam();
		calculatorWithParam.add(10,20);
		calculatorWithParam.add(50,2);
		calculatorWithParam.add(60,10);
		calculatorWithParam.add(75,12);
	}
}