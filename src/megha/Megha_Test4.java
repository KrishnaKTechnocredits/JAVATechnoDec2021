package megha;

public class Megha_Test4 {

	void findIfNumIsSquareInArray(int[] arr) {
		int cnt = 0;
		for (int index = 0; index < arr.length - 1; index++) {
			if (arr[index] * arr[index] == arr[index + 1])
				cnt++;
		}

		if (cnt == arr.length - 1)
			System.out.println("True");
		else 
			System.out.println("False");
	}

	void findPrimeNumWords(String input) {
		String[] arr = input.split(" ");
		for (int index = 0; index < arr.length; index++) {
			int wordLength = arr[index].length();
			if (isPrime(wordLength))
				System.out.print(arr[index] + " ");
		}
	}

	boolean isPrime(int num) {
		boolean flag = true;
		if (num == 1)
			return false;

		for (int index = 2; index <= num / 2; index++) {
			if (num % index == 0) {
				flag = false;
				break;
			}
		}

		return flag;
	}

	public static void main(String[] args) {
		Megha_Test4 megha_Test = new Megha_Test4();
		System.out.println("Output of Program 1 :");
		int[] arr = { 2, 4, 16, 256};
		megha_Test.findIfNumIsSquareInArray(arr);
		System.out.println();
		System.out.println("Output of Program 2 :");
		String input = "I love my India";
		megha_Test.findPrimeNumWords(input);
		System.out.println();
		System.out.println();
		System.out.println("Second Output of Program 2 :");
		String input1 = "I would like to have a cup of tea";
		new Megha_Test4().findPrimeNumWords(input1);

	}

}
