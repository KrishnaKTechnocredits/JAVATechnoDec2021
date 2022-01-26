/* Program 6 : Return a string by placing all odd numbers , first capital letters from given string, even numbers.
input : eTe1CH9cred4it6s
output : 19T46    */

package amruta.Assignment_23;

class SortString {

	String returnStringInGivenOrder(String str) {

		String oddnum = "";
		String evennum = "";
		String uppercase = "";
		String temp = "";
		int count = 0;

		for (int index = 0; index < str.length(); index++) {

			char ch = str.charAt(index);

			if (Character.isDigit(ch)) {
				temp = temp + ch;
				int num = Integer.parseInt(temp);

				if (num % 2 == 0)
					evennum += ch;
				else
					oddnum += ch;
			} else if (Character.isUpperCase(ch)) {

				if (count == 0) {
					uppercase += ch;
					count++;
				}
			}
		}

		return oddnum + uppercase + evennum;
	}

	public static void main(String[] args) {

		String input = "eTe1CH9cred4it6s";

		String output = new SortString().returnStringInGivenOrder(input);

		System.out.println("\nString after sorting in given order : " + output);
	}
}