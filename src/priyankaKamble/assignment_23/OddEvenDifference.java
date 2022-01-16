package priyankaKamble.assignment_23;

/*Program 4 : Find the difference between odd and even digits from given string.
input : tec5hno3cre6di1ts
output : 3
Hint : (5+3+1)-(6) = 9-6
*/
public class OddEvenDifference {
	int evenSum = 0, oddSum = 0;

	int findOddEvenDifference(String input) {
		for (int index = 0; index < input.length(); index++) {
			String ch = "" + input.charAt(index);
			if (Character.isDigit(input.charAt(index)) && input.charAt(index) % 2 == 0) {
				evenSum += Integer.parseInt(ch);
			} else if (Character.isDigit(input.charAt(index)) && input.charAt(index) % 2 != 0) {
				oddSum += Integer.parseInt(ch);
			}
		}
		return oddSum - evenSum;
	}

	public static void main(String[] args) {
		OddEvenDifference oddEvenDifference = new OddEvenDifference();
		String input1 = "tec5hno3cre6di1ts";
		System.out.println("Input1 String = " + input1);
		System.out.println("Difference b/w Odd & Even number = " + oddEvenDifference.findOddEvenDifference(input1));

	}
}
