package shivangi;

class Calculator
{
	int num1 = 10;
	int num2 = 2;
	
	void add(){
		int add = num1+num2;
		System.out.println("Addition is" + add);
	}
	
	void substract(){
		int sub = num1-num2;
		System.out.println("Subtraction is" + sub);
	}
	
	void multiply(){
		int multi = num1*num2;
		System.out.println("Multiplication is" + multi);
	}
	
	void division(){
		int div = num1/num2;
		System.out.println("division is" + div);
	}
	
	public static void main(String a[]){
		Calculator c1 = new Calculator();
		c1.add();
		c1.substract();
		c1.multiply();
		c1.division();
	}
}	