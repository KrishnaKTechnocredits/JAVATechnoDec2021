package sagarAcharya;

public class A27_NumberValidation {

	public static void main(String[] args) {
		A27_NumberValidation a27 = new A27_NumberValidation();
		a27.checkNum1("+919765463742");
	}
	
	boolean checkIsDigit(String str) {
		for(int i = 0;i<str.length();i++) {
			if(Character.isDigit(str.charAt(i))) 
				return true;
		}
		return false;
	}
	
	boolean startNumCheck(char ch) {
		if(ch == 9 || ch == 8 || ch == 7)
			return true;
		return false;
	}
	
	void checkNum1(String str) {
		if(str.length() == 14) {
			if(str.startsWith("+91 ")) {
				if(startNumCheck(str.charAt(4))) {
					System.out.println("Valid Num");
				}else
					System.out.println("Invalid");
			}else
				System.out.println("Invalid");
		}else if(str.length() == 13) {
			String temp = str.replace(" ", "");
			if(temp.length()==10) {
				if(checkIsDigit(temp)) {
					if(startNumCheck(temp.charAt(0))) {
						System.out.println("Valid");
				}else
					System.out.println("Invalid");
			}else
				System.out.println("Invalid");
		}else
			System.out.println("Invalid");	
	}
		else if(str.length() == 11) {
			if(checkIsDigit(str)) {
				if(str.charAt(0) == 0) {
					if(startNumCheck(str.charAt(1))) {
						System.out.println("valid");
					}else
						System.out.println("Invalid");
				}else
					System.out.println("Invalid");
			}else
				System.out.println("Invalid");
		}
		else if(str.length()==10) {
			if(checkIsDigit(str)) {
				if(startNumCheck(str.charAt(0))) {
					System.out.println("Valid");
			}else
				System.out.println("Invalid");
		}else
			System.out.println("Invalid");
	}
		else {
			System.out.println("Invalid Num");
		}
	}
}

/*Assignment 27 : 21st Jan'2022

WAP to validate the phone number which is starting from number 9/8/7 and which should fit in the below mentioned valid patterns.
Valid Patters (considering initial number is 9 ):
1) +91 9765463742
2) 976 546 37 42
3) 09765463742
4) 9765463742

Input    : +919765463742
Output :  +919765463742 --> Invalid

Input    : 097 654 637 42
Output : 097 654 637 42 --> Invalid

Input    : +91 1765463742
Output : +91 1765463742 --> Invalid

Input    : 976 546 3742
Output : 976 546 3742 --> Invalid

Input    : 976546A742
Output : 976546A742 --> Invalid

Invalid  : 3765463742
Output : 3765463742 --> Invalid

Invalid  : 9765463742
Output : 9765463742 --> Valid
*/