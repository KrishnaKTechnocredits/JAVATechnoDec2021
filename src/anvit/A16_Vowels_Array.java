package anvit;

public class A16_Vowels_Array {
	
	int vowelCount = 0;

	void getVowel(String name) {
		int count = 0;
		for (int index = 0; index < name.length(); index++) {
			if (name.charAt(index) == 'a' || name.charAt(index) == 'e' || name.charAt(index) == 'i'
					|| name.charAt(index) == 'o' || name.charAt(index) == 'u') {
				count++;
				vowelCount++;
			}
		}
		System.out.println(name + "  -->  " + count);
	}

	void findVowels(String[] arr) {
		for (int index = 0; index < arr.length; index++) {
			getVowel(arr[index]);
		}
		System.out.println("Total Vowels in the given array : " + vowelCount);
	}

	public static void main(String[] args) {
		A16_Vowels_Array a16 = new A16_Vowels_Array();
		String[] arr = { "priyanka", "swati", "acharya", "hevin" };
		a16.findVowels(arr);
	}
}
