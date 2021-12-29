package vaishnavi;

	public class A11_ReturnMethod {
		
		int firstOccuranceOfCharInString(String name, char ch) {
			int charIndex = -1;
			for (int index = 0; index < name.length(); index++) {
				if (name.charAt(index) == ch) {
					charIndex = index + 1;
					break;
				}
			}
			return charIndex;
		}

		int lastOccuranceOfCharInString(String name, char ch) {
			int charIndex = -1;
			for (int index = name.length() - 1; index > 0; index--) {
				if (name.charAt(index) == ch) {
					charIndex = index + 1;
					break;
				}
			}
			return charIndex;
		}

		boolean isCharFoundOrNot(String input, char ch) {
			boolean charFound = false;
			for (int index = 0; index < input.length(); index++) {
				if (input.charAt(index) == ch) {
					charFound = true;
				}
			}
			return charFound;
		}

		int totalOccuranceOfCharInString(String name, char ch) {
			int count = 0;
			for (int index = 0; index < name.length(); index++) {
				if (name.charAt(index) == ch) {
					count++;
				}
			}
			return count;
		}

		public static void main(String[] args) {
			A11_ReturnMethod a11_ReturnMethod = new A11_ReturnMethod();
			int firstOccurence = a11_ReturnMethod.firstOccuranceOfCharInString("Vaishnavi", 'a');
			System.out.println("First occurence of character is: " + firstOccurence);
		

			int lastOccurence = a11_ReturnMethod.lastOccuranceOfCharInString("Vaishnavi", 'i');
			System.out.println("Last occurence of the given character is: " + lastOccurence);
			

			boolean charSearch = a11_ReturnMethod.isCharFoundOrNot("Vaishnavi", 's');
			System.out.println(charSearch);
			

			int charCount = a11_ReturnMethod.totalOccuranceOfCharInString("Vaishnavi", 'i');
			System.out.println("Total occurence of the given character is: " + charCount);
			
		}
	}