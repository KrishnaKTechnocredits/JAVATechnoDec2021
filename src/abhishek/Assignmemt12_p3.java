package abhishek;
import java.util.Scanner;
class Assignmemt12_p3 {
	int stringOccuurrence(String input, char ch) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == ch)
				count++;
		}
		return count;
	}

	void countOccurrence(String input, boolean firstSingle, boolean firstRepeat) {
		char ch=' ';
		for (int index = 0; index < input.length(); index++) {
			ch = input.charAt(index);
			int count = stringOccuurrence(input, ch);

			if(firstSingle == true && count == 1) {
				System.out.println("First Non repetitive character in given string: "+input +" is "+ch);
				System.out.println("##########################################################################################");
				firstSingle = false;
			}
			if(firstRepeat == true && count >1) {
				System.out.println("First repetitive character in given string: "+input +" is "+ch);
				System.out.println("##########################################################################################");
				firstRepeat =false;
			}
		}
		if(firstSingle == true)
			System.out.println("All the chars are having more than 1 instance");
		if(firstRepeat == true)
			System.out.println("None of the chars in given string has more than 1 instance");
	}

	void reverseString(String input) {
		char ch=' ';
		System.out.println("Reverse String is:   ");
		for (int index = input.length()-1; index >=0; index--) {
			ch = input.charAt(index);
			System.out.print(ch);
		}
	}

	public static void main(String[] a) {
		Assignmemt12_p3 assignmemt12_p3 = new Assignmemt12_p3();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		String input = sc.next();
		System.out.println("Value for Boolean flag firstSingle [true/false]: ");
		boolean fSingle = sc.nextBoolean();
		System.out.println("Value for Boolean flag firstRepeat [true/false]: ");
		boolean fRepeat = sc.nextBoolean();
		assignmemt12_p3.countOccurrence(input, fSingle, fRepeat);
		assignmemt12_p3.reverseString(input);
		sc.close();
	}
}