package saurav;

public class A17_P2_GetStringHavingMaxVowels { // --------------*****---------------//

	String manav(String[] input) {
		int maxVowelCount = 0;
		String maxVowelsString = " ";
		for (int index = 0; index < input.length; index++) {
			String currentName = input[index];
			int currentNameVowelCount = 0;
			for (int innerIndex = 0; innerIndex < currentName.length(); innerIndex++) {
				int ch = input.length;
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					currentNameVowelCount++;
				}
			}
			if (currentNameVowelCount > maxVowelCount) {
				maxVowelCount = currentNameVowelCount;
			}
			maxVowelsString = currentName;
		}
		System.out.println("String having max vowels is :");
		System.out.println(maxVowelsString);
		return maxVowelsString;
	}

	public static void main(String[] a) {
		A17_P2_GetStringHavingMaxVowels stringhavingmaxvowels = new A17_P2_GetStringHavingMaxVowels();
		String[] words = { "saurav", "main", "piyush", "abhisheeek" };
		stringhavingmaxvowels.manav(words);
	}
}
