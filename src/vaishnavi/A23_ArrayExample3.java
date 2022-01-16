package vaishnavi;

public class A23_ArrayExample3 {
	String diffStringOperations(String str) {
		String lowerCaseChar = "";
		String upperCaseChar = "";
		String digits = "";
		String specialChar = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isLowerCase(ch))
				lowerCaseChar = lowerCaseChar + ch;
			else if (Character.isUpperCase(ch))
				upperCaseChar = upperCaseChar + ch;
			else if (Character.isDigit(ch))
				digits = digits + ch;
			else
				specialChar = specialChar + ch;
		}
		return lowerCaseChar + upperCaseChar + digits + specialChar;
	}

	public static void main(String[] args) {
		A23_ArrayExample3 a23_ArrayExample3 = new A23_ArrayExample3();
		String str = "te4c&Hno7CreD-8i*ts";
		System.out.println(" An output string is : " + a23_ArrayExample3.diffStringOperations(str));
	}

}
