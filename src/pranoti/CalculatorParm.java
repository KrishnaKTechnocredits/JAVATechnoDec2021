package pranoti;

class CalculatorParm{
	
	void add(int num1,int num2){
		int ans = num1 + num2 ;
		System.out.println("Addition of num1 & num2 is : " +ans);
	}
	
	void sub(int num1,int num2){
		int ans = num1 - num2 ;
		System.out.println("Substarction of num1 & num2 is : " +ans);
	}
	
	void mul(int num1 ,int num2){
		int ans = num1 * num2 ;
		System.out.println("Multiplication of num1 & num2 is : " +ans);
	}
	
	void div(int num1 ,int num2){
		int ans = num1 / num2 ;
		System.out.println("Division of num1 & num2 is : " +ans);
	}
	
	public static void main(String[]args){
		CalculatorParm calculatorParm =new CalculatorParm ();
		calculatorParm.add(100,10);
		calculatorParm.sub(130,10);
		calculatorParm.mul(210,10);
		calculatorParm.div(110,10);
	}
}

