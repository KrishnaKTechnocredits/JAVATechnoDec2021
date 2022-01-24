/* Assignment 27 : 21st Jan'2022
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
Output : 9765463742 --> Valid  	*/

package amruta.Assignment_27;

public class FindValidPattern {
	
	//method to check 10 number as digit only 
		static boolean checkAllareDigit(String num) {
			for (int index = 0; index < num.length(); index++) {
				char ch = num.charAt(index);
				
				if (!Character.isDigit(ch))
					return false;
			}
			return true;
		}

		//Method to check valid starting 1st number
		static boolean isFirstNumValid(char num) {
			if (num == '9' || num == '8' || num == '7') {
				return true;
			} else {
				return false;
			}
		}

		void isPhoneNumvalid(String phoneNum) {

			if (phoneNum.length() == 14) {
				
				if (phoneNum.startsWith("+91 ")) {
					
					if (isFirstNumValid(phoneNum.charAt(4))) {
						
						if(checkAllareDigit(phoneNum.substring(4))) {
							
							System.out.println(phoneNum + " : Valid Number");
							
						}else{
							
							System.out.println(phoneNum + " : Invalid Number");
						}
					} else{
						
						System.out.println(phoneNum + " : Invalid Number");
					}
				}else{
					
					System.out.println(phoneNum + " : Invalid Number");
				}
			} 
			else if (phoneNum.length() == 13) {
				
				if (isFirstNumValid(phoneNum.charAt(0))){
					
					if(phoneNum.charAt(3) == ' ' && phoneNum.charAt(7) == ' ' && phoneNum.charAt(10) == ' ') {
						phoneNum = phoneNum.replace(" ", "");
						
						if(phoneNum.length() == 10) {
							
							if(checkAllareDigit(phoneNum)) {
								
								System.out.println(phoneNum + " : Valid Number");
							}else {
								
								System.out.println(phoneNum + " : Invalid Number");
							}
						}else {
							
							System.out.println(phoneNum + " : Invalid Number");
						}
					}else {
						
						System.out.println(phoneNum + " : Invalid Number");
					}
				}else {
					
					System.out.println(phoneNum + " : Invalid Number");
				} 
			} 
			else if (phoneNum.length() == 11) {
				
				if (phoneNum.startsWith("0")) {
					
					if (isFirstNumValid(phoneNum.charAt(1))){
						
						if(checkAllareDigit(phoneNum)) {
							
							System.out.println(phoneNum + " : Valid Number");
						}else {
							
							System.out.println(phoneNum + " : Invalid Number");
						}
					} else {
						
						System.out.println(phoneNum + " : Invalid Number");
					}
				}else {
					
					System.out.println(phoneNum + " : Invalid Number");
				}
			} 
			else if (phoneNum.length() == 10) {
				
				if(isFirstNumValid(phoneNum.charAt(0))){
					
						if(checkAllareDigit(phoneNum)) {
							
							System.out.println(phoneNum + " : Valid Number");
						}else {
							
							System.out.println(phoneNum + " : Invalid Number");
						}
				}else{
					
					System.out.println(phoneNum + " : Invalid Number");
				}
			}else {
				
				System.out.println(phoneNum + " : Invalid Number");
			}
		}

		public static void main(String[] args) {
			FindValidPattern v = new FindValidPattern();
			System.out.println("\n--- Below are the Valid Phone Number ---\n");
			//Valid Phone Numbers
			v.isPhoneNumvalid("+91 9765463742");
			v.isPhoneNumvalid("976 546 37 42");
			v.isPhoneNumvalid("09765463742");
			v.isPhoneNumvalid("9765463742");

			//Invalid Phone Numbers
			System.out.println("\n--- Below are the Invalid Phone Number ---\n");
			v.isPhoneNumvalid("+919765463742");
			v.isPhoneNumvalid("097 654 637 42");
			v.isPhoneNumvalid("+91 1765463742");
			v.isPhoneNumvalid("976 546 3742");
			v.isPhoneNumvalid("976546A742");
			v.isPhoneNumvalid("3765463742");
			v.isPhoneNumvalid("1765463742");
		}
}