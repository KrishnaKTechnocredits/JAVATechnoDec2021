package poojaRajguru;

public class A16_StringVowel {
	int vowelCount(String str) {
		int count = 0;
		for(int index=0; index<str.length(); index++) {
			if(str.charAt(index) == 'a' || str.charAt(index) == 'e' || str.charAt(index) == 'i' || str.charAt(index) == 'o' || str.charAt(index) == 'u')
				count++;
		}
		System.out.println(str + " -> " + count);
		return count;
	}

	void findVowel(String[] arr) {
		int totalCount = 0;
		for(int index=0; index<arr.length; index++)
			totalCount += vowelCount(arr[index]);
		System.out.println("Total vowels = " + totalCount);
	}

	public static void main(String[] args) {
		A16_StringVowel stringVowel = new A16_StringVowel();
		String[] strArr = {"priyanka", "swati", "acharya", "hevin"};
		stringVowel.findVowel(strArr);
	}
}

