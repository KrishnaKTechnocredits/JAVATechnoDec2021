package nehaPandey;
//Write a program to find max digit from given number.

//Input will be as number format only, DO NOT CHANGE NUMBER INTO STRING
//Input : 6832774
//Output :8

public class Exam4_Max_Digit {
	void findMaxDigitFromGivenNumber(int num) {
		int max = 0;
		while (num / 10 > 0) {
			if (max < num % 10)
				max = num % 10;
			num = num / 10;
		}
		System.out.println("Maximum digit from given number is: " + max);

	}

	public static void main(String[] args) {
		Exam4_Max_Digit maxdigit = new Exam4_Max_Digit();
		maxdigit.findMaxDigitFromGivenNumber(6832774);
	}

}
