/* 2. WAP to find out unique elements from the given array an return in the form of an array.
Input    : {1, 9, 1, 3, 16, 3, 9, 59, 4, 4, 16}
Output : {1, 9, 3, 16, 59, 4}

Input    : {19, 8, 0, 8, 60, 56, 97, 0, 33, 60, 0}
Output : {19, 8, 0, 60, 56, 97, 33}
 */

package shwetaDharmadhikari.Assignment30;

public class DisplayUniqueElement {

	void findUniqueElements(int[] input) {
		// int[] output=new int[input.length]; int count=0;boolean flag=false;
		for (int index = 0; index < input.length; index++) {

			int innerIndex;
			for (innerIndex = 0; innerIndex < index; innerIndex++) {
				if (input[index] == input[innerIndex])
					break;
			}
			if (index == innerIndex)
				System.out.print(input[index] + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = { 19, 8, 0, 8, 60, 56, 97, 0, 33, 60, 0 };
		DisplayUniqueElement displayUniqueElement = new DisplayUniqueElement();
		displayUniqueElement.findUniqueElements(input);

	}

}
