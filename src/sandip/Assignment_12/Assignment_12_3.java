package sandip.Assignment_12;

import java.util.Scanner;

public class Assignment_12_3 {

	int count;
	char store;

	void frequencyOfCharacter(String input) {
		System.out.println();
		for (int index = 0; index <= input.length() - 1; index++) {
			count = 0;
			store = input.charAt(index);
			for (int index1 = 0; index1 <= input.length() - 1; index1++) {
				if (store == input.charAt(index1)) {
					count++;
				}
			}
			System.out.println(store + " ----- " + count);
		}
	}

	public static void main(String[] args) {
		Assignment_12_3 frequency01 = new Assignment_12_3();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter string for frequency : ");
		String s1 = scanner.next();
		frequency01.frequencyOfCharacter(s1);
		scanner.close();
	}
}
