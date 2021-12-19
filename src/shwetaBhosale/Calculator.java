package shwetaBhosale;

class Calculator{
	int number1 = 10;
	int number2 = 2;
	
	void add(){
		int ans = number1+number2;
		System.out.println("Addition is " +ans);
	}
	void sub(){
		int ans = number1-number2;
		System.out.println("Substraction is " +ans);
	}		
	void mul(){
		int ans = number1*number2;
		System.out.println("Mul is " +ans);
	}
	void div(){
		int ans = number1/number2;
		System.out.println("Div is " +ans);
	}
	public static void main(String[] a){
		Calculator cal=new Calculator();
		cal.add();
		cal.sub();
		cal.mul();
		cal.div();
	}
}