package sagarAcharya;

public class A23_P3 {
	
	public static void main(String[] args) {
		String str = new A23_P3().getReplacments("te4c&Hno7CreD-8i*ts");
		System.out.println(str);
	}
	
	String getReplacments(String input) {
		String smallChar = "",digits = "",capLetter = "",specChar = "";
		
		for(int i = 0;i<input.length();i++) {
			char ch = input.charAt(i);
			if(Character.isLowerCase(ch)) {
				smallChar += ch;
			}
				else if(Character.isDigit(ch)) {
				digits += ch;
			}
				else if (Character.isUpperCase(ch)) {
				capLetter += ch;
			}else {
				specChar += ch;
			}
		}
		
		return smallChar + digits + capLetter + specChar;
	}
	
	
}


/*Program 3 : Return a string by placing all small characters first, followed by digits, capital letters, special characters.

input : te4c&Hno7CreD-8i*ts
output : tecnoreits478HCD&-**/