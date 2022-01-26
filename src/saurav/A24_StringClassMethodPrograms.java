package saurav;

public class A24_StringClassMethodPrograms {
	int cnt = 0;

	void totalWordsAndLetterCount(String input) {
		String[] inputArray = input.split(" ");
		for (int index = 0; index < inputArray.length; index++) {
			System.out.println("chars in word  " + inputArray[index] + " : " + inputArray[index].length());
		}
		System.out.println("Total number of words : " + inputArray.length);
	}

	void findVowels(String input) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == 'o' || input.charAt(index) == 'a' || input.charAt(index) == 'e'
					|| input.charAt(index) == 'i' || input.charAt(index) == 'u') {
				count++;
				cnt++;
			}
		}
		System.out.println("count of vowels in given string : " + input + " : " + count);
	}

	void findVowelsCount(String word) {
		String[] wordArray = word.split(" ");
		for (int index = 0; index < wordArray.length; index++) {
			findVowels(wordArray[index]);
		}
		System.out.println("total vowels count : " + cnt);
	}

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

	void arrayOfWordContainDigit(String word) {
		String[] wordArray = word.split(" ");
		for (int index = 0; index < wordArray.length; index++) {
			String[] output = new String[wordArray.length];
			output[index] = filterDigit(wordArray[index]);
			System.out.print(output[index]);
		}
	}

	String reverse(String word) {
		String output = " ";
		for (int index = word.length() - 1; index >= 0; index--) {
			output += word.charAt(index);
		}
		return output;
	}

	String reverseString(String input) {
		String temp = " ";
		String[] word = input.split(" ");
		for (int index = 0; index < word.length; index++) {
			temp += " " + reverse(word[index]);
		}
		System.out.println("Reverse String : " + temp.trim());
		return temp;
	}

	String firstLetterUppercase(String input) {
		String finalWord = " ";
		String[] arr = input.split(" ");
		for (int index = 0; index < arr.length; index++) {
			String word = arr[index];
			word = word.substring(0, 1).toUpperCase();
			finalWord = word + arr[index].substring(1) + " ";
			System.out.println(finalWord.trim());
		}
		return input;
	}

	String home(String input) {
		String word = " ";
		for (int index = input.length() - 1; index >= 0; index--) {
			char ch = input.charAt(index);
			if (index == input.length() - 1)
				ch = Character.toUpperCase(ch);
			word = word + ch;
		}
		return word;
	}

	void reverseAndConvertFirstLetter(String input) {
		String[] arr = input.split(" ");
		String temp = " ";
		for (int index = 0; index < arr.length; index++) {
			temp = temp + " " + home(arr[index]);
		}
		System.out.println("Reverse string with first letter capital : " + temp.trim());
	}

	
	
	String reverseStr(String input) {
		String cse =" ";
		for(int index=0 ; index<input.length(); index++) {
			char ch = input.charAt(index);
			if(Character.isLowerCase(ch))
				ch = Character.toUpperCase(ch);
			else
				ch = Character.toLowerCase(ch);
			cse = cse+ch;
		}
		return cse;
	}
	
	void reversecse(String input) {
		String[] Arr = input.split(" ");
		String temp = " ";
		for(int index=0; index<Arr.length; index++) {
			temp =  temp + " "+reverseStr(Arr[index]);
		}
		System.out.println(temp.trim());
	}
	
	public static void main(String[] a) {
		A24_StringClassMethodPrograms assignment24 = new A24_StringClassMethodPrograms();;
		String input = "Hi hello";
		assignment24.totalWordsAndLetterCount(input);
		System.out.println();
		assignment24.findVowelsCount("aashvi ssauravo monalisaa");
		System.out.println();
		System.out.print("OUTPUT : ");
		assignment24.arrayOfWordContainDigit("aas2h34vi s56sau8r9av90o");
		System.out.println();
		System.out.println();
		assignment24.reverse("saurav");
		System.out.println();
		assignment24.reverseString("saurav monali");
		System.out.println();
		assignment24.firstLetterUppercase("anvit harsh dipali");
		System.out.println();
		assignment24.reverseAndConvertFirstLetter("saurav monali");
		assignment24.reversecse("tEcHnOcREdItS");
	}
}
