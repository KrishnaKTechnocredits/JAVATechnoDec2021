/*Assignment -18: 5th Jan'2022
Print total Letters, Uppercase , Lowercase , Digits from given String.

Input : TE1ch2noC2red9iTs
output :  Total Letters -> 13
          Total UpperCase characters -> 4
          Total LowerCase characters -> 9
          Total Digits -> 4*/

package deepak;

public class A19_StringDetails {
	int uppperCaseCount, lowerCaseCount, digitCount;

	void stringOperation(String input) {
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isLetter(ch)) {
				if (Character.isUpperCase(ch)) {
					uppperCaseCount++;
				} else
					lowerCaseCount++;
			} else
				digitCount++;
		}
		System.out.println("Total Letters -> " + (uppperCaseCount + lowerCaseCount));
		System.out.println("Total UpperCase characters -> " + uppperCaseCount);
		System.out.println("Total LowerCase characters -> " + lowerCaseCount);
		System.out.println("Total Digits -> " + digitCount);
	}

	public static void main(String[] args) {
		A19_StringDetails stringDetails = new A19_StringDetails();
		stringDetails.stringOperation("TE1ch2noC2red9iTs");
	}
}