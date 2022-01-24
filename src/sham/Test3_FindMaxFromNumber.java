package sham;

public class Test3_FindMaxFromNumber {

	void findMaxDigitFromNumber() {
		int num = 6832774;
		int maxNum = 0, temp;
		while (num != 0) {
			temp = num % 10;

			if (maxNum == 0) {
				maxNum = temp;
			} else if (maxNum < temp) {
				maxNum = temp;
			}
			num = num / 10;
		}
		System.out.println("max digit from Number : "+maxNum);
	}

	public static void main(String[] args) {
		Test3_FindMaxFromNumber maxDigit = new Test3_FindMaxFromNumber();
		maxDigit.findMaxDigitFromNumber();

	}

}
