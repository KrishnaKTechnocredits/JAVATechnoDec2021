package sagarShrikhande;
class A1_Calculator{

	void add(int num1, int num2){
		int ans = num1 + num2;
		System.out.println("addition of " +num1+ " & "+ num2+ " is: "+ans);
	}
	
	void sub(int num1, int num2){
		int ans = num1 - num2;
		System.out.println("substraction of " +num1+ " & "+ num2+ " is: "+ans);
	}
	
	void mul(int num1, int num2){
		int ans = num1 * num2;
		System.out.println("multiplication of " +num1+ " & "+ num2+ " is: "+ans);
	}
	
	void div(int num1, int num2){
		float ans = (float)num1 / num2;
		System.out.println("division of " +num1+ " & "+ num2+ " is: "+ans);
	}
	
	public static void main(String[] args){
		A1_Calculator calculator = new A1_Calculator();
		calculator.add(10,2);
		calculator.sub(70,28);
		calculator.mul(25,3);
		calculator.div(70,16);
	}
}