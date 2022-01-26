package yogeshNimbalkar;

public class A27_ValidatePhoneNum {

	void processData(String str) {
		boolean firstChar, isDigit;
		String num;
		switch(str.length()) {
		case 10:
			firstChar = isFirstValidChar(str.charAt(0));
			if(firstChar) {
				num = str.substring(1);
				isDigit = isAllDigitInStr(num);
				if(isDigit) {
					System.out.println("Valid phone number");
				}
				else {
					System.out.println("Invalid phone number");
				}
			}else {
				System.out.println("Invalid phone number");
			}
			break;
		case 11:
			if(str.charAt(0)=='0') {
				firstChar = isFirstValidChar(str.charAt(1));
				if(firstChar) {
					num = str.substring(2);
					isDigit = isAllDigitInStr(num);
					if(isDigit) {
						System.out.println("Valid phone number");
					}else {
						System.out.println("Invalid phone number");
					}
				}else {
					System.out.println("Invalid phone number");
				}
			}else {
				System.out.println("Invalid phone number");
			}
			break;
		case 13:
			if(str.charAt(3)==' ' && str.charAt(7)==' ' && str.charAt(10)==' ') {
				num = str.replace(" ","");
				if(num.length()==10) {
					firstChar = isFirstValidChar(num.charAt(0));
					if(firstChar) {
						isDigit = isAllDigitInStr(num.substring(1));
						if(isDigit) {
							System.out.println("Valid phone number");
						}else {
							System.out.println("Invalid phone number");
						}
					}else {
						System.out.println("Invalid phone number");
					}
				}else {
					System.out.println("Invalid phone number");
				}
			}else {
				System.out.println("Invalid phone number");
			}
			break;
		case 14:
			String[] arr = str.split(" ");
			if(arr.length == 2) {
				if(arr[0].equals("+91")) {
					if(arr[1].length()==10) {
						firstChar = isFirstValidChar(arr[1].charAt(0));
						if(firstChar) {
							num = arr[1].substring(1);
							isDigit = isAllDigitInStr(num);
							if(isDigit) {
								System.out.println("Valid phone number");
							}else {
								System.out.println("Invalid phone number");
							}
						}else {
							System.out.println("Invalid phone number");
						}
					}else {
						System.out.println("Invalid phone number");
					}
				}else {
					System.out.println("Invalid phone number");
				}
			}else {
				System.out.println("Invalid phone number");
			}
			break;
		default :
			System.out.println("Invalid phone number");
		}
	}
	
	boolean isFirstValidChar(char ch) {
		boolean flag;
		if(ch == '9' || ch == '8' || ch == '7')
			flag = true;
		else
			flag = false;
		return flag;
	}
	
	boolean isAllDigitInStr(String str) {
		boolean isDigit = true;
		for(int index=0; index<str.length(); index++) {
			if(!Character.isDigit(str.charAt(index))) {
				isDigit = false;
				break;
			}
		}
		return isDigit;
	}
	
	public static void main(String[] args) {
		A27_ValidatePhoneNum validatePhoneNum = new A27_ValidatePhoneNum();
		String input1 = "+91 9730882633";
		String input2 = "973 080 26 33";
		String input3 = "09730882633";
		String input4 = "9730882633";
		validatePhoneNum.processData(input1);
		validatePhoneNum.processData(input2);
		validatePhoneNum.processData(input3);
		validatePhoneNum.processData(input4);
	}
}
