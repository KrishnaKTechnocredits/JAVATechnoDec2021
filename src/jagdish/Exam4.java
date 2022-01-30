package jagdish;

public class Exam4 {

	boolean checkArray(int[] number) {
		boolean flag = true;
		for (int index = 0; index < number.length - 1; index++) {
			if (number[index + 1] != number[index] * number[index]) {
				flag = false;
				break;
			}
		}
		return flag;
	}

	boolean isPrimeCheck(int number) {
		boolean flag = true;
		if (number == 1)
			return false;

		for (int index = 2; index <= number / 2; index++) {
			if (number % index == 0) {
				flag = false;
				break;
			}
		}

		return flag;
	}

	void findPrimeNuminWords(String input) {
		String[] arr = input.split(" ");
		for (int index = 0; index < arr.length; index++) {
			int length = arr[index].length();
			if (isPrimeCheck(length))
				System.out.print(arr[index] + " ");
		}
	}

	public static void main(String[] args) {
		Exam4 e4 = new Exam4();
		int[] arr1 = { 2, 4, 16, 256 }; // true
		int[] arr2 = { 2, 3, 55, 156 }; // false
		System.out.println("Output1 :- ");
		System.out.println("Output is " + e4.checkArray(arr1));
		System.out.println("Output is " + e4.checkArray(arr2));
		System.out.println();
		System.out.println("Output2 :- ");
		String word = "I love my India";
		String word1 = "I would like to have a cup of tea";
		new Exam4().findPrimeNuminWords(word);
		System.out.println();
		new Exam4().findPrimeNuminWords(word1);
	}
}
