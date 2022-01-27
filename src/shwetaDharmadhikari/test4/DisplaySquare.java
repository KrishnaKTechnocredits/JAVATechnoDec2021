/*
 * Programming Test : 27th Jan'2022

Program - 1 : WAP to find next number in an array is square of previous number or not

Input 1: {2,4,16,256}

output 1 : true

Note: 4 is square of 2, 16 is square of 4, and so on
 */
package shwetaDharmadhikari.test4;

public class DisplaySquare {

	boolean findSquareNumber(int[] input) {
		int count = 0;
		for (int index = 0; index < input.length-1; index++) {
			if ((input[index + 1] == (input[index] * input[index])))
				count++;
		}
		if (count == input.length - 1)
			return true;
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 4, 16, 256 };
		System.out.println("Output: " + new DisplaySquare().findSquareNumber(arr));
	}

}
