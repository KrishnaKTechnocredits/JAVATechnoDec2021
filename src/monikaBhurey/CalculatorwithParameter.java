package monikaBhurey;
class CalculatorwithParameter
{
		void add(int num1, int num2){
			int ans = num1+num2;
			System.out.println(ans);
		}
		
		void sub(int num1, int num2){
			int ans = num1-num2;
			System.out.println(ans);
		}
		
		void mul(int num1, int num2){
			int ans = num1*num2;
			System.out.println(ans);
		}
		
		void div(int num1, int num2){
			int ans = num1/num2;
			System.out.println(ans);
		}
			
		public static void main(String[] args){
			CalculatorwithParameter calculatorwithParameter = new CalculatorwithParameter();// object bannana.
			calculatorwithParameter.add(15,20);
			calculatorwithParameter.sub(85,10);
			calculatorwithParameter.mul(26,45);
			calculatorwithParameter.div(80,2);
		}	
}
