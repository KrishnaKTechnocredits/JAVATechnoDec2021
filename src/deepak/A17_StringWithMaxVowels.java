/*Assignment - 17: 1st Jan'2022
Program 2: return String having maximum vowels from given array.
Sample input : String[] arr = {"hi","priyanka", "sandip", "aakanksha", "pallavi", "apurva"};
output : aakanksha

*/
package deepak;

import java.util.Arrays;

public class A17_StringWithMaxVowels {
	int count = 0;
	int maxCount = 0;
	String maxVowelName = "";

	int getVowelCount(String input) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == 'a' || input.charAt(index) == 'i' || input.charAt(index) == 'e'
					|| input.charAt(index) == 'o' || input.charAt(index) == 'u') {
				count++;
			}
		}
		System.out.println(input + " : " + count);
		return count;
	}

	String getStringMaxVowel(String[] input) {
		System.out.println("Vowels in each String of the array input: ");
		for (int index = 0; index < input.length; index++) {
			count = getVowelCount(input[index]);
			if (maxCount < count) {
				maxCount = count;
				maxVowelName = input[index];
			}
		}
		System.out.println("***************************");
		System.out.print("String with maximum vowels: ");
		return maxVowelName;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A17_StringWithMaxVowels stringWithMaxVowels = new A17_StringWithMaxVowels();
		String[] input = { "hi", "priyanka", "sandip", "aakanksha", "pallavi", "apurva" };
		System.out.println("Given array: " + Arrays.toString(input));
		System.out.println("********************************************************************");
		System.out.println(stringWithMaxVowels.getStringMaxVowel(input));

	}
}