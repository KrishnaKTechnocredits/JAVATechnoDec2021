package sagarShrikhande.arrayAndStrings;

public class A23_P5_DiffOfEvenOddNum {

	int getDiffOfOddandEvenNumsInString(String input) {
		int oddSum = 0;
		int evenSum = 0;
		String temp = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch))
				temp = temp + ch;
			if ((Character.isLetter(ch) && !temp.isEmpty()) || index == input.length() - 1) {

				int n = Integer.parseInt(temp);
				if (n % 2 == 0)
					evenSum += n;
				else
					oddSum += n;
				temp = "";
			}
		}
		return evenSum - oddSum;
	}

	public static void main(String[] args) {
		A23_P5_DiffOfEvenOddNum a23_P5_DiffOfEvenOddNum = new A23_P5_DiffOfEvenOddNum();
		String input = "te112ch34no29";
		System.out.println("Diff is: " + a23_P5_DiffOfEvenOddNum.getDiffOfOddandEvenNumsInString(input));
	}
}
/*
 * Program 5 : Find the difference between even and odd numbers from given
 * string. input : te112ch34no29 output : 117 hint : (112+34)-(29)
 */