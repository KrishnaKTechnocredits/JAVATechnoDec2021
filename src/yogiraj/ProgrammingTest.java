package yogiraj;

import java.util.*;

import vaibhav.Assignment_15.MaxLengthString;

public class ProgrammingTest {
	public char firstNonRepeatingCapitalChar() {
		String input = "tEChNoCrEdits";

		int i = 0;

		while (i < input.length()) {
			if (input.indexOf(input.charAt(i)) == input.lastIndexOf(input.charAt(i))
					&& Character.isUpperCase(input.charAt(i))) {
				break;
			}
			i++;
		}
		return input.charAt(i);
	}

	public String findMaximumLengthWord() {
		String input = "good morning technocredits hi hello";

		String[] str = new String[10];

		String maxlenghtWorrd = "";

		HashMap map = new HashMap();

		int max = 0, temp = 0;

		str = input.split(" ");

		for (int i = 0; i < str.length; i++) {
			map.put(str[i].length(), str[i]);

			temp = str[i].length();

			if (temp > max) {
				max = temp;

				maxlenghtWorrd = map.get(max).toString();
			}
		}
		return maxlenghtWorrd;
	}

	public int sumOfAllNumber() {
		ArrayList<Integer> al = new ArrayList<Integer>();

		int sum = 0, temp = 0;

		al.add(10);
		al.add(10);
		al.add(20);
		al.add(30);

		for (int i = 0; i < al.size(); i++) {
			temp = (int) al.get(i);

			sum = sum + temp;
		}
		return sum;
	}

	public static void main(String[] args) {
		ProgrammingTest pt = new ProgrammingTest();

		char ch = pt.firstNonRepeatingCapitalChar();

		System.out.println("First non repeating capital character is : " + ch + "\n");

		String s = pt.findMaximumLengthWord();

		System.out.println("Word with maximum lenght is :  " + s + "\n");

		int sum = pt.sumOfAllNumber();

		System.out.println("Sum of all numbers is :  " + sum);
	}

}
