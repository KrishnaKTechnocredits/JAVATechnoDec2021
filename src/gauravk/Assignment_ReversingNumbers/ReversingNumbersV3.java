package gauravk.Assignment_ReversingNumbers;

public class ReversingNumbersV3 {
	int numberReversing(int num) {
		String abc = String.valueOf(num);
		String[] s = abc.split("");
		String str = "";
		for (int i = s.length - 1, j = 0; i >= 0; i--) {
			str += s[i];
		}
		return Integer.parseInt(str);
	}

	public static void main(String[] args) {

		ReversingNumbersV3 rn = new ReversingNumbersV3();
		System.out.println("\n" + (rn.numberReversing(471)));

	}
}
