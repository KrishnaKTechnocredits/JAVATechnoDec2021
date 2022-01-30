package sandip.Assignment_23;

public class Even_Odd {

	void oddEvenDiff(String input) {

		int odd = 0;
		int even = 0;
		int num = 0;
		String temp = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				temp = temp + ch;
			} else if (!temp.equals("")) {
				num = Integer.parseInt(temp);
				if (num % 2 == 0) {
					even = even + num;
				} else {
					odd = odd + num;
				}
				temp = "";
			}
		}
		if (!temp.equals("")) {
			num = Integer.parseInt(temp);
			if (num % 2 == 0) {
				even = even + num;
			} else {
				odd = odd + num;
			}
			temp = "";
		}
		System.out.println("Diffrence of odd and even is :" + (even - odd));
	}

	public static void main(String[] args) {
		Even_Odd o1 = new Even_Odd();
		o1.oddEvenDiff("te112ch34no29");
	}
}
