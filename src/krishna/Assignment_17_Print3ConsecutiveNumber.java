package krishna;

public class Assignment_17_Print3ConsecutiveNumber {

	void findNumber(int[] num) {
		for (int i = 0; i < num.length - 2; i++) {
			if (num[i] + 1 == num[i + 1] && num[i] + 2 == num[i + 2]) {
				System.out.println(
						"The consecutive number are : " + num[i] + " --> " + num[i + 1] + " --> " + num[i + 2]);
			}
		}
	}

	public static void main(String[] arr) {
		int[] num = { 10, 13, 14, 15, 16, 19, 20, 22, 23, 24 };
		Assignment_17_Print3ConsecutiveNumber ass17 = new Assignment_17_Print3ConsecutiveNumber();
		ass17.findNumber(num);

	}
}
