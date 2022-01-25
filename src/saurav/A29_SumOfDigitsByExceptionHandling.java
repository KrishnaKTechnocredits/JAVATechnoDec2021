package saurav;

public class A29_SumOfDigitsByExceptionHandling {

	void display(String input) {
		int sum = 0;
		String[] str = input.split(" ");

		for (int index = 0; index < str.length; index++) {
			try {
				int num = Integer.parseInt(str[index]);
				sum = sum + num;
			} catch (NumberFormatException ne) {
				// handled
			}
		}
		System.out.println("Sum : " + sum);
	}

	public static void main(String[] a) {
		A29_SumOfDigitsByExceptionHandling assignment29 = new A29_SumOfDigitsByExceptionHandling();
		assignment29.display("I have 15 years and 3 months of automation exp");
	}
}
