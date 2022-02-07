package gauravk.Assignment_ReversingNumbers;

public class ReversingNumbersV1 {

	int numberReversing(int num) {
		String abc = String.valueOf(num);
		char[] ch = abc.toCharArray();
		String str = "";
		for (int i = ch.length - 1, j = 0; i >= 0; i--) {
			str += ch[i];
		}
		return Integer.parseInt(str);
	}

	public static void main(String[] args) {

		ReversingNumbersV1 rn = new ReversingNumbersV1();
		System.out.println("\n" + rn.numberReversing(12345));

	}
}
