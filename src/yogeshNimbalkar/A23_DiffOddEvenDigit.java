package yogeshNimbalkar;

import java.util.Scanner;

//Find the difference between odd and even digits from given string.
public class A23_DiffOddEvenDigit {

	int getOddSumEvenSum(String str) {
		int sum =0;
		for (int index=0; index<str.length(); index++) {
			char ch = str.charAt(index);
			if(Character.isDigit(ch)) {
				if(Character.getNumericValue(ch) % 2 != 0) {
					sum += Character.getNumericValue(ch);
				}else {
					sum -= Character.getNumericValue(ch);
				}
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		A23_DiffOddEvenDigit diffOddEvenDigit = new A23_DiffOddEvenDigit();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string :");
		String input = scanner.next();
		System.out.println("Sum = " + diffOddEvenDigit.getOddSumEvenSum(input));	
		scanner.close();
	}
}
