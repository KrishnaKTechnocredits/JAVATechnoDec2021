/*
 * Assignment - 16 : 31st Dec'2021

print count of vowels in each input from String array and print total vowels.
input : String[] arr = {"priyanka", "swati", "acharya", "hevin" }
output : priyanka -> 3
              swati -> 2
              acharya -> 3
              hevin -> 2
total vowels -> 10
 */
package shwetaDharmadhikari;

public class Assign_16_PrintVowelsinString {

	int getVowelsInString(String name) {
		int cnt = 0;
		for (int index = 0; index < name.length(); index++) {
			if (name.charAt(index) == 'a' || name.charAt(index) == 'e' || name.charAt(index) == 'i'
					|| name.charAt(index) == 'o' || name.charAt(index) == 'u' || name.charAt(index) == 'A'
					|| name.charAt(index) == 'I' || name.charAt(index) == 'O' || name.charAt(index) == 'U'
					|| name.charAt(index) == 'E') {
				cnt++;
			}
		}
		System.out.println(name + " -> " + cnt);
		return cnt;
	}

	void findCharCount(String[] input) {
		int count = 0;
		for (int index = 0; index < input.length; index++) {
			int temp = getVowelsInString(input[index]);
			count += temp;
		}
		System.out.println("Count of vowels: " + count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = { "priyanka", "swati", "acharya", "hevin" };
		Assign_16_PrintVowelsinString printVowelsinString = new Assign_16_PrintVowelsinString();
		printVowelsinString.findCharCount(arr);
	}

}
