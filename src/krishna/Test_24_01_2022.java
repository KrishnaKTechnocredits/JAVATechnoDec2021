package krishna;

public class Test_24_01_2022 {
	static int findMax() {
		int[] num = { 6, 8, 3, 2, 7, 7, 4 };
		int max = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] > max) {
				max = num[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		Test_24_01_2022 test = new Test_24_01_2022();
		System.out.println("The max Number is :  " + findMax());
	}
}
