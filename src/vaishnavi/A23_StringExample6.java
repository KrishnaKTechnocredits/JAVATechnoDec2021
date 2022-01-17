package vaishnavi;

public class A23_StringExample6 {

	String findOddEvenCapitalString(String str) {
		String oddNum = "";
		String evenNum = "";
		String firstCapital = "";
		boolean flag = true;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				if (Integer.parseInt(ch + "") % 2 == 0)
					evenNum += ch;
				else
					oddNum += ch;
			} else if (Character.isUpperCase(ch) && flag == true) {
				firstCapital += ch;
				flag = false;
			}
		}
		return oddNum + firstCapital + evenNum;
	}

	public static void main (String[] args) {
		A23_StringExample6 A23_StringExample6 = new A23_StringExample6();
		String str = "eTe1CH9cred4it6s";
		System.out.println("An output string is: "+A23_StringExample6.findOddEvenCapitalString(str));
	}
}
