package nehaPandey;

public class Assignment_24 {
	// PROGRAM :1

	void findTotalWordsInGivenStringWithItsLength(String str) {
		String[] arr = str.split(" ");
		for (int index = 0; index < arr.length; index++) {
			System.out.println(arr[index] + " -> " + arr[index].length());

		}
		System.out.println();

	}

	// PROGRAM : 2

	void findTotalVowelsInEachWordsFromGivenString(String word) {
		int count = 0;
		for (int index = 0; index < word.length(); index++) {
			if (word.charAt(index) == 'a' || word.charAt(index) == 'e' || word.charAt(index) == 'i'
					|| word.charAt(index) == 'o' || word.charAt(index) == 'u') {
				count++;

			}

		}
		System.out.println(word + " -> " + count);

	}

	void findVowels(String str) {
		String[] word = str.split(" ");
		for (int index = 0; index < word.length; index++) {
			findTotalVowelsInEachWordsFromGivenString(word[index]);

		}

	}

	// PROGRAM : 3

	String getDigitsFromWords(String str) {
		String temp = " ";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				temp = temp + ch;

			}

		}
		return temp;

	}

	void getArrayOfDigitsFromWords(String input) {
		String[] arr = input.split(" ");
		for (int index = 0; index < arr.length; index++) {
			String[] output = new String[arr.length];
			output[index] = getDigitsFromWords(arr[index]);
			System.out.print(output[index]);

		}
		System.out.println();

	}

	// PROGRAM : 4

	String reverseWord(String input) {
		String reverseStr = " ";
		for (int index = input.length() - 1; index >= 0; index--) {
			char ch = input.charAt(index);
			reverseStr = reverseStr + ch;
		}
		return reverseStr;

	}

	void reverseEachWordOnSameIndex(String str) {
		String temp = " ";
		String[] arr = str.split(" ");
		for (int index = 0; index < arr.length; index++) {
			temp = temp + " " + reverseWord(arr[index]);

		}
		System.out.println(temp.trim());
	}

	// PROGRAM : 5

	void getFirstCharacterOfWordWithCapitalLetter(String input) {
		String[] arr = input.split(" ");
		String temp = " ";
		for (int index = 0; index < arr.length; index++) {
			String word = arr[index];
			char ch = arr[index].charAt(0);
			ch = Character.toUpperCase(ch);
			word = ch + word.substring(1);
			temp += word + " ";

		}
		System.out.print(temp.trim());
		System.out.println();

	}

	// PROGRAM : 6

	String reverseEachWord(String input) {
		String revStr = "";
		for (int index = input.length() - 1; index >= 0; index--) {
			char ch = input.charAt(index);
			if (index == input.length() - 1)
				ch = Character.toUpperCase(ch);
			revStr = revStr + ch;
		}
		return revStr;
	}

	void convertFirstLetterOfEachWordIntoCapital(String input) {
		String[] arr = input.split(" ");
		String temp = "";
		for (int index = 0; index < arr.length; index++) {
			temp = temp + " " + reverseEachWord(arr[index]);
		}
		System.out.println(temp.trim());

	}

	// PROGRAM : 7

	void reverseCase(String input) {
		String temp = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isLetter(ch)) {
				if (Character.isUpperCase(ch))
					temp = temp + Character.toLowerCase(ch);
				else
					temp = temp + Character.toUpperCase(ch);
			}
		}
		System.out.println(temp);
	}

	public static void main(String[] args) {
		Assignment_24 a24 = new Assignment_24();
		System.out.println("Program1:");
		System.out.println();
		a24.findTotalWordsInGivenStringWithItsLength("Hi Hello");
		System.out.println("Program2:");
		System.out.println();
		a24.findVowels("aashvi technocredits");
		System.out.println();
		System.out.println("Program3:");
		System.out.println();
		a24.getArrayOfDigitsFromWords("Te1c2h C94re3");
		System.out.println();
		System.out.println("Program4:");
		System.out.println();
		a24.reverseEachWordOnSameIndex("Hi techno hello");
		System.out.println();
		System.out.println("Program5:");
		System.out.println();
		a24.getFirstCharacterOfWordWithCapitalLetter("anvit harsh dipali");
		System.out.println();
		System.out.println("Program6:");
		System.out.println();
		a24.convertFirstLetterOfEachWordIntoCapital("Vrushali Sagar Shital");
		System.out.println();
		System.out.println("Program7:");
		System.out.println();
		a24.reverseCase("TeCHnoC");

	}

}
