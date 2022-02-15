//sum of all numbers in a given statement.
package pradeep.ProgTest6;

public class Program3 {

	static void printSumOfAllNumInGivenStatement(String input) {
		int sum = 0;
		String[] arr = input.split(" ");

		for (int index = 0; index < arr.length; index++) {
			String str = arr[index];
			try {
				sum = sum + Integer.parseInt(str);
			} catch (Exception e) {

			}
		}
		System.out.println("Sum of All Number in Given Statement is: " + sum);
	}

	public static void main(String[] args) {
		String input = "10 10 20 30";
		printSumOfAllNumInGivenStatement(input);
	}

}
