/*Program 5 : Find the difference between even and odd numbers from given string.
input : te112ch34no29
output : 117
hint : (112+34)-(29)
 */
package sham;

public class A23_Program5 {

	static int diffInEvenAndOdd(String name) {
		int evenno = 0;
		int oddno = 0;
		String temp = "";
		int output = 0;

		for (int index = 0; index < name.length(); index++) {
			if (Character.isDigit(name.charAt(index))) {
				temp = temp + name.charAt(index);
			} else {
				if (temp.length() > 0) {
					int temp1 = Integer.parseInt(temp);
					if (temp1 % 2 == 0) {
						System.out.println("Even no is : " + temp1);
						evenno = evenno + temp1;
					} else {
						System.out.println("Odd no is :" + temp1);
						oddno = oddno + temp1;
					}
				}
				temp = "";
			}
		}
		if (temp.length() > 0) {
			int temp1 = Integer.parseInt(temp);
			if (temp1 % 2 == 0) {
				System.out.println("Even no is : " + temp1);
				evenno = evenno + temp1;
			} else {
				System.out.println("Odd no is :" + temp1);
				oddno = oddno + temp1;
			}
		}
		temp = "";
		output = evenno - oddno;
		return output;
	}

	public static void main(String[] args) {
		int output = diffInEvenAndOdd("te112ch34no29");
		System.out.println("The difference between odd and even digits is : " + output);

	}
}
