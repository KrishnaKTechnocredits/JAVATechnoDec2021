package swati;

public class A29_CountNumber {


	int findNumber(String str) {
		String[] input = str.split(" ");
		int sum = 0;
		for (String word : input) {
			try {
				int num = Integer.parseInt(word);
				sum = sum + num;
			} catch (NumberFormatException e) {

			}

		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A29_CountNumber a29 = new A29_CountNumber();
		String str = "I have 15 years and 3 months of automation experience";
		int sum = a29.findNumber(str);
		System.out.println("Sum is " + sum);

	}

}
