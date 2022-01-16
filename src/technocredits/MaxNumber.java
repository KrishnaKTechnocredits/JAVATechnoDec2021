package technocredits;

import java.util.Arrays;

public class MaxNumber {

	int minNumber = 0;
	void findMinNumber(int[] arr){
		
		for(int index=0;index<arr.length;index++) {
			if(minNumber > arr[index])
				minNumber = arr[index];
		}
		minNumber--;
	}
	
	int findMax(int[] arr) {
		int max = 0;
		int tempIndex = 0;
		for(int index=0;index<arr.length;index++) {
			if(max < arr[index]) {
				max = arr[index];
				tempIndex = index;
			}
		}
		arr[tempIndex] = minNumber;
		return max;
	}
	
	void printNthMax(int[] input,int n) {
		int ans = 0;
		findMinNumber(input);
		for(int index = 1; index<=n; index++) {
			ans = findMax(input);
		}
		System.out.println(ans);
	}
	
	public static void main(String[] args) {
		MaxNumber maxNumber = new MaxNumber();
		int[] input = {-10,-23,-9,-99,-54,-56,-78,-23,-11,-2};
		maxNumber.printNthMax(input, 3);
	}
}
