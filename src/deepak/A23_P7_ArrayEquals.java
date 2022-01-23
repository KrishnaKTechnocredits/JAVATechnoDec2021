/*Assignment23
	Program 7 : Verify if 2 arrays are identical.
	
	int[] arr1 = {10,44,-33};
	int[] arr2 = {10,44,-33};
	
	output : both arrays are identical.
	
	int[] arr3 = {10,44,-33};
	int[] arr4 = {10,44,-33,55};
	
	output : both arrays are not identical.
*/

package deepak;

public class A23_P7_ArrayEquals {

	static int a[] = null;

	void arrayEquals(int[] input1, int[] input2) {
		boolean flag = false;
		if (input1.length == input2.length) {
			for (int index = 0; index < input1.length; index++) {
				if (input1[index] != input2[index])
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
		A23_P7_ArrayEquals arrayEqual = new A23_P7_ArrayEquals();
		int[] input1 = { 10, 44, -33 };
		int[] input2 = { 10, 44, -33 };

		int[] input3 = { 10, 44, -33 };
		int[] input4 = { 10, 44, -33, 55 };
		arrayEqual.arrayEquals(input1, input2);
		arrayEqual.arrayEquals(input3, input4);

	}

}
