package jagdish;

public class A29_Assignment {

	void sumOfNumbersfromString(String input) {
		String[] output = input.split(" ");
		int sum = 0;
		for (int index = 0; index < output.length; index++) {
			try {
				sum = sum + Integer.parseInt(output[index]);
			} catch (NumberFormatException nf) {
				// System.out.println("Catch");
			}
		}

		System.out.println("The Expected sum is: " + sum);
	}

	public static void main(String[] args) {
		A29_Assignment assign29 = new A29_Assignment();
		String str = "I have 15 years and 3 months of automation experience";
		System.out.println("Input:- " + str);
		assign29.sumOfNumbersfromString(str);
	}
}
