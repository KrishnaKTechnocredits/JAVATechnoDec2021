package pradeep;

public class A29_ExceptionHand {

	void printSumOfNumInString(String input) {
		int sum = 0;
		String[] arr = input.split(" ");
		for (int index = 0; index < arr.length; index++) {
			try {
				int temp = Integer.parseInt(arr[index]);
				sum = sum + temp;
			} catch (NumberFormatException ae) {

			}
		}
		System.out.println("Sum of integer is: " + sum);
	}

	public static void main(String[] args) {
		A29_ExceptionHand a29_ExceptionHand = new A29_ExceptionHand();
		String input = "Input : I have 15 years and 3 months 9 of automation experience";
		a29_ExceptionHand.printSumOfNumInString(input);
	}
}
