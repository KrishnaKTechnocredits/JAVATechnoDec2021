/*Programming Test : 27th Jan'2022

Program - 2 : WAP to return a string having each word length is prime number from the given sentence.

Prime numbres are : 2, 3, 5, 7, 11, 13, 17, 19 ...

Examples:

Input 1 : I love my India

Output 1 : my India

Input 2 : I would like to have a cup of tea

Output 2 : would to cup of tea

*/

package vaibhav.Exam_4;

public class Exam4_Program2 {

	boolean isPrime(int num) {
		boolean flag = true;
		for (int index = 2; index <= num / 2; index++) {
			if (num % index == 0) {
				flag = false;
				break;
			}
		}
		return flag;
	}

	String expectedStringOutput(String str) { // I love my India
		String[] strArr = str.split(" ");
		String outputString = "";
		for (String word : strArr) {
			if (word.length() == 1) {
				continue;
			} else if (isPrime(word.length())) {
				outputString += word + " ";
			}
		}

		return outputString.trim();
	}

	public static void main(String[] args) {
		Exam4_Program2 exam4_Program2 = new Exam4_Program2();
		String inputString_1 = "I love my India";
		String inputString_2 = "I would like to have a cup of tea";
		System.out.println("Input String is 		: " + inputString_1);
		System.out.println("Expected Output String is	: " + exam4_Program2.expectedStringOutput(inputString_1));
		System.out.println("");
		System.out.println("Input String is 		: " + inputString_2);
		System.out.println("Expected Output String is	: " + exam4_Program2.expectedStringOutput(inputString_2));
	}
}
