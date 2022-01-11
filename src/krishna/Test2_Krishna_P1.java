package krishna;

public class Test2_Krishna_P1 {

	int sum = 6;

	void find_ArrayPairs(int arr[], int n) {

		for (int i = 0; i < n; i++)
			for (int j = i + 1; j < n; j++)
				if (arr[i] + arr[j] == sum)
					System.out.print(" {" + arr[i] + " , " + arr[j] + "},");
	}

	void findSingleoccurance(int arr1[], int m) {
		int count = 0;
		int temp = 0;
		int i = 0;
		for (; i < m; i++) {
			int j = 0;
			for (; j < m; j++) {
				if (i == j) {
					continue;
				}
				if (arr1[i] == arr1[j]) {
					break;
				}
				
			}
			if (j == arr1.length) {
                System.out.println(" ");
				System.out.print(arr1[i]);
				
			}
		}
		

	}

	public static void main(String[] args) {
		Test2_Krishna_P1 tst2 = new Test2_Krishna_P1();
		int arr[] = { 5, 1, 2, 7, 6, 3, 4, 9 };
		int n = arr.length;
		tst2.find_ArrayPairs(arr, n);

		int arr1[] = { 5, 8, 1, 2, 4, 3, 2, 1 };
		int m = arr1.length;
		tst2.findSingleoccurance(arr1, m);
	}

}
