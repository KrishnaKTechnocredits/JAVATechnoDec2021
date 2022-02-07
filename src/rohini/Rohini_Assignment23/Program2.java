package rohini.Rohini_Assignment23;

/*Program 2 : Find sum of numbers from given string.
input : te12ch22nocre3dits4
output : 12 + 22 + 3 + 4 = 41*/

public class Program2 {

	int getSumOfNumsInString(String input) {
		int sum = 0;
		String temp = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch))
				temp = temp + ch;
			if ((Character.isLetter(ch) && !temp.isEmpty()) || index == input.length() - 1) {
				sum = sum + Integer.parseInt(temp);
				temp = "";
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Program2 prg2 = new Program2();
		String s = "te12ch22nocre3dits4";
		System.out.println("Sum of all Numbers in String is: " + prg2.getSumOfNumsInString(s));
	}

}
