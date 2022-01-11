package jagdish;

public class Exam2_Jagdish {

	/*
	 * *2. WAP to print a single occurrence element from the array in Java?* i/p :
	 * {5,8,1,2,4,3,2,1} o/p : {5,8,4,3}
	 */
	void SingleOccurance(int[] input) {

		System.out.println("The single occurrence element from the array is:- ");
		for (int index = 0; index < input.length; index++) {
			int count = 0;

			for (int innerloop = 0; innerloop < input.length; innerloop++) {
				if (input[index] == input[innerloop])
					count++;
			}
			if (count == 1) {
				System.out.print(input[index]);
			}
		}
	}

	/*
	 * How to find all pairs in an array of integers whose sum is equal to the given
	 * number
	 */
	void displayEqualno(int[] arr, int total) {
		System.out.println("All pairs in an array of integers whose sum is equal to the given number is:- ");
		for (int index = 0; index < arr.length; index++) {
			for (int innerloop = index + 1; innerloop < arr.length; innerloop++) {
				if ((arr[index] + arr[innerloop]) == total)
					System.out.println(arr[index] + "," + arr[innerloop]);
			}
		}
	}

	public static void main(String[] args) {
		Exam2_Jagdish singleoccurance = new Exam2_Jagdish();
		int number[] = { 5, 8, 1, 2, 4, 3, 2, 1 };
		singleoccurance.SingleOccurance(number);
		System.out.println("");
		System.out.println("");
		int number1[] = { 5, 1, 2, 7, 6, 3, 4, 9 };
		singleoccurance.displayEqualno(number1, 6);
	}
}
