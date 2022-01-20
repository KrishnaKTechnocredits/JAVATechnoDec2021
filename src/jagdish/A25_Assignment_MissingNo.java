package jagdish;
/*Program 1 : Find the single missing number from the array.
int num[] = { 1, 2, 8, 10, 9, 5, 7, 6, 4 };
output: 3*/

public class A25_Assignment_MissingNo {

	int findMissingno(int arr[]) {

		int len = arr.length + 1;
		int sum = (len * (len + 1) / 2);
		for (int index = 0; index < arr.length; index++) {
			sum = sum - arr[index];
		}

		return sum;
	}

	public static void main(String[] args) {
		A25_Assignment_MissingNo ass25 = new A25_Assignment_MissingNo();
		int arr[] = { 3, 2, 5, 10, 6, 4, 8, 7, 9 };
		System.out.println("The missing no is " + ass25.findMissingno(arr));
	}
}
