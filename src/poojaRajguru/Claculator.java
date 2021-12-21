package poojaRajguru;

class Calculator{
	
	int num1 = 10;
	int num2 = 2;
	int total = 0;
	
	void add(){
	    total = total + num1 + num2;
		System.out.println("Addition is = " +total);
	}
	
	void sub(){
		total = total + num1 - num2;
		System.out.println("Addition is = " +total);
	}
	
	void mul(){
		total = total + num1 * num2;
		System.out.println("Addition is = " +total);
	}
	
	void div(){
		total = total + num1 / num2;
		System.out.println("Addition is = " +total);
	}
	
	void result(){
		System.out.println("Result is = " +total);
	}
	public static void main(String[] args){
		Calculator c1 = new Calculator();
		c1.add();
		c1.sub();
		c1.mul();
		c1.div();
		c1.result();
	}
}