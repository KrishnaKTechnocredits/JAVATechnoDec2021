/*
Program 2 : Find sum of numbers from given string.
input : te12ch22nocre3dits4
output : 12 + 22 + 3 + 4 = 41
*/

package shivangi.Assignment23;

public class A23_Program2 {
	
	void findSumStringFromString(String input) {
		int sum = 0;
		String temp = "";
		for(int index=0; index<=input.length()-1; index++) {
			char ch = input.charAt(index);
			if(Character.isDigit(ch)) {
				temp = temp + ch;
			}else if(temp.length()>0) {
				sum = sum + Integer.parseInt(temp);
				temp = "" ;
			}
		}
		if(temp.length()>0) {
			sum = sum + Integer.parseInt(temp);
			temp = "" ;
		}
		System.out.println("Sum of number is : " + sum);
	}
	
	public static void main(String[] args) {
		A23_Program2 p2 = new A23_Program2();
		p2.findSumStringFromString("te12ch22nocre3dits4");
	}
}
