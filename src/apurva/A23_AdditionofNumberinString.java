package apurva;


public class A23_AdditionofNumberinString {
	void getSumOfNumbersInString(String str) {
		String temp = "";
		int sum = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				temp = temp + ch;
				
			} else if (!temp.equals("")) {
				sum = sum + Integer.parseInt(temp);				
				temp = "";				
			}
		}
		if (!temp.equals(""))
			sum = sum + Integer.parseInt(temp);
		System.out.println("Sum of numbers in given String is: " +sum);
	}

	public static void main(String[] a) {
		new A23_AdditionofNumberinString().getSumOfNumbersInString("te12ch22nocre3dits4");
	}

}
