/*Program - 2 : WAP to return a string having each word length is prime number from the given sentence.

Prime numbres are : 2, 3, 5, 7, 11, 13, 17, 19 ...

Examples:

Input 1 : I love my India

Output 1 : my India

Input 2 : I would like to have a cup of tea

Output 2 : would to cup of tea
*/

package pallavi;

import java.util.Scanner;

public class Test4_PrimeLengthString {

	String getPrimeLengthString(String input) {
		String[] str = input.trim().split(" ");
		String output = "";

		for (int index = 1; index < str.length; index++) {
			if (isprime(str[index].length())) {
				output += str[index] + " ";
			}
		}
		return output;
	}

	boolean isprime(int length) {
		boolean isPrime = true;
		for (int i = 2; i <= length / 2; i++) {
			if (length % i == 0) {
				isPrime = false;
				break;
			} else
				isPrime = true;
		}
		return isPrime;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the string");
		String input = sc.nextLine();
		String output = new Test4_PrimeLengthString().getPrimeLengthString(input);
		System.out.println("Output:- " + output);
	}

}
