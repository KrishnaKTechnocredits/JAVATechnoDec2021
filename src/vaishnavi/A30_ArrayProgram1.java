package vaishnavi;

	import java.util.Arrays;

	public class A30_ArrayProgram1 {
		void shiftAllZeroAfterNonZeroElements(int[] arr) {
			System.out.println("Input is : " + Arrays.toString(arr));
			int count = 0;
			int[] outputArr = new int[arr.length];
		
			for(int index=0; index<=arr.length-1; index++) {

				if(arr[index]!=0) {
					outputArr[count] = arr[index];
					count++;
				}
			}
			System.out.println("output is : " + Arrays.toString(outputArr));
		}

		public static void main(String[] args) {
			int[] arr = {1, 0, 2, 0, 9, 6, 0, 19, 20, 0};
			A30_ArrayProgram1 a30_ArrayProgram1 = new A30_ArrayProgram1();
			a30_ArrayProgram1.shiftAllZeroAfterNonZeroElements(arr);
		}


}
