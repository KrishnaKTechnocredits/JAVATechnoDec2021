package nishika;

/* Return a string by placing all small characters first, followed by digits, capital letters, special characters.

input : te4c&Hno7CreD-8i*ts
output : tecnoreits478HCD&-* */

public class A_23_program3 {
	
	String upperCase ="";
	String lowerCase ="";
	String digit ="";
	String specialChar ="";
	String temp = " ";
	
	String  getdisplay(String name) {
		for(int index = 0 ; index<name.length() ; index++) {
			char ch = name.charAt(index);
			
				if(Character.isLetter(ch)) {
					if(Character.isUpperCase(ch)) {
						upperCase = upperCase + ch;
					}
					else{
						lowerCase= lowerCase +ch;
					}
				}
				
				else if(Character.isDigit(ch)) {
					digit = digit+ch;
				} else {
					specialChar = specialChar+ch;
				}
		}
		 temp = (temp +lowerCase+digit+upperCase+specialChar);
		 return temp;
	}
	public static void main(String[] args) {
		
		A_23_program3  program1  = new A_23_program3();
		String temp = program1.getdisplay("te4c&Hno7CreD-8i*/ts");
		System.out.println("string  output is--->" +   temp);
	}
}
