/* WAP to return aray of words containing only digits
 * Input=>"Te1c2h c94re3"
 * Output=>"12 943"
 */
package anjali.Assignment24;

public class A24_Program3 {

	String takeOnlyDigitsInString(String name) {
		String temp = "";
		for (int index = 0; index < name.length(); index++) {
			char ch = name.charAt(index);
			if (Character.isDigit(ch))
				temp = temp + ch;
		}
		return temp;
	}

	String returnArrayContainingOnlyDigits(String name) {
		String temp1 = "";
		String[] arr = name.split(" ");
		for (int index = 0; index < arr.length; index++) {
			temp1 = temp1 + " " + takeOnlyDigitsInString(arr[index]);
		}
		return temp1.trim();
	}

	public static void main(String[] args) {
		A24_Program3 a24_Program3 = new A24_Program3();
		String output = a24_Program3.returnArrayContainingOnlyDigits("Te1c2h c94re3");
		System.out.println(output);
	}

}
