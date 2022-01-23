/*Assignment23:
	Program 6 : Return a string by placing all odd numbers , first capital letters from given string, even numbers.
	input : eTe1CH9cred4it6s	
	output : 19T46
*/

package deepak;

public class A23_P6_StringAdjustment2 {

	void stringAdjustment(String input) {
		String oddNums = "";
		String evenNums = "";
		String firstCap = "";
		for (int index = 0; index < input.length(); index++) {
			String temp = "";
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				temp += ch;
				int num = Integer.parseInt(temp);
				if (num % 2 != 0) {
					oddNums += temp;
					temp = "";
				} else
					evenNums += temp;
				temp = "";
			}
		}
		for (int index1 = 0; index1 < input.length(); index1++) {
			String temp = "";
			char ch = input.charAt(index1);
			if (Character.isLetter(ch) && Character.isUpperCase(ch)) {
				temp += ch;
				firstCap = temp;
				break;
			}
		}
		System.out.println(oddNums + firstCap + evenNums);
	}

	public static void main(String[] args) {
		A23_P6_StringAdjustment2 stringadjustment = new A23_P6_StringAdjustment2();
		String input = "eTe1CH9cred4it6s";
		System.out.print("Arranged String of '" + input + "' string is: ");
		stringadjustment.stringAdjustment(input);
	}

}
