package nishika;
		
	/*	Find the difference between odd and even digits from given string.
		input : tec5hno3cre6di1ts
		output : 3
		Hint : (5+3+1)-(6) = 9-6  */

	public class A_23_program4 {
		
		void diffBetOddEven(String name) {
			
			int avg = 0;
			int odd =0;
			int even =0;
			int num = 0;
			
			for(int i=0 ; i <name.length() ; i++) {
				char ch = name.charAt(i);
				
				if(Character.isDigit(ch)) {
					 num=Character.getNumericValue(ch);
					if(num % 2 == 0) {
						even=num;
					}else {
						odd=odd+num;
					}
				}
			}
			avg=odd-even;
			System.out.println("Avg is ---->"+  avg);
		}	
		public static void main(String[] args) {
			A_23_program4 program4 = new A_23_program4();
			program4. diffBetOddEven("tec5hno3cre6di1ts");
		}
	}