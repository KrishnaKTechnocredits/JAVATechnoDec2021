package jagdish;

import java.util.Scanner;

public class FrequencyofChar {

	int getCountofChar(String name, char ch) {
		int count = 0;
		for (int index = 0; index < name.length(); index++) {
			if (ch == name.charAt(index))
				count++;
		}
		return count;
	}

	void printFirstNonRepeatingChar(String input) {
		for (int index = 0; index < input.length(); index++) {
			int cnt = getCountofChar(input, input.charAt(index));
			if (cnt == 1) {
				input.charAt(index);
				break;
			}
		}

	}

	public static void main(String[] args) { // 1

		FrequencyofChar frequencyofchar = new FrequencyofChar();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input string");
		String input = sc.next();
		System.out.println("Enter the Char ");
		char ch = sc.next().charAt(0);
		int temp = frequencyofchar.getCountofChar(input, ch);
		System.out.println("The Count of the Char for name " + input + " is = " + temp);

	}

}
