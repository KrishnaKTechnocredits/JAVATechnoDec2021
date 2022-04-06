/*26th May Coding Exam-14 : Collection

1. Return all the palindrome number from given array.
input: [123,121,989,1221,951]
output: [121,989,1221]

public ArrayList<Integer> getPalindrome(int numbser[]){
	//write your logic
}*/

package vaibhav.Practice.Programming_Test.Test_14;

import java.util.ArrayList;
import java.util.Arrays;

public class PalindromeNumber {

	boolean isPalindrome(int num) {
		int temp = num;
		int sum = 0;
		int mod = 0;
		while (temp != 0) {
			mod = temp % 10;
			sum = sum * 10 + mod;
			temp = temp / 10;
		}
		if (sum == num)
			return true;
		else
			return false;
	}

	ArrayList<Integer> getPalindrome(int number[]) {
		ArrayList<Integer> output = new ArrayList<Integer>();
		for (int num : number) {
			if (isPalindrome(num))
				output.add(num);
		}
		return output;
	}

	public static void main(String[] args) {
		PalindromeNumber palindromeNumber = new PalindromeNumber();
		int[] number = { 123, 121, 989, 1221, 951 };
		ArrayList<Integer> output = palindromeNumber.getPalindrome(number);

		System.out.println("Input Number	: " + Arrays.toString(number));
		System.out.println("Expected output : " + output);
	}

}
