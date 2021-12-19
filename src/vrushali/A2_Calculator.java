package vrushali;

class A2_Calculator{
	
	int number1= 10;
	int number2=2;
	
	void add(){
		int ans = number1+number2;
		System.out.println("Addition is "+ ans);
	}
	
	void sub(){
		int ans = number1-number2;
		System.out.println("Substraction is " + ans);
	}
	
	void multiplication(){
		int ans = number1*number2;
		System.out.println("multication is " + ans);
	}
	
	void division(){
		int ans = number1/number2;
		System.out.println("division is " + ans);
	}
	
	public static void main(String[] args){
		A2_Calculator calculator = new A2_Calculator();
		calculator.add();
		calculator.sub();
		calculator.multiplication();
		calculator.division();
	}
}