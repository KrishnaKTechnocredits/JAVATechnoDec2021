package nehaPandey;

public class Assignment29_Exception_Handling {

	void findSumOfDigitFromString(String str) {
		int sum = 0;
		String[] arr = str.split(" ");
		for (int index = 0; index < arr.length; index++) {
			try {
				int num = Integer.parseInt(arr[index]);
				sum = sum + num;
			} catch (NumberFormatException ne) {

			}
		}
		System.out.println("Sum of digits in string: " + sum);

	}

	public static void main(String[] args) {
		Assignment29_Exception_Handling a29 = new Assignment29_Exception_Handling();
		String input = "I have 15 years and 3 months of automation experience";
		a29.findSumOfDigitFromString(input);
	}

}
