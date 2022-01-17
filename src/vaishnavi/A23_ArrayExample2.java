package vaishnavi;

public class A23_ArrayExample2 {
	int findSumOfNumFromString(String str) {
		int sum = 0;
		String temp = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch))
				temp = temp + ch;
			if ((Character.isLetter(ch) && !temp.isEmpty()) || index == str.length() - 1) {
				sum = sum + Integer.parseInt(temp);
				temp = "";
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		A23_ArrayExample2 a23_ArrayExample2 = new A23_ArrayExample2();
		String str = "te12ch22nocre3dits4";
		System.out.println("Sum of numbers from given String is: "+ a23_ArrayExample2.findSumOfNumFromString(str));
	}

}


