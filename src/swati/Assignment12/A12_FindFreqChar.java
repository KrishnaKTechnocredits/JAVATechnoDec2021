package swati.Assignment12;

import java.util.Scanner;

public class A12_FindFreqChar {

	void findRep(String name) {

		for (int i = 0; i < name.length(); i++) {
			int count = 0;

			// System.out.println("----" + ch);
			for (int j = 0; j < name.length(); j++) {

				if (name.charAt(i) == name.charAt(j)) {
					count++;

				}

			}
			if (count >= 2) {
				System.out.println("Repeated character " + name.charAt(i) + " is " + count);

			}

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter name ");
		String name = scan.next();
		A12_FindFreqChar fc = new A12_FindFreqChar();
		fc.findRep(name);

	}

}
