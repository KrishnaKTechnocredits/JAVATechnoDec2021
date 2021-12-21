package poojaJoshi;

class Calculator{
	int number1= 10;
	int number2=20;
	
	void add(){
		int ans= number1+number2;
		System.out.println("Addition is " +ans);
	}
	
	void sub(){
		int ans= number2-number1;
		System.out.println("Subtraction is " +ans);
	}
	
	void multi(){
		int ans= number1*number2;
		System.out.println("Multiplication is " +ans);
	}
	
	void div(){
		int ans= number2/number1;
		System.out.println("Division is " +ans);
	}
	
	public static void main (String[] args){
		Calculator calculator = new Calculator();
		calculator.add();
		calculator.sub();
		calculator.div();
		calculator.multi();
	}
}

		
		
		

	


