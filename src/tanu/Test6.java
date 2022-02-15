package tanu;

import java.util.*;

/*1.  Write a method to return the first non repeating Capital character.
Input : tEChNoCrEdits
Output : N

2. Find maximum word length from a given statement.
input = "good morning technocredits hi hello";
output : technocredits

3. sum of all numbers in a given statement.
input = "10 10 20 30";
output : 70*/

//if (name.indexOf(i) != name.lastIndexOf(i)) {
class Test6 {
	char ch;

	void returnFirstNonRepeatingCapChar(String Name) {
		String temp = "";// E//CNCE
		for (int index = 0; index < Name.length(); index++) {
			ch = Name.charAt(index);
			if (Character.isUpperCase(ch)) {
				if (Name.indexOf(ch) == Name.lastIndexOf(ch)) {
					System.out.println(ch);
					break;
				}
			}

		}
	}

	void maxWordLength(String word) {
		String[] strname = word.split(" ");
		int maxwordlength = strname[0].length();
		String maxname = "";
		for (int index = 0; index < strname.length; index++) {/// "good morning technocredits hi hello

			if (maxwordlength < strname[index].length()) {
				maxwordlength = strname[index].length();
				maxname = strname[index];
			}
		}
		System.out.println(maxname + "--->>" + maxwordlength);
	}

	void sumOfNumber(String Arraynumber) {
		int sum=0;
		String[] Number = Arraynumber.split(" ");// "10 10 20 30";
		for (int index = 0; index < Number.length;index++) {
			
			sum = sum+ Integer.parseInt(Number[index]);
				
			}
		System.out.println(sum);
		}
	

	public static void main(String[] arg) {
		Test6 test = new Test6();
		test.returnFirstNonRepeatingCapChar("tEChNoCrEdits");
		test.maxWordLength("good morning technocredits hi hello");
		test.sumOfNumber("10 10 20 30");
	}
}