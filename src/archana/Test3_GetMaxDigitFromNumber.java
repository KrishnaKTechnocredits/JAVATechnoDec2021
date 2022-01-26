package archana;

public class Test3_GetMaxDigitFromNumber {

	int getMaxDigitFromNumber(int num) {
		int max = 0;
		do {
			int rem = num % 10;
			int ans = num / 10;
			num = ans;
			if (max < rem) {
				max = rem;
			}
		} while (num > 0);
		return max;
	}

	public static void main(String[] args) {
		Test3_GetMaxDigitFromNumber test3 = new Test3_GetMaxDigitFromNumber();
		int maxNo = test3.getMaxDigitFromNumber(6932774);
		System.out.println("Max no from given number : " + maxNo);
	}

}
