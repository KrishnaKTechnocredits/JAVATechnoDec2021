package shivangi;

class CalculatorAssignment
{
	void add(int num1, int num2){
		int ans = num1+num2;
		System.out.println(ans);
	}
	
	void substract(int num1, int num2){
		int ans = num1-num2;
		System.out.println(ans);
	}
	
	void multi(int num1, int num2){
		int ans = num1*num2;
		System.out.println(ans);
	}
	
	void div(int num1, int num2){
		int ans = num1/num2;
		System.out.println(ans);
	}
	
	public static void main(String[] args)
	{
		CalculatorAssignment calculatorAssignment1 = new CalculatorAssignment();
		calculatorAssignment1.add(8,5);
		calculatorAssignment1.substract(15,6);
		calculatorAssignment1.multi(5,5);
		calculatorAssignment1.div(15,3);
	}	
}

