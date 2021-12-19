class Calculator1{
	
	int number1 = 10;
	int number2 = 20;
	
	void add(){
		int ans = (number1+number2);
		System.out.println("add number is " + ans);
	}
	
	void sub(){
		int ans = (number1-number2);
		System.out.println("sub number is " + ans);
	}
	
	void mul(){
		int ans = (number1*number2);
		System.out.println("mul number is " + ans);
	}
	
	void div(){
		int ans = (number1/number2);
		System.out.println("div number is " + ans);
	}
	
	public static void main (String [] args){
		Calculator1 calculator = new Calculator1();
		calculator.add();
		calculator.sub();
		calculator.mul();
		calculator.div();
	}
}