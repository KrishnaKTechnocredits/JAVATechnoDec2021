/*Assignment - 16: 31st Dec'2021
print count of vowels in each input from String array and print total vowels.
input : String[] arr = {"priyanka", "swati", "acharya", "hevin" }
output : priyanka -> 3
              swati -> 2
              acharya -> 3
              hevin -> 2
total vowels -> 10
*/

package deepak;

public class A16_VowelsInArray {
	int totalVowelCount = 0;

	int getVowelCount(String input) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
				count++;
		}
		System.out.println(input + " : " + count);
		return totalVowelCount = totalVowelCount + count;
	}

	void getVowelCountInArray(String[] input) {
		for (int index = 0; index < input.length; index++) {
			getVowelCount(input[index]);

		}
		System.out.println("Total Vowel Count in Array: " + totalVowelCount);
	}

	public static void main(String[] args) {
		A16_VowelsInArray vowelsInArray = new A16_VowelsInArray();
		String[] input = { "priyanka", "swati", "acharya", "hevin" };
		vowelsInArray.getVowelCountInArray(input);

	}

}
