/* Exam 3 - 24th Jan'2022
Write a program to find max digit from given number.
Input will be as number format only, DO NOT CHANGE NUMBER INTO STRING

Input : 6832774
Output :8

*/

package vaibhav.Exam_3;

public class Exam3_Program1 {

	void findMaxDigit(int num) {
		int maxNum = 0; 
		int temp;
		while (num >0) {
			temp = num % 10;
			num = num / 10; 
			if (temp > maxNum)
				maxNum = temp;
		}

		System.out.println("Maximum digit form given number is : " + maxNum);
	}

	public static void main(String[] args) {
		Exam3_Program1 exam3_Program1 = new Exam3_Program1();
		exam3_Program1.findMaxDigit(6832774);
	}
}
