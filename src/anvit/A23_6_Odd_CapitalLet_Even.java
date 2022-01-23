package anvit;

public class A23_6_Odd_CapitalLet_Even {
	
	String mainMethod(String input) {
		String odd = "";
		String even = "";
		String upperCase = "";
		String output = "";
		for(int i = 0 ; i<input.length(); i++) {
			char ch = input.charAt(i);
			if(Character.isDigit(ch)) {
				String s = ch + "";
				int num = Integer.parseInt(s);
				if(num%2==0)
					even = even + num;
				else
					odd = odd + num;
			}
		}
		for(int index = 0 ; index<input.length(); index++) {
			char ch = input.charAt(index);
			if(Character.isUpperCase(ch)) {
				upperCase = ch + "";
				break;
			}
		}
		output = odd + upperCase + even;
		return output;
	}
	
	public static void main(String[] args) {
		A23_6_Odd_CapitalLet_Even a23_6 = new A23_6_Odd_CapitalLet_Even();
		String str = a23_6.mainMethod("eTe1CH9cred4it6s");
		System.out.println(str);
	}
}
