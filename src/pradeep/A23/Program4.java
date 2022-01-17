//Program 4 : Find the difference between odd and even digits from given string.
package pradeep.A23;

public class Program4 {

	int getDiffOddEvenDigit(String input) {
		int evenDigit = 0;
		int oddDigit = 0;

		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				int num = Character.getNumericValue(ch);
				if (num % 2 == 0) {
					evenDigit += num;
				} else {
					oddDigit += num;
				}
			}
		}
		int diff = oddDigit - evenDigit;
		return diff;
	}

	public static void main(String[] args) {
		Program4 program4 = new Program4();
		String input = "tec5hno3cre6di1ts";
		int diff = program4.getDiffOddEvenDigit(input);
		System.out.println("Difference between odd and even digit is : "+diff);
	}

}
