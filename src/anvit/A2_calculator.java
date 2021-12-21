package anvit;

class A2_calculator{
	int num1 = 10;
	int num2 = 20;
	int total;
	
	void addition(){
		total = total + (num1 + num2);
		System.out.println("Addition of two numbers is " + total);		
	}
	
	void substraction(){
		total = total + (num1 - num2);
		System.out.println("Substraction of two numbers is " + total);
	}
	
	void multiplication(){
		total = total + (num1 * num2);
		System.out.println("Multiplication of two numbers is " + total);
	}
	
	void division(){
		total = total + (num1 / num2);
		System.out.println("Division of two numbers is " + total);
	}
	
	void last(){
		System.out.println("total is " + total);
	}
	public static void main(String[] args){
		A2_calculator example = new A2_calculator();
		example.addition();
		example.substraction();
		example.multiplication();
		example.division();
		example.last();
		}
}