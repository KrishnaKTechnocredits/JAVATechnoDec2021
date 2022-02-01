/*
Assignment-30 :
Program-2. WAP to find out unique elements from the given array an return in the form of an array.
Input    : {1, 9, 1, 3, 16, 3, 9, 59, 4, 4, 16}
Output : {1, 9, 3, 16, 59, 4}

Input    : {19, 8, 0, 8, 60, 56, 97, 0, 33, 60, 0}
Output : {19, 8, 0, 60, 56, 97, 33}
*/

package shivangi.Assignment30_ArrayProgram;

import java.util.Arrays;

public class A30_P2 {

	int count = 0;

	int[] printUniqueNumInArray(int[] numArr) {
		System.out.println("Input array is : " + Arrays.toString(numArr));
		count = 0;
		int[] output= new int [numArr.length];
		boolean flag=true;
		for(int index=0;index<numArr.length;index++) {
			flag=true;
			for(int innerIndex=0; innerIndex<count; innerIndex++) {
				if(numArr[index]==output[innerIndex]) {
						flag=false;
						break;
				}
			}
			if(flag == true){
				output[count]=numArr[index];
				count++;
			}

		}
		return output;
	}

	int[] removeExtraXero(int[] arr) {
		int[] output = printUniqueNumInArray(arr);
		System.out.println("Unique elements in array having zero : " + Arrays.toString(output));
		int[] finalOutputArr = new int[count];
		for (int index = 0; index < count; index++) {
			finalOutputArr[index] = output[index];
		}
		return finalOutputArr;
	}

	public static void main(String[] args) {
		A30_P2 p2 = new A30_P2();
		int[] numArr = { 1, 9, 1, 3, 16, 3, 9, 59, 4, 4, 16 };
		int[] finalOutputArr = p2.removeExtraXero(numArr);
		System.out.println("Unique elements are : " + Arrays.toString(finalOutputArr));
		System.out.println();
		System.out.println("**************-------------------------**************");
		System.out.println();
		int[] numArr2 = {19, 8, 0, 8, 60, 56, 97, 0, 33, 60, 0};
		int[] finalOutputArr2 = p2.removeExtraXero(numArr2);
		System.out.println("Unique elements are : " + Arrays.toString(finalOutputArr2));
	}
}
