package naquibalam;

public class Test2_Array {

	void getAddingCombination(int[] arr, int sum) {
		for (int i=0; i<arr.length; i++) {
			boolean sumFound = false; 
			for (int j=0; j<arr.length; j++) {
				if (((arr[i] + arr[j]) == sum) && (i != j) && (i <= j)) {
					sumFound = true;
					System.out.println(arr[i] + "," + arr[j]);
				}	
			}
		}
	}
	
	
	void getArrayUnique(int[] arr) {	
		for (int i=0; i<arr.length; i++) {
			boolean uniqueFound = false; 
			for (int j=0; j<arr.length; j++) {
				if ((arr[i] == arr[j]) && (i != j)) {
					uniqueFound = true;
				}	
			}
			if (uniqueFound == false) {
				System.out.print(arr[i] + " ");
			}
		}
	}
	public static void main(String[] args) {
		Test2_Array test2_Array = new Test2_Array();
		int[] arr = {5,8,1,2,4,3,2,1};
		int[] arr2 = {5,1,2,7,6,3,4,9};
		System.out.println("All unique values from the given array are : ");
		test2_Array.getArrayUnique(arr);
		System.out.println("");
		System.out.println("\n\nAll combination that give sum as 6 are given below : ");
		test2_Array.getAddingCombination(arr2, 6);
	}
}
