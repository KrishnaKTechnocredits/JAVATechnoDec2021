package pranoti;

public class T4_P1_ArrayOperations {

	boolean findNextNumberISSquare(int[] arr) {
		boolean flag = true;
		for (int index = 0; index < arr.length - 1; index++) {
			if (arr[index] * arr[index] != arr[index + 1])
				flag = false;
		}
		return flag;
	}

	public static void main(String[] args) {
		int arr[] = { 2, 4, 16, 256 };
		T4_P1_ArrayOperations test = new T4_P1_ArrayOperations();
		boolean flag = test.findNextNumberISSquare(arr);
		if (flag == true)
			System.out.println("true");
		else
			System.out.println("flase");
	}

}
