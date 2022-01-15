package sham;

public class Test2_FindPaires {

	void findPairesofSum(int arr[]) {
		System.out.println("Paires of sum 6 are below: ");
		for (int i = 0; i < arr.length - 2; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] + arr[j] == 6) {
					System.out.println(arr[i] + "->" + arr[j]);
				}
			}
		}
	}

	public static void main(String[] args) {
		Test2_FindPaires findPaire = new Test2_FindPaires();
		int[] arr = { 5, 1, 2, 7, 6, 3, 4, 9 };
		findPaire.findPairesofSum(arr);

	}

}
