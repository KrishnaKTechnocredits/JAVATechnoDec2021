/*Program 1 : Find second max from given array.
input : {1,11,3,99,66,54,22,44};
output : 66
*/
package pallavi;

public class A23_FindNthMax {

	void nthMaxInArray(int[] input, int nthMax) {

		for (int index = 0; index < input.length; index++) {
			int count = 0;

			for (int innerIndex = 0; innerIndex < input.length; innerIndex++) {
				if (input[index] < input[innerIndex])
					count++;
			}

			if (count == nthMax - 1) {
				System.out.println(input[index]);
				break;
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 3, 99, -66, 54, 22, 44 };
		int nthMax = 4;
		new A23_FindNthMax().nthMaxInArray(arr, nthMax);
		;
	}

}
