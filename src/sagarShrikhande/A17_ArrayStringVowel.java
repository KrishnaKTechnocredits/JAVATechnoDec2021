package sagarShrikhande;

public class A17_ArrayStringVowel {

	int countVowelInString(String input) {
		int cnt = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e' || ch == 'I' || ch == 'i' || ch == 'O' || ch == 'o'
					|| ch == 'U' || ch == 'u')
				cnt++;
		}
		return cnt;
	}

	String countVowelInStringArray(String[] arr) {
		int maxVowelCount = 0;
		String maxString = null;
		for (int index = 0; index < arr.length; index++) {
			int count = countVowelInString(arr[index]);
			if (count > maxVowelCount) {
				maxVowelCount = count;
				maxString = arr[index];
			}
		}
		return maxString;
	}

	public static void main(String[] args) {
		A17_ArrayStringVowel a17_ArrayStringVowel = new A17_ArrayStringVowel();
		String[] arr = { "hi", "priyanka", "sandip", "aakanksha", "pallavi", "apurva" };
		System.out.println(a17_ArrayStringVowel.countVowelInStringArray(arr));
	}
}

/*
 * Program 2: return String having maximum vowels from given array. Sample input
 * : String[] arr = {"hi","priyanka", "sandip", "aakanksha", "pallavi",
 * "apurva"}; output : aakanksha
 */