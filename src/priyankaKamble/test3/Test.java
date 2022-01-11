package priyankaKamble.test3;

import java.util.Arrays;

/*
1. How to find all pairs in an array of integers whose sum is equal to the given number
i/p  : {5,1,2,7,6,3,4,9} , sum : 6
o/p : {5,1}, {2,4}*/

public class Test {
	
	void findDigitPair(int[] arr, int sum){
		for(int index=0; index <arr.length; index++) {
			for(int innerIndex =1 ; innerIndex <arr.length; innerIndex++) {
				if(arr[index] < sum && arr[index] != arr[innerIndex]) {
					if(arr[index] + arr[innerIndex] == 6)
						System.out.println("Digits whoes sum is "+sum +" are = "  +arr[index] +" & "+arr[innerIndex]);
				}
			}
		}
	}

	public static void main(String[] args) {
		Test test = new Test();
		int[] arr = {5,1,2,7,6,3,4,9};
		System.out.println("input Array = "+ Arrays.toString(arr));
		int sum = 6;
		test.findDigitPair(arr, sum);
	} 
}
