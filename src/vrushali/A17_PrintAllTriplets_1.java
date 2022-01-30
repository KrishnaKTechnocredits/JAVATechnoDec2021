/*Program 1: Print all triplets in which all 3 numbers are consecutive.

Sample input : int[] arr = {10,13,14,15,16,19,20,22,23,24};
output : 13 -> 14 -> 15
              14 -> 15 -> 16
              22 -> 23 -> 24 */

package vrushali;

public class A17_PrintAllTriplets_1 {

	void findTriples(int[] arr) {
		boolean flag= false;
		for (int index=0; index <=arr.length-3 ; index++) {
			int num = arr[index];
			if(arr[index +1] == arr[index]+1 && arr[index +2] == arr[index]+2 ) {
				flag= true;
				System.out.println(arr[index] + "->"+ arr[index +1] + "->"+arr[index +2]);
			}
		}
	}

	public static void main(String[] args) {
		A17_PrintAllTriplets_1 printAllTriplets_1 = new A17_PrintAllTriplets_1();
		int[] arr = {10,13,14,15,16,19,20,22,23,24};
		printAllTriplets_1.findTriples(arr);
	}
}
