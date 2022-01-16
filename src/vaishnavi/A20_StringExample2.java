package vaishnavi;

public class A20_StringExample2 {
	
	void printSumOfAllDigitsInString(String name) {
		int sum = 0;
		for (int index = 0; index < name.length(); index++) {
			char ch = name.charAt(index);
			if (Character.isDigit(ch)){
				int num = Character.getNumericValue(ch);
				sum = sum + num; 
			}
		}
		System.out.println();
		System.out.println("Sum of all digits in given string is : " + sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A20_StringExample2 a20_StringExample2 = new A20_StringExample2();
		a20_StringExample2.printSumOfAllDigitsInString("tech1noc9red3its");
	}

}
