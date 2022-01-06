/*Assignment -18: 5th Jan'2022
Print total Letters, Uppercase , Lowercase , Digits from given String.

Input : TE1ch2noC2red9iTs
output :  Total Letters -> 13
          Total UpperCase characters -> 4
          Total LowerCase characters -> 9
          Total Digits -> 4*/

package deepak;

public class A20_StringDigitsSum {
	int digitCount;

	void stringOperation(String input) {
		int sum = 0;
		for(int index = 0 ; index <input.length() ; index++) {
			char ch = input.charAt(index);
			if(Character.isDigit(ch)) {
				int num = Character.getNumericValue(ch);
				sum = sum + num;
			}
		}
		System.out.println("Sum of digits in the given string is: "+sum);
	}

	public static void main(String[] args) {
		A20_StringDigitsSum stringDetails = new A20_StringDigitsSum();
		stringDetails.stringOperation("TE1ch2noC2red9iTs");
	}

}
