/*	 1. How to find all pairs in an array of integers whose sum is equal to the given number
i/p  : {5,1,2,7,6,3,4,9} , sum : 6
o/p : {5,1}, {2,4}   */

package amruta.Test_3_4;

class Test3 {

	void pairsOfInt(int[] arr) {
		int sum = 6;
		System.out.println("Pairs in an array of integers whose sum is equal to 6 : ");

		for (int index = 0; index < arr.length - 1; index++) {

			for (int innerindex = index; innerindex < arr.length - 1; innerindex++) {

				if (arr[index] != arr[innerindex]) {
					if (arr[index] + arr[innerindex] == sum) {
						System.out.println(arr[index] + "," + arr[innerindex]);
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		Test3 test = new Test3();
		int[] input = { 5, 1, 2, 7, 6, 3, 4, 9 };
		test.pairsOfInt(input);
	}
}
