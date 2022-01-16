package vaishnavi;

public class Test3_PairsOfArray {

	void findPairsInArray(int num) {
		int arr[]= { 5, 1, 2, 7, 6, 3, 4, 9 };
		for(int index = 0; index < arr.length ; index++) {
			for (int index1 = 0; index1 < index; index1++) {
				if (arr[index1] + arr[index] == num) {
					System.out.println("{"+ arr[index1] +","+ arr[index]+"}");
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test3_PairsOfArray test3_PairsOfArray = new Test3_PairsOfArray();
		test3_PairsOfArray.findPairsInArray(6);
	}

}
