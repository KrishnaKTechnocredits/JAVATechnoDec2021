package rahulGavali;

/*Assignment 23
Program 4 : Find the difference between odd and even digits from given string.
input : tec5hno3cre6di1ts
output : 3
Hint : (5+3+1)-(6) = 9-6
*/

		public class A23_P4_DifferenceOddEvenDigits {
	
			void getDifferenceOddEvenNums(String input) {
				int sumOdd = 0;
				int sumEven = 0;
				String temp = "";
				for (int index = 0; index < input.length(); index++) {
					char ch = input.charAt(index);
					if (Character.isDigit(ch)) {
						temp += ch;
						int num = Integer.parseInt(temp.valueOf(ch));
						if (num % 2 != 0) {
							sumOdd += num;
						} else
							sumEven += num;
					}
				}
				System.out.println("Difference between the sum of odd numbers and sum of even numbers is: " + (sumOdd - sumEven));
			}
	
			public static void main(String[] args) {
				A23_P4_DifferenceOddEvenDigits diffOddEven = new A23_P4_DifferenceOddEvenDigits();
				String input = "tec5hno3cre6di1ts";
				diffOddEven.getDifferenceOddEvenNums(input);
	
			}
	
		}
