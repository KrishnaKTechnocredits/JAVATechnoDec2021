class Calculator{
	int num1=10;
	int num2=20;
	
	void add(){
		int answer = num1+num2;
		System.out.println("addition is "+answer);
	}
	
	void sub(){
		int answer = num2-num1;
		System.out.println("sub is "+answer);
	}
	
	void mul(){
		int answer = num1*num2;
		System.out.println("mul is "+answer);
	}
	
	void div(){
		int answer = num2/num1;
		System.out.println("div is "+answer);
	}
	
	public static void main(String[] a){
		Calculator calculator = new Calculator();
		calculator.add();
		calculator.sub();
		calculator.mul();
		calculator.div();
	}

}