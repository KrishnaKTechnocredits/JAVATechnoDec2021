package nasir;
class A1_Calculator{
	
	void addition(int num1, int num2){
		int ans=num1+num2;
		System.out.println("Addition of num1 and num2 is "+ans);
	}
	
	void subtraction(int num1, int num2){
		int ans=num1-num2;
		System.out.println("Subtratcion of num1 and num2 is "+ans);
	}
	
	void multiplication(int num1, int num2){
		int ans=num1*num2;
		System.out.println("Multiplication of num1 and num2 is "+ans);
	}
	
	void division(int num1, int num2){
		int ans=num1/num2;
		System.out.println("Division of num1 and num2 is "+ans);
	}
	
	public static void main(String[]args){
		A1_Calculator calculator =new A1_Calculator();
		calculator.addition(100,200);
		calculator.subtraction(200,100);
		calculator.multiplication(5,5);
		calculator.division(100,25);
	}
}