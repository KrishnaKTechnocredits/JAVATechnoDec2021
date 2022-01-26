/*   Program 4 : Find the difference between odd and even digits from given string. 
input : tec5hno3cre6di1ts
output : 3
Hint : (5+3+1)-(6) = 9-6		*/

package amruta.Assignment_23;

class DifferenceOddEven {

	int findDifference(String input) {

		int evennum = 0;
		int oddnum = 0;

		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);

			if (Character.isDigit(ch)) {

				int num = Character.getNumericValue(ch);

				if (num % 2 == 0)
					evennum += num;
				else
					oddnum += num;
			}
		}

		int difference = 0;

		if (evennum > oddnum)
			difference = evennum - oddnum;
		else
			difference = oddnum - evennum;

		return difference;
	}

	public static void main(String[] args) {

		String input = "tec5hno3cre6di1ts";

		int answer = new DifferenceOddEven().findDifference(input);

		System.out.println("\nDifference between Odd and Even number is : " + answer);
	}
}