package dharam;
class A4_jkl{
	
	void add(int a, int b){
		System.out.println("Add is :" + (a+b));
	}
	
	void sub(int a, int b){
		System.out.println("Sub is :" + (a-b));
	}
	
	void mul(int a, int b){
		System.out.println("Mul is :" + (a*b));
	}
	
	void div(int a, int b){
		System.out.println("Div is :" + (a/b));
	}
	
	public static void main (String [] args){
		A4_jkl calculatorExample1 = new A4_jkl();
		calculatorExample1.add(10,10);
		calculatorExample1.sub(10,10);
		calculatorExample1.mul(10,10);
		calculatorExample1.div(10,10);
	}
}