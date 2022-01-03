package saurav;

public class A16_CountOfVowelsInEachInputFromStringArray {
	int cnt = 0;

	void findVowels(String input) {
		int count = 0; ///////////// parameters in charAt() method are a case sensitive
						///////////// method/////////////
		for (int index = 0; index < input.length(); index++) { //////// taking only a single input/////////
			if (input.charAt(index) == 'a' || input.charAt(index) == 'e' || input.charAt(index) == 'i'
					|| input.charAt(index) == 'o' || input.charAt(index) == 'u') {
				count++;
				cnt++;
			}
		}
		System.out.println("Total vowels in " + input + " : " + count);
	}

	void getVowelsFromStringArray(String[] input) {
		for (int index = 0; index < input.length; index++) { //////// taking String Array as input////////////
			findVowels(input[index]);
		}
		System.out.println();
		System.out.println("Total of vowels from String Array : " + cnt);
	}

	public static void main(String[] a) {
		A16_CountOfVowelsInEachInputFromStringArray stringarr = new A16_CountOfVowelsInEachInputFromStringArray();
		// stringarr.findVowels("saurav");
		String[] input = { "saurav", "monali", "mumbai", "pune", "nashik" };
		stringarr.getVowelsFromStringArray(input);
	}
}
