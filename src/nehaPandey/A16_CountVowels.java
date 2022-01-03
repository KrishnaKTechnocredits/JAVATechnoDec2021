package nehaPandey;

public class A16_CountVowels {
	int totalVowelCount = 0;

	void VowelCount(String name) {
		int vowelCount = 0;
		for (int index = 0; index < name.length(); index++) {
			if (name.charAt(index) == 'a' || name.charAt(index) == 'e' || name.charAt(index) == 'i'
					|| name.charAt(index) == 'o' || name.charAt(index) == 'u') {
				vowelCount++;
				totalVowelCount++;
			}
		}
		System.out.println("Total count of vowels in " + name + " is: " + vowelCount);
	}

	void totalCountOfVowels(String[] arr) {
		for (int index = 0; index < arr.length; index++) {
			VowelCount(arr[index].toLowerCase());
		}
		System.out.println();
		System.out.println("Total counts of vowels is: " + totalVowelCount);
	}

	public static void main(String[] args) {
		A16_CountVowels as = new A16_CountVowels();
		String str[] = { "Anmesh", "Rahul", "Prachi", "Abhineet" };
		as.totalCountOfVowels(str);
	}
}
