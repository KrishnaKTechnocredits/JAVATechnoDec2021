package yogeshNagar;

class A1_Calculator{
	
	int number1 = 10;
	int number2 = 2;
	
	void add(){
		int ans = number1 + number2;
		System.out.println("Addition is "+ans);
	}
	
	void subtraction(){
		int ans = number1 - number2;
		System.out.println("Subtraction is "+ans);
	}
	
	void multiplication(){
		int ans = number1 * number2;
		System.out.println("Multiplication is "+ans);
	}
	
	void division(){
		int ans = number1/number2;
		System.out.println("Division is "+ans);
	}
	
	public static void main(String[] args){
		A1_Calculator calculator = new A1_Calculator();
		calculator.add();
		calculator.multiplication();
		calculator.division();
		calculator.subtraction();
	}
}