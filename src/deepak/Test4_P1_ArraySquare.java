/*Programming Test: 27th Jan'2022
Program - 1 : WAP to find next number in an array is square of previous number or not
Input 1: {2,4,16,256}
output 1 : true
Note: 4 is square of 2, 16 is square of 4, and so on
*/

package deepak;

public class Test4_P1_ArraySquare {
	
	boolean isSquare(int[] input) {
		boolean flag = true;
		for(int index = 0; index<input.length-1 ; index++) {
			if(input[index] != input[index+1]/(input[index])) {
					flag = false;
					break;
				}
			}
		return flag;
	}
	
	public static void main(String[] args) {
		Test4_P1_ArraySquare isSquare = new Test4_P1_ArraySquare();
		int[] input = {2,4,16,256};
		System.out.println(isSquare.isSquare(input));
	}
}
