package yogeshNagar;

import java.util.Arrays;

public class A24_StringSplitPrograme {
	/*
	 * Input : Hi Hello Output : Total 2 words Hi --> 2 Hello --> 5
	 */
	void getWordCountString(String str) {
		String[] splitStr = str.split(" ");
		for (int index = 0; index < splitStr.length; index++)
			System.out.println(splitStr[index] + " word length is " + splitStr[index].length());
	}

	/*
	 * Input : aashvi technocredits Output : Vowel count aashvi --> 3 technocredits
	 * --> 4
	 */
	int getVowelCountWord(String str) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			if (str.charAt(index) == 'a' || str.charAt(index) == 'e' || str.charAt(index) == 'i'
					|| str.charAt(index) == 'o' || str.charAt(index) == 'u')
				count++;
		}
		return count;
	}

	void getVowelCountEachWordString(String str) {
		String[] splitStr = str.split(" ");
		for (int index = 0; index < splitStr.length; index++) {
			int count = getVowelCountWord(splitStr[index]);
			System.out.println("Vowel count in " + splitStr[index] + " are " + count);
		}
	}

	/*
	 * Input : "Te1c2h C94re3" Output : "12" "943"
	 */
	String getDigitsFromWord(String str) {
		String temp = "";
		for (int index = 0; index < str.length(); index++) {
			if (Character.isDigit(str.charAt(index)))
				temp += str.charAt(index);

			else if (!temp.endsWith(""))
				temp = "";
		}
		return temp;
	}

	void getDigitArrayString(String str) {
		String[] splitedStr = str.split(" ");
		String[] newString = new String[splitedStr.length];
		for (int index = 0; index < splitedStr.length; index++) {
			String wordDigits = getDigitsFromWord(splitedStr[index]);
			newString[index] = wordDigits;
		}
		System.out.println(Arrays.toString(newString));
	}

	/*
	 * Input : "Hi techno hello" Output : "iH onhcet olleh"
	 */

	String getReverseString(String str) {
		String reverseStr = "";
		for (int index = str.length() - 1; index >= 0; index--)
			reverseStr = reverseStr + str.charAt(index);
		return reverseStr;
	}

	void getReverseStringArray(String str) {
		String[] splitedStr = str.split(" ");
		String[] newString = new String[splitedStr.length];
		for (int index = 0; index < splitedStr.length; index++) {
			String reverseString = getReverseString(splitedStr[index]);
			newString[index] = reverseString;
		}
		System.out.println(Arrays.toString(newString));
	}

	/*
	 * Input : "anvit harsh dipali" Output : "Anvit Harsh Dipali"
	 */
	void convertFistCharUpperCaseWord(String str) {
		String[] splitedStr = str.split(" ");
		String[] changedArr = new String[splitedStr.length];
		for (int index = 0; index < splitedStr.length; index++) {
			char capsChar = Character.toUpperCase(splitedStr[index].charAt(0));
			changedArr[index] = capsChar + splitedStr[index].substring(1);
		}
		System.out.println(Arrays.toString(changedArr));
	}

	/*
	 * Input : "Vrushali Sagar Shital" Output : "IlahsurV Ragas LatihS"
	 */
	void reverseCapsFirstCharString(String str) {
		String[] splitedStr = str.split(" ");
		String[] changedStr = new String[splitedStr.length];
		for (int index = 0; index < splitedStr.length; index++) {
			String reverseStr = getReverseString(splitedStr[index]);
			char capsChar = Character.toUpperCase(reverseStr.charAt(0));
			changedStr[index] = capsChar + reverseStr.substring(1);
		}
		System.out.println(Arrays.toString(changedStr));
	}

	/*
	 * Input : "TeCHnoCReditS*" Output : "tEchNOcrEDITs"
	 */
	void reverseCaseEachCharString(String str) {
		String convertedStr = "";
		for (int index = 0; index < str.length(); index++) {
			if (Character.isUpperCase(str.charAt(index)))
				convertedStr = convertedStr + Character.toLowerCase(str.charAt(index));
			else
				convertedStr = convertedStr + Character.toUpperCase(str.charAt(index));
		}
		System.out.println(convertedStr);
	}

	public static void main(String[] args) {
		A24_StringSplitPrograme strArray = new A24_StringSplitPrograme();

		System.out.println("---Programe 1---");
		strArray.getWordCountString("Hi Hello");
		System.out.println("\n");
		
		System.out.println("---Programe 2---");
		strArray.getVowelCountEachWordString("aashvi technocredits");
		System.out.println("\n");
		
		System.out.println("---Programe 3---");
		strArray.getDigitArrayString("Te1c2h C94re3");
		System.out.println("\n");
		
		System.out.println("---Programe 4---");
		strArray.getReverseStringArray("Hi techno hello");
		System.out.println("\n");
		
		System.out.println("---Programe 5---");
		strArray.convertFistCharUpperCaseWord("anvit harsh dipali");
		System.out.println("\n");
		
		System.out.println("---Programe 6---");
		strArray.reverseCapsFirstCharString("Vrushali Sagar Shital");
		System.out.println("\n");
		
		System.out.println("---Programe 7---");
		strArray.reverseCaseEachCharString("TeCHnoCReditS");
	}

}
