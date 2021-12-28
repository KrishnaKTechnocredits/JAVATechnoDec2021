package priya;

class Calculator{
	int num1=10;
	int num2=2;
	
	void add(){
		int sum = num1+num2;
		System.out.println("Addition of two num is " +sum);
	}
	
	void sub(){
		int sub = num1-num2;
		System.out.println("Substarction of two num is " +sub);
	}
	
	void mult(){
		int mult = num1*num2;
		System.out.println("Multiplication of two num is " +mult);
	}
	
	void div(){
		int div = num1/num2;
		System.out.println("Division of two num is " +div);
	}
	
	public static void main (String[] args){
		Calculator calc = new Calculator();
		calc.add();
		calc.sub();
		calc.mult();
		calc.div();
	}
	
}