/*WAP to find out the total sum of all the numbers present in the given string without using Character class method.
Input    : I have 15 years and 3 months of automation experience
Output : Expected Sum  = 8
Hint: Using exception handling (i.e. try catch block).*/

package vrushali;

public class A29_SumOfAllNumTryCatch {

	void SumOfNumbersUsingException(String input) {
		String[] str = input.split(" ");
		int sum = 0;
		for (int index = 0; index < str.length; index++) {
			try {
				sum = sum + Integer.parseInt(str[index]);
			} catch (NumberFormatException e) {

			}
		}
		System.out.println("Sum = " + sum);
	}

	public static void main(String[] args) {
		A29_SumOfAllNumTryCatch A29_SumOfAllNumTryCatch = new A29_SumOfAllNumTryCatch();
		String input = "I have 15 years and 3 months of automation experience";
		A29_SumOfAllNumTryCatch.SumOfNumbersUsingException(input);
	}
}
