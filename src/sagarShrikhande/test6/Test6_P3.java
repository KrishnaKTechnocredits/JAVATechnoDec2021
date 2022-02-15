package sagarShrikhande.test6;

public class Test6_P3 {

	int getSumOfNumsInString(String input) {
		int sum = 0;
		String temp = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch))
				temp = temp + ch;
			if ((Character.isSpaceChar(ch)|| Character.isLetter(ch) && !temp.isEmpty()) || index == input.length() - 1) {
				sum = sum + Integer.parseInt(temp);
				temp = "";
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Test6_P3 tp3 = new Test6_P3();
		String input = "10 10 20 30";
		System.out.println("Sum of nums: " + tp3.getSumOfNumsInString(input));
	}
}

/*
 * 3. sum of all numbers in a given statement. input = "10 10 20 30"; output :
 * 70
 * 
 */