package sandip.Test_3;

public class Max_Num {

	void maxNuber(int input) {
		int max = 0;
		int lastDigit = 0;
		while (input > 0) {
			lastDigit = input % 10;
			if (max < lastDigit) {
				max = lastDigit;
			}
			input = input / 10;
		}
		System.out.println("Max number is :" + max);
	}

	public static void main(String[] args) {
		Max_Num t1 = new Max_Num();
		t1.maxNuber(6832774);
	}
}
