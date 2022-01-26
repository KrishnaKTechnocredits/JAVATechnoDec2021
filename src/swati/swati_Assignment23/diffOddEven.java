package swati.swati_Assignment23;

public class diffOddEven {
	int odd = 0;
	int even = 0;

	void diff(String str) {
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (Character.isDigit(c)) {
				String temp = "" + c;
				int num = Integer.parseInt(temp);
				if (num % 2 == 0) {
					even = even + num;
				} else {
					odd = odd + num;
				}
			}
		}
		System.out.println(odd - even);
	}

	public static void main(String[] args) {
		diffOddEven de = new diffOddEven();
		String str = "tec5hno3cre6di1ts";
		de.diff(str);

	}

}
