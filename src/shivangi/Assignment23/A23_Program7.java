/*
Program 7 : Verify if 2 arrays are identical.

int[] arr1 = {10,44,-33};
int[] arr2 = {10,44,-33};
output : both arrays are identical.

int[] arr3 = {10,44,-33};
int[] arr4 = {10,44,-33,55};
output : both arrays are not identical.
*/

package shivangi.Assignment23;

public class A23_Program7 {
	
	void checkArrayIdentical(int arr1[], int arr2[]) {
		
		boolean flag = false;
		if (arr1.length == arr2.length) {
			for (int index = 0; index < arr2.length; index++) {
				if (arr1[index] != arr2[index])
					flag = true;
			}
			if (flag == false)
				System.out.println("Both Arrays are identical");
			else
				System.out.println("Both Arrays are not identical");

		} else
			System.out.println("Both Arrays are not identical");
	}


	public static void main(String[] args) {
		A23_Program7 p7_1 = new A23_Program7();
		int[] arr1 = { 10, 44, -33};
		int[] arr2 = { 10, 44, -33 };
		p7_1.checkArrayIdentical(arr1, arr2);

		
		int[] arr5 = { 10, 44, 33};
		int[] arr6 = { 10, 44, -33 };
		p7_1.checkArrayIdentical(arr5, arr6);
	}
}
