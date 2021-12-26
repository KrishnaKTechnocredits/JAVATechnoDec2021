package rahulGavali;


	public class A2_CalculatorWithParam{
		
		void add(int num1, int num2){
		int ans = num1 + num2;
		System.out.println("Addition is " + ans);
	}
		void sub(int num1, int num2){
		int ans = num1 - num2;
		System.out.println("Substraction is " + ans);
	}	
	
		void div(int num1, int num2){
		int ans = num1 / num2;
		System.out.println("Division is " + ans);
	}
		void multi(int num1, int num2){
		int ans = num1 + num2;
		System.out.println("Multiplication is " + ans);
	}
		public static void main(String[] arg){
		A2_CalculatorWithParam calculatorWithParam = new A2_CalculatorWithParam();
		calculatorWithParam.add(13,17);
		calculatorWithParam.sub(13,17);
		calculatorWithParam.div(13,17);
		calculatorWithParam.multi(13,17);
	}
}

