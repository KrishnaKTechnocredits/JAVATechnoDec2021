package archana;

public class Ass23_P7_OddEvenNummSum {
	int diffOddEvenNums(String input) {
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
		Ass23_P7_OddEvenNummSum ass23 = new Ass23_P7_OddEvenNummSum();
		String input = "te112ch34no29";
		int ans = ass23.diffOddEvenNums(input);
		System.out.println("Diff is: " + ans);
	}
}
