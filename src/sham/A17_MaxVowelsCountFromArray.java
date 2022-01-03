package sham;

public class A17_MaxVowelsCountFromArray {

	int findVowelsFromString(String name) {

		int count = 0;
		for (int index = 0; index < name.length(); index++) {
			if (name.charAt(index) == 'a' || name.charAt(index) == 'e' || name.charAt(index) == 'i'
					|| name.charAt(index) == 'o' || name.charAt(index) == 'u')

				count++;

		}
		// System.out.println("Vowel Count from "+name+" is :"+count);
		return count;
	}

	String findVowelsFromStringArray(String[] arr) {
		int maxVowelCount = 0;
		String maxString = null;
		for (int index = 0; index < arr.length; index++) {
			int count = findVowelsFromString(arr[index]);
			if (count > maxVowelCount) {
				maxVowelCount = count;
				maxString = arr[index];
			}
		}
		return maxString;
	}

	public static void main(String[] args) {
		A17_MaxVowelsCountFromArray maxVowel = new A17_MaxVowelsCountFromArray();
		String[] arr = { "hi", "priyanka", "sandip", "aakanksha", "pallavi", "apurva" };
		String max = maxVowel.findVowelsFromStringArray(arr);
		System.out.println("Found Max Vowel Count from: "+max);
	}

}
