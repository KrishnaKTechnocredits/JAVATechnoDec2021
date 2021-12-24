/*Assignment - 11 : 24rd Dec'2021

Write a program with following methods.

1. create a method to return first occurrence of given character from given string.
2. create a method to return last occurrence of given character from given string.
3. create a method to return true if given character is found from given string else return false.
4. create a method to return total occurrence of given character from given string. 
*/

package pallavi;

public class A11_CharReturn {

	int getFirstOccuranceOfChar(String name, char c) {
		for (int index = 0; index <= (name.length() - 1); index++) {
			if (name.charAt(index) == c) {
				System.out.println("First occurance of " + c + " in string " + name + " is at position:");
				return index;
			}
		}
		return -1;
	}

	int getLastOccuranceOfChar(String name, char c) {
		for (int index = (name.length() - 1); index >= 0; index--) {
			if (name.charAt(index) == c) {
				System.out.println("Last occurance of " + c + " in string " + name + " is at position:");

				return index;
			}
		}
		return -1;
	}

	boolean isCharPresent(String name, char c) {
		for (int index = 0; index <= (name.length() - 1); index++) {
			if (name.charAt(index) == c)
				return true;
		}
		return false;
	}

	int getTotalOccuranceOfChar(String name, char c) {
		int cnt = 0;
		System.out.println("Total occurances of " + c + " in string " + name + " is :");
		for (int index = (name.length() - 1); index >= 0; index--) {
			if (name.charAt(index) == c) {
				System.out.println("Total occurances of " + c + " in string " + name + " is :");

				cnt++;
			}
		}
		return cnt;
	}

	public static void main(String[] arr) {
		A11_CharReturn a11_CharReturn = new A11_CharReturn();

		int firstOccurance = a11_CharReturn.getFirstOccuranceOfChar("technocredits", 'a');
		if (firstOccurance >= 0) {
			System.out.println(firstOccurance + 1);
		} else
			System.out.println("Given character is not present in string");

		int lastOccurance = a11_CharReturn.getLastOccuranceOfChar("technocredits", 'c');
		if (lastOccurance >= 0) {
			System.out.println(lastOccurance + 1);
		} else
			System.out.println("Given character is not present in string");

		System.out.println(a11_CharReturn.isCharPresent("technocredits", 's'));
		System.out.println(a11_CharReturn.isCharPresent("technocredits", 'b'));

		int totalOccurance = a11_CharReturn.getTotalOccuranceOfChar("technocredits", 'a');
		if (totalOccurance >= 0) {
			System.out.println(totalOccurance);
		} else
			System.out.println("Given character is not present in string");
	}
}
