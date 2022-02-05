package rohini.Rohini_Assignment23;

/*Program 4 : Find the difference between odd and even digits from given string.
input : tec5hno3cre6di1ts
output : 3
Hint : (5+3+1)-(6) = 9-6
 */
public class Program4 {

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
		Program4 prg4 = new Program4();
		String str = "tec5hno3cre6di1ts";
		System.out.println("Input string : " + str);
		System.out.println("Difference b/w Odd & Even number = " + prg4.findOddEvenDifference(str));

	}
}
