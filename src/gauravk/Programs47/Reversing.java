package gauravk.Programs47;
import java.util.Arrays;

/*
 *  Reverse all numbers in a given array.
Input : {471, 443, 749}
Output : {174, 344, 947}
 */
public class Reversing {
	
	static int numericReverse(int num) {
		int result=0;
		for(;num!=0;num/=10) {
			int dig = num%10;
			result = result*10+dig;
		}
		return result;
	}
	
	static int[] iteratingArray(int[] arr) {
		int[] resultingArray = new int[arr.length];
		for(int i=0; i<arr.length; i++) {
			resultingArray[i] = numericReverse(arr[i]);
		}
		return resultingArray;
	}
		
	public static void main(String[] args) {
		int[] input = {471, 443, 749};
		System.out.println("Reverse of "+Arrays.toString(input)+" is "+Arrays.toString(iteratingArray(input)));
	}
}
