package vaibhav.Practice.Array;

public class TestQuestion12 {
	public static void main(String[] args) {

		int arr[] = new int[3];
		arr[0] = new int[1].length;
		arr[1] = new int[12].length;
		arr[2] = new int[3].length;
		int sum = 0;

		for (int i = 0; i < 3; i++) {
			sum += arr[i];
		}
		System.out.println(sum);
	}

}
