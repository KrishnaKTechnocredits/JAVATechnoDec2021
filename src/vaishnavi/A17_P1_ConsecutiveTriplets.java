package vaishnavi;

public class A17_P1_ConsecutiveTriplets {
	
	void printConsecutiveTriplets(int[] arr) {
		for(int index = 0; index < arr.length - 2; index++) {
			if(arr[index] == (arr[index+1]-1) && arr[index] == (arr[index+2] -2)){
				System.out.println(arr[index] + " --> " + (arr[index+1]) + " --> " + (arr[index+2]));
			}
		}
	}
	public static void main(String[] args) {
		A17_P1_ConsecutiveTriplets a17_P1_ConsecutiveTriplets = new A17_P1_ConsecutiveTriplets();
		int[] arr = {10, 13, 14, 15, 16, 19, 20, 22, 23, 24};
		System.out.println(" 3 consecutive triplets are : " );
		a17_P1_ConsecutiveTriplets.printConsecutiveTriplets(arr);

	}

}
