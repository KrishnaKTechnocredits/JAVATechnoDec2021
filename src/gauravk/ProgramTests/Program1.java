package gauravk.ProgramTests;

import java.util.Arrays;

/*
 * Programming Test : 27th Jan'2022

Program - 1 : WAP to find next number in an array is square of previous number or not

Input 1: {2,4,16,256}

output 1 : true

Note: 4 is square of 2, 16 is square of 4, and so on

 */
public class Program1 {
	
	boolean sequentialSquareQualification(int[] arr) {
		boolean result=true;
		
		
		for(int j=0; j<arr.length-1; j++) {
			if(arr[j+1]!=arr[j]*arr[j]) {
				result=false;
				break;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		Program1 p1 = new Program1();
		int[] inputArray = {2,4,16,256};
		int[] inputArray2 = {2,4,16,257};
		System.out.println("Sequential square qualification for "+Arrays.toString(inputArray)+" is "+p1.sequentialSquareQualification(inputArray));
		System.out.println("Sequential square qualification for "+Arrays.toString(inputArray2)+" is "+p1.sequentialSquareQualification(inputArray2));
	}
}
