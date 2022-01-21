/*
Assignment-23 : 15th Jan'2022

Program 1 : Find second max from given array.
input : {1,11,3,99,66,54,22,44};
output : 66
*/

package shivangi.Assignment23;

import java.util.Arrays;

public class A23_Program1 {

		void findSecondMaxFromArray(int[] arr) {
			int max = 0;
			int secondMax = 0;
			if(arr[0] > arr[1]) {
				max = arr[0];
				secondMax = arr[1];
			}else {
				max = arr[1];
				secondMax = arr[0];
			}
			
			for(int index=0; index<=arr.length-1; index++) {
				if(max<arr[index]) {
					secondMax = max;
					max = arr[index];
				}else if(max>arr[index] && secondMax<arr[index]) {
					secondMax = arr[index];
				}
			}
			System.out.println("Max number is : " + max);
			System.out.println("Second max number is : " + secondMax);
		}
		
		//Find second max using sorting
		void findNthMaxUsingSorting(int[] arr, int n) {
			Arrays.sort(arr); //length is 8 means(0 to 7)
			System.out.println(Arrays.toString(arr));
			for(int index=0; index<=arr.length-1; index++) {
				System.out.println(n + " max is using sorting method : " + arr[arr.length-n]); //(8-2 = 6) for 2nd index
				break;
			}
		}
		
		//Find second max using 2 for loop
		void findSecondMaxArray(int arr[]) {
			for (int index = 0; index < arr.length; index++) {
				int count = 0;
				for (int innerIndex = 0; innerIndex <= arr.length-1; innerIndex++) {
					if (arr[index] < arr[innerIndex]) {
						count++;
					}
				}
				if (count == 1) {
					System.out.println("Second max using 2 for loop by comparing count : " + arr[index]);
				}
				count = 0;
			}
		}
		
		public static void main(String[] args) {
			int[] arr = {1,11,3,99,66,54,22,44};
			A23_Program1 a23 = new A23_Program1();
			a23.findSecondMaxFromArray(arr);
			
			System.out.println();
			//To second max by sorting (if sorting allowed)
			a23.findNthMaxUsingSorting(arr, 2);
			
			System.out.println();
			a23.findSecondMaxArray(arr);
		}
		
}
