/* Assignment - 17 : 1st Jan'2022
 * 
Program 1: Print all triplets in which all 3 numbers are consecutive.

Sample input : int[] arr = {10,13,14,15,16,19,20,22,23,24};
output : 13 -> 14 -> 15
              14 -> 15 -> 16
              22 -> 23 -> 24 

 */

package vaibhav.Practice.Assignment_17;

public class Program1_PrintTriplets {

	void printTriplets(int[] arr) {
		int x, y, z;
		int count = 0;

		System.out.println("Triplets form the given array are as below :");
		for (int index = 0; index < arr.length - 2; index++) {
			x = arr[index];
			y = arr[index + 1];
			z = arr[index + 2];
			if ((y == x + 1) && (z == y + 1)) {
				count++;
				System.out.println(x + " --> " + y + " --> " + z);
			}
		}
		if (count == 0)
			System.out.println("There are no any triplets found in the given array.");
		else 
			System.out.println("In the given array we have total "+ count + " triplets ");
	}

	public static void main(String[] args) {
		Program1_PrintTriplets program1_PrintTriplets = new Program1_PrintTriplets();
		int[] inputArr = { 10, 13, 14, 15, 16, 19, 20, 22, 23, 24 };
		program1_PrintTriplets.printTriplets(inputArr);
	}

}
