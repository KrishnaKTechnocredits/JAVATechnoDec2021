package kalyani;

public class A27_ValidatePhoneNo {

	static boolean isTenCharDigit(String num) {
		for (int index = 0; index < num.length(); index++) {
			char ch = num.charAt(index);
			if (!Character.isDigit(ch))
				return false;
			}
		return true;
	}

	static boolean isFirstNumValid(char num) {
		if (num == '9' || num == '8' || num == '7') {
			return true;
		} else {
			return false;
		}
	}

	void validatePhoneNum(String phoneNum) {
		if (phoneNum.length() == 14) {
			if (phoneNum.startsWith("+91 ")) {
				if (isFirstNumValid(phoneNum.charAt(4))) {
					if(isTenCharDigit(phoneNum.substring(4))) {
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
		} else if (phoneNum.length() == 13) {
			if (isFirstNumValid(phoneNum.charAt(0))) {
				if(phoneNum.charAt(3) == ' ' && phoneNum.charAt(7) == ' ' && phoneNum.charAt(10) == ' ') {
					phoneNum = phoneNum.replace(" ", "");
					if(phoneNum.length() == 10) {
						if(isTenCharDigit(phoneNum)) {
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
			}else if (phoneNum.length() == 11) {
				if (phoneNum.startsWith("0")) {
					if (isFirstNumValid(phoneNum.charAt(1))) {
						if(isTenCharDigit(phoneNum)) {
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
			} else if (phoneNum.length() == 10) {
				if(isFirstNumValid(phoneNum.charAt(0))) {
					if(isTenCharDigit(phoneNum)) {
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
			
	}

	public static void main(String[] args) {
		A27_ValidatePhoneNo assign27 = new A27_ValidatePhoneNo();
		System.out.println("Testing Valid patterns");
		assign27.validatePhoneNum("+91 9765463742");
		assign27.validatePhoneNum("976 546 37 42");
		assign27.validatePhoneNum("09765463742");
		assign27.validatePhoneNum("9765463742");
		System.out.println("------------------------");
		System.out.println("Testing Invalid patterns");
		assign27.validatePhoneNum("+919765463742");
		assign27.validatePhoneNum("097 654 637 42");
		assign27.validatePhoneNum("+91 1765463742");
		assign27.validatePhoneNum("976 546 3742");
		assign27.validatePhoneNum("976546A742");
		assign27.validatePhoneNum("3765463742");
		assign27.validatePhoneNum("1765463742");
	}
}