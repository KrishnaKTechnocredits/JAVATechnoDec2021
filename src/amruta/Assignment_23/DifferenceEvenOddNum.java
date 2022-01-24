/*   Program 5 : Find the difference between even and odd numbers from given string. 
input : te112ch34no29
output : 117
hint : (112+34)-(29)	*/

package amruta.Assignment_23;

class DifferenceEvenOddNum {

	int findDifferenceOfOddEvenNum(String input) {

		int evennum = 0;
		int oddnum = 0;
		String temp = "";
		int num = 0;

		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);

			if (Character.isDigit(ch)) {
				temp += ch;
			} else if (Character.isLetter(ch)) {

				if (!temp.equals("")) {
					num = Integer.parseInt(temp);

					if (num % 2 == 0) {
						evennum += num;
						System.out.println("Even Num Sum - " + evennum);
						temp = "";
					} else {
						oddnum += num;
						System.out.println("Odd Num Sum - " + oddnum);
						temp = "";
					}
				}
			}
		}

		if (!temp.equals("")) {
			num = Integer.parseInt(temp);

			if (num % 2 == 0) {
				evennum += num;
				System.out.println("Even Num Sum - " + evennum);
				temp = "";
			} else {
				oddnum += num;
				System.out.println("Odd Num Sum - " + oddnum);
				temp = "";
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

		String input = "te112ch34no29";

		int answer = new DifferenceEvenOddNum().findDifferenceOfOddEvenNum(input);

		System.out.println("\nDifference between Odd and Even number is : " + answer);
	}

}