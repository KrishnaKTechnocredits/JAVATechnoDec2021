package priyankaZende;
class A3_Calculator{
	int number1 =10;
	int number2 =2;
	
	void add(){
		int ans = number1 + number2;
		System.out.println("Addition is :"+ans);
	}
		
	void sub(){
		int sub = number1 - number2;
		System.out.println("Substraction is :"+sub);
	}
		
	void multiplication(){
		int mult = number1 * number2;
		System.out.println("Multiplication is :"+mult);
	}
		
	void division(){
		int div = number1  / number2;
		System.out.println("Division is :"+div);
	}
		
	public static void main(String[] args){
		A3_Calculator calculator = new A3_Calculator();
		calculator.add();
		calculator.sub();
		calculator.multiplication();
		calculator.division();
	}
}
