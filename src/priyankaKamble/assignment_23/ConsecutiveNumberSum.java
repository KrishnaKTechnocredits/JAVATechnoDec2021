package priyankaKamble.assignment_23;
/*
Program 2 : Find sum of numbers from given string.
input : te12ch22nocre3dits4
output : 12 + 22 + 3 + 4 = 41*/

public class ConsecutiveNumberSum {
	
	int checkDigit(String input) {// te12ch22nocre3dits4
		String temp = "0";
		int sum = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				temp += ch;
			} else {
				sum =sum + Integer.parseInt(temp);
				temp = "0";
			}
		}
		if (!temp.equals("0")) {
			sum += Integer.parseInt(temp);
		}
		//System.out.println(sum);
		return sum;
	}

	public static void main(String[] args) {
		ConsecutiveNumberSum consecutiveNumberSum = new ConsecutiveNumberSum();
		String input = "te12ch22nocre3dits4";
		System.out.println("Sum of Consecutive integers from string = " +consecutiveNumberSum.checkDigit(input));
		
	}
}
