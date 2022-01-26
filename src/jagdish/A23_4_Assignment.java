package jagdish;

/*Program 4 : Find the difference between odd and even digits from given string.
input : tec5hno3cre6di1ts
output : 3
Hint : (5+3+1)-(6) = 9-6*/

public class A23_4_Assignment {

	int findOddEvenString(String input) {
		int odd = 0;
		int even = 0;

		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				String temp = ch + "";
				int ans = Integer.parseInt(temp);
				if (ans % 2 == 0)
					even = even + ans;
				else
					odd = odd + ans;
			}

		}

		return odd - even;

	}

	public static void main(String[] args) {
		A23_4_Assignment oddevenstring = new A23_4_Assignment();
		String name = "tec5hno3cre6di1ts";

		System.out.println("THe overall value is : " + oddevenstring.findOddEvenString(name));
	}

}
