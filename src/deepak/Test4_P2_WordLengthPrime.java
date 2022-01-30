/*Programming Test: 27th Jan'2022
Program - 2: WAP to return a string having each word length is prime number from the given sentence.
Prime numbres are : 2, 3, 5, 7, 11, 13, 17, 19 ...

Examples:
Input 1 : I love my India
Output 1 : my India
Input 2 : I would like to have a cup of tea
Output 2 : would to cup of tea
*/

package deepak;

public class Test4_P2_WordLengthPrime {

	boolean isPrime(String str) {
		int length = str.length();
		boolean flag = true;
		for (int index = 2; index < length; index++) {
			if (length % index == 0) {
				flag = false;
			}
		}
		return flag;
	}

	void isStringLengthPrime(String input) {
		String output[] = input.split(" ");
		for (int index = 0; index < output.length; index++) {
			int tempLength = output[index].length();
			if (tempLength > 1) {
				if (isPrime(output[index]))
					System.out.print(output[index] + " ");
			}
		}
	}

	public static void main(String[] args) {
		Test4_P2_WordLengthPrime isLengthOfStringIsPrime = new Test4_P2_WordLengthPrime();
		isLengthOfStringIsPrime.isStringLengthPrime("I love my India");
		System.out.println();
		isLengthOfStringIsPrime.isStringLengthPrime("I would like to have a cup of tea");
	}
}
