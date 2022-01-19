/* Program 1 : Find second max from given array.
input : {1,11,3,99,66,54,22,44};
output : 66
 */
package monikaArkade;

public class A23_Program1 {
	int[] arr = { 1, 11, 3, 99, 66, 54, 22, 44 };
	int max = 0;
	int secondMax = 0;

	void findSecondMax(int[] input) {
		for (int index = 0; index < arr.length; index++) {
			if (max < arr[index]) {
				secondMax = max;
				max = arr[index];
			} else if (max > arr[index] && secondMax < arr[index])
				secondMax = arr[index];
		}
		System.out.println("Second Max number from array : " + secondMax);
	}

	public static void main(String[] args) {
		A23_Program1 p1 = new A23_Program1();
		int[] input = { 1, 11, 3, 99, 66, 54, 22, 44 };
		p1.findSecondMax(input);
	}
}
