package archana;

public class Ass25_FindMissingNoFromArray {

	int findMissingnoFromArray(int arr[]) {
		int len = arr.length + 1;
		int sum = (len * (len + 1) / 2);// Sum of 1 to 10 no = 55
		for (int index = 0; index < arr.length; index++) {
			sum = sum - arr[index];		}
		return sum;
	}
	public static void main(String[] args) {
		Ass25_FindMissingNoFromArray ass25 = new Ass25_FindMissingNoFromArray();
		int arr[] = { 1, 2, 5, 10, 6, 4, 8, 7, 9 };
		int missingno = ass25.findMissingnoFromArray(arr);
		System.out.println("Missing number in array is : " + missingno);

	}
}