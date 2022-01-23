package krishna.Assignment_23_StringArray;

public class Assignment_23_ReturnDiffChar {
	String findDiffCharacterInString(String provide) {
		String firstUC = "";
		String oddNum = "";
		String evenNum = "";
		int sum = 0;
		boolean flag = true;
		for (int i = 0; i < provide.length(); i++) {
			char ch = provide.charAt(i);
			if (Character.isDigit(ch)) {
				sum = Integer.parseInt(ch + "");
				if (sum % 2 == 0)
					evenNum += sum;
				else
					oddNum += sum;
			} else if (Character.isUpperCase(ch)) {
				if (flag) {
					firstUC += ch;
					flag = false;
				}
			}
		}
		return oddNum + firstUC + evenNum;
	}

	public static void main(String[] args) {
		Assignment_23_ReturnDiffChar ass23 = new Assignment_23_ReturnDiffChar();
		String str1 = "eTe1CH9cred4it6s";
		System.out.println("All odd numbers , first capital letters from given string, even numbers : "
				+ ass23.findDiffCharacterInString(str1));
	}
}
