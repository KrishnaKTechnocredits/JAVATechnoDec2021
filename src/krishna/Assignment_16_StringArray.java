package krishna;

public class Assignment_16_StringArray {
	int count = 0;

	void findVowels(String found) {
		int cnt = 0;
		for (int index = 0; index < found.length(); index++) {
			if (found.charAt(index) == 'a' || found.charAt(index) == 'e' || found.charAt(index) == 'i'
					|| found.charAt(index) == 'o' || found.charAt(index) == 'u') {
				count++;
				cnt++;
			}
		}
		System.out.println("The vowels found in  " + found + " ---> " + cnt);
	}

	void countVowels(String[] provide) {
		for (int i = 0; i < provide.length; i++) {
			findVowels(provide[i]);
		}
		System.out.println("The total count of vowels is : " + count);
	}

	public static void main(String[] arr) {
		String[] provide = { "priyanka", "swati", "acharya", "hevin" };
		Assignment_16_StringArray ass16 = new Assignment_16_StringArray();
		ass16.countVowels(provide);
	}

}
