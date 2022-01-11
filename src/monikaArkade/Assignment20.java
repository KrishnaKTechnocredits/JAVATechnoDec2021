//Write a method to print sum of all digits in a given String
package monikaArkade;

public class Assignment20 {

	void getNumbericValue(String name) {
		int sum = 0;
		for (int index = 0; index < name.length(); index++) {
			char ch = name.charAt(index);
			if (Character.isDigit(name.charAt(index))) {
				int num = Character.getNumericValue(ch);
				sum = sum + num;
			}
		}
		System.out.println("Sum of digits: " + sum);
	}

	public static void main(String[] args) {
		Assignment20 assignment20 = new Assignment20();
		assignment20.getNumbericValue(" tech1noc9red3its");
	}
}
