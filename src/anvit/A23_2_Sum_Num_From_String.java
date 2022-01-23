package anvit;

public class A23_2_Sum_Num_From_String {

	int method(String input) {
		String temp = "";
		int sum = 0;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isDigit(ch))
				temp = temp + ch;
			if (Character.isLetter(ch) && temp.length() > 0) {
				sum = sum + Integer.parseInt(temp);
				temp = "";
			}
		}
		if (!temp.equals(""))
			sum = sum + Integer.parseInt(temp);
		return sum;
	}

	public static void main(String[] args) {
		A23_2_Sum_Num_From_String a23_2_Sum_Num_From_String = new A23_2_Sum_Num_From_String();
		String str = "te12ch22nocre3dits4";
		System.out.println("Sum of numbers from given string : " + a23_2_Sum_Num_From_String.method(str));
	}
}
