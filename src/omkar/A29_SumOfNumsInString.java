package omkar;

public class A29_SumOfNumsInString {
	int findSumOfNumsInString(String input) {
		String[] temp = input.split(" ");
		int sum = 0;
		for (int i = 0; i < temp.length; i++) {
			try {
				int num = Integer.parseInt(temp[i]);
				sum = sum + num;
			} catch (NumberFormatException ae) {

			}
		}
		return sum;
	}

	public static void main(String[] args) {
		String input = "I have 15 years and 3 months of automation experience";
		System.out.println(new A29_SumOfNumsInString().findSumOfNumsInString(input));
	}

}
