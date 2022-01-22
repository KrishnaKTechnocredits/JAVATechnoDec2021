package technocredits.stringdemo;

//Validate Phone number [9,8,7]
// Valid : +91 9765463742
//             09765463742
//             976 543 37 42
//             9765463742
//             8975552160  

//+919765463742 invalid 
//097 654 637 42 invalid
//+91 1765463742 invalid
// 976 543 3742 invalid
// 976546A742 invalid
// 3765463742

public class Example7 {
	static boolean verifyAllCharsAsDigit(String str) {
		
		return true;
	}
	
	static boolean isFirstCharValid(char ch) {
		if(ch == '9' || ch =='8' || ch =='7')
			return true;
		return false;
	}
	
	public static void main(String[] args) {
		
		String num = "";
		if(num.length() == 14) {
			if(num.startsWith("+91 ")) {
				
			}
		}else if(num.length() == 11) {
			if(num.startsWith("0")){
				if(isFirstCharValid(num.charAt(1))) {
					
				}else {
					System.out.println("Invalid pattern");
				}
			}
		}else if(num.length() == 13) {
			if(isFirstCharValid(num.charAt(0))){
				if(num.indexOf(3) == ' ' && num.indexOf(7) == ' ' && num.indexOf(10) == ' ') {
					num = num.replace(" ", "");
					if(num.length() == 10) {
						boolean isAllDigit = verifyAllCharsAsDigit(num);
						if(isAllDigit)
							System.out.println("Valid Pattern");
						else
							System.out.println("Invalid Pattern");
					}else {
						System.out.println("Invalid pattern");
					}
				}else
					System.out.println("Invalid pattern");
			}
					
		}
	}
	
}
