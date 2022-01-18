package nishika;

		/*  Program 2 : Find sum of numbers from given string.
		input : te12ch22nocre3dits4
		output : 12 + 22 + 3 + 4 = 41
		
		string to convert int .... method ==> (string name= Integer.parseInt().
		*/

public class A_23_program2 {
	
	int findNum(String name) {
		
		int sum=0;
		String temp="";
		
		for(int index=0; index<name.length(); index++) {
			
			char ch = name.charAt(index);
			
				if(Character.isDigit(ch)) {
					temp = temp + ch;
				}else {
					if(temp.length() >0) {
					sum = sum + Integer.parseInt(temp);
					temp = "";
				}
				}	
		}
			if(temp.length() >0) {
				sum = sum + Integer.parseInt(temp);
			}
			return sum;
		
	}
	
	public static void main(String[] args) {
		 A_23_program2  a_23_program2 = new  A_23_program2();
		int sum= a_23_program2.findNum("te12ch22nocre3dits4");
		System.out.println(sum);
	}
}
