package nishika;
		/*
		* Program 5 : Find the difference between even and odd numbers from given string.
		input : te112ch34no29
		output : 117
		hint : (112+34)-(29)
		 */

public class A_23_program5 {
	int sum=0;
	String temp="";
	int oddNum=0;
	int avg=0;
	int evenNum=0;
	
	void diffBetOddEven(String name){
		
		for(int index=0; index<name.length(); index++) {
			
			char ch= name.charAt(index);
			if(Character.isDigit(ch)) {
				temp = temp + ch;
			}else {
				if(temp.length() >0) {
				sum = Integer.parseInt(temp);
				if(sum%2==0) {
					evenNum+=sum;
				}else {
					oddNum=+sum;
				}
				temp = "";
			}
			}	
	}
		if(temp.length() >0) {
			oddNum = Integer.parseInt(temp);
		}
		
		System.out.println(evenNum-oddNum);
		
	}
	
	public static void main(String[] args) {
		A_23_program5 a_23_program5 = new A_23_program5();
		a_23_program5.diffBetOddEven("te112ch34no29");
	}
}
