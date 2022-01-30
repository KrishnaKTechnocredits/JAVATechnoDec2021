/*Write a program to find max digit from given number.
Input will be as number format only, DO NOT CHANGE NUMBER INTO STRING
Input : 6832774
Output :8*/

package vrushali;

public class Exam3_MaxDigitFromGivenNumber {

	void maxDigitFromNumber(int num) {

		int maxNum = 0;
		int reminder = 0;

		while(num>0) {
			num = num / 10;
			reminder = num % 10;
			if (maxNum < reminder)
				maxNum = reminder;

		}
		System.out.println("Max digit from given Number " + maxNum);
	}

	public static void main(String[] args) {
		Exam3_MaxDigitFromGivenNumber maxDigitFromGivenNumber = new Exam3_MaxDigitFromGivenNumber();
		maxDigitFromGivenNumber.maxDigitFromNumber(6832774);
	}
}
