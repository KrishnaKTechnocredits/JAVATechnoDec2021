package vivek;

class A2_Calculator{
	
	void add(int num1,int num2){
		int addition = num1 + num2;
		System.out.println(addition);
	}
	
	void substract(int num1,int num2){
		int substraction = num1 - num2;
		System.out.println(substraction);
	}
	
	void multiply(int num1,int num2){
		int multiplication = num1 * num2;
		System.out.println(multiplication);
	}
	
	void divide(int num1,int num2){
		int division = num1 / num2;
		System.out.println(division);
	}
	
	public static void main(String[] args){
		A2_Calculator calculator = new A2_Calculator();
		calculator.add(10,20);
		calculator.substract(20,10);
		calculator.multiply(20,10);
		calculator.divide(20,10);
	}
}