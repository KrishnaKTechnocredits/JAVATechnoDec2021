package vishakha;

public class A16_ArrayVowels {

	int getVowelCountString(String str) {
		int count = 0;
		String temp = str.toLowerCase();
		for (int index = 0; index < str.length(); index++) {
			if (temp.charAt(index) == 'a' || temp.charAt(index) == 'e' || temp.charAt(index) == 'i'
					|| temp.charAt(index) == 'o' || temp.charAt(index) == 'u')
				count++;
		}
		System.out.println(str + " -> " + count);
		return count;
	}

	void findVowelCountAllString(String[] arr) {
		int totalcount = 0;
		for (int index = 0; index < arr.length; index++)
			totalcount += getVowelCountString(arr[index]);
		System.out.println("total vowels =" + totalcount);
	}

	public static void main(String[] args) {
		A16_ArrayVowels arrayVowels = new A16_ArrayVowels();
		String[] input = { "priyanka", "swati", "acharya", "hevin" };
		arrayVowels.findVowelCountAllString(input);
	}
}
