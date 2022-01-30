package sandip.Assignment_23;

public class Odd_even_diff {

	void oddEvenDiff(String input) {
		int num = 0;
		int odd = 0;
		int even = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				num = Character.getNumericValue(ch);
				if (num % 2 == 0) {
					even = even + num;
				} else {
					odd = odd + num;
				}
			}
		}
		System.out.println("Diffrence of odd and even is :" + (odd - even));
	}

	public static void main(String[] args) {
		Odd_even_diff o1 = new Odd_even_diff();
		o1.oddEvenDiff("tech5hno3cre6di1ts");
	}
}
