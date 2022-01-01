package vaishnavi;

	import java.util.Scanner;

	public class A12_P3_ReverseString {

		int findChar(String name, char ch) {
			int count = 0;
			for (int index = 0; index < name.length(); index++) {
				if (name.charAt(index) == ch) {
					count++;
				}
			}
			return count;
		}

		void firstNonRepetedChar(String letter) {
			char chr = ' ';
			for (int index = 0; index < letter.length(); index++) {
				char ch = letter.charAt(index);
				int name = findChar(letter, ch);
				if (name == 1) {
					chr = ch;
					break;
				}
			}
			System.out.println(chr);
		}
		
		void firstRepetedChar(String letter) {
			char chr = ' ';
			for (int index = 0; index < letter.length(); index++) {
				char ch = letter.charAt(index);
				int name = findChar(letter, ch);
				if (name != 1) {
					chr = ch;
					break;
				}
			}
			System.out.println(chr);
		}

		public static void main(String[] a) {
			A12_P3_ReverseString a12_P3_ReverseString = new A12_P3_ReverseString();

			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the name : ");
			String name = scanner.next();
			System.out.println("First repeted character is :");
			a12_P3_ReverseString.firstRepetedChar(name);

			System.out.println("Enter the second name : ");
			String letter = scanner.next();
			System.out.println("First non repeted character is :");
			a12_P3_ReverseString.firstNonRepetedChar(letter);
			scanner.close();
		}
	}