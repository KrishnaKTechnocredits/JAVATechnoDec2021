/*1. How to find all pairs in an array of integers whose sum is equal to the given number
i/p  : {5,1,2,7,6,3,4,9} , sum : 6
o/p : {5,1}, {2,4}



2. WAP to print a single occurrence element from the array in Java?
i/p  : {5,8,1,2,4,3,2,1}
o/p : {5,8,4,3}
*/

package poojaJoshi;

public class Test2_Array {

	void findPair(int[] num) {

		for (int index = 0; index < num.length - 1; index++) {
			for (int index1 = 1; index1 < num.length - 1; index1++)
				if (num[index] + num[index1] == 6) {
					System.out.println(" {" + num[index] + "," + num[index1] + "}");

				}
		}
	}

	void singleElement(int[] number) {
		int count = 0;
		for (int index = 0; index < number.length; index++) {
			for (int index2 = 0; index2 < number.length; index2++) {
				if (number[index] == number[index2])
					count++;
			}
			if (count == 1) {
				System.out.println(number[index]);
			}
		}
	}

	public static void main(String[] args) {
		Test2_Array test2 = new Test2_Array();
		int[] num = { 5, 1, 2, 7, 6, 3, 4, 9 };
		int[] number = { 5, 8, 1, 2, 4, 3, 2, 1 };
		System.out.println("Output is : ");
		test2.findPair(num);
		System.out.println("single occurrence element from the array in Java is: ");
		test2.singleElement(number);
	}
}
