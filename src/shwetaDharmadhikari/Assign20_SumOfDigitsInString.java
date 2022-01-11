/*Assignment - 20 : 06th Jan'2022
 * Find sum of all the digits in a given string
String str = "Tech1credi2ts"
 */
package shwetaDharmadhikari;

public class Assign20_SumOfDigitsInString {

	int getSumOfDigits(String input) {
		int sum = 0;
		for (int index = 0; index < input.length(); index++) {
			if (Character.isDigit(input.charAt(index))) {
				sum += Character.getNumericValue(input.charAt(index));
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Tech1credi2ts";
		Assign20_SumOfDigitsInString assign20_SumOfDigitsInString = new Assign20_SumOfDigitsInString();
		System.out.println("sum of all the digits in a given string is : " + assign20_SumOfDigitsInString.getSumOfDigits(str));
	}

}
