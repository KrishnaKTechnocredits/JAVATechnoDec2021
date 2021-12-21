package anvit;

class A1_calc{
	int num1 = 10;
	int num2 = 20;
	
	void addition(){
		int add = num1 + num2;
		System.out.println("Addition of two numbers is " + add);		
	}
	
	void substraction(){
		int sub = num1 - num2;
		System.out.println("Substraction of two numbers is " + sub);
	}
	
	void multiplication(){
		int multi = num1 * num2;
		System.out.println("Multiplication of two numbers is " + multi);
	}
	
	void division(){
		int div = num1 / num2;
		System.out.println("Division of two numbers is " + div);
	}
	public static void main(String[] args){
		A1_calc example = new A1_calc();
		example.addition();
		example.substraction();
		example.multiplication();
		example.division();
		}
}