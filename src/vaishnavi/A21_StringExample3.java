package vaishnavi;

public class A21_StringExample3 {

	int sum = 0;
	int count = 0;
	String temp ="";
	
	int getDigitsFromStringInput(String name) {
		for (int index = 0; index < name.length(); index ++) {
			char ch = name.charAt(index);
			if(Character.isDigit(ch)) {
				sum = sum + Character.getNumericValue(ch);
				temp = temp + ch;
			}
		}
		System.out.println();
		System.out.println("Sum of all digits in given string is : " + sum);
		System.out.println("All digits from given string is : " + temp);
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A21_StringExample3 a21StringExample3 = new A21_StringExample3();
		a21StringExample3.getDigitsFromStringInput("T24ec5hn67oc8r91e4di74t21s");

	}

}
