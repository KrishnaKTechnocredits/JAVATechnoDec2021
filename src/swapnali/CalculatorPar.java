package swapnali;

class CalculatorPar{
	
	void add(int num1, int num2){
		int total=num1+num2;
		System.out.println("Addition of two numbers is: "+total);
	}
	
	void sub(int num1,int num2){
		int total=num1-num2;
		System.out.println("Substraction of two numbers is: "+total);
	}
	
	void mul(int num1,int num2){
		int total=num1*num2;
		System.out.println("Multiplication of two numbers is: "+total);
	}
	
	void div(int num1,int num2){
		int total=num1/num2;
		System.out.println("Division of two numbers is: "+total);
	}
	
	public static void main(String[] args){
		
		CalculatorPar cal= new CalculatorPar();
		cal.add(10,20);
		cal.sub(30,10);
		cal.mul(5,8);
		cal.div(30,10);
	}

}