package pratiksha;

public class A16_VowelString {

	int totalVowelCount = 0;

	void getVowelCount(String name) {
		int vowelCount = 0;
		for (int index = 0; index < name.length(); index++) {
			if (name.charAt(index) == 'a' || name.charAt(index) == 'e' || name.charAt(index) == 'i'
					|| name.charAt(index) == 'o' || name.charAt(index) == 'u') {
				vowelCount++;
				totalVowelCount++;
			}
		}
		System.out.println(name + "  -->  " + vowelCount);
	}

	void findVowelsInArray(String[] arr) {
		for (int index = 0; index < arr.length; index++) {
			getVowelCount(arr[index].toLowerCase());
		}
		System.out.println("Total Vowels in the given array : " + totalVowelCount);
	}

	public static void main(String[] args) {
		A16_VowelString vowelString = new A16_VowelString();
		String[] arr = { "Pratiksha", "Aarya", "Harish", "Shivani" };
		vowelString.findVowelsInArray(arr);

	}

}
