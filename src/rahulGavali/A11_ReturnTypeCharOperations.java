	/*Assignment - 11: 24rd Dec'2021
	Write a program with following methods.
	1. create a method to return first occurrence of given character from given string.
	2. create a method to return last occurrence of given character from given string.
	3. create a method to return true if given character is found from given string else return false.
	4. create a method to return total occurrence of given character from given string.
	*/


package rahulGavali;

public class A11_ReturnTypeCharOperations {
		int firstOccuranceOfChar(String input, char ch) {
			int charIndex = -1;
			for (int index = 0; index < input.length(); index++) {
				if (input.charAt(index) == ch) {
					charIndex = index + 1;
					break;
				}
			}
			return charIndex;
		}

		int lastOccuranceOfChar(String input, char ch) {
			int charIndex = -1;
			for (int index = input.length() - 1; index > 0; index--) {
				if (input.charAt(index) == ch) {
					charIndex = index + 1;
					break;
				}
			}
			return charIndex;
		}

		boolean OccuranceOfChar(String input, char ch) {
			boolean charPresent = false;
			for (int index = 0; index < input.length(); index++) {
				if (input.charAt(index) == ch) {
					charPresent = true;
				}
			}
			return charPresent;
		}

		int countOfChar(String input, char ch) {
			int count = 0;
			for (int index = 0; index < input.length(); index++) {
				if (input.charAt(index) == ch) {
					count++;
				}
			}
			return count;
		}

		public static void main(String[] args) {
			A11_ReturnTypeCharOperations returnTypeCharOperation = new A11_ReturnTypeCharOperations();
			int firstOccurence = returnTypeCharOperation.firstOccuranceOfChar("technocredits", 'c');
			System.out.println("First occurence of the given character is: " + firstOccurence);
			System.out.println("****");
			
			int lastOccurence = returnTypeCharOperation.lastOccuranceOfChar("technocredits", 'c');
			System.out.println("Last occurence of the given character is: " + lastOccurence);
			System.out.println("****");

			boolean charCheck = returnTypeCharOperation.OccuranceOfChar("technocredits", 'd');
			System.out.println(charCheck);
			System.out.println("****");
			
			int charCount = returnTypeCharOperation.countOfChar("technocredits", 'e');
			System.out.println("Total occurence of the given character is: " + charCount);
			System.out.println("*****");
		}
	}


