package archana;

public class Ass23_P2_SumofNumInString {
	int getSumOfNumsInString(String str) {
		int sum = 0;
		String temp = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				temp = temp + ch;
			}
			if ((Character.isLetter(ch) && !temp.isEmpty()) || index == str.length() - 1) {
				sum = sum + Integer.parseInt(temp);
				temp = "";
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		Ass23_P2_SumofNumInString ass23 = new Ass23_P2_SumofNumInString();
		String s = "te112ch34no29";
		int ans = ass23.getSumOfNumsInString(s);
		System.out.println("Sum of all Numbers in String is: " + ans);
	}

}
