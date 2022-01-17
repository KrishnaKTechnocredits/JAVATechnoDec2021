package vaishnavi;

public class A23_StringExamples5 {

	int findDiffBetweenOddAndEvenNumberFromString(String str) {
		int oddNum = 0;
		int evenNum = 0;
		String temp = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch))
				temp = temp + ch;
			if ((Character.isLetter(ch) && !temp.isEmpty()) || index == str.length() - 1) {

				int n = Integer.parseInt(temp);
				if (n % 2 == 0)
					evenNum += n;
				else
					oddNum += n;
				temp = "";
			}
		}
		return evenNum - oddNum;
	}
	public static void main(String[] args) {
		A23_StringExamples5 a23_StringExamples5 = new A23_StringExamples5();
		String str = "te112ch34no29";
		System.out.println("The difference between even and odd numbers from given string is: " +a23_StringExamples5.findDiffBetweenOddAndEvenNumberFromString(str));
	}
}
