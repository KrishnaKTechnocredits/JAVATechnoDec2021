package sagarAcharya;

class Calculator1{
		
	void add(int number1,int number2){
		int ans = number1+number2;
		System.out.println("Addition is "+ans);
	}
	
	void add1(){
		System.out.println("test ");
	}
	
	void sub(int number1,int number2){
		int ans = number1-number2;
		System.out.println("Subtraction is "+ans);
	}
	
	void mul(int number1,int number2){
		int ans = number1*number2;
		System.out.println("Multiplication is "+ans);
	}
	
	void div(int number1,int number2){
		int ans = number1/number2;
		System.out.println("Division is "+ans);
	}

	public static void main(String[] args){
		Calculator1 calc= new Calculator1();
		calc.add(5,5);
		calc.sub(5,5);
		calc.mul(5,5);
		calc.div(5,5);
		calc.add1();
	}
}