package sandip.Assignment_23;

public class First {

	void firstOccurance(String input) {
		System.out.println("Input : " + input);
		int num = 0;
		String even = "";
		String odd = "";
		char uc = ' ';
		boolean flag = true;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				num = Character.getNumericValue(ch); // if you use "valueOf" it will give ascii value of ch.
				if (num % 2 == 0) {
					String s = Integer.toString(num);
					even = even + s;
				} else {
					String s1 = Integer.toString(num);
					odd = odd + s1;
				}
			} else if (Character.isUpperCase(ch) && flag == true) {
				uc = ch;
				flag = false;
			}
		}
		System.out.println("Output : " + odd + uc + even);
	}

	public static void main(String[] args) {
		First f1 = new First();
		f1.firstOccurance("eTe1CH9cred4it6s");
	}
}
