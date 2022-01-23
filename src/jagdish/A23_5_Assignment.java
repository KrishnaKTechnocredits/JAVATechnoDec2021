package jagdish;
/*Program 5 : Find the difference between even and odd numbers from given string.
input : te112ch34no29
output : 117
hint : (112+34)-(29)*/

public class A23_5_Assignment {
	String temp = ""; // 112 //146
	int even = 0;
	int odd = 0;

	int findEvenOddString(String input) {

		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) // te112ch34no29
				temp = temp + ch;

			if (Character.isLetter(ch) && !temp.equals("") || index == input.length() - 1) {
				int ans = Integer.parseInt(temp);
				if (ans % 2 == 0)
					even = even + ans;
				else
					odd = odd + ans;
				temp = "";
			}
		}
		return even - odd;
	}

	public static void main(String[] args) {
		A23_5_Assignment eo = new A23_5_Assignment();
		String name = "te112ch34no29";
		System.out.println("The sum is : " + eo.findEvenOddString(name));

	}

}
