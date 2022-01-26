/*
Program_1_2(Optional) : 15th Jan'2022

Program 1 : Find NthMax from given array, for ex - 4th max, output will be 44.
input : {1,11,3,99,66,54,22,44};
output : 44
*/

package shivangi.Assignment23;

import java.util.Arrays;

public class A23_Program1_2 {

		int findMaxFromArray(int[] arr) {
			int max = 0;
			int tempIndex = 0;
			for(int index=0; index<=arr.length-1; index++) {
				if(arr[index] > max) {
					max = arr[index];
					tempIndex = index;
				}
			}
			arr[tempIndex] = 0;
			System.out.println(Arrays.toString(arr));
			return max;
		}
		
		int findNthMax(int[] arr, int n) {
			int output = 0;
			for(int index=1; index<=n; index++) {
				output = findMaxFromArray(arr);
			}
			return output;
		}
		
		public static void main(String[] args) {
			int[] arr = {1,11,3,99,66,54,22,44};
			A23_Program1_2 a23_2 = new A23_Program1_2();
			int finalOutput = a23_2.findNthMax(arr, 4);
			System.out.println(finalOutput);
		}
		
}
