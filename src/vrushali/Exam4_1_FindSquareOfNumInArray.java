/*Program - 1 : WAP to find next number in an array is square of previous number or not
Input 1: {2,4,16,256}
output 1 : true
Note: 4 is square of 2, 16 is square of 4, and so on
*/
package vrushali;

public class Exam4_1_FindSquareOfNumInArray {
	
	boolean checkNextNumInArrayIsSquareOfPrevNum(int[] num) {
		int squareOfNum = 0;
		boolean flag = true;
		
		for(int index = 0; index < num.length-1; index++) {
			int firstNum = num[index];
			int nextNum = num[index+1];
			
			squareOfNum = firstNum*firstNum;
			System.out.println("Square of " + num[index] + "-> " +squareOfNum);
			if(nextNum == squareOfNum) {
				flag = true;
			}
			else {
				flag=false;
				break;
			}		
		}
		return flag;	
	}
	
	public static void main(String[] args) {
		Exam4_1_FindSquareOfNumInArray findSquareOfNumInArray = new Exam4_1_FindSquareOfNumInArray();
		int[] numArr = {2,4,16,256};
		boolean b = findSquareOfNumInArray.checkNextNumInArrayIsSquareOfPrevNum(numArr);
		System.out.println("In Given array next number is square of previous number -> " + b);
		
		
	}
}
