package technocredits;

import java.util.Arrays;

public class UniqueArrayElements {

	private int tempIndex = 0;
	
	void filterUniqueNos(int[] input, int[] output) {
		for(int index=0;index<input.length;index++) {
			boolean flag = true;
			for(int innerIndex=0;innerIndex<output.length;innerIndex++) {
				if(input[index] == output[innerIndex]) {
					flag = false;
					break;
				}
			}
			if(flag) {
				output[tempIndex] = input[index];
				tempIndex++;
			}
		}
	}
	
	void printArrayUniqueNos(int[] input1, int[] input2) {
		int[] output = new int[input1.length + input2.length];
		filterUniqueNos(input1, output);
		filterUniqueNos(input2, output);
		
		int[] finalOutput = new int[tempIndex];
		for(int index=0;index<finalOutput.length;index++) {
			finalOutput[index] = output[index];
		}
		
		System.out.println(Arrays.toString(finalOutput));
	}
	
	public static void main(String[] args) {
		int[] arr1 = {1,3,5,3};
		int[] arr2 = {5,7,1,9,8,9};
		// 1,3,5,7,9,8
		new UniqueArrayElements().printArrayUniqueNos(arr1, arr2);
	}
}
