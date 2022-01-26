package saurav;

public class Test3_FindMaxDigitFromGivenNumber {

	void display(int input) {
		int maxNumber = 0;
		while (input > 0) {
			int maxNum = input % 10;
			if (maxNum > maxNumber)
				maxNumber = maxNum;
			input = input / 10;
		}
		System.out.println(maxNumber);
	}

	public static void main(String[] a) {
		Test3_FindMaxDigitFromGivenNumber test3 = new Test3_FindMaxDigitFromGivenNumber();
		test3.display(6327874);
	}
}
