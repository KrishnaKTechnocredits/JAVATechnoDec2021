package rohini.Rohini_Assignment23;

/*Program 6 : Return a string by placing all odd numbers , first capital letters from given string, even numbers.
input : eTe1CH9cred4it6s
output : 19T46
*/

public class Program6 {

	
	String firstUpperCase = "", EvenDigits = "", oddDigits = "";

	String arrangeStrning(String str) {
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch) && str.charAt(index) % 2 == 0)
				EvenDigits += ch;
			else if (Character.isDigit(ch) && str.charAt(index) % 2 != 0)
				oddDigits += ch;
			else if (Character.isLetter(ch) && Character.isUpperCase(ch))
				firstUpperCase += ch;
		}
		return oddDigits + firstUpperCase.charAt(0) + EvenDigits;
	}

	public static void main(String[] args) {
		Program6 prg6 = new Program6();
		String str = "eTe1CH9cred4it6s";
		System.out.println("Input String  = " + str +"\nOutput String = " + prg6.arrangeStrning(str));

	}
}
