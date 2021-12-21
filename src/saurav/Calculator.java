package saurav;

class Calculator{

    int number1 = 10;  
	int number2 = 2;
	
	void add (){
		int ans = number1 + number2 ;
		System.out.println("Addition is "+ans);
	}
	
	void sub (){
		int ans1 = number1 - number2 ;
		System.out.println("Subtraction is "+ans1);
	}
	
	void mul (){
		int ans2 = number1* number2 ;
		System.out.println("Multiplication is "+ans2);
	}
	
	void Div (){
		int ans3 = number1 / number2 ;
		System.out.println("Division is "+ans3);
	}
	
	public static void main (String[] a){
		Calculator calculator = new Calculator();
		calculator.add();
		calculator.sub();
		calculator.mul();
		calculator.Div();
		
	}
	
	
}