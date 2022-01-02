package sandip.Assignment_17;

public class Vowel_String {

	int temp;
	int count1;
	int index1;

	void maxVowels(String s2) {
		count1 = 0;
		for (int index = 0; index < s2.length(); index++) {
			if ((s2.charAt(index) == 'a') || (s2.charAt(index) == 'e') || (s2.charAt(index) == 'i')
					|| (s2.charAt(index) == 'o') || (s2.charAt(index) == 'u')) {
				count1++;
			}
		}
	}

	void vowelString(String[] s1) {
		for (int index = 0; index < s1.length; index++) {
			maxVowels(s1[index]);
			if (count1 > temp) {
				temp = count1;
				index1 = index;
			}
		}
		System.out.println("String with maximum vowel :" + s1[index1]);
	}

	public static void main(String[] args) {
		Vowel_String vowels = new Vowel_String();
		String[] a1 = { "hi", "priyanka", "sandip", "aakansha", "pallavi", "apurva" };
		vowels.vowelString(a1);
	}
}
