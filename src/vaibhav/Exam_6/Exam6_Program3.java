/* Programming Test - 6 : 10th Feb'2022
 
3. sum of all numbers in a given statement.
input = "10 10 20 30";
output : 70

*/

package vaibhav.Exam_6;

public class Exam6_Program3 {

	int getSumOfNumbers(String input) {
		String[] strArr = input.split(" ");
		int sum = 0;

		for (String str : strArr) {
			try {
				sum = sum + Integer.parseInt(str);
			} catch (NumberFormatException ne) {

			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Exam6_Program3 exam6_Program3 = new Exam6_Program3();
		String input = "10 10 20 30";
		System.out.println("Input String 			: " + input);
		System.out.println("Expected Sum of all numbers	: " + exam6_Program3.getSumOfNumbers(input));
	}

}
