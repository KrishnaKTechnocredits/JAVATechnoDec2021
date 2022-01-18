/*Program 6 : Return a string by placing all odd numbers , first capital letters from given string, even numbers.
input : eTe1CH9cred4it6s
output : 19T46
 */
package anjali.Assignment23;

public class A23_Program6 {

	String oddNoCapitalLetterEvenNos(String name) {
		boolean flag = true;
		String result = "";
		int index = 0;
		String evenno = "";
		String oddno = "";
		String upperCaseLetter = "";
		for (index = 0; index < name.length(); index++) {
			char ch = name.charAt(index);
			if (Character.isDigit(ch)) {
				int num = Character.getNumericValue(ch);
				if (num % 2 == 0) {
					evenno = evenno + num;
					//System.out.println(evenno);
				} else {
					oddno = oddno + num;
					//System.out.println(oddno);
				}
			} else if (Character.isLetter(name.charAt(index))) {
				if (flag == true) {
					if (Character.isUpperCase(name.charAt(index))) {
						upperCaseLetter = upperCaseLetter + name.charAt(index);
						flag = false;
					}
				}
			}
		}
		result = oddno + upperCaseLetter + evenno;
		return result;
	}

	public static void main(String[] args) {
		A23_Program6 a23_Program6 = new A23_Program6();
		String input ="eTe1CH9cred4it6s";
		String output = a23_Program6.oddNoCapitalLetterEvenNos(input);
		System.out.println("The output of "+input+" after modification is : "+output);

	}

}
