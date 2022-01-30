package sagarShrikhande.arrayAndStrings;

public class A29_SumOfNumInString {

	int findSumOfNumsInString(String input) {
		String[] temp = input.split(" ");
		int sum = 0;
		for (int i = 0; i < temp.length; i++) {
			try {
				int num = Integer.parseInt(temp[i]);
				sum = sum + num;
			} catch (NumberFormatException ae) {

			}
		}
		return sum;
	}

	public static void main(String[] args) {
		String input = "I have 15 years and 3 months of automation experience";
		System.out.println(new A29_SumOfNumInString().findSumOfNumsInString(input));
	}

}

/*
 * Assignment 29 : 25th Jan'2022
 * 
 * WAP to find out the total sum of all the numbers present in the given string
 * without using Character class method. Input : I have 15 years and 3 months of
 * automation experience Output : Expected Sum = 8
 * 
 * Hint : Using exception handling (i.e. try catch block).
 */
