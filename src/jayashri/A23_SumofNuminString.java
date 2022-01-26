package jayashri;

public class A23_SumofNuminString {
	void getSumOfNum(String input) {
		int sum = 0;
		String temp = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				temp = temp + ch;
			} else if (!temp.equals("")) {
				sum = sum + Integer.parseInt(temp);
				temp = "";
			}
		}
		if (!temp.equals(""))
			sum = sum + Integer.parseInt(temp);
		System.out.println(sum);
	}

	public static void main(String[] args) {
		A23_SumofNuminString asum = new A23_SumofNuminString();
		System.out.print("Sum of all the numbers in string is ");
		asum.getSumOfNum("te12ch22nocre3dits4");
	}
}
