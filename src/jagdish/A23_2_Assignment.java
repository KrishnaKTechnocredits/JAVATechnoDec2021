package jagdish;

public class A23_2_Assignment {

	int findSumofString(String input) { // te12ch22nocre3dits4 = 12+22+3+4 =41
		String temp = "";// 12
		int sum = 0;

		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch))
				temp = temp + ch;

			if (Character.isLetter(ch) && !temp.equals("") || index == input.length() - 1) {
				sum = sum + Integer.parseInt(temp);
				temp = "";
			}

		}
		return sum;
	}

	public static void main(String[] args) {

		A23_2_Assignment sumofnostring = new A23_2_Assignment();
		String name = "te12ch22nocre3dits4";
		System.out.println("The sum of no is : " + sumofnostring.findSumofString(name));

	}

}
