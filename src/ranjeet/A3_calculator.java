package ranjeet;
class A3_calculator{
	int number1 = 10;
	int number2 = 2;
	
	void add(){
		int ans = number1 + number2;
		System.out.println("Addition is " + ans);
	}
	
	void substract(){
		int ans = number1 - number2;
		System.out.println("Substarction is " + ans);
	}
	
	void multiplication(){
		int ans = number1 * number2;
		System.out.println("Multipication is " + ans);
	}
	
	void division(){
		int ans = number1 / number2;
		System.out.println("Division is " + ans);
	}
	
	public static void main(String[] args){
		A3_calculator calculator = new A3_calculator();
		calculator.add();
		calculator.substract();
		calculator.multiplication();
		calculator.division();
		
		
	}
}