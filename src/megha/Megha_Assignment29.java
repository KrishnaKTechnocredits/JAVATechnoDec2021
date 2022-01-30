package megha;

public class Megha_Assignment29 {

	int sum = 0;

	void findSumOfDigitsInWordsInArray(String input) {

		String[] arr = input.split(" ");
		for (int index = 0; index < arr.length; index++) {
			try {
			sum += Integer.parseInt(arr[index]);
			}
			catch(NumberFormatException nfe) {
				
			}
		}
		System.out.println("The Sum of the digits in the String is : " + sum);
	}

	public static void main(String[] args) {
		Megha_Assignment29 megha_Assignment = new Megha_Assignment29();
		String input = "I am 15 years old and my brother is 5 years old";
		megha_Assignment.findSumOfDigitsInWordsInArray(input);
	}

}
