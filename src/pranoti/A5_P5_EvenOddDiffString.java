package pranoti;

public class A5_P5_EvenOddDiffString {
	
	void findEvenOddDiffrence(String input) {
		int evenSum = 0;
		int oddSum = 0;
		String temp = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch))
				temp = temp + ch;
			else if (!temp.equals("")) {
				if (Integer.parseInt(temp) % 2 == 0) {
					evenSum = evenSum + Integer.parseInt(temp);
				} else
					oddSum = oddSum + Integer.parseInt(temp);
				temp = "";
			}
		}
			if (!temp.equals("")) {
				if (Integer.parseInt(temp) % 2 == 0) 
					evenSum = evenSum + Integer.parseInt(temp);
				else
					oddSum = oddSum + Integer.parseInt(temp);
			}
		System.out.println("Sum of difference between even and odd numbers : " + (evenSum - oddSum));
	}

	public static void main(String[] args) {
		A5_P5_EvenOddDiffString a5_P5_EvenOddDiffString = new A5_P5_EvenOddDiffString();
		a5_P5_EvenOddDiffString.findEvenOddDiffrence("te112ch34no29");
	}
}
