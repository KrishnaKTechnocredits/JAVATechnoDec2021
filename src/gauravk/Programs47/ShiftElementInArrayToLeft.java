package gauravk.Programs47;
import java.util.Arrays;

/*
 * 15.Write a program on array which shift element by
i/p : {5,1,2,7,6,3,4,9}
o/p : {1,2,7,6,3,4,9,5}

 */
public class ShiftElementInArrayToLeft {
	
	int[] shiftElementToLeftByOnePlace(int[] arr) {
		int[] result = new int[arr.length];
		for(int i=0,j=i+1; j<arr.length; i++,j++) {
			result[i]=arr[j];
		}
		result[arr.length-1]=arr[0];
		return result;
	}
		
	public static void main(String[] args) {
		int[] input = {5,1,2,7,6,3,4,9};
		ShiftElementInArrayToLeft shiftToLeft = new ShiftElementInArrayToLeft();
		System.out.println("Input: "+Arrays.toString(input)+"\nOutput: "+Arrays.toString(shiftToLeft.shiftElementToLeftByOnePlace(input)));
	}
}
