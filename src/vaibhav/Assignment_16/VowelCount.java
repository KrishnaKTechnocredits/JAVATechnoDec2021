/*
Assignment - 16 : 31st Dec'2021 

print count of vowels in each input from String array and print total vowels.
input : String[] arr = {"priyanka", "swati", "acharya", "hevin" }
output : priyanka -> 3
              swati -> 2
              acharya -> 3
              hevin -> 2
total vowels -> 10

*/
package vaibhav.Assignment_16;

import java.util.Arrays;

public class VowelCount {

	int totalVowelCount;

	int getVowelCount(String str) {
		char ch = ' ';
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			ch = str.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				totalVowelCount++;
				count++;
			}
		}
		return count;
	}

	void printVowelCount(String[] inputArr) {
		String temp = "";
		System.out.println("Vowel count for each word is as below : ");
		for (int index = 0; index < inputArr.length; index++) {
			temp = inputArr[index];
			System.out.println(temp + "	:" + getVowelCount(temp));
		}
		System.out.println("\nTotal vowel count is : " + totalVowelCount);
	}

	public static void main(String[] args) {
		VowelCount vowelCount = new VowelCount();
		String[] arr = { "priyanka", "swati", "acharya", "hevin" };
		System.out.println("Given input Array is : " + Arrays.toString(arr) + "\n");
		vowelCount.printVowelCount(arr);
	}
}
