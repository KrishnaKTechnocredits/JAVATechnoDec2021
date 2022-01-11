package tanu;

class Assignment17 {

	void threeConsecutive(int[] number) {
		int first = 0;
		int second = 0;
		int third = 0;

		for (int index = 0; index < number.length - 2; index++) {

			first = number[index];
			second = number[index + 1];

			if (second == first + 1) {
				second = number[index + 1];
				third = number[index + 2];
				if (third == second + 1) {
					System.out.println(first + " " + second + " " + third);
				}

			}

		}

	}

	void maxVowelCount(String[] name) {
		String element = null;
		int maxvowel = 0;
		String maxvowelname = null;
		for (int index = 0; index < name.length; index++) {
			int vowelcount = 0;
			element = name[index];
			for (int alpha = 0; alpha < element.length(); alpha++) {
				if (element.charAt(alpha) == 'a' || element.charAt(alpha) == 'e' || element.charAt(alpha) == 'i'
						|| element.charAt(alpha) == 'o' || element.charAt(alpha) == 'u') {
					vowelcount++;
					if (vowelcount > maxvowel) {
						maxvowel = vowelcount;
						maxvowelname = element;
					}
				}
			}
		}
		System.out.println(maxvowelname);

	}

	public static void main(String[] arg) {
		Assignment17 assignment17 = new Assignment17();
		int[] userinput = { 10, 13, 14, 15, 16, 19, 20, 22, 23, 24, 27, 28, 29 };
		assignment17.threeConsecutive(userinput);
		String[] userinput1 = { "karan", "shweta", "pallavi", "aabhishek", "sagar" };
		assignment17.maxVowelCount(userinput1);

	}

}
