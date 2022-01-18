package saurav;

public class A24_ArrayOfWordContainDigit {
	
	String filterDigit(String str) {
		String temp = " ";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch))
				temp += ch;
		}
		// System.out.print(temp);
		return temp;
	}

	void arrayOfDigit(String word) {
		String[] wordArray = word.split(" ");
		for (int index = 0; index < wordArray.length; index++) {
			String[] output = new String[wordArray.length];
			output[index] = filterDigit(wordArray[index]);
			System.out.print(output[index]);
		}
	}
	
	public static void main(String[] a) {
		A24_ArrayOfWordContainDigit program3 = new A24_ArrayOfWordContainDigit();
		String input = "aas2h34vi s56sau8r9av90o";
		program3.arrayOfDigit(input);
	}

}
