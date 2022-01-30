package priyankaKamble.assignment_29;
/*Assignment 29 : 25th Jan'2022

WAP to find out the total sum of all the numbers present in the given string without using Character class method.
Input    : I have 15 years and 3 months of automation experience
Output : Expected Sum  = 8

Hint      : Using exception handling (i.e. try catch block). 
*/

public class AdditionWithException {

	int findDigit(String input) {
		String[] strArr = input.trim().split(" ");
		int sum = 0;
			for (int index = 0; index < strArr.length; index++) {
				try {
					sum = sum + Integer.parseInt(strArr[index]);
				}
				catch (Exception re) {
				}
			}
		//System.out.println("Sum = >" +sum);
		return sum;
	}

	public static void main(String[] args) {
		AdditionWithException exception = new AdditionWithException();
		String input = "I have 15 years and 3 months of automation experience";
		System.out.println("Input String => " + input);
		System.out.println("Expected Sum => " + exception.findDigit(input));
	}
}
