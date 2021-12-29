package dharam;

class Calculator{

	int number1 = 10;
	int number2 = 2;

		void add(){
			int ans = number1 + number2;
			System.out.println("Add number is " + ans);
		}

		void sub(){
			int ans = number1 - number2;
			System.out.println("sub number is " + ans);
		}

		void mul(){
			int ans = number1 * number2;
			System.out.println("mul number is " + ans);
		}

		void div(){
			int ans = number1 / number2;
			System.out.println("div number is " + ans);
		}

		public static void main (String[] agr){
			Calculator Calculator = new Calculator();
			Calculator.add();
			Calculator.sub();
			Calculator.mul();
			Calculator.div();
		}
}






















