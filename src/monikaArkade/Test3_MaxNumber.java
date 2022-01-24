/*
Write a program to find max digit from given number.
Input will be as number format only, DO NOT CHANGE NUMBER INTO STRING
Input : 6832774
Output :8
 */
package monikaArkade;

public class Test3_MaxNumber {
	int reminder, max = 0;

	void findMaxNum(int num) {
		while (num > 0) {
			reminder = num % 10;
			if (max < reminder)
				max = reminder;
			num = num / 10;
		}
		System.out.println("Max Number is: " + max);
	}

	public static void main(String[] args) {
		Test3_MaxNumber t3 = new Test3_MaxNumber();
		int num = 6832774;
		t3.findMaxNum(num);
	}
}
