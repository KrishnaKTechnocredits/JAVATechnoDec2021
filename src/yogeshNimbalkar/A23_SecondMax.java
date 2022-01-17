package yogeshNimbalkar;

import java.util.Arrays;

// find second maximum from given array
public class A23_SecondMax {

	// Approach -1
	int getSecondMaxNo(int[] arr) {
		int max, smax;
		if(arr[0] > arr[1]) {
			max = arr[0];
			smax = arr[1];
		}else {
			max = arr[1];
			smax = arr[0];
		}
		for(int index=2; index<arr.length; index++) {
			if(max<arr[index]) {
				smax = max;
				max = arr[index];
			}else if(max > arr[index] && smax < arr[index]) {
				smax = arr[index];
			}
		}
		return smax;
	}
	
	//Approach - 2
	 int getSecondMaxNo1(int[] arr) {
		 Arrays.sort(arr);
		 return arr[arr.length - 2];
	 }
	 
	public static void main(String[] args) {
		A23_SecondMax secondmax = new A23_SecondMax();
		int[] input = {-1,-11,3,-99,-66,-54,-22,-44};
		System.out.println("Second maximum number from given array is : " + secondmax.getSecondMaxNo(input));
		System.out.println("Second maximum number from given array is : " + secondmax.getSecondMaxNo1(input));
	}
}
