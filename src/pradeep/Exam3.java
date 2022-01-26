package pradeep;

public class Exam3 {

	void findMaxDigit(int input) {		
		int num = input;
		int digit = 0;
		int max = 0;

		while (num > 0) {
			digit = num % 10;
			num = num / 10;

			if (max < digit) {
				max = digit;
			}
		}
		System.out.println("Maximum Digit is from given number is : " + max);
	}

	public static void main(String[] args) {
		Exam3 exam3 = new Exam3();
		int input = 6832774;
		System.out.println("Input : " + input);
		exam3.findMaxDigit(input);
	}
}
