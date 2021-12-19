package pranoti;

public class CalculatorDemo {
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
		CalculatorDemo calculatorDemo =new CalculatorDemo ();
		calculatorDemo.add(100,10);
		calculatorDemo.sub(130,10);
		calculatorDemo.mul(210,10);
		calculatorDemo.div(110,10);
	}

}
