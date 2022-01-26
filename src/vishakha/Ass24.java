package vishakha;

import java.util.Arrays;

public class Ass24 {
	void findTotalWordsInStringWithLength(String str) {
		String[] arr = str.split(" ");
		System.out.println("Total Words in the given String are : " + arr.length);
		for (int index = 0; index < arr.length; index++) {
			int wordLength = arr[index].length();
			System.out.println("Length of word " + arr[index] + " --> " + wordLength);
		}
	}

	void findTotalVowelsInEachWordsInString(String str) {
		String[] arr = str.split(" ");
		for (int index = 0; index < arr.length; index++) {
			int wordLength = arr[index].length();
			String word = arr[index];
			int wordVowel = 0;
			for (int innerIndex = 0; innerIndex < wordLength; innerIndex++) {
				char ch = word.charAt(innerIndex);
				if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O'
						|| ch == 'u' || ch == 'U')
					wordVowel++;
			}
			System.out.println("Vowels in the word " + word + " --> " + wordVowel);
		}
	}

	String[] arrayOFWordsContainingDigits(String str) {
		String[] arr = str.split(" ");
		for (int index = 0; index < arr.length; index++) {
			int wordLength = arr[index].length();
			String word = arr[index];
			String temp = "";
			for (int innerIndex = 0; innerIndex < wordLength; innerIndex++) {
				char ch = word.charAt(innerIndex);
				if (Character.isDigit(ch))
					temp += ch;
			}
			arr[index] = temp;
		}
		return arr;
	}

	String[] reverseOFWordsInSamePosition(String str) {
		String[] arr = str.split(" ");
		for (int index = 0; index < arr.length; index++) {
			int wordLength = arr[index].length();
			String word = arr[index];
			String temp = "";
			for (int innerIndex = wordLength - 1; innerIndex >= 0; innerIndex--) {
				char ch = word.charAt(innerIndex);
				temp += ch;
			}
			arr[index] = temp;
		}
		return arr;
	}

	String[] convertFirstLetterOFWordsToUpperCase(String str) {
		String[] arr = str.split(" ");
		for (int index = 0; index < arr.length; index++) {
			int wordLength = arr[index].length();
			String word = arr[index];
			String temp = "";
			temp += Character.toUpperCase(word.charAt(0));
			for (int innerIndex = 1; innerIndex < wordLength; innerIndex++) {
				temp += word.charAt(innerIndex);
			}
			arr[index] = temp;
		}
		return arr;
	}

	String[] convertFirstLetterOFReversedWordsToUpperCase(String str) {
		String[] arr = str.split(" ");
		for (int index = 0; index < arr.length; index++) {
			int wordLength = arr[index].length();
			String word = arr[index];
			String temp = "";
			temp += Character.toUpperCase(word.charAt(wordLength - 1));
			for (int innerIndex = wordLength - 2; innerIndex >= 0; innerIndex--) {
				temp += word.charAt(innerIndex);
			}
			arr[index] = temp;
		}
		return arr;
	}

	void swapCasesOfWords(String str) {
		String temp = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isLetter(ch)) {
				if (Character.isUpperCase(ch))
					temp += Character.toLowerCase(ch);
				else
					temp += Character.toUpperCase(ch);
			}
		}
		System.out.println("The New String with Swapped Cases : " + temp);
	}

	public static void main(String[] args) {
		Ass24 ass = new Ass24();
		System.out.println("Output of Program 1: ");
		ass.findTotalWordsInStringWithLength("Hi Hello");
		System.out.println();
		System.out.println("Output of Program 2: ");
		ass.findTotalVowelsInEachWordsInString("Aashvi Technocredits");
		System.out.println();
		System.out.println("Output of Program 3: ");
		String[] arr = ass.arrayOFWordsContainingDigits("ATe1c2h C94re3");
		System.out.println(Arrays.toString(arr));
		System.out.println();
		System.out.println("Output of Program 4: ");
		String[] revArr = ass.reverseOFWordsInSamePosition("Hi Techno Hello");
		System.out.println(Arrays.toString(revArr));
		System.out.println();
		System.out.println("Output of Program 5: ");
		String[] convertFirstLetterofWordsArr = ass.convertFirstLetterOFWordsToUpperCase("anvit harsh dipali");
		System.out.println(Arrays.toString(convertFirstLetterofWordsArr));
		System.out.println();
		System.out.println("Output of Program 6: ");
		String[] convertFirstLetterofRevWordsArr = ass
				.convertFirstLetterOFReversedWordsToUpperCase("Vrushali Sagar Shital");
		System.out.println(Arrays.toString(convertFirstLetterofRevWordsArr));
		System.out.println();
		System.out.println("Output of Program 7: ");
		ass.swapCasesOfWords("TeCHnoCReditS");
	}

}