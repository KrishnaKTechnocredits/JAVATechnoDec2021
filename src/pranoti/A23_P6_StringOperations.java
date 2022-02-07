package pranoti;

public class A23_P6_StringOperations {

	String getString(String input) {
		String eventemp = "";
		String oddtemp = "";
		String upperCase = "";
		String temp = "";
		int num = 0;
		boolean flag = true;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				temp = temp + ch;
				num = Integer.parseInt(temp);
				temp = "";
				if (num % 2 == 0)
					eventemp = eventemp + num;
				else
					oddtemp = oddtemp + num;
			} else if (Character.isUpperCase(ch) && flag) {
				upperCase = upperCase + ch;
				flag = false;
			}
		}
		return oddtemp + upperCase + eventemp;
	}

	public static void main(String[] args) {
		A23_P6_StringOperations a23_P6_StringOperations = new A23_P6_StringOperations();
		String str = a23_P6_StringOperations.getString("eTe1CH9cred4it6s");
		System.out.println(str);
	}
}
