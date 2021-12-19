package omkar;

class Calculator{
	int number1=10;
	int number2=2;
	
	void add (){
		int ans = number1 + number2;
		System.out.println("Addition is " + ans);
	}
	
	void sub(){
		int ans = number1 - number2;
		System.out.println("Substraction is " + ans);	
	}
	
	void multi(){
		int ans = number1 * number2;
		System.out.println("Multiplication is " + ans);	
	}
	
	void div(){
		int ans = number1 / number2;
		System.out.println("Division is " + ans);	
	}
	
		public static void main(String[] arg){
		 Calculator calculator = new Calculator();
		 calculator.add();
		 calculator.sub();
		 calculator.multi();
		 calculator.div();
	}		 
}		 